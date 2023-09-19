package com.kptl.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *定义员工服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: Job.proto")
public final class JobGrpc {

  private JobGrpc() {}

  public static final String SERVICE_NAME = "job.Job";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindJobResponse> METHOD_FIND_ALL_JOBS = getFindAllJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindJobResponse> getFindAllJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindJobResponse> getFindAllJobsMethod() {
    return getFindAllJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindJobResponse> getFindAllJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest, com.kptl.proto.FindJobResponse> getFindAllJobsMethod;
    if ((getFindAllJobsMethod = JobGrpc.getFindAllJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindAllJobsMethod = JobGrpc.getFindAllJobsMethod) == null) {
          JobGrpc.getFindAllJobsMethod = getFindAllJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindAllJobRequest, com.kptl.proto.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindAllJobs"))
                  .build();
          }
        }
     }
     return getFindAllJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindJobByNameRequest,
      com.kptl.proto.FindJobResponse> METHOD_FIND_JOB_BY_NAME = getFindJobByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindJobByNameRequest,
      com.kptl.proto.FindJobResponse> getFindJobByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindJobByNameRequest,
      com.kptl.proto.FindJobResponse> getFindJobByNameMethod() {
    return getFindJobByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindJobByNameRequest,
      com.kptl.proto.FindJobResponse> getFindJobByNameMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindJobByNameRequest, com.kptl.proto.FindJobResponse> getFindJobByNameMethod;
    if ((getFindJobByNameMethod = JobGrpc.getFindJobByNameMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobByNameMethod = JobGrpc.getFindJobByNameMethod) == null) {
          JobGrpc.getFindJobByNameMethod = getFindJobByNameMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindJobByNameRequest, com.kptl.proto.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindJobByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindJobByName"))
                  .build();
          }
        }
     }
     return getFindJobByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindJobByIdRequest,
      com.kptl.proto.FindJobResponse> METHOD_FIND_JOB_BY_ID = getFindJobByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindJobByIdRequest,
      com.kptl.proto.FindJobResponse> getFindJobByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindJobByIdRequest,
      com.kptl.proto.FindJobResponse> getFindJobByIdMethod() {
    return getFindJobByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindJobByIdRequest,
      com.kptl.proto.FindJobResponse> getFindJobByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindJobByIdRequest, com.kptl.proto.FindJobResponse> getFindJobByIdMethod;
    if ((getFindJobByIdMethod = JobGrpc.getFindJobByIdMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobByIdMethod = JobGrpc.getFindJobByIdMethod) == null) {
          JobGrpc.getFindJobByIdMethod = getFindJobByIdMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindJobByIdRequest, com.kptl.proto.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindJobById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindJobById"))
                  .build();
          }
        }
     }
     return getFindJobByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindJobRequest,
      com.kptl.proto.FindJobResponse> METHOD_FIND_JOBS = getFindJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindJobRequest,
      com.kptl.proto.FindJobResponse> getFindJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindJobRequest,
      com.kptl.proto.FindJobResponse> getFindJobsMethod() {
    return getFindJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindJobRequest,
      com.kptl.proto.FindJobResponse> getFindJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindJobRequest, com.kptl.proto.FindJobResponse> getFindJobsMethod;
    if ((getFindJobsMethod = JobGrpc.getFindJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsMethod = JobGrpc.getFindJobsMethod) == null) {
          JobGrpc.getFindJobsMethod = getFindJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindJobRequest, com.kptl.proto.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindJobs"))
                  .build();
          }
        }
     }
     return getFindJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsByTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindJobsByTypeReq,
      com.kptl.proto.FindSimplifyJobResponse> METHOD_FIND_JOBS_BY_TYPE = getFindJobsByTypeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindJobsByTypeReq,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsByTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindJobsByTypeReq,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsByTypeMethod() {
    return getFindJobsByTypeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindJobsByTypeReq,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsByTypeMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindJobsByTypeReq, com.kptl.proto.FindSimplifyJobResponse> getFindJobsByTypeMethod;
    if ((getFindJobsByTypeMethod = JobGrpc.getFindJobsByTypeMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsByTypeMethod = JobGrpc.getFindJobsByTypeMethod) == null) {
          JobGrpc.getFindJobsByTypeMethod = getFindJobsByTypeMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindJobsByTypeReq, com.kptl.proto.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindJobsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobsByTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindJobsByType"))
                  .build();
          }
        }
     }
     return getFindJobsByTypeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> METHOD_SAVE_JOBS = getSaveJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getSaveJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getSaveJobsMethod() {
    return getSaveJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getSaveJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse> getSaveJobsMethod;
    if ((getSaveJobsMethod = JobGrpc.getSaveJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getSaveJobsMethod = JobGrpc.getSaveJobsMethod) == null) {
          JobGrpc.getSaveJobsMethod = getSaveJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "SaveJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("SaveJobs"))
                  .build();
          }
        }
     }
     return getSaveJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsSimplifyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindSimplifyJobResponse> METHOD_FIND_JOBS_SIMPLIFY = getFindJobsSimplifyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsSimplifyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsSimplifyMethod() {
    return getFindJobsSimplifyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest,
      com.kptl.proto.FindSimplifyJobResponse> getFindJobsSimplifyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindAllJobRequest, com.kptl.proto.FindSimplifyJobResponse> getFindJobsSimplifyMethod;
    if ((getFindJobsSimplifyMethod = JobGrpc.getFindJobsSimplifyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsSimplifyMethod = JobGrpc.getFindJobsSimplifyMethod) == null) {
          JobGrpc.getFindJobsSimplifyMethod = getFindJobsSimplifyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindAllJobRequest, com.kptl.proto.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindJobsSimplify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindJobsSimplify"))
                  .build();
          }
        }
     }
     return getFindJobsSimplifyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> METHOD_UPDATE_JOBS = getUpdateJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getUpdateJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getUpdateJobsMethod() {
    return getUpdateJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.JobMessage,
      com.kptl.proto.SaveJobResponse> getUpdateJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse> getUpdateJobsMethod;
    if ((getUpdateJobsMethod = JobGrpc.getUpdateJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getUpdateJobsMethod = JobGrpc.getUpdateJobsMethod) == null) {
          JobGrpc.getUpdateJobsMethod = getUpdateJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "UpdateJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("UpdateJobs"))
                  .build();
          }
        }
     }
     return getUpdateJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisteredCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.Company,
      com.kptl.proto.CommonResponse> METHOD_REGISTERED_COMPANY = getRegisteredCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.Company,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.Company,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethod() {
    return getRegisteredCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.Company,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.Company, com.kptl.proto.CommonResponse> getRegisteredCompanyMethod;
    if ((getRegisteredCompanyMethod = JobGrpc.getRegisteredCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getRegisteredCompanyMethod = JobGrpc.getRegisteredCompanyMethod) == null) {
          JobGrpc.getRegisteredCompanyMethod = getRegisteredCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.Company, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "RegisteredCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.Company.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("RegisteredCompany"))
                  .build();
          }
        }
     }
     return getRegisteredCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> METHOD_UPDATE_COMPANY = getUpdateCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getUpdateCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getUpdateCompanyMethod() {
    return getUpdateCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getUpdateCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq, com.kptl.proto.CommonResponse> getUpdateCompanyMethod;
    if ((getUpdateCompanyMethod = JobGrpc.getUpdateCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getUpdateCompanyMethod = JobGrpc.getUpdateCompanyMethod) == null) {
          JobGrpc.getUpdateCompanyMethod = getUpdateCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.RegisteredCompanyReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "UpdateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.RegisteredCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("UpdateCompany"))
                  .build();
          }
        }
     }
     return getUpdateCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindCompanyByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindCompanyByNameReq,
      com.kptl.proto.CommonCompanyResponse> METHOD_FIND_COMPANY_BY_NAME = getFindCompanyByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindCompanyByNameReq,
      com.kptl.proto.CommonCompanyResponse> getFindCompanyByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindCompanyByNameReq,
      com.kptl.proto.CommonCompanyResponse> getFindCompanyByNameMethod() {
    return getFindCompanyByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindCompanyByNameReq,
      com.kptl.proto.CommonCompanyResponse> getFindCompanyByNameMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindCompanyByNameReq, com.kptl.proto.CommonCompanyResponse> getFindCompanyByNameMethod;
    if ((getFindCompanyByNameMethod = JobGrpc.getFindCompanyByNameMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindCompanyByNameMethod = JobGrpc.getFindCompanyByNameMethod) == null) {
          JobGrpc.getFindCompanyByNameMethod = getFindCompanyByNameMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindCompanyByNameReq, com.kptl.proto.CommonCompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindCompanyByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindCompanyByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonCompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindCompanyByName"))
                  .build();
          }
        }
     }
     return getFindCompanyByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindCompanyByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.FindCompanyByIdResponse> METHOD_FIND_COMPANY_BY_ID = getFindCompanyByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.FindCompanyByIdResponse> getFindCompanyByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.FindCompanyByIdResponse> getFindCompanyByIdMethod() {
    return getFindCompanyByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.FindCompanyByIdResponse> getFindCompanyByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq, com.kptl.proto.FindCompanyByIdResponse> getFindCompanyByIdMethod;
    if ((getFindCompanyByIdMethod = JobGrpc.getFindCompanyByIdMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindCompanyByIdMethod = JobGrpc.getFindCompanyByIdMethod) == null) {
          JobGrpc.getFindCompanyByIdMethod = getFindCompanyByIdMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.CommonCompanyReq, com.kptl.proto.FindCompanyByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindCompanyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindCompanyByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindCompanyById"))
                  .build();
          }
        }
     }
     return getFindCompanyByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllCompaniesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.FindAllCompaniesReq,
      com.kptl.proto.CommonCompanyResponse> METHOD_FIND_ALL_COMPANIES = getFindAllCompaniesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.FindAllCompaniesReq,
      com.kptl.proto.CommonCompanyResponse> getFindAllCompaniesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.FindAllCompaniesReq,
      com.kptl.proto.CommonCompanyResponse> getFindAllCompaniesMethod() {
    return getFindAllCompaniesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.FindAllCompaniesReq,
      com.kptl.proto.CommonCompanyResponse> getFindAllCompaniesMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.FindAllCompaniesReq, com.kptl.proto.CommonCompanyResponse> getFindAllCompaniesMethod;
    if ((getFindAllCompaniesMethod = JobGrpc.getFindAllCompaniesMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindAllCompaniesMethod = JobGrpc.getFindAllCompaniesMethod) == null) {
          JobGrpc.getFindAllCompaniesMethod = getFindAllCompaniesMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindAllCompaniesReq, com.kptl.proto.CommonCompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "FindAllCompanies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindAllCompaniesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonCompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("FindAllCompanies"))
                  .build();
          }
        }
     }
     return getFindAllCompaniesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBoundCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> METHOD_BOUND_COMPANY = getBoundCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getBoundCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getBoundCompanyMethod() {
    return getBoundCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getBoundCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq, com.kptl.proto.CommonResponse> getBoundCompanyMethod;
    if ((getBoundCompanyMethod = JobGrpc.getBoundCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getBoundCompanyMethod = JobGrpc.getBoundCompanyMethod) == null) {
          JobGrpc.getBoundCompanyMethod = getBoundCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.CommonCompanyReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "BoundCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("BoundCompany"))
                  .build();
          }
        }
     }
     return getBoundCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVerifyCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> METHOD_VERIFY_COMPANY = getVerifyCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethod() {
    return getVerifyCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.CommonCompanyReq, com.kptl.proto.CommonResponse> getVerifyCompanyMethod;
    if ((getVerifyCompanyMethod = JobGrpc.getVerifyCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getVerifyCompanyMethod = JobGrpc.getVerifyCompanyMethod) == null) {
          JobGrpc.getVerifyCompanyMethod = getVerifyCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.CommonCompanyReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "VerifyCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("VerifyCompany"))
                  .build();
          }
        }
     }
     return getVerifyCompanyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobStub newStub(io.grpc.Channel channel) {
    return new JobStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobFutureStub(channel);
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static abstract class JobImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllJobs(com.kptl.proto.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobByName(com.kptl.proto.FindJobByNameRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobByNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobById(com.kptl.proto.FindJobByIdRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobs(com.kptl.proto.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobsByType(com.kptl.proto.FindJobsByTypeReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsByTypeMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveJobsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public void findJobsSimplify(com.kptl.proto.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsSimplifyMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void registeredCompany(com.kptl.proto.Company request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateCompany(com.kptl.proto.RegisteredCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void findCompanyByName(com.kptl.proto.FindCompanyByNameReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCompanyByNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void findCompanyById(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindCompanyByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCompanyByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findAllCompanies(com.kptl.proto.FindAllCompaniesReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllCompaniesMethodHelper(), responseObserver);
    }

    /**
     */
    public void boundCompany(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoundCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyCompanyMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindAllJobRequest,
                com.kptl.proto.FindJobResponse>(
                  this, METHODID_FIND_ALL_JOBS)))
          .addMethod(
            getFindJobByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindJobByNameRequest,
                com.kptl.proto.FindJobResponse>(
                  this, METHODID_FIND_JOB_BY_NAME)))
          .addMethod(
            getFindJobByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindJobByIdRequest,
                com.kptl.proto.FindJobResponse>(
                  this, METHODID_FIND_JOB_BY_ID)))
          .addMethod(
            getFindJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindJobRequest,
                com.kptl.proto.FindJobResponse>(
                  this, METHODID_FIND_JOBS)))
          .addMethod(
            getFindJobsByTypeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindJobsByTypeReq,
                com.kptl.proto.FindSimplifyJobResponse>(
                  this, METHODID_FIND_JOBS_BY_TYPE)))
          .addMethod(
            getSaveJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.JobMessage,
                com.kptl.proto.SaveJobResponse>(
                  this, METHODID_SAVE_JOBS)))
          .addMethod(
            getFindJobsSimplifyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindAllJobRequest,
                com.kptl.proto.FindSimplifyJobResponse>(
                  this, METHODID_FIND_JOBS_SIMPLIFY)))
          .addMethod(
            getUpdateJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.JobMessage,
                com.kptl.proto.SaveJobResponse>(
                  this, METHODID_UPDATE_JOBS)))
          .addMethod(
            getRegisteredCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.Company,
                com.kptl.proto.CommonResponse>(
                  this, METHODID_REGISTERED_COMPANY)))
          .addMethod(
            getUpdateCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.RegisteredCompanyReq,
                com.kptl.proto.CommonResponse>(
                  this, METHODID_UPDATE_COMPANY)))
          .addMethod(
            getFindCompanyByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindCompanyByNameReq,
                com.kptl.proto.CommonCompanyResponse>(
                  this, METHODID_FIND_COMPANY_BY_NAME)))
          .addMethod(
            getFindCompanyByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.CommonCompanyReq,
                com.kptl.proto.FindCompanyByIdResponse>(
                  this, METHODID_FIND_COMPANY_BY_ID)))
          .addMethod(
            getFindAllCompaniesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindAllCompaniesReq,
                com.kptl.proto.CommonCompanyResponse>(
                  this, METHODID_FIND_ALL_COMPANIES)))
          .addMethod(
            getBoundCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.CommonCompanyReq,
                com.kptl.proto.CommonResponse>(
                  this, METHODID_BOUND_COMPANY)))
          .addMethod(
            getVerifyCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.CommonCompanyReq,
                com.kptl.proto.CommonResponse>(
                  this, METHODID_VERIFY_COMPANY)))
          .build();
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobStub extends io.grpc.stub.AbstractStub<JobStub> {
    private JobStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobStub(channel, callOptions);
    }

    /**
     */
    public void findAllJobs(com.kptl.proto.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobByName(com.kptl.proto.FindJobByNameRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobById(com.kptl.proto.FindJobByIdRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobs(com.kptl.proto.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobsByType(com.kptl.proto.FindJobsByTypeReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsByTypeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public void findJobsSimplify(com.kptl.proto.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsSimplifyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registeredCompany(com.kptl.proto.Company request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCompany(com.kptl.proto.RegisteredCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCompanyByName(com.kptl.proto.FindCompanyByNameReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCompanyByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCompanyById(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindCompanyByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCompanyByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllCompanies(com.kptl.proto.FindAllCompaniesReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllCompaniesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void boundCompany(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoundCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobBlockingStub extends io.grpc.stub.AbstractStub<JobBlockingStub> {
    private JobBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kptl.proto.FindJobResponse findAllJobs(com.kptl.proto.FindAllJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.FindJobResponse findJobByName(com.kptl.proto.FindJobByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobByNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.FindJobResponse findJobById(com.kptl.proto.FindJobByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.FindJobResponse findJobs(com.kptl.proto.FindJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.FindSimplifyJobResponse findJobsByType(com.kptl.proto.FindJobsByTypeReq request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsByTypeMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.SaveJobResponse saveJobs(com.kptl.proto.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getSaveJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public com.kptl.proto.FindSimplifyJobResponse findJobsSimplify(com.kptl.proto.FindAllJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsSimplifyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.SaveJobResponse updateJobs(com.kptl.proto.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse registeredCompany(com.kptl.proto.Company request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse updateCompany(com.kptl.proto.RegisteredCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonCompanyResponse findCompanyByName(com.kptl.proto.FindCompanyByNameReq request) {
      return blockingUnaryCall(
          getChannel(), getFindCompanyByNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.FindCompanyByIdResponse findCompanyById(com.kptl.proto.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getFindCompanyByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonCompanyResponse findAllCompanies(com.kptl.proto.FindAllCompaniesReq request) {
      return blockingUnaryCall(
          getChannel(), getFindAllCompaniesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse boundCompany(com.kptl.proto.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getBoundCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse verifyCompany(com.kptl.proto.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getVerifyCompanyMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobFutureStub extends io.grpc.stub.AbstractStub<JobFutureStub> {
    private JobFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindJobResponse> findAllJobs(
        com.kptl.proto.FindAllJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindJobResponse> findJobByName(
        com.kptl.proto.FindJobByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobByNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindJobResponse> findJobById(
        com.kptl.proto.FindJobByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindJobResponse> findJobs(
        com.kptl.proto.FindJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindSimplifyJobResponse> findJobsByType(
        com.kptl.proto.FindJobsByTypeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsByTypeMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.SaveJobResponse> saveJobs(
        com.kptl.proto.JobMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindSimplifyJobResponse> findJobsSimplify(
        com.kptl.proto.FindAllJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsSimplifyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.SaveJobResponse> updateJobs(
        com.kptl.proto.JobMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> registeredCompany(
        com.kptl.proto.Company request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> updateCompany(
        com.kptl.proto.RegisteredCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonCompanyResponse> findCompanyByName(
        com.kptl.proto.FindCompanyByNameReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCompanyByNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindCompanyByIdResponse> findCompanyById(
        com.kptl.proto.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCompanyByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonCompanyResponse> findAllCompanies(
        com.kptl.proto.FindAllCompaniesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllCompaniesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> boundCompany(
        com.kptl.proto.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBoundCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> verifyCompany(
        com.kptl.proto.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyCompanyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_JOBS = 0;
  private static final int METHODID_FIND_JOB_BY_NAME = 1;
  private static final int METHODID_FIND_JOB_BY_ID = 2;
  private static final int METHODID_FIND_JOBS = 3;
  private static final int METHODID_FIND_JOBS_BY_TYPE = 4;
  private static final int METHODID_SAVE_JOBS = 5;
  private static final int METHODID_FIND_JOBS_SIMPLIFY = 6;
  private static final int METHODID_UPDATE_JOBS = 7;
  private static final int METHODID_REGISTERED_COMPANY = 8;
  private static final int METHODID_UPDATE_COMPANY = 9;
  private static final int METHODID_FIND_COMPANY_BY_NAME = 10;
  private static final int METHODID_FIND_COMPANY_BY_ID = 11;
  private static final int METHODID_FIND_ALL_COMPANIES = 12;
  private static final int METHODID_BOUND_COMPANY = 13;
  private static final int METHODID_VERIFY_COMPANY = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_JOBS:
          serviceImpl.findAllJobs((com.kptl.proto.FindAllJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOB_BY_NAME:
          serviceImpl.findJobByName((com.kptl.proto.FindJobByNameRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOB_BY_ID:
          serviceImpl.findJobById((com.kptl.proto.FindJobByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS:
          serviceImpl.findJobs((com.kptl.proto.FindJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS_BY_TYPE:
          serviceImpl.findJobsByType((com.kptl.proto.FindJobsByTypeReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse>) responseObserver);
          break;
        case METHODID_SAVE_JOBS:
          serviceImpl.saveJobs((com.kptl.proto.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS_SIMPLIFY:
          serviceImpl.findJobsSimplify((com.kptl.proto.FindAllJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindSimplifyJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOBS:
          serviceImpl.updateJobs((com.kptl.proto.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_COMPANY:
          serviceImpl.registeredCompany((com.kptl.proto.Company) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY:
          serviceImpl.updateCompany((com.kptl.proto.RegisteredCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_FIND_COMPANY_BY_NAME:
          serviceImpl.findCompanyByName((com.kptl.proto.FindCompanyByNameReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse>) responseObserver);
          break;
        case METHODID_FIND_COMPANY_BY_ID:
          serviceImpl.findCompanyById((com.kptl.proto.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindCompanyByIdResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_COMPANIES:
          serviceImpl.findAllCompanies((com.kptl.proto.FindAllCompaniesReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonCompanyResponse>) responseObserver);
          break;
        case METHODID_BOUND_COMPANY:
          serviceImpl.boundCompany((com.kptl.proto.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_VERIFY_COMPANY:
          serviceImpl.verifyCompany((com.kptl.proto.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kptl.proto.JobOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Job");
    }
  }

  private static final class JobFileDescriptorSupplier
      extends JobBaseDescriptorSupplier {
    JobFileDescriptorSupplier() {}
  }

  private static final class JobMethodDescriptorSupplier
      extends JobBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobFileDescriptorSupplier())
              .addMethod(getFindAllJobsMethodHelper())
              .addMethod(getFindJobByNameMethodHelper())
              .addMethod(getFindJobByIdMethodHelper())
              .addMethod(getFindJobsMethodHelper())
              .addMethod(getFindJobsByTypeMethodHelper())
              .addMethod(getSaveJobsMethodHelper())
              .addMethod(getFindJobsSimplifyMethodHelper())
              .addMethod(getUpdateJobsMethodHelper())
              .addMethod(getRegisteredCompanyMethodHelper())
              .addMethod(getUpdateCompanyMethodHelper())
              .addMethod(getFindCompanyByNameMethodHelper())
              .addMethod(getFindCompanyByIdMethodHelper())
              .addMethod(getFindAllCompaniesMethodHelper())
              .addMethod(getBoundCompanyMethodHelper())
              .addMethod(getVerifyCompanyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
