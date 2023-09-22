package com.kptl.job.service;

import com.kptl.job.dto.EmployeeDTO;
import com.kptl.proto.employee.FindRecordsReq;
import com.kptl.proto.employee.OperateRequest;
import com.kptl.proto.employee.SelfInformation;
import com.kptl.proto.employee.SplitPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeDeliverService {
    boolean deliver(OperateRequest request);

    List<Integer> deliverRecords(FindRecordsReq request);

    List<Integer> browses(Integer id);

    List<SelfInformation> findEmployeeSimpleInformation(SplitPage splitPage);

    SelfInformation findEmployeeInformation(Integer id);

    void completeSelfInformation(SelfInformation selfInformation);
}
