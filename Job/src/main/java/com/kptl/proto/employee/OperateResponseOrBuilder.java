// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee/employee.proto

package com.kptl.proto.employee;

public interface OperateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employee.OperateResponse)
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
