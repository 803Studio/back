// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.kptl.proto.employee;

public interface SelfInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employee.SelfInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  boolean hasSimpleInfo();
  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  com.kptl.proto.employee.SimpleInformation getSimpleInfo();
  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  com.kptl.proto.employee.SimpleInformationOrBuilder getSimpleInfoOrBuilder();

  /**
   * <code>int32 isMarry = 2;</code>
   */
  int getIsMarry();

  /**
   * <code>int32 education = 3;</code>
   */
  int getEducation();

  /**
   * <code>int32 jobStatus = 4;</code>
   */
  int getJobStatus();
}
