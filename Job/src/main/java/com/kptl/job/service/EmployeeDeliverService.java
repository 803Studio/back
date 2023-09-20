package com.kptl.job.service;

import com.kptl.proto.employee.FindRecordsReq;
import com.kptl.proto.employee.OperateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDeliverService {
    boolean deliver(OperateRequest request);

    List<Integer> deliverRecords(FindRecordsReq request);

    List<Integer> browses(Integer id);
}
