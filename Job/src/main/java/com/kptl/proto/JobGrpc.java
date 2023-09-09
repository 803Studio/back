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
  public static final io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> METHOD_REGISTERED_COMPANY = getRegisteredCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethod() {
    return getRegisteredCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq,
      com.kptl.proto.CommonResponse> getRegisteredCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.RegisteredCompanyReq, com.kptl.proto.CommonResponse> getRegisteredCompanyMethod;
    if ((getRegisteredCompanyMethod = JobGrpc.getRegisteredCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getRegisteredCompanyMethod = JobGrpc.getRegisteredCompanyMethod) == null) {
          JobGrpc.getRegisteredCompanyMethod = getRegisteredCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.RegisteredCompanyReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "RegisteredCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.RegisteredCompanyReq.getDefaultInstance()))
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
                  "job.Job", "updateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.RegisteredCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("updateCompany"))
                  .build();
          }
        }
     }
     return getUpdateCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisteredRecruiterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.RegisteredRecruiterReq,
      com.kptl.proto.CommonResponse> METHOD_REGISTERED_RECRUITER = getRegisteredRecruiterMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.RegisteredRecruiterReq,
      com.kptl.proto.CommonResponse> getRegisteredRecruiterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredRecruiterReq,
      com.kptl.proto.CommonResponse> getRegisteredRecruiterMethod() {
    return getRegisteredRecruiterMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.RegisteredRecruiterReq,
      com.kptl.proto.CommonResponse> getRegisteredRecruiterMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.RegisteredRecruiterReq, com.kptl.proto.CommonResponse> getRegisteredRecruiterMethod;
    if ((getRegisteredRecruiterMethod = JobGrpc.getRegisteredRecruiterMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getRegisteredRecruiterMethod = JobGrpc.getRegisteredRecruiterMethod) == null) {
          JobGrpc.getRegisteredRecruiterMethod = getRegisteredRecruiterMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.RegisteredRecruiterReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "RegisteredRecruiter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.RegisteredRecruiterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JobMethodDescriptorSupplier("RegisteredRecruiter"))
                  .build();
          }
        }
     }
     return getRegisteredRecruiterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVerifyCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.VerifyCompanyReq,
      com.kptl.proto.CommonResponse> METHOD_VERIFY_COMPANY = getVerifyCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.VerifyCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.VerifyCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethod() {
    return getVerifyCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.VerifyCompanyReq,
      com.kptl.proto.CommonResponse> getVerifyCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.VerifyCompanyReq, com.kptl.proto.CommonResponse> getVerifyCompanyMethod;
    if ((getVerifyCompanyMethod = JobGrpc.getVerifyCompanyMethod) == null) {
      synchronized (JobGrpc.class) {
        if ((getVerifyCompanyMethod = JobGrpc.getVerifyCompanyMethod) == null) {
          JobGrpc.getVerifyCompanyMethod = getVerifyCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.VerifyCompanyReq, com.kptl.proto.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Job", "VerifyCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.VerifyCompanyReq.getDefaultInstance()))
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
    public void findJobs(com.kptl.proto.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobsMethodHelper(), responseObserver);
    }

    /**
     */
    public void registeredCompany(com.kptl.proto.RegisteredCompanyReq request,
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
    public void registeredRecruiter(com.kptl.proto.RegisteredRecruiterReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredRecruiterMethodHelper(), responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.VerifyCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyCompanyMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.FindJobRequest,
                com.kptl.proto.FindJobResponse>(
                  this, METHODID_FIND_JOBS)))
          .addMethod(
            getSaveJobsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.JobMessage,
                com.kptl.proto.SaveJobResponse>(
                  this, METHODID_SAVE_JOBS)))
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
                com.kptl.proto.RegisteredCompanyReq,
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
            getRegisteredRecruiterMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.RegisteredRecruiterReq,
                com.kptl.proto.CommonResponse>(
                  this, METHODID_REGISTERED_RECRUITER)))
          .addMethod(
            getVerifyCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.VerifyCompanyReq,
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
    public void findJobs(com.kptl.proto.FindJobRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveJobs(com.kptl.proto.JobMessage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request, responseObserver);
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
    public void registeredCompany(com.kptl.proto.RegisteredCompanyReq request,
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
    public void registeredRecruiter(com.kptl.proto.RegisteredRecruiterReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredRecruiterMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.VerifyCompanyReq request,
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
    public com.kptl.proto.FindJobResponse findJobs(com.kptl.proto.FindJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.SaveJobResponse saveJobs(com.kptl.proto.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getSaveJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.SaveJobResponse updateJobs(com.kptl.proto.JobMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateJobsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse registeredCompany(com.kptl.proto.RegisteredCompanyReq request) {
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
    public com.kptl.proto.CommonResponse registeredRecruiter(com.kptl.proto.RegisteredRecruiterReq request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredRecruiterMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.CommonResponse verifyCompany(com.kptl.proto.VerifyCompanyReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.FindJobResponse> findJobs(
        com.kptl.proto.FindJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindJobsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.SaveJobResponse> saveJobs(
        com.kptl.proto.JobMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveJobsMethodHelper(), getCallOptions()), request);
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
        com.kptl.proto.RegisteredCompanyReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> registeredRecruiter(
        com.kptl.proto.RegisteredRecruiterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredRecruiterMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.CommonResponse> verifyCompany(
        com.kptl.proto.VerifyCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyCompanyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_JOBS = 0;
  private static final int METHODID_SAVE_JOBS = 1;
  private static final int METHODID_UPDATE_JOBS = 2;
  private static final int METHODID_REGISTERED_COMPANY = 3;
  private static final int METHODID_UPDATE_COMPANY = 4;
  private static final int METHODID_REGISTERED_RECRUITER = 5;
  private static final int METHODID_VERIFY_COMPANY = 6;

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
        case METHODID_FIND_JOBS:
          serviceImpl.findJobs((com.kptl.proto.FindJobRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.FindJobResponse>) responseObserver);
          break;
        case METHODID_SAVE_JOBS:
          serviceImpl.saveJobs((com.kptl.proto.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOBS:
          serviceImpl.updateJobs((com.kptl.proto.JobMessage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.SaveJobResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_COMPANY:
          serviceImpl.registeredCompany((com.kptl.proto.RegisteredCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY:
          serviceImpl.updateCompany((com.kptl.proto.RegisteredCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_RECRUITER:
          serviceImpl.registeredRecruiter((com.kptl.proto.RegisteredRecruiterReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.CommonResponse>) responseObserver);
          break;
        case METHODID_VERIFY_COMPANY:
          serviceImpl.verifyCompany((com.kptl.proto.VerifyCompanyReq) request,
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
              .addMethod(getFindJobsMethodHelper())
              .addMethod(getSaveJobsMethodHelper())
              .addMethod(getUpdateJobsMethodHelper())
              .addMethod(getRegisteredCompanyMethodHelper())
              .addMethod(getUpdateCompanyMethodHelper())
              .addMethod(getRegisteredRecruiterMethodHelper())
              .addMethod(getVerifyCompanyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
