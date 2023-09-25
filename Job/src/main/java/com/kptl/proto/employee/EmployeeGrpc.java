package com.kptl.proto.employee;

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
    comments = "Source: employee/employee.proto")
public final class EmployeeGrpc {

  private EmployeeGrpc() {}

  public static final String SERVICE_NAME = "employee.Employee";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeliverMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> METHOD_DELIVER = getDeliverMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getDeliverMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getDeliverMethod() {
    return getDeliverMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getDeliverMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest, com.kptl.proto.employee.OperateResponse> getDeliverMethod;
    if ((getDeliverMethod = EmployeeGrpc.getDeliverMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getDeliverMethod = EmployeeGrpc.getDeliverMethod) == null) {
          EmployeeGrpc.getDeliverMethod = getDeliverMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.OperateRequest, com.kptl.proto.employee.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "deliver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.OperateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("deliver"))
                  .build();
          }
        }
     }
     return getDeliverMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBrowsesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> METHOD_BROWSES = getBrowsesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getBrowsesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getBrowsesMethod() {
    return getBrowsesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest,
      com.kptl.proto.employee.OperateResponse> getBrowsesMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.OperateRequest, com.kptl.proto.employee.OperateResponse> getBrowsesMethod;
    if ((getBrowsesMethod = EmployeeGrpc.getBrowsesMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getBrowsesMethod = EmployeeGrpc.getBrowsesMethod) == null) {
          EmployeeGrpc.getBrowsesMethod = getBrowsesMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.OperateRequest, com.kptl.proto.employee.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "browses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.OperateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("browses"))
                  .build();
          }
        }
     }
     return getBrowsesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeliverRecordsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.FindRecordsReq,
      com.kptl.proto.employee.OperateResponse> METHOD_DELIVER_RECORDS = getDeliverRecordsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.FindRecordsReq,
      com.kptl.proto.employee.OperateResponse> getDeliverRecordsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.FindRecordsReq,
      com.kptl.proto.employee.OperateResponse> getDeliverRecordsMethod() {
    return getDeliverRecordsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.FindRecordsReq,
      com.kptl.proto.employee.OperateResponse> getDeliverRecordsMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.FindRecordsReq, com.kptl.proto.employee.OperateResponse> getDeliverRecordsMethod;
    if ((getDeliverRecordsMethod = EmployeeGrpc.getDeliverRecordsMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getDeliverRecordsMethod = EmployeeGrpc.getDeliverRecordsMethod) == null) {
          EmployeeGrpc.getDeliverRecordsMethod = getDeliverRecordsMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.FindRecordsReq, com.kptl.proto.employee.OperateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "deliverRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.FindRecordsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.OperateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("deliverRecords"))
                  .build();
          }
        }
     }
     return getDeliverRecordsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCompleteSelfInformationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> METHOD_COMPLETE_SELF_INFORMATION = getCompleteSelfInformationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getCompleteSelfInformationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getCompleteSelfInformationMethod() {
    return getCompleteSelfInformationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getCompleteSelfInformationMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation, global.Headers.ResponseHeader> getCompleteSelfInformationMethod;
    if ((getCompleteSelfInformationMethod = EmployeeGrpc.getCompleteSelfInformationMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getCompleteSelfInformationMethod = EmployeeGrpc.getCompleteSelfInformationMethod) == null) {
          EmployeeGrpc.getCompleteSelfInformationMethod = getCompleteSelfInformationMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.SelfInformation, global.Headers.ResponseHeader>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "completeSelfInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.SelfInformation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  global.Headers.ResponseHeader.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("completeSelfInformation"))
                  .build();
          }
        }
     }
     return getCompleteSelfInformationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindEmployeeInformationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.FindEmployeeInfoReq,
      com.kptl.proto.employee.FindEmployeeResponse> METHOD_FIND_EMPLOYEE_INFORMATION = getFindEmployeeInformationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.FindEmployeeInfoReq,
      com.kptl.proto.employee.FindEmployeeResponse> getFindEmployeeInformationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.FindEmployeeInfoReq,
      com.kptl.proto.employee.FindEmployeeResponse> getFindEmployeeInformationMethod() {
    return getFindEmployeeInformationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.FindEmployeeInfoReq,
      com.kptl.proto.employee.FindEmployeeResponse> getFindEmployeeInformationMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.FindEmployeeInfoReq, com.kptl.proto.employee.FindEmployeeResponse> getFindEmployeeInformationMethod;
    if ((getFindEmployeeInformationMethod = EmployeeGrpc.getFindEmployeeInformationMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getFindEmployeeInformationMethod = EmployeeGrpc.getFindEmployeeInformationMethod) == null) {
          EmployeeGrpc.getFindEmployeeInformationMethod = getFindEmployeeInformationMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.FindEmployeeInfoReq, com.kptl.proto.employee.FindEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "findEmployeeInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.FindEmployeeInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.FindEmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("findEmployeeInformation"))
                  .build();
          }
        }
     }
     return getFindEmployeeInformationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindEmployeeSimpleInformationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.SplitPage,
      com.kptl.proto.employee.FindEmployeeSimpleResponse> METHOD_FIND_EMPLOYEE_SIMPLE_INFORMATION = getFindEmployeeSimpleInformationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.SplitPage,
      com.kptl.proto.employee.FindEmployeeSimpleResponse> getFindEmployeeSimpleInformationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.SplitPage,
      com.kptl.proto.employee.FindEmployeeSimpleResponse> getFindEmployeeSimpleInformationMethod() {
    return getFindEmployeeSimpleInformationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.SplitPage,
      com.kptl.proto.employee.FindEmployeeSimpleResponse> getFindEmployeeSimpleInformationMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.SplitPage, com.kptl.proto.employee.FindEmployeeSimpleResponse> getFindEmployeeSimpleInformationMethod;
    if ((getFindEmployeeSimpleInformationMethod = EmployeeGrpc.getFindEmployeeSimpleInformationMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getFindEmployeeSimpleInformationMethod = EmployeeGrpc.getFindEmployeeSimpleInformationMethod) == null) {
          EmployeeGrpc.getFindEmployeeSimpleInformationMethod = getFindEmployeeSimpleInformationMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.SplitPage, com.kptl.proto.employee.FindEmployeeSimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "findEmployeeSimpleInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.SplitPage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.FindEmployeeSimpleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("findEmployeeSimpleInformation"))
                  .build();
          }
        }
     }
     return getFindEmployeeSimpleInformationMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateSelfInformationMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> METHOD_UPDATE_SELF_INFORMATION = getUpdateSelfInformationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getUpdateSelfInformationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getUpdateSelfInformationMethod() {
    return getUpdateSelfInformationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation,
      global.Headers.ResponseHeader> getUpdateSelfInformationMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.employee.SelfInformation, global.Headers.ResponseHeader> getUpdateSelfInformationMethod;
    if ((getUpdateSelfInformationMethod = EmployeeGrpc.getUpdateSelfInformationMethod) == null) {
      synchronized (EmployeeGrpc.class) {
        if ((getUpdateSelfInformationMethod = EmployeeGrpc.getUpdateSelfInformationMethod) == null) {
          EmployeeGrpc.getUpdateSelfInformationMethod = getUpdateSelfInformationMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.employee.SelfInformation, global.Headers.ResponseHeader>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "employee.Employee", "updateSelfInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.employee.SelfInformation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  global.Headers.ResponseHeader.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeMethodDescriptorSupplier("updateSelfInformation"))
                  .build();
          }
        }
     }
     return getUpdateSelfInformationMethod;
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
    public void deliver(com.kptl.proto.employee.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverMethodHelper(), responseObserver);
    }

    /**
     */
    public void browses(com.kptl.proto.employee.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBrowsesMethodHelper(), responseObserver);
    }

    /**
     */
    public void deliverRecords(com.kptl.proto.employee.FindRecordsReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverRecordsMethodHelper(), responseObserver);
    }

    /**
     */
    public void completeSelfInformation(com.kptl.proto.employee.SelfInformation request,
        io.grpc.stub.StreamObserver<global.Headers.ResponseHeader> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteSelfInformationMethodHelper(), responseObserver);
    }

    /**
     */
    public void findEmployeeInformation(com.kptl.proto.employee.FindEmployeeInfoReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindEmployeeInformationMethodHelper(), responseObserver);
    }

    /**
     */
    public void findEmployeeSimpleInformation(com.kptl.proto.employee.SplitPage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeSimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindEmployeeSimpleInformationMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateSelfInformation(com.kptl.proto.employee.SelfInformation request,
        io.grpc.stub.StreamObserver<global.Headers.ResponseHeader> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSelfInformationMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeliverMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.OperateRequest,
                com.kptl.proto.employee.OperateResponse>(
                  this, METHODID_DELIVER)))
          .addMethod(
            getBrowsesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.OperateRequest,
                com.kptl.proto.employee.OperateResponse>(
                  this, METHODID_BROWSES)))
          .addMethod(
            getDeliverRecordsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.FindRecordsReq,
                com.kptl.proto.employee.OperateResponse>(
                  this, METHODID_DELIVER_RECORDS)))
          .addMethod(
            getCompleteSelfInformationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.SelfInformation,
                global.Headers.ResponseHeader>(
                  this, METHODID_COMPLETE_SELF_INFORMATION)))
          .addMethod(
            getFindEmployeeInformationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.FindEmployeeInfoReq,
                com.kptl.proto.employee.FindEmployeeResponse>(
                  this, METHODID_FIND_EMPLOYEE_INFORMATION)))
          .addMethod(
            getFindEmployeeSimpleInformationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.SplitPage,
                com.kptl.proto.employee.FindEmployeeSimpleResponse>(
                  this, METHODID_FIND_EMPLOYEE_SIMPLE_INFORMATION)))
          .addMethod(
            getUpdateSelfInformationMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.employee.SelfInformation,
                global.Headers.ResponseHeader>(
                  this, METHODID_UPDATE_SELF_INFORMATION)))
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
    public void deliver(com.kptl.proto.employee.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browses(com.kptl.proto.employee.OperateRequest request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBrowsesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverRecords(com.kptl.proto.employee.FindRecordsReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverRecordsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void completeSelfInformation(com.kptl.proto.employee.SelfInformation request,
        io.grpc.stub.StreamObserver<global.Headers.ResponseHeader> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteSelfInformationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findEmployeeInformation(com.kptl.proto.employee.FindEmployeeInfoReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindEmployeeInformationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findEmployeeSimpleInformation(com.kptl.proto.employee.SplitPage request,
        io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeSimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindEmployeeSimpleInformationMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSelfInformation(com.kptl.proto.employee.SelfInformation request,
        io.grpc.stub.StreamObserver<global.Headers.ResponseHeader> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSelfInformationMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.kptl.proto.employee.OperateResponse deliver(com.kptl.proto.employee.OperateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeliverMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.employee.OperateResponse browses(com.kptl.proto.employee.OperateRequest request) {
      return blockingUnaryCall(
          getChannel(), getBrowsesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.employee.OperateResponse deliverRecords(com.kptl.proto.employee.FindRecordsReq request) {
      return blockingUnaryCall(
          getChannel(), getDeliverRecordsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public global.Headers.ResponseHeader completeSelfInformation(com.kptl.proto.employee.SelfInformation request) {
      return blockingUnaryCall(
          getChannel(), getCompleteSelfInformationMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.employee.FindEmployeeResponse findEmployeeInformation(com.kptl.proto.employee.FindEmployeeInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getFindEmployeeInformationMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.employee.FindEmployeeSimpleResponse findEmployeeSimpleInformation(com.kptl.proto.employee.SplitPage request) {
      return blockingUnaryCall(
          getChannel(), getFindEmployeeSimpleInformationMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public global.Headers.ResponseHeader updateSelfInformation(com.kptl.proto.employee.SelfInformation request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSelfInformationMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.employee.OperateResponse> deliver(
        com.kptl.proto.employee.OperateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.employee.OperateResponse> browses(
        com.kptl.proto.employee.OperateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBrowsesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.employee.OperateResponse> deliverRecords(
        com.kptl.proto.employee.FindRecordsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverRecordsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<global.Headers.ResponseHeader> completeSelfInformation(
        com.kptl.proto.employee.SelfInformation request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteSelfInformationMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.employee.FindEmployeeResponse> findEmployeeInformation(
        com.kptl.proto.employee.FindEmployeeInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindEmployeeInformationMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.employee.FindEmployeeSimpleResponse> findEmployeeSimpleInformation(
        com.kptl.proto.employee.SplitPage request) {
      return futureUnaryCall(
          getChannel().newCall(getFindEmployeeSimpleInformationMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<global.Headers.ResponseHeader> updateSelfInformation(
        com.kptl.proto.employee.SelfInformation request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSelfInformationMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELIVER = 0;
  private static final int METHODID_BROWSES = 1;
  private static final int METHODID_DELIVER_RECORDS = 2;
  private static final int METHODID_COMPLETE_SELF_INFORMATION = 3;
  private static final int METHODID_FIND_EMPLOYEE_INFORMATION = 4;
  private static final int METHODID_FIND_EMPLOYEE_SIMPLE_INFORMATION = 5;
  private static final int METHODID_UPDATE_SELF_INFORMATION = 6;

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
          serviceImpl.deliver((com.kptl.proto.employee.OperateRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse>) responseObserver);
          break;
        case METHODID_BROWSES:
          serviceImpl.browses((com.kptl.proto.employee.OperateRequest) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse>) responseObserver);
          break;
        case METHODID_DELIVER_RECORDS:
          serviceImpl.deliverRecords((com.kptl.proto.employee.FindRecordsReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.employee.OperateResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_SELF_INFORMATION:
          serviceImpl.completeSelfInformation((com.kptl.proto.employee.SelfInformation) request,
              (io.grpc.stub.StreamObserver<global.Headers.ResponseHeader>) responseObserver);
          break;
        case METHODID_FIND_EMPLOYEE_INFORMATION:
          serviceImpl.findEmployeeInformation((com.kptl.proto.employee.FindEmployeeInfoReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeResponse>) responseObserver);
          break;
        case METHODID_FIND_EMPLOYEE_SIMPLE_INFORMATION:
          serviceImpl.findEmployeeSimpleInformation((com.kptl.proto.employee.SplitPage) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.employee.FindEmployeeSimpleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SELF_INFORMATION:
          serviceImpl.updateSelfInformation((com.kptl.proto.employee.SelfInformation) request,
              (io.grpc.stub.StreamObserver<global.Headers.ResponseHeader>) responseObserver);
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
      return com.kptl.proto.employee.EmployeeOuterClass.getDescriptor();
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
              .addMethod(getBrowsesMethodHelper())
              .addMethod(getDeliverRecordsMethodHelper())
              .addMethod(getCompleteSelfInformationMethodHelper())
              .addMethod(getFindEmployeeInformationMethodHelper())
              .addMethod(getFindEmployeeSimpleInformationMethodHelper())
              .addMethod(getUpdateSelfInformationMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
