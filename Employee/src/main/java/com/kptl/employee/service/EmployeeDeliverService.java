package com.kptl.employee.service;

import com.kptl.proto.OperateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDeliverService {
    boolean deliver(OperateRequest request);

    List<Integer> deliverRecords(OperateRequest request);
}
