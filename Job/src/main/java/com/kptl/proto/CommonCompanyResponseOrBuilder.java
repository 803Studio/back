// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto;

public interface CommonCompanyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:job.CommonCompanyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  com.kptl.proto.ResponseHeader getHeader();
  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  com.kptl.proto.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .job.Company companies = 2;</code>
   */
  java.util.List<com.kptl.proto.Company> 
      getCompaniesList();
  /**
   * <code>repeated .job.Company companies = 2;</code>
   */
  com.kptl.proto.Company getCompanies(int index);
  /**
   * <code>repeated .job.Company companies = 2;</code>
   */
  int getCompaniesCount();
  /**
   * <code>repeated .job.Company companies = 2;</code>
   */
  java.util.List<? extends com.kptl.proto.CompanyOrBuilder> 
      getCompaniesOrBuilderList();
  /**
   * <code>repeated .job.Company companies = 2;</code>
   */
  com.kptl.proto.CompanyOrBuilder getCompaniesOrBuilder(
      int index);
}