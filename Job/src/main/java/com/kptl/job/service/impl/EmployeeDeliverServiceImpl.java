package com.kptl.job.service.impl;

import com.kptl.job.dao.EmployeeDeliverMapper;
import com.kptl.job.dto.BrowseRecordDTO;
import com.kptl.job.dto.DeliverDTO;
import com.kptl.job.dto.EmployeeDTO;
import com.kptl.job.service.EmployeeDeliverService;
import com.kptl.proto.employee.*;
import com.kptl.proto.employee.JobType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmployeeDeliverServiceImpl implements EmployeeDeliverService {
    @Autowired
    private EmployeeDeliverMapper employeeDeliverMapper;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public boolean deliver(OperateRequest request) {
        DeliverDTO deliverDTO = new DeliverDTO();
        deliverDTO.setDeliverId(UUID.randomUUID().toString());
        deliverDTO.setId(request.getId());
        deliverDTO.setJobId(request.getJobId());
        employeeDeliverMapper.deliver(deliverDTO);
        return true;
    }

    @Override
    public List<Integer> deliverRecords(FindRecordsReq request) {
        return employeeDeliverMapper.deliverRecords(request.getId());
    }

    @Override
    public List<Integer> browses(Integer id) {
        return getBrowseRecords(String.valueOf(id));
    }

    @Override
    public List<SelfInformation> findEmployeeSimpleInformation(SplitPage splitPage) {
        List<EmployeeDTO> employeeSimpleInformation =
                employeeDeliverMapper.findEmployeeSimpleInformation(splitPage.getIndex(), splitPage.getSize());
        if (employeeSimpleInformation == null || employeeSimpleInformation.isEmpty()) {
            return null;
        }
        List<SelfInformation> selfInformations = new ArrayList<>();
        for (EmployeeDTO employeeDTO : employeeSimpleInformation) {
            selfInformations.add(castToInformation(employeeDTO));
        }
        return selfInformations;
    }

    private SelfInformation castToInformation(EmployeeDTO employeeDTO) {
        SelfInformation.Builder self = SelfInformation.newBuilder();
        SimpleInformation.Builder simp = SimpleInformation.newBuilder();
        simp.setId(employeeDTO.getId());
        simp.setRealName(employeeDTO.getRealName());
        simp.setSex(employeeDTO.getSex());
        simp.setWorkYear(employeeDTO.getWorkYear());
        simp.setExpectedLocation(employeeDTO.getExpectedLocation());
        simp.setIndustry(employeeDTO.getIndustry());
        simp.setJobType(JobType.valueOf(employeeDTO.getJobType()));
        self.setSimpleInfo(simp.build());
        return self.build();
    }


    @Override
    public SelfInformation findEmployeeInformation(Integer id) {
        return null;
    }

    @Override
    public void completeSelfInformation(SelfInformation selfInformation) {

    }

    private List<Integer> getBrowseRecords(String userId) {
        Map<Object, Object> entries = redisTemplate.opsForHash().entries(userId);
        List<BrowseRecordDTO> browseRecordDTOS = new ArrayList<>();
        for (Map.Entry<Object, Object> entry : entries.entrySet()) {
            BrowseRecordDTO browseRecordDTO = new BrowseRecordDTO();
            browseRecordDTO.setJobId(Integer.valueOf((String)entry.getKey()));
            browseRecordDTO.setTime((Long)entry.getValue());
            browseRecordDTOS.add(browseRecordDTO);
        }
        List<BrowseRecordDTO> sortedJobs = browseRecordDTOS.stream()
                .sorted(Comparator.comparing(BrowseRecordDTO::getTime).reversed())
                .collect(Collectors.toList());
        List<Integer> jobIds = sortedJobs.stream()
                .map(BrowseRecordDTO::getJobId)
                .collect(Collectors.toList());
        return jobIds;
    }
}
