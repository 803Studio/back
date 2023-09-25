package com.kptl.job.api;

import com.kptl.job.service.EmployeeDeliverService;
import com.kptl.proto.employee.*;

import global.Headers;
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
    public void browses(OperateRequest request, StreamObserver<OperateResponse> responseObserver) {
        List<Integer> list = employeeDeliverService.browses(request.getId());
        Headers.ResponseHeader header = Headers.ResponseHeader.newBuilder().setStatus(Headers.ResponseStatus.OK).setMessage("查询成功！").build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        if (list != null && !list.isEmpty()) {
            for (Integer jobId : list) {
                builder.addJobIds(jobId);
            }
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deliverRecords(FindRecordsReq request, StreamObserver<OperateResponse> responseObserver) {
        List<Integer> list = employeeDeliverService.deliverRecords(request);
        Headers.ResponseHeader header = Headers.ResponseHeader.newBuilder().setStatus(Headers.ResponseStatus.OK).setMessage("查询成功！").build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        if (list != null && !list.isEmpty()) {
            for (Integer jobId : list) {
                builder.addJobIds(jobId);
            }
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
        result.put(id, list);
        Headers.ResponseHeader header = Headers.ResponseHeader.newBuilder().setStatus(Headers.ResponseStatus.OK).setMessage(deliver.toString()).build();
        OperateResponse.Builder builder = OperateResponse.newBuilder();
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void completeSelfInformation(SelfInformation request, StreamObserver<Headers.ResponseHeader> responseObserver) {
        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
        try {
            employeeDeliverService.completeSelfInformation(request);
            header.setStatus(Headers.ResponseStatus.OK).setMessage("操作成功！");
        } catch (Exception e) {
            header.setStatus(Headers.ResponseStatus.InternalErr).setMessage("操作失败！");
        }
        responseObserver.onNext(header.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findEmployeeInformation(FindEmployeeInfoReq request, StreamObserver<FindEmployeeResponse> responseObserver) {
        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
        FindEmployeeResponse.Builder builder = FindEmployeeResponse.newBuilder();
        try {
            SelfInformation employeeInformation = employeeDeliverService.findEmployeeInformation(request.getId());
            builder.setSelfInfo(employeeInformation);
            header.setStatus(Headers.ResponseStatus.OK).setMessage("查询成功！");
        } catch (Exception e) {
            header.setStatus(Headers.ResponseStatus.InternalErr).setMessage("查询失败！");
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findEmployeeSimpleInformation(SplitPage request, StreamObserver<FindEmployeeSimpleResponse> responseObserver) {
        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
        FindEmployeeSimpleResponse.Builder builder = FindEmployeeSimpleResponse.newBuilder();
        try {
            List<SimpleInformation> employeeSimpleInformation = employeeDeliverService.findEmployeeSimpleInformation(request);
            builder.addAllEmployees(employeeSimpleInformation);
            header.setStatus(Headers.ResponseStatus.OK).setMessage("查询成功！");
        } catch (Exception e) {
            header.setStatus(Headers.ResponseStatus.InternalErr).setMessage("查询失败！");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
