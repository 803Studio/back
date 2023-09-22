package com.kptl.proto.company;

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
 *定义公司服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: company.proto")
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "company.CompanyService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisteredCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.Company,
      com.kptl.proto.company.CommonResponse> METHOD_REGISTERED_COMPANY = getRegisteredCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.Company,
      com.kptl.proto.company.CommonResponse> getRegisteredCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.Company,
      com.kptl.proto.company.CommonResponse> getRegisteredCompanyMethod() {
    return getRegisteredCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.Company,
      com.kptl.proto.company.CommonResponse> getRegisteredCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.Company, com.kptl.proto.company.CommonResponse> getRegisteredCompanyMethod;
    if ((getRegisteredCompanyMethod = CompanyServiceGrpc.getRegisteredCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getRegisteredCompanyMethod = CompanyServiceGrpc.getRegisteredCompanyMethod) == null) {
          CompanyServiceGrpc.getRegisteredCompanyMethod = getRegisteredCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.Company, com.kptl.proto.company.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "registeredCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.Company.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("registeredCompany"))
                  .build();
          }
        }
     }
     return getRegisteredCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.RegisteredCompanyReq,
      com.kptl.proto.company.CommonResponse> METHOD_UPDATE_COMPANY = getUpdateCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.RegisteredCompanyReq,
      com.kptl.proto.company.CommonResponse> getUpdateCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.RegisteredCompanyReq,
      com.kptl.proto.company.CommonResponse> getUpdateCompanyMethod() {
    return getUpdateCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.RegisteredCompanyReq,
      com.kptl.proto.company.CommonResponse> getUpdateCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.RegisteredCompanyReq, com.kptl.proto.company.CommonResponse> getUpdateCompanyMethod;
    if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getUpdateCompanyMethod = CompanyServiceGrpc.getUpdateCompanyMethod) == null) {
          CompanyServiceGrpc.getUpdateCompanyMethod = getUpdateCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.RegisteredCompanyReq, com.kptl.proto.company.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "updateCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.RegisteredCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("updateCompany"))
                  .build();
          }
        }
     }
     return getUpdateCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindCompanyByNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByNameReq,
      com.kptl.proto.company.CommonCompanyResponse> METHOD_FIND_COMPANY_BY_NAME = getFindCompanyByNameMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByNameReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByNameReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByNameMethod() {
    return getFindCompanyByNameMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByNameReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByNameMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByNameReq, com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByNameMethod;
    if ((getFindCompanyByNameMethod = CompanyServiceGrpc.getFindCompanyByNameMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFindCompanyByNameMethod = CompanyServiceGrpc.getFindCompanyByNameMethod) == null) {
          CompanyServiceGrpc.getFindCompanyByNameMethod = getFindCompanyByNameMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.FindCompanyByNameReq, com.kptl.proto.company.CommonCompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "findCompanyByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.FindCompanyByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("findCompanyByName"))
                  .build();
          }
        }
     }
     return getFindCompanyByNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindCompanyByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.FindCompanyByIdResponse> METHOD_FIND_COMPANY_BY_ID = getFindCompanyByIdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.FindCompanyByIdResponse> getFindCompanyByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.FindCompanyByIdResponse> getFindCompanyByIdMethod() {
    return getFindCompanyByIdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.FindCompanyByIdResponse> getFindCompanyByIdMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.FindCompanyByIdResponse> getFindCompanyByIdMethod;
    if ((getFindCompanyByIdMethod = CompanyServiceGrpc.getFindCompanyByIdMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFindCompanyByIdMethod = CompanyServiceGrpc.getFindCompanyByIdMethod) == null) {
          CompanyServiceGrpc.getFindCompanyByIdMethod = getFindCompanyByIdMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.FindCompanyByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "findCompanyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.FindCompanyByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("findCompanyById"))
                  .build();
          }
        }
     }
     return getFindCompanyByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindAllCompaniesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.FindAllCompaniesReq,
      com.kptl.proto.company.CommonCompanyResponse> METHOD_FIND_ALL_COMPANIES = getFindAllCompaniesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.FindAllCompaniesReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindAllCompaniesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.FindAllCompaniesReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindAllCompaniesMethod() {
    return getFindAllCompaniesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.FindAllCompaniesReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindAllCompaniesMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.FindAllCompaniesReq, com.kptl.proto.company.CommonCompanyResponse> getFindAllCompaniesMethod;
    if ((getFindAllCompaniesMethod = CompanyServiceGrpc.getFindAllCompaniesMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFindAllCompaniesMethod = CompanyServiceGrpc.getFindAllCompaniesMethod) == null) {
          CompanyServiceGrpc.getFindAllCompaniesMethod = getFindAllCompaniesMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.FindAllCompaniesReq, com.kptl.proto.company.CommonCompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "findAllCompanies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.FindAllCompaniesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("findAllCompanies"))
                  .build();
          }
        }
     }
     return getFindAllCompaniesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBoundCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> METHOD_BOUND_COMPANY = getBoundCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getBoundCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getBoundCompanyMethod() {
    return getBoundCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getBoundCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.CommonResponse> getBoundCompanyMethod;
    if ((getBoundCompanyMethod = CompanyServiceGrpc.getBoundCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getBoundCompanyMethod = CompanyServiceGrpc.getBoundCompanyMethod) == null) {
          CompanyServiceGrpc.getBoundCompanyMethod = getBoundCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "boundCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("boundCompany"))
                  .build();
          }
        }
     }
     return getBoundCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getVerifyCompanyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> METHOD_VERIFY_COMPANY = getVerifyCompanyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getVerifyCompanyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getVerifyCompanyMethod() {
    return getVerifyCompanyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq,
      com.kptl.proto.company.CommonResponse> getVerifyCompanyMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.CommonResponse> getVerifyCompanyMethod;
    if ((getVerifyCompanyMethod = CompanyServiceGrpc.getVerifyCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getVerifyCompanyMethod = CompanyServiceGrpc.getVerifyCompanyMethod) == null) {
          CompanyServiceGrpc.getVerifyCompanyMethod = getVerifyCompanyMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.CommonCompanyReq, com.kptl.proto.company.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "verifyCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("verifyCompany"))
                  .build();
          }
        }
     }
     return getVerifyCompanyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFindCompanyByIndustryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByIndustryReq,
      com.kptl.proto.company.CommonCompanyResponse> METHOD_FIND_COMPANY_BY_INDUSTRY = getFindCompanyByIndustryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByIndustryReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByIndustryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByIndustryReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByIndustryMethod() {
    return getFindCompanyByIndustryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByIndustryReq,
      com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByIndustryMethodHelper() {
    io.grpc.MethodDescriptor<com.kptl.proto.company.FindCompanyByIndustryReq, com.kptl.proto.company.CommonCompanyResponse> getFindCompanyByIndustryMethod;
    if ((getFindCompanyByIndustryMethod = CompanyServiceGrpc.getFindCompanyByIndustryMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFindCompanyByIndustryMethod = CompanyServiceGrpc.getFindCompanyByIndustryMethod) == null) {
          CompanyServiceGrpc.getFindCompanyByIndustryMethod = getFindCompanyByIndustryMethod = 
              io.grpc.MethodDescriptor.<com.kptl.proto.company.FindCompanyByIndustryReq, com.kptl.proto.company.CommonCompanyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "company.CompanyService", "findCompanyByIndustry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.FindCompanyByIndustryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kptl.proto.company.CommonCompanyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("findCompanyByIndustry"))
                  .build();
          }
        }
     }
     return getFindCompanyByIndustryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    return new CompanyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompanyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompanyServiceFutureStub(channel);
  }

  /**
   * <pre>
   *定义公司服务
   * </pre>
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registeredCompany(com.kptl.proto.company.Company request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisteredCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void updateCompany(com.kptl.proto.company.RegisteredCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void findCompanyByName(com.kptl.proto.company.FindCompanyByNameReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCompanyByNameMethodHelper(), responseObserver);
    }

    /**
     */
    public void findCompanyById(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.FindCompanyByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCompanyByIdMethodHelper(), responseObserver);
    }

    /**
     */
    public void findAllCompanies(com.kptl.proto.company.FindAllCompaniesReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllCompaniesMethodHelper(), responseObserver);
    }

    /**
     */
    public void boundCompany(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoundCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyCompanyMethodHelper(), responseObserver);
    }

    /**
     */
    public void findCompanyByIndustry(com.kptl.proto.company.FindCompanyByIndustryReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindCompanyByIndustryMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisteredCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.Company,
                com.kptl.proto.company.CommonResponse>(
                  this, METHODID_REGISTERED_COMPANY)))
          .addMethod(
            getUpdateCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.RegisteredCompanyReq,
                com.kptl.proto.company.CommonResponse>(
                  this, METHODID_UPDATE_COMPANY)))
          .addMethod(
            getFindCompanyByNameMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.FindCompanyByNameReq,
                com.kptl.proto.company.CommonCompanyResponse>(
                  this, METHODID_FIND_COMPANY_BY_NAME)))
          .addMethod(
            getFindCompanyByIdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.CommonCompanyReq,
                com.kptl.proto.company.FindCompanyByIdResponse>(
                  this, METHODID_FIND_COMPANY_BY_ID)))
          .addMethod(
            getFindAllCompaniesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.FindAllCompaniesReq,
                com.kptl.proto.company.CommonCompanyResponse>(
                  this, METHODID_FIND_ALL_COMPANIES)))
          .addMethod(
            getBoundCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.CommonCompanyReq,
                com.kptl.proto.company.CommonResponse>(
                  this, METHODID_BOUND_COMPANY)))
          .addMethod(
            getVerifyCompanyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.CommonCompanyReq,
                com.kptl.proto.company.CommonResponse>(
                  this, METHODID_VERIFY_COMPANY)))
          .addMethod(
            getFindCompanyByIndustryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kptl.proto.company.FindCompanyByIndustryReq,
                com.kptl.proto.company.CommonCompanyResponse>(
                  this, METHODID_FIND_COMPANY_BY_INDUSTRY)))
          .build();
    }
  }

  /**
   * <pre>
   *定义公司服务
   * </pre>
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     */
    public void registeredCompany(com.kptl.proto.company.Company request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisteredCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCompany(com.kptl.proto.company.RegisteredCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCompanyByName(com.kptl.proto.company.FindCompanyByNameReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCompanyByNameMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCompanyById(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.FindCompanyByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCompanyByIdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAllCompanies(com.kptl.proto.company.FindAllCompaniesReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAllCompaniesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void boundCompany(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoundCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyCompany(com.kptl.proto.company.CommonCompanyReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyCompanyMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCompanyByIndustry(com.kptl.proto.company.FindCompanyByIndustryReq request,
        io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindCompanyByIndustryMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *定义公司服务
   * </pre>
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kptl.proto.company.CommonResponse registeredCompany(com.kptl.proto.company.Company request) {
      return blockingUnaryCall(
          getChannel(), getRegisteredCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonResponse updateCompany(com.kptl.proto.company.RegisteredCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonCompanyResponse findCompanyByName(com.kptl.proto.company.FindCompanyByNameReq request) {
      return blockingUnaryCall(
          getChannel(), getFindCompanyByNameMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.FindCompanyByIdResponse findCompanyById(com.kptl.proto.company.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getFindCompanyByIdMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonCompanyResponse findAllCompanies(com.kptl.proto.company.FindAllCompaniesReq request) {
      return blockingUnaryCall(
          getChannel(), getFindAllCompaniesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonResponse boundCompany(com.kptl.proto.company.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getBoundCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonResponse verifyCompany(com.kptl.proto.company.CommonCompanyReq request) {
      return blockingUnaryCall(
          getChannel(), getVerifyCompanyMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.kptl.proto.company.CommonCompanyResponse findCompanyByIndustry(com.kptl.proto.company.FindCompanyByIndustryReq request) {
      return blockingUnaryCall(
          getChannel(), getFindCompanyByIndustryMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义公司服务
   * </pre>
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonResponse> registeredCompany(
        com.kptl.proto.company.Company request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisteredCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonResponse> updateCompany(
        com.kptl.proto.company.RegisteredCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonCompanyResponse> findCompanyByName(
        com.kptl.proto.company.FindCompanyByNameReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCompanyByNameMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.FindCompanyByIdResponse> findCompanyById(
        com.kptl.proto.company.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCompanyByIdMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonCompanyResponse> findAllCompanies(
        com.kptl.proto.company.FindAllCompaniesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAllCompaniesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonResponse> boundCompany(
        com.kptl.proto.company.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBoundCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonResponse> verifyCompany(
        com.kptl.proto.company.CommonCompanyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyCompanyMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kptl.proto.company.CommonCompanyResponse> findCompanyByIndustry(
        com.kptl.proto.company.FindCompanyByIndustryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindCompanyByIndustryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTERED_COMPANY = 0;
  private static final int METHODID_UPDATE_COMPANY = 1;
  private static final int METHODID_FIND_COMPANY_BY_NAME = 2;
  private static final int METHODID_FIND_COMPANY_BY_ID = 3;
  private static final int METHODID_FIND_ALL_COMPANIES = 4;
  private static final int METHODID_BOUND_COMPANY = 5;
  private static final int METHODID_VERIFY_COMPANY = 6;
  private static final int METHODID_FIND_COMPANY_BY_INDUSTRY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTERED_COMPANY:
          serviceImpl.registeredCompany((com.kptl.proto.company.Company) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY:
          serviceImpl.updateCompany((com.kptl.proto.company.RegisteredCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse>) responseObserver);
          break;
        case METHODID_FIND_COMPANY_BY_NAME:
          serviceImpl.findCompanyByName((com.kptl.proto.company.FindCompanyByNameReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse>) responseObserver);
          break;
        case METHODID_FIND_COMPANY_BY_ID:
          serviceImpl.findCompanyById((com.kptl.proto.company.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.FindCompanyByIdResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL_COMPANIES:
          serviceImpl.findAllCompanies((com.kptl.proto.company.FindAllCompaniesReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse>) responseObserver);
          break;
        case METHODID_BOUND_COMPANY:
          serviceImpl.boundCompany((com.kptl.proto.company.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse>) responseObserver);
          break;
        case METHODID_VERIFY_COMPANY:
          serviceImpl.verifyCompany((com.kptl.proto.company.CommonCompanyReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonResponse>) responseObserver);
          break;
        case METHODID_FIND_COMPANY_BY_INDUSTRY:
          serviceImpl.findCompanyByIndustry((com.kptl.proto.company.FindCompanyByIndustryReq) request,
              (io.grpc.stub.StreamObserver<com.kptl.proto.company.CommonCompanyResponse>) responseObserver);
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

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kptl.proto.company.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getRegisteredCompanyMethodHelper())
              .addMethod(getUpdateCompanyMethodHelper())
              .addMethod(getFindCompanyByNameMethodHelper())
              .addMethod(getFindCompanyByIdMethodHelper())
              .addMethod(getFindAllCompaniesMethodHelper())
              .addMethod(getBoundCompanyMethodHelper())
              .addMethod(getVerifyCompanyMethodHelper())
              .addMethod(getFindCompanyByIndustryMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
