// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee/Employee.proto

package com.kptl.proto;

public interface OperateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employee.OperateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  com.kptl.proto.ResponseHeader getHeader();
  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  com.kptl.proto.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated int32 jobIds = 2;</code>
   */
  java.util.List<java.lang.Integer> getJobIdsList();
  /**
   * <code>repeated int32 jobIds = 2;</code>
   */
  int getJobIdsCount();
  /**
   * <code>repeated int32 jobIds = 2;</code>
   */
  int getJobIds(int index);
}