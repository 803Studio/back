// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee/Employee.proto

package com.kptl.proto;

public interface ResponseHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:employee.ResponseHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.employee.ResponseStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.employee.ResponseStatus status = 1;</code>
   */
  com.kptl.proto.ResponseStatus getStatus();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}