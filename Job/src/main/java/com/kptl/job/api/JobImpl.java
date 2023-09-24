package com.kptl.job.api;

import com.kptl.job.service.JobService;
import com.kptl.proto.job.*;
import global.Headers;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class JobImpl extends JobGrpc.JobImplBase {
    @Autowired
    private JobService jobService;

    /**
     * 根据角色查询角色
     */
    @Override
    public void findJobs(FindJobRequest request, StreamObserver<FindJobResponse> responseObserver) {
        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
        FindJobResponse.Builder builder = FindJobResponse.newBuilder();
        List<JobMessage> jobs = new ArrayList<>();
        try {
            jobs = jobService.findJobs(request);
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        if (jobs != null) {
            for (JobMessage jobMessage : jobs) {
                builder.addJobMsg(jobMessage);
            }
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findJobsSimplify(FindAllJobRequest request, StreamObserver<FindSimplifyJobResponse> responseObserver) {
        List<JobSimplifyMessage> jobs = new ArrayList<>();
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        FindSimplifyJobResponse.Builder builder = FindSimplifyJobResponse.newBuilder();
        try {
            jobs = jobService.findJobsSimplify(request);
            if (jobs != null) {
                for (JobSimplifyMessage jobMessage : jobs) {
                    builder.addJobMsg(jobMessage);
                }
            }
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void findJobsByType(FindJobsByTypeReq request, StreamObserver<FindSimplifyJobResponse> responseObserver) {
        List<JobSimplifyMessage> jobs = new ArrayList<>();
        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
        FindSimplifyJobResponse.Builder builder = FindSimplifyJobResponse.newBuilder();
        try {
            jobs = jobService.findJobsByType(request);
            if (jobs != null) {
                for (JobSimplifyMessage jobMessage : jobs) {
                    builder.addJobMsg(jobMessage);
                }
            }
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    /**
     * 通用接口，查询所有职位
     */
    @Override
    public void findAllJobs(FindAllJobRequest request, StreamObserver<FindJobResponse> responseObserver) {
        List<JobMessage> jobs = new ArrayList<>();
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        FindJobResponse.Builder builder = FindJobResponse.newBuilder();
        try {
            jobs = jobService.findAllJobs(request);
            if (jobs != null) {
                for (JobMessage jobMessage : jobs) {
                    builder.addJobMsg(jobMessage);
                }
            }
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    /**
     * 根据职位名称查询职位
     */
    @Override
    public void findJobByName(FindJobByNameRequest request, StreamObserver<FindJobResponse> responseObserver) {
        List<JobMessage> jobs = new ArrayList<>();
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        FindJobResponse.Builder builder = FindJobResponse.newBuilder();
        try {
            jobs = jobService.findJobByName(request);
            if (jobs != null ) {
                jobs.forEach(job -> {
                    builder.addJobMsg(job);
                });
            }
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    /**
     * 根据industry查询职位
     */
    @Override
    public void findJobsByIndustry(FindJobsByIndustryReq request, StreamObserver<FindJobResponse> responseObserver) {
        List<JobMessage> jobs = new ArrayList<>();
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        FindJobResponse.Builder builder = FindJobResponse.newBuilder();
        try {
            jobs = jobService.findJobsByIndustry(request);
            jobs.forEach(builder::addJobMsg);
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    /**
     * 根据id查询职位详细信息
     */
    @Override
    public void findJobById(FindJobByIdRequest request, StreamObserver<FindJobResponse> responseObserver) {
        List<JobMessage> jobs = new ArrayList<>();
        ResponseHeader.Builder header = ResponseHeader.newBuilder();
        FindJobResponse.Builder builder = FindJobResponse.newBuilder();
        try {
            if (jobService.findJobById(request) != null) {
                jobs.add(jobService.findJobById(request));
                for (JobMessage jobMessage : jobs) {
                    builder.addJobMsg(jobMessage);
                }
            }
            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
        } catch (Exception e) {
            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
        }
        builder.setHeader(header);
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    /**
     * 新建职位
     */
    @Override
    public void saveJobs(JobMessage request, StreamObserver<SaveJobResponse> responseObserver) {
        Boolean result = jobService.saveJob(request);
        ResponseHeader.Builder header = ResponseHeader.newBuilder();

        if (result) {
           header.setStatus(ResponseStatus.OK).setMessage("保存成功!");
        } else {
            header.setStatus(ResponseStatus.OK).setMessage("保存失败!");
        }

        SaveJobResponse response = SaveJobResponse.newBuilder().setHeader(header.build()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * 更新职位
     */
    @Override
    public void updateJobs(JobMessage request, StreamObserver<SaveJobResponse> responseObserver) {
        Boolean result = jobService.updateJob(request);
        ResponseHeader.Builder header = ResponseHeader.newBuilder();

        if (result) {
            header.setStatus(ResponseStatus.OK).setMessage("更新成功!");
        } else {
            header.setStatus(ResponseStatus.OK).setMessage("更新失败!");
        }

        SaveJobResponse response = SaveJobResponse.newBuilder().setHeader(header.build()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
