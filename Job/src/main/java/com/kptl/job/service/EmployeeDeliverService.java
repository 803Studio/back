package com.kptl.job.service;

import com.kptl.proto.employee.OperateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDeliverService {
    boolean deliver(OperateRequest request);

    List<Integer> deliverRecords(OperateRequest request);
}
