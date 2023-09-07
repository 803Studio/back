// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto;

public interface JobMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:job.JobMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *职位id
   * </pre>
   *
   * <code>int32 jobId = 2;</code>
   */
  int getJobId();

  /**
   * <pre>
   *职位名称
   * </pre>
   *
   * <code>string jobName = 3;</code>
   */
  java.lang.String getJobName();
  /**
   * <pre>
   *职位名称
   * </pre>
   *
   * <code>string jobName = 3;</code>
   */
  com.google.protobuf.ByteString
      getJobNameBytes();

  /**
   * <pre>
   *薪资
   * </pre>
   *
   * <code>int32 jobMoney = 4;</code>
   */
  int getJobMoney();

  /**
   * <pre>
   *职位要求
   * </pre>
   *
   * <code>string jobReq = 5;</code>
   */
  java.lang.String getJobReq();
  /**
   * <pre>
   *职位要求
   * </pre>
   *
   * <code>string jobReq = 5;</code>
   */
  com.google.protobuf.ByteString
      getJobReqBytes();

  /**
   * <pre>
   *职位地址
   * </pre>
   *
   * <code>string jobLocation = 6;</code>
   */
  java.lang.String getJobLocation();
  /**
   * <pre>
   *职位地址
   * </pre>
   *
   * <code>string jobLocation = 6;</code>
   */
  com.google.protobuf.ByteString
      getJobLocationBytes();

  /**
   * <pre>
   *公司id(用户id)
   * </pre>
   *
   * <code>int32 companyId = 7;</code>
   */
  int getCompanyId();

  /**
   * <pre>
   *招聘者
   * </pre>
   *
   * <code>string recruiterName = 8;</code>
   */
  java.lang.String getRecruiterName();
  /**
   * <pre>
   *招聘者
   * </pre>
   *
   * <code>string recruiterName = 8;</code>
   */
  com.google.protobuf.ByteString
      getRecruiterNameBytes();

  /**
   * <pre>
   *招聘者手机号
   * </pre>
   *
   * <code>string recruiterPhone = 9;</code>
   */
  java.lang.String getRecruiterPhone();
  /**
   * <pre>
   *招聘者手机号
   * </pre>
   *
   * <code>string recruiterPhone = 9;</code>
   */
  com.google.protobuf.ByteString
      getRecruiterPhoneBytes();

  /**
   * <pre>
   *招聘人数
   * </pre>
   *
   * <code>int32 jobNeed = 10;</code>
   */
  int getJobNeed();

  /**
   * <pre>
   *招聘者id
   * </pre>
   *
   * <code>int32 recruiterId = 11;</code>
   */
  int getRecruiterId();

  /**
   * <pre>
   *职位发布时间
   * </pre>
   *
   * <code>int64 openTime = 12;</code>
   */
  long getOpenTime();

  /**
   * <pre>
   *职位标签
   * </pre>
   *
   * <code>string jobTags = 13;</code>
   */
  java.lang.String getJobTags();
  /**
   * <pre>
   *职位标签
   * </pre>
   *
   * <code>string jobTags = 13;</code>
   */
  com.google.protobuf.ByteString
      getJobTagsBytes();

  /**
   * <pre>
   *职位刷新时间
   * </pre>
   *
   * <code>int64 updateTime = 14;</code>
   */
  long getUpdateTime();
}
