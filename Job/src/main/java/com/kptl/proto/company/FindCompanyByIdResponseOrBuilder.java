// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: company/company.proto

package com.kptl.proto.company;

public interface FindCompanyByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:company.FindCompanyByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  global.Headers.ResponseHeader getHeader();
  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  global.Headers.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.company.Company company = 2;</code>
   */
  boolean hasCompany();
  /**
   * <code>.company.Company company = 2;</code>
   */
  com.kptl.proto.company.Company getCompany();
  /**
   * <code>.company.Company company = 2;</code>
   */
  com.kptl.proto.company.CompanyOrBuilder getCompanyOrBuilder();
}
