package com.kptl.job.service.impl;

import com.kptl.job.dao.EmployeeDeliverMapper;
import com.kptl.job.dto.DeliverDTO;
import com.kptl.job.service.EmployeeDeliverService;
import com.kptl.proto.employee.FindRecordsReq;
import com.kptl.proto.employee.OperateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeDeliverServiceImpl implements EmployeeDeliverService {
    @Autowired
    private EmployeeDeliverMapper employeeDeliverMapper;

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
}
