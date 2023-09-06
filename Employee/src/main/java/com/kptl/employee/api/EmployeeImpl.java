package com.kptl.employee.api;

import com.kptl.employee.service.EmployeeDeliverService;
import com.kptl.proto.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GRpcService
public class EmployeeImpl extends EmployeeGrpc.EmployeeImplBase {


    @Autowired
    private EmployeeDeliverService employeeDeliverService;
    @Override
    public void deliverRecords(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        List<Integer> list = employeeDeliverService.deliverRecords(request);
        ResponseHeader header = ResponseHeader.newBuilder().setStatus(ResponseStatus.OK).setMessage("查询成功！").build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        for (Integer jobId : list) {
            builder.addJobIds(jobId);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void deliver(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        Boolean deliver = employeeDeliverService.deliver(request);
        int id = request.getId();
        Map<Integer, List<Integer>> result = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(1232);
        result.put(id, list);
        ResponseHeader header = ResponseHeader.newBuilder().setStatus(ResponseStatus.OK).setMessage(deliver.toString()).build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        for (Integer i : list) {
            builder.addJobIds(i);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void browses(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        super.browses(request, responseObserver);
    }

}

