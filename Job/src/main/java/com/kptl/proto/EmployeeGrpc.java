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
public final class EmployeeGrpc {

  private EmployeeGrpc() {}

  public static final String SERVICE_NAME = "job.Employee";

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
    if ((getFindJobsMethod = EmployeeGrpc.getFindJobsMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getFindJobsMethod = EmployeeGrpc.getFindJobsMethod) == null) {
          EmployeeGrpc.getFindJobsMethod = getFindJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.FindJobRequest, com.kptl.proto.FindJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Employee", "FindJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.FindJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("FindJobs"))
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
    if ((getSaveJobsMethod = EmployeeGrpc.getSaveJobsMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getSaveJobsMethod = EmployeeGrpc.getSaveJobsMethod) == null) {
          EmployeeGrpc.getSaveJobsMethod = getSaveJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Employee", "SaveJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("SaveJobs"))
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
    if ((getUpdateJobsMethod = EmployeeGrpc.getUpdateJobsMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getUpdateJobsMethod = EmployeeGrpc.getUpdateJobsMethod) == null) {
          EmployeeGrpc.getUpdateJobsMethod = getUpdateJobsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.JobMessage, com.kptl.proto.SaveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "job.Employee", "UpdateJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.JobMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.SaveJobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("UpdateJobs"))
                  .build();
          }
        }
     }
     return getUpdateJobsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeStub newStub(io.grpc.Channel channel) {
    return new EmployeeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeFutureStub(channel);
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static abstract class EmployeeImplBase implements io.grpc.BindableService {

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
          .build();
    }
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class EmployeeStub extends io.grpc.stub.AbstractStub<EmployeeStub> {
    private EmployeeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeStub(channel, callOptions);
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
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class EmployeeBlockingStub extends io.grpc.stub.AbstractStub<EmployeeBlockingStub> {
    private EmployeeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeBlockingStub(channel, callOptions);
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
  }

  /**
   * <pre>
   *定义员工服务
   * </pre>
   */
  public static final class EmployeeFutureStub extends io.grpc.stub.AbstractStub<EmployeeFutureStub> {
    private EmployeeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeFutureStub(channel, callOptions);
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
  }

  private static final int METHODID_FIND_JOBS = 0;
  private static final int METHODID_SAVE_JOBS = 1;
  private static final int METHODID_UPDATE_JOBS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeImplBase serviceImpl, int methodId) {
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

  private static abstract class EmployeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kptl.proto.Job.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Employee");
    }
  }

  private static final class EmployeeFileDescriptorSupplier
      extends EmployeeBaseDescriptorSupplier {
    EmployeeFileDescriptorSupplier() {}
  }

  private static final class EmployeeMethodDescriptorSupplier
      extends EmployeeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeFileDescriptorSupplier())
              .addMethod(getFindJobsMethodHelper())
              .addMethod(getSaveJobsMethodHelper())
              .addMethod(getUpdateJobsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
