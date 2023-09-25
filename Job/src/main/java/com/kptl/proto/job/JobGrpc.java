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
    comments = "Source: job/Job.proto")
public final class JobGrpc {

  private JobGrpc() {}

  public static final String SERVICE_NAME = "job.Job";

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
    if ((getFindAllJobsMethod = JobGrpc.getFindAllJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindAllJobsMethod = JobGrpc.getFindAllJobsMethod) == null) {
          JobGrpc.getFindAllJobsMethod = getFindAllJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findAllJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findAllJobs"))
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
    if ((getFindJobByNameMethod = JobGrpc.getFindJobByNameMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobByNameMethod = JobGrpc.getFindJobByNameMethod) == null) {
          JobGrpc.getFindJobByNameMethod = getFindJobByNameMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobByNameRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobByName"))
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
    if ((getFindJobByIdMethod = JobGrpc.getFindJobByIdMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobByIdMethod = JobGrpc.getFindJobByIdMethod) == null) {
          JobGrpc.getFindJobByIdMethod = getFindJobByIdMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobByIdRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobById"))
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
    if ((getFindJobsByIndustryMethod = JobGrpc.getFindJobsByIndustryMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsByIndustryMethod = JobGrpc.getFindJobsByIndustryMethod) == null) {
          JobGrpc.getFindJobsByIndustryMethod = getFindJobsByIndustryMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobsByIndustryReq, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobsByIndustry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobsByIndustryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobsByIndustry"))
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
    if ((getFindJobsMethod = JobGrpc.getFindJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsMethod = JobGrpc.getFindJobsMethod) == null) {
          JobGrpc.getFindJobsMethod = getFindJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobRequest, com.kptl.proto.job.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobs"))
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
    if ((getFindJobsByTypeMethod = JobGrpc.getFindJobsByTypeMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsByTypeMethod = JobGrpc.getFindJobsByTypeMethod) == null) {
          JobGrpc.getFindJobsByTypeMethod = getFindJobsByTypeMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindJobsByTypeReq, com.kptl.proto.job.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobsByType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindJobsByTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobsByType"))
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
    if ((getSaveJobsMethod = JobGrpc.getSaveJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getSaveJobsMethod = JobGrpc.getSaveJobsMethod) == null) {
          JobGrpc.getSaveJobsMethod = getSaveJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "saveJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("saveJobs"))
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
    if ((getFindJobsSimplifyMethod = JobGrpc.getFindJobsSimplifyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getFindJobsSimplifyMethod = JobGrpc.getFindJobsSimplifyMethod) == null) {
          JobGrpc.getFindJobsSimplifyMethod = getFindJobsSimplifyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.FindAllJobRequest, com.kptl.proto.job.FindSimplifyJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "findJobsSimplify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindAllJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.FindSimplifyJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("findJobsSimplify"))
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
    if ((getUpdateJobsMethod = JobGrpc.getUpdateJobsMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getUpdateJobsMethod = JobGrpc.getUpdateJobsMethod) == null) {
          JobGrpc.getUpdateJobsMethod = getUpdateJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.job.JobMessage, com.kptl.proto.job.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "updateJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.job.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("updateJobs"))
                  .build();
          }
        }
     }
     return getUpdateJobsMethod;
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

  private static abstract class JobBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kptl.proto.job.JobOuterClass.getDescriptor();
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
