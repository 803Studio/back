//package com.kptl.job.api;
//
//import com.kptl.job.service.CompanyService;
//import com.kptl.proto.company.*;
//import com.kptl.proto.company.CompanyServiceGrpc;
//import global.Headers;
//import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//@GRpcService
//public class CompanyImpl extends CompanyServiceGrpc.CompanyServiceImplBase {
//    @Autowired
//    private CompanyService companyService;
//    /**
//     * 注册成为公司
//     */
//    @Override
//    public void registeredCompany(Company request, StreamObserver<CommonResponse> responseObserver) {
//        Headers.ResponseHeader.Builder header = Headers.ResponseHeader.newBuilder();
//        ResponseHeader
//        try {
//            companyService.registeredCompany(request);
//            header.setStatus(ResponseStatus.OK).setMessage("注册成功！");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("注册失败！");
//        }
//        CommonResponse result = CommonResponse.newBuilder().setHeader(header).build();
//        responseObserver.onNext(result);
//        responseObserver.onCompleted();
//    }
//
//    /**
//     * 更新公司
//     */
//    @Override
//    public void updateCompany(RegisteredCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        try {
//            companyService.updateCompany(request.getCompany());
//            header.setStatus(ResponseStatus.OK).setMessage("更新成功！");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("更新失败！");
//        }
//        CommonResponse result = CommonResponse.newBuilder().setHeader(header).build();
//        responseObserver.onNext(result);
//        responseObserver.onCompleted();
//    }
//
//    @Override
//    public void findCompanyByName(FindCompanyByNameReq request, StreamObserver<CommonCompanyResponse> responseObserver) {
//        List<Company> companies = new ArrayList<>();
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        CommonCompanyResponse.Builder builder = CommonCompanyResponse.newBuilder();
//        try {
//            companies = companyService.findCompanyByName(request);
//            if (companies != null) {
//                for (Company company : companies) {
//                    builder.addCompanies(company);
//                }
//            }
//            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
//        }
//        builder.setHeader(header);
//
//        responseObserver.onNext(builder.build());
//        responseObserver.onCompleted();
//    }
//
//    @Override
//    public void findCompanyById(CommonCompanyReq request, StreamObserver<FindCompanyByIdResponse> responseObserver) {
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        FindCompanyByIdResponse.Builder builder = FindCompanyByIdResponse.newBuilder();
//        try {
//            builder.setCompany(companyService.findCompaniesById(request.getId()));
//            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
//        }
//        builder.setHeader(header);
//        responseObserver.onNext(builder.build());
//        responseObserver.onCompleted();
//    }
//
//    @Override
//    public void findAllCompanies(FindAllCompaniesReq request, StreamObserver<CommonCompanyResponse> responseObserver) {
//        List<Company> companies = new ArrayList<>();
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        CommonCompanyResponse.Builder builder = CommonCompanyResponse.newBuilder();
//        try {
//            companies = companyService.findCompanies(request);
//            header.setStatus(ResponseStatus.OK).setMessage("查询成功!");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("查询失败!");
//        }
//        builder.setHeader(header);
//        for (Company company : companies) {
//            builder.addCompanies(company);
//        }
//        responseObserver.onNext(builder.build());
//        responseObserver.onCompleted();
//    }
//
//    /**
//     *根据行业找公司
//     */
//    public void findCompanyByIndustry(FindCompanyByIndustryReq request, StreamObserver<CommonCompanyResponse> responseObserver) {
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        CommonCompanyResponse.Builder builder = CommonCompanyResponse.newBuilder();
//        List<Company> companies = new ArrayList<>();
//        try {
//            companies = companyService.findCompanyByIndustry(request);
//            header.setStatus(ResponseStatus.OK).setMessage("查找成功！");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("查找失败companyService = {CompanyServiceImpl@8450} ！");
//        }
//        builder.setHeader(header);
//        for (Company company : companies) {
//            builder.addCompanies(company);
//        }
//        responseObserver.onNext(builder.build());
//        responseObserver.onCompleted();
//    }
//
//    @Override
//    public void boundCompany(CommonCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
//        super.boundCompany(request, responseObserver);
//    }
//
//
//    /**
//     *验证公司
//     */
//    @Override
//    public void verifyCompany(CommonCompanyReq request, StreamObserver<CommonResponse> responseObserver) {
//        ResponseHeader.Builder header = ResponseHeader.newBuilder();
//        try {
//            companyService.verifyCompany(request.getId());
//            header.setStatus(ResponseStatus.OK).setMessage("验证成功！");
//        } catch (Exception e) {
//            header.setStatus(ResponseStatus.InternalErr).setMessage("验证失败！");
//        }
//        CommonResponse result = CommonResponse.newBuilder().setHeader(header).build();
//        responseObserver.onNext(result);
//        responseObserver.onCompleted();
//    }
//
//}
