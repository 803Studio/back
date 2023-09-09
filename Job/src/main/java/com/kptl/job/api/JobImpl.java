package com.kptl.job.api;

import com.kptl.job.service.CompanyService;
import com.kptl.job.service.JobService;
import com.kptl.proto.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class JobImpl extends JobGrpc.JobImplBase {
    @Autowired
    private JobService jobService;
    @Autowired
    private CompanyService companyService;
    @Override
    public void findJobs(FindJobRequest request, StreamObserver<FindJobResponse> responseObserver) {
        super.findJobs(request, responseObserver);
    }

    @Override
    public void saveJobs(JobMessage request, StreamObserver<SaveJobResponse> responseObserver) {
        Boolean result = jobService.saveJob(request);
        ResponseHeader.Builder header = ResponseHeader.newBuilder();

        if (result) {
           header.setStatus(ResponseStatus.OK).setMessage("保存成功！");
        } else {
            header.setStatus(ResponseStatus.OK).setMessage("保存失败！");
        }

        SaveJobResponse response = SaveJobResponse.newBuilder().setHeader(header.build()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateJobs(JobMessage request, StreamObserver<SaveJobResponse> responseObserver) {
        Boolean result = jobService.updateJob(request);
        ResponseHeader.Builder header = ResponseHeader.newBuilder();

        if (result) {
            header.setStatus(ResponseStatus.OK).setMessage("更新成功！");
        } else {
            header.setStatus(ResponseStatus.OK).setMessage("更新失败！");
        }

        SaveJobResponse response = SaveJobResponse.newBuilder().setHeader(header.build()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void registeredCompany(RegisteredCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        try {
            companyService.registeredCompany(request.getCompany());
            header.setStatus(ResponseStatus.OK).setMessage("注册成功！");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("注册失败！");
        }
        CommonResponse result = CommonResponse.newBuilder().setHeader(header).build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void updateCompany(RegisteredCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        try {
            companyService.updateCompany(request.getCompany());
            header.setStatus(ResponseStatus.OK).setMessage("更新成功！");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("更新失败！");
        }
        CommonResponse result = CommonResponse.newBuilder().setHeader(header).build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void registeredRecruiter(RegisteredRecruiterReq request, StreamObserver<CommonResponse> responseObserver) {
        super.registeredRecruiter(request, responseObserver);
    }

    @Override
    public void verifyCompany(VerifyCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
        super.verifyCompany(request, responseObserver);
    }
}
