package com.kptl.proto.job;

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
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "jobService.JobService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindJobResponse> METHOD_FIND_ALL_JOBS = getFindAllJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindAllJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindAllJobsMethod() {
    return getFindAllJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindAllJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindJobResponse> getFindAllJobsMethod;
    if ((getFindAllJobsMethod = JobServiceGrpc.getFindAllJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindAllJobsMethod = JobServiceGrpc.getFindAllJobsMethod) == null) {
          JobServiceGrpc.getFindAllJobsMethod = getFindAllJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindAllJobs"))
                  .build();
          }
        }
     }
     return getFindAllJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByNameRequest,
      com.kptl.proto.job.FindJobResponse> METHOD_FIND_JOB_BY_NAME = getFindJobByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByNameRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByNameRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByNameMethod() {
    return getFindJobByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByNameRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByNameMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByNameRequest, com.kptl.proto.job.FindJobResponse> getFindJobByNameMethod;
    if ((getFindJobByNameMethod = JobServiceGrpc.getFindJobByNameMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobByNameMethod = JobServiceGrpc.getFindJobByNameMethod) == null) {
          JobServiceGrpc.getFindJobByNameMethod = getFindJobByNameMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobByNameRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobByName"))
                  .build();
          }
        }
     }
     return getFindJobByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByIdRequest,
      com.kptl.proto.job.FindJobResponse> METHOD_FIND_JOB_BY_ID = getFindJobByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByIdRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByIdRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByIdMethod() {
    return getFindJobByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByIdRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobByIdRequest, com.kptl.proto.job.FindJobResponse> getFindJobByIdMethod;
    if ((getFindJobByIdMethod = JobServiceGrpc.getFindJobByIdMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobByIdMethod = JobServiceGrpc.getFindJobByIdMethod) == null) {
          JobServiceGrpc.getFindJobByIdMethod = getFindJobByIdMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobByIdRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobById"))
                  .build();
          }
        }
     }
     return getFindJobByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsByIndustryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByIndustryReq,
      com.kptl.proto.job.FindJobResponse> METHOD_FIND_JOBS_BY_INDUSTRY = getFindJobsByIndustryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByIndustryReq,
      com.kptl.proto.job.FindJobResponse> getFindJobsByIndustryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByIndustryReq,
      com.kptl.proto.job.FindJobResponse> getFindJobsByIndustryMethod() {
    return getFindJobsByIndustryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByIndustryReq,
      com.kptl.proto.job.FindJobResponse> getFindJobsByIndustryMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByIndustryReq, com.kptl.proto.job.FindJobResponse> getFindJobsByIndustryMethod;
    if ((getFindJobsByIndustryMethod = JobServiceGrpc.getFindJobsByIndustryMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobsByIndustryMethod = JobServiceGrpc.getFindJobsByIndustryMethod) == null) {
          JobServiceGrpc.getFindJobsByIndustryMethod = getFindJobsByIndustryMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobsByIndustryReq, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobsByIndustry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobsByIndustryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobsByIndustry"))
                  .build();
          }
        }
     }
     return getFindJobsByIndustryMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobRequest,
      com.kptl.proto.job.FindJobResponse> METHOD_FIND_JOBS = getFindJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobsMethod() {
    return getFindJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobRequest,
      com.kptl.proto.job.FindJobResponse> getFindJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobRequest, com.kptl.proto.job.FindJobResponse> getFindJobsMethod;
    if ((getFindJobsMethod = JobServiceGrpc.getFindJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobsMethod = JobServiceGrpc.getFindJobsMethod) == null) {
          JobServiceGrpc.getFindJobsMethod = getFindJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobs"))
                  .build();
          }
        }
     }
     return getFindJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsByTypeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByTypeReq,
      com.kptl.proto.job.FindSimplifyJobResponse> METHOD_FIND_JOBS_BY_TYPE = getFindJobsByTypeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByTypeReq,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsByTypeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByTypeReq,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsByTypeMethod() {
    return getFindJobsByTypeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByTypeReq,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsByTypeMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindJobsByTypeReq, com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsByTypeMethod;
    if ((getFindJobsByTypeMethod = JobServiceGrpc.getFindJobsByTypeMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobsByTypeMethod = JobServiceGrpc.getFindJobsByTypeMethod) == null) {
          JobServiceGrpc.getFindJobsByTypeMethod = getFindJobsByTypeMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobsByTypeReq, com.kptl.proto.job.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobsByTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobsByType"))
                  .build();
          }
        }
     }
     return getFindJobsByTypeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSaveJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> METHOD_SAVE_JOBS = getSaveJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getSaveJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getSaveJobsMethod() {
    return getSaveJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getSaveJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse> getSaveJobsMethod;
    if ((getSaveJobsMethod = JobServiceGrpc.getSaveJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getSaveJobsMethod = JobServiceGrpc.getSaveJobsMethod) == null) {
          JobServiceGrpc.getSaveJobsMethod = getSaveJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "SaveJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("SaveJobs"))
                  .build();
          }
        }
     }
     return getSaveJobsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindJobsSimplifyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindSimplifyJobResponse> METHOD_FIND_JOBS_SIMPLIFY = getFindJobsSimplifyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsSimplifyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsSimplifyMethod() {
    return getFindJobsSimplifyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest,
      com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsSimplifyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindSimplifyJobResponse> getFindJobsSimplifyMethod;
    if ((getFindJobsSimplifyMethod = JobServiceGrpc.getFindJobsSimplifyMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobsSimplifyMethod = JobServiceGrpc.getFindJobsSimplifyMethod) == null) {
          JobServiceGrpc.getFindJobsSimplifyMethod = getFindJobsSimplifyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "FindJobsSimplify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJobsSimplify"))
                  .build();
          }
        }
     }
     return getFindJobsSimplifyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateJobsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> METHOD_UPDATE_JOBS = getUpdateJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getUpdateJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getUpdateJobsMethod() {
    return getUpdateJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage,
      com.kptl.proto.job.SaveJobResponse> getUpdateJobsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse> getUpdateJobsMethod;
    if ((getUpdateJobsMethod = JobServiceGrpc.getUpdateJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getUpdateJobsMethod = JobServiceGrpc.getUpdateJobsMethod) == null) {
          JobServiceGrpc.getUpdateJobsMethod = getUpdateJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobService.JobService", "UpdateJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("UpdateJobs"))
                  .build();
          }
        }
     }
     return getUpdateJobsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    return new JobServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobServiceFutureStub(channel);
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllJobs(com.kptl.proto.job.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobByName(com.kptl.proto.job.FindJobByNameRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobByNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobById(com.kptl.proto.job.FindJobByIdRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobsByIndustry(com.kptl.proto.job.FindJobsByIndustryReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsByIndustryMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobs(com.kptl.proto.job.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void findJobsByType(com.kptl.proto.job.FindJobsByTypeReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsByTypeMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.job.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveJobsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public void findJobsSimplify(com.kptl.proto.job.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsSimplifyMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateJobs(com.kptl.proto.job.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindAllJobRequest,
                com.kptl.proto.job.FindJobResponse>(
                  this, METHODID_FIND_ALL_JOBS)))
          .addMethod(
            getFindJobByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindJobByNameRequest,
                com.kptl.proto.job.FindJobResponse>(
                  this, METHODID_FIND_JOB_BY_NAME)))
          .addMethod(
            getFindJobByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindJobByIdRequest,
                com.kptl.proto.job.FindJobResponse>(
                  this, METHODID_FIND_JOB_BY_ID)))
          .addMethod(
            getFindJobsByIndustryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindJobsByIndustryReq,
                com.kptl.proto.job.FindJobResponse>(
                  this, METHODID_FIND_JOBS_BY_INDUSTRY)))
          .addMethod(
            getFindJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindJobRequest,
                com.kptl.proto.job.FindJobResponse>(
                  this, METHODID_FIND_JOBS)))
          .addMethod(
            getFindJobsByTypeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindJobsByTypeReq,
                com.kptl.proto.job.FindSimplifyJobResponse>(
                  this, METHODID_FIND_JOBS_BY_TYPE)))
          .addMethod(
            getSaveJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.JobMessage,
                com.kptl.proto.job.SaveJobResponse>(
                  this, METHODID_SAVE_JOBS)))
          .addMethod(
            getFindJobsSimplifyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.FindAllJobRequest,
                com.kptl.proto.job.FindSimplifyJobResponse>(
                  this, METHODID_FIND_JOBS_SIMPLIFY)))
          .addMethod(
            getUpdateJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.job.JobMessage,
                com.kptl.proto.job.SaveJobResponse>(
                  this, METHODID_UPDATE_JOBS)))
          .build();
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractStub<JobServiceStub> {
    private JobServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     */
    public void findAllJobs(com.kptl.proto.job.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobByName(com.kptl.proto.job.FindJobByNameRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobById(com.kptl.proto.job.FindJobByIdRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobsByIndustry(com.kptl.proto.job.FindJobsByIndustryReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsByIndustryMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobs(com.kptl.proto.job.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJobsByType(com.kptl.proto.job.FindJobsByTypeReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsByTypeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.job.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public void findJobsSimplify(com.kptl.proto.job.FindAllJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsSimplifyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateJobs(com.kptl.proto.job.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kptl.proto.job.FindJobResponse findAllJobs(com.kptl.proto.job.FindAllJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAllJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.FindJobResponse findJobByName(com.kptl.proto.job.FindJobByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobByNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.FindJobResponse findJobById(com.kptl.proto.job.FindJobByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.FindJobResponse findJobsByIndustry(com.kptl.proto.job.FindJobsByIndustryReq request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsByIndustryMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.FindJobResponse findJobs(com.kptl.proto.job.FindJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.FindSimplifyJobResponse findJobsByType(com.kptl.proto.job.FindJobsByTypeReq request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsByTypeMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.SaveJobResponse saveJobs(com.kptl.proto.job.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getSaveJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public com.kptl.proto.job.FindSimplifyJobResponse findJobsSimplify(com.kptl.proto.job.FindAllJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsSimplifyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.job.SaveJobResponse updateJobs(com.kptl.proto.job.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateJobsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractStub<JobServiceFutureStub> {
    private JobServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindJobResponse> findAllJobs(
        com.kptl.proto.job.FindAllJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindJobResponse> findJobByName(
        com.kptl.proto.job.FindJobByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobByNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindJobResponse> findJobById(
        com.kptl.proto.job.FindJobByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindJobResponse> findJobsByIndustry(
        com.kptl.proto.job.FindJobsByIndustryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsByIndustryMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindJobResponse> findJobs(
        com.kptl.proto.job.FindJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindSimplifyJobResponse> findJobsByType(
        com.kptl.proto.job.FindJobsByTypeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsByTypeMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.SaveJobResponse> saveJobs(
        com.kptl.proto.job.JobMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     *职位简洁信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.FindSimplifyJobResponse> findJobsSimplify(
        com.kptl.proto.job.FindAllJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsSimplifyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.job.SaveJobResponse> updateJobs(
        com.kptl.proto.job.JobMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateJobsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_JOBS = 0;
  private static final int METHODID_FIND_JOB_BY_NAME = 1;
  private static final int METHODID_FIND_JOB_BY_ID = 2;
  private static final int METHODID_FIND_JOBS_BY_INDUSTRY = 3;
  private static final int METHODID_FIND_JOBS = 4;
  private static final int METHODID_FIND_JOBS_BY_TYPE = 5;
  private static final int METHODID_SAVE_JOBS = 6;
  private static final int METHODID_FIND_JOBS_SIMPLIFY = 7;
  private static final int METHODID_UPDATE_JOBS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_JOBS:
          serviceImpl.findAllJobs((com.kptl.proto.job.FindAllJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOB_BY_NAME:
          serviceImpl.findJobByName((com.kptl.proto.job.FindJobByNameRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOB_BY_ID:
          serviceImpl.findJobById((com.kptl.proto.job.FindJobByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS_BY_INDUSTRY:
          serviceImpl.findJobsByIndustry((com.kptl.proto.job.FindJobsByIndustryReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS:
          serviceImpl.findJobs((com.kptl.proto.job.FindJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS_BY_TYPE:
          serviceImpl.findJobsByType((com.kptl.proto.job.FindJobsByTypeReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse>) responseObserver);
          break;
        case METHODID_SAVE_JOBS:
          serviceImpl.saveJobs((com.kptl.proto.job.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOBS_SIMPLIFY:
          serviceImpl.findJobsSimplify((com.kptl.proto.job.FindAllJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.FindSimplifyJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOBS:
          serviceImpl.updateJobs((com.kptl.proto.job.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.job.SaveJobResponse>) responseObserver);
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

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kptl.proto.job.Job.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getFindAllJobsMethodHelper())
              .addMethod(getFindJobByNameMethodHelper())
              .addMethod(getFindJobByIdMethodHelper())
              .addMethod(getFindJobsByIndustryMethodHelper())
              .addMethod(getFindJobsMethodHelper())
              .addMethod(getFindJobsByTypeMethodHelper())
              .addMethod(getSaveJobsMethodHelper())
              .addMethod(getFindJobsSimplifyMethodHelper())
              .addMethod(getUpdateJobsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
