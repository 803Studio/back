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
    comments = "Source: employee/Employee.proto")
public final class EmployeeGrpc {

  private EmployeeGrpc() {}

  public static final String SERVICE_NAME = "employee.Employee";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeliverMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> METHOD_DELIVER = getDeliverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverMethod() {
    return getDeliverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse> getDeliverMethod;
    if ((getDeliverMethod = EmployeeGrpc.getDeliverMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getDeliverMethod = EmployeeGrpc.getDeliverMethod) == null) {
          EmployeeGrpc.getDeliverMethod = getDeliverMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "Deliver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("Deliver"))
                  .build();
          }
        }
     }
     return getDeliverMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeliverRecordsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> METHOD_DELIVER_RECORDS = getDeliverRecordsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverRecordsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverRecordsMethod() {
    return getDeliverRecordsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getDeliverRecordsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse> getDeliverRecordsMethod;
    if ((getDeliverRecordsMethod = EmployeeGrpc.getDeliverRecordsMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getDeliverRecordsMethod = EmployeeGrpc.getDeliverRecordsMethod) == null) {
          EmployeeGrpc.getDeliverRecordsMethod = getDeliverRecordsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "DeliverRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("DeliverRecords"))
                  .build();
          }
        }
     }
     return getDeliverRecordsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBrowsesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> METHOD_BROWSES = getBrowsesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getBrowsesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getBrowsesMethod() {
    return getBrowsesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest,
      com.kptl.proto.OperateResponse> getBrowsesMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse> getBrowsesMethod;
    if ((getBrowsesMethod = EmployeeGrpc.getBrowsesMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getBrowsesMethod = EmployeeGrpc.getBrowsesMethod) == null) {
          EmployeeGrpc.getBrowsesMethod = getBrowsesMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.OperateRequest, com.kptl.proto.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "Browses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("Browses"))
                  .build();
          }
        }
     }
     return getBrowsesMethod;
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
    public void deliver(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverMethodHelper(), responseObserver);
    }

    /**
     */
    public void deliverRecords(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverRecordsMethodHelper(), responseObserver);
    }

    /**
     */
    public void browses(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBrowsesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeliverMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.OperateRequest,
                com.kptl.proto.OperateResponse>(
                  this, METHODID_DELIVER)))
          .addMethod(
            getDeliverRecordsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.OperateRequest,
                com.kptl.proto.OperateResponse>(
                  this, METHODID_DELIVER_RECORDS)))
          .addMethod(
            getBrowsesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.OperateRequest,
                com.kptl.proto.OperateResponse>(
                  this, METHODID_BROWSES)))
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
    public void deliver(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverRecords(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverRecordsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browses(com.kptl.proto.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBrowsesMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.kptl.proto.OperateResponse deliver(com.kptl.proto.OperateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeliverMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.OperateResponse deliverRecords(com.kptl.proto.OperateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeliverRecordsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.OperateResponse browses(com.kptl.proto.OperateRequest request) {
      return blockingUnaryCall(
          getChannel(), getBrowsesMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.OperateResponse> deliver(
        com.kptl.proto.OperateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.OperateResponse> deliverRecords(
        com.kptl.proto.OperateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverRecordsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.OperateResponse> browses(
        com.kptl.proto.OperateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBrowsesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELIVER = 0;
  private static final int METHODID_DELIVER_RECORDS = 1;
  private static final int METHODID_BROWSES = 2;

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
        case METHODID_DELIVER:
          serviceImpl.deliver((com.kptl.proto.OperateRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse>) responseObserver);
          break;
        case METHODID_DELIVER_RECORDS:
          serviceImpl.deliverRecords((com.kptl.proto.OperateRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse>) responseObserver);
          break;
        case METHODID_BROWSES:
          serviceImpl.browses((com.kptl.proto.OperateRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.OperateResponse>) responseObserver);
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
      return com.kptl.proto.EmployeeOuterClass.getDescriptor();
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
              .addMethod(getDeliverMethodHelper())
              .addMethod(getDeliverRecordsMethodHelper())
              .addMethod(getBrowsesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
