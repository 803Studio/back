package com.kptl.employee.service.impl;

import com.kptl.employee.dao.EmployeeDeliverMapper;
import com.kptl.employee.dto.DeliverDTO;
import com.kptl.employee.service.EmployeeDeliverService;
import com.kptl.proto.OperateRequest;
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
    public List<Integer> deliverRecords(OperateRequest request) {
        return employeeDeliverMapper.deliverRecords(request.getId());
    }
}
