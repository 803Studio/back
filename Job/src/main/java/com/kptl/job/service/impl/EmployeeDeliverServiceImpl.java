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
    public List<SimpleInformation> findEmployeeSimpleInformation(SplitPage splitPage) {
        List<EmployeeDTO> employeeSimpleInformation =
                employeeDeliverMapper.findEmployeeSimpleInformation(splitPage.getIndex(), splitPage.getSize());
        if (employeeSimpleInformation == null || employeeSimpleInformation.isEmpty()) {
            return null;
        }
        List<SimpleInformation> selfInformations = new ArrayList<>();
        for (EmployeeDTO employeeDTO : employeeSimpleInformation) {
            selfInformations.add(castToSimpInformation(employeeDTO));
        }
        return selfInformations;
    }

    private SimpleInformation castToSimpInformation(EmployeeDTO employeeDTO) {
        SimpleInformation.Builder simp = SimpleInformation.newBuilder();
        simp.setId(employeeDTO.getId());
        simp.setRealName(employeeDTO.getRealName());
        simp.setSex(employeeDTO.getSex());
        simp.setWorkYear(employeeDTO.getWorkYear());
        simp.setExpectedLocation(employeeDTO.getExpectedLocation());
        simp.setIndustry(employeeDTO.getIndustry());
        simp.setJobType(JobType.valueOf(employeeDTO.getJobType()));
        return simp.build();
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
        self.setIsMarry(employeeDTO.getIsMarry());
        self.setEducation(employeeDTO.getEducation());
        self.setJobStatus(employeeDTO.getJobStatus());
        return self.build();
    }


    @Override
    public SelfInformation findEmployeeInformation(Integer id) {
        EmployeeDTO employeeInformation = employeeDeliverMapper.findEmployeeInformation(id);
        if (employeeInformation == null) {
            return null;
        }
        return castToInformation(employeeInformation);
    }

    @Override
    public void completeSelfInformation(SelfInformation selfInformation) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(selfInformation.getSimpleInfo().getId());
        employeeDTO.setRealName(selfInformation.getSimpleInfo().getRealName());
        employeeDTO.setSex(selfInformation.getSimpleInfo().getSex());
        employeeDTO.setWorkYear(selfInformation.getSimpleInfo().getWorkYear());
        employeeDTO.setExpectedLocation(selfInformation.getSimpleInfo().getExpectedLocation());
        employeeDTO.setIndustry(selfInformation.getSimpleInfo().getIndustry());
        employeeDTO.setJobType(String.valueOf(selfInformation.getSimpleInfo().getJobType()));
        employeeDTO.setIsMarry(selfInformation.getIsMarry());
        employeeDTO.setEducation(selfInformation.getEducation());
        employeeDTO.setJobStatus(selfInformation.getJobStatus());
        EmployeeDTO employeeInformation = employeeDeliverMapper.findEmployeeInformation(employeeDTO.getId());
        if (employeeInformation == null) {
            employeeDeliverMapper.completeSelfInformation(employeeDTO);
        } else {
            employeeDeliverMapper.updateSelfInformation(employeeDTO);
        }
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
