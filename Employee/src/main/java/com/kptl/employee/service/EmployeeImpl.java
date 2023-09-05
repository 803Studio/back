package com.kptl.employee.service;

import com.kptl.proto.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GRpcService
public class EmployeeImpl extends EmployeeGrpc.EmployeeImplBase {
    @Override
    public void deliver(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        int id = request.getId();
        Map<Integer, List<Integer>> result = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(123);
        result.put(id, list);
        ResponseHeader header = ResponseHeader.newBuilder().setStatus(ResponseStatus.OK).build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        for (int i = 0; i < list.size(); i++) {
            builder.setJobIds(i, list.get(i));
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void browses(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        super.browses(request, responseObserver);
    }
}

