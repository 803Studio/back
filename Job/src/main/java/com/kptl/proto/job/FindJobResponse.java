// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job/Job.proto

package com.kptl.proto.job;

/**
 * Protobuf type {@code job.FindJobResponse}
 */
public  final class FindJobResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.FindJobResponse)
    FindJobResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindJobResponse.newBuilder() to construct.
  private FindJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindJobResponse() {
    jobMsg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindJobResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            global.Headers.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(global.Headers.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              jobMsg_ = new java.util.ArrayList<com.kptl.proto.job.JobMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            jobMsg_.add(
                input.readMessage(com.kptl.proto.job.JobMessage.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        jobMsg_ = java.util.Collections.unmodifiableList(jobMsg_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.job.FindJobResponse.class, com.kptl.proto.job.FindJobResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private global.Headers.ResponseHeader header_;
  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  public global.Headers.ResponseHeader getHeader() {
    return header_ == null ? global.Headers.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.global.ResponseHeader header = 1;</code>
   */
  public global.Headers.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int JOBMSG_FIELD_NUMBER = 2;
  private java.util.List<com.kptl.proto.job.JobMessage> jobMsg_;
  /**
   * <code>repeated .job.JobMessage jobMsg = 2;</code>
   */
  public java.util.List<com.kptl.proto.job.JobMessage> getJobMsgList() {
    return jobMsg_;
  }
  /**
   * <code>repeated .job.JobMessage jobMsg = 2;</code>
   */
  public java.util.List<? extends com.kptl.proto.job.JobMessageOrBuilder> 
      getJobMsgOrBuilderList() {
    return jobMsg_;
  }
  /**
   * <code>repeated .job.JobMessage jobMsg = 2;</code>
   */
  public int getJobMsgCount() {
    return jobMsg_.size();
  }
  /**
   * <code>repeated .job.JobMessage jobMsg = 2;</code>
   */
  public com.kptl.proto.job.JobMessage getJobMsg(int index) {
    return jobMsg_.get(index);
  }
  /**
   * <code>repeated .job.JobMessage jobMsg = 2;</code>
   */
  public com.kptl.proto.job.JobMessageOrBuilder getJobMsgOrBuilder(
      int index) {
    return jobMsg_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < jobMsg_.size(); i++) {
      output.writeMessage(2, jobMsg_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < jobMsg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, jobMsg_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kptl.proto.job.FindJobResponse)) {
      return super.equals(obj);
    }
    com.kptl.proto.job.FindJobResponse other = (com.kptl.proto.job.FindJobResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getJobMsgList()
        .equals(other.getJobMsgList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getJobMsgCount() > 0) {
      hash = (37 * hash) + JOBMSG_FIELD_NUMBER;
      hash = (53 * hash) + getJobMsgList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.job.FindJobResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.kptl.proto.job.FindJobResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code job.FindJobResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.FindJobResponse)
      com.kptl.proto.job.FindJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.job.FindJobResponse.class, com.kptl.proto.job.FindJobResponse.Builder.class);
    }

    // Construct using com.kptl.proto.job.FindJobResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getJobMsgFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (jobMsgBuilder_ == null) {
        jobMsg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        jobMsgBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobResponse_descriptor;
    }

    public com.kptl.proto.job.FindJobResponse getDefaultInstanceForType() {
      return com.kptl.proto.job.FindJobResponse.getDefaultInstance();
    }

    public com.kptl.proto.job.FindJobResponse build() {
      com.kptl.proto.job.FindJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.job.FindJobResponse buildPartial() {
      com.kptl.proto.job.FindJobResponse result = new com.kptl.proto.job.FindJobResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (jobMsgBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          jobMsg_ = java.util.Collections.unmodifiableList(jobMsg_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jobMsg_ = jobMsg_;
      } else {
        result.jobMsg_ = jobMsgBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kptl.proto.job.FindJobResponse) {
        return mergeFrom((com.kptl.proto.job.FindJobResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.job.FindJobResponse other) {
      if (other == com.kptl.proto.job.FindJobResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (jobMsgBuilder_ == null) {
        if (!other.jobMsg_.isEmpty()) {
          if (jobMsg_.isEmpty()) {
            jobMsg_ = other.jobMsg_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJobMsgIsMutable();
            jobMsg_.addAll(other.jobMsg_);
          }
          onChanged();
        }
      } else {
        if (!other.jobMsg_.isEmpty()) {
          if (jobMsgBuilder_.isEmpty()) {
            jobMsgBuilder_.dispose();
            jobMsgBuilder_ = null;
            jobMsg_ = other.jobMsg_;
            bitField0_ = (bitField0_ & ~0x00000002);
            jobMsgBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobMsgFieldBuilder() : null;
          } else {
            jobMsgBuilder_.addAllMessages(other.jobMsg_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.kptl.proto.job.FindJobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.job.FindJobResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private global.Headers.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        global.Headers.ResponseHeader, global.Headers.ResponseHeader.Builder, global.Headers.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public global.Headers.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? global.Headers.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(global.Headers.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        global.Headers.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(global.Headers.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            global.Headers.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public global.Headers.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    public global.Headers.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            global.Headers.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.global.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        global.Headers.ResponseHeader, global.Headers.ResponseHeader.Builder, global.Headers.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            global.Headers.ResponseHeader, global.Headers.ResponseHeader.Builder, global.Headers.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<com.kptl.proto.job.JobMessage> jobMsg_ =
      java.util.Collections.emptyList();
    private void ensureJobMsgIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        jobMsg_ = new java.util.ArrayList<com.kptl.proto.job.JobMessage>(jobMsg_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kptl.proto.job.JobMessage, com.kptl.proto.job.JobMessage.Builder, com.kptl.proto.job.JobMessageOrBuilder> jobMsgBuilder_;

    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public java.util.List<com.kptl.proto.job.JobMessage> getJobMsgList() {
      if (jobMsgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobMsg_);
      } else {
        return jobMsgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public int getJobMsgCount() {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.size();
      } else {
        return jobMsgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.job.JobMessage getJobMsg(int index) {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.get(index);
      } else {
        return jobMsgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder setJobMsg(
        int index, com.kptl.proto.job.JobMessage value) {
      if (jobMsgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobMsgIsMutable();
        jobMsg_.set(index, value);
        onChanged();
      } else {
        jobMsgBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder setJobMsg(
        int index, com.kptl.proto.job.JobMessage.Builder builderForValue) {
      if (jobMsgBuilder_ == null) {
        ensureJobMsgIsMutable();
        jobMsg_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobMsgBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(com.kptl.proto.job.JobMessage value) {
      if (jobMsgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobMsgIsMutable();
        jobMsg_.add(value);
        onChanged();
      } else {
        jobMsgBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        int index, com.kptl.proto.job.JobMessage value) {
      if (jobMsgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobMsgIsMutable();
        jobMsg_.add(index, value);
        onChanged();
      } else {
        jobMsgBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        com.kptl.proto.job.JobMessage.Builder builderForValue) {
      if (jobMsgBuilder_ == null) {
        ensureJobMsgIsMutable();
        jobMsg_.add(builderForValue.build());
        onChanged();
      } else {
        jobMsgBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        int index, com.kptl.proto.job.JobMessage.Builder builderForValue) {
      if (jobMsgBuilder_ == null) {
        ensureJobMsgIsMutable();
        jobMsg_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobMsgBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder addAllJobMsg(
        java.lang.Iterable<? extends com.kptl.proto.job.JobMessage> values) {
      if (jobMsgBuilder_ == null) {
        ensureJobMsgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobMsg_);
        onChanged();
      } else {
        jobMsgBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder clearJobMsg() {
      if (jobMsgBuilder_ == null) {
        jobMsg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        jobMsgBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public Builder removeJobMsg(int index) {
      if (jobMsgBuilder_ == null) {
        ensureJobMsgIsMutable();
        jobMsg_.remove(index);
        onChanged();
      } else {
        jobMsgBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.job.JobMessage.Builder getJobMsgBuilder(
        int index) {
      return getJobMsgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.job.JobMessageOrBuilder getJobMsgOrBuilder(
        int index) {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.get(index);  } else {
        return jobMsgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public java.util.List<? extends com.kptl.proto.job.JobMessageOrBuilder> 
         getJobMsgOrBuilderList() {
      if (jobMsgBuilder_ != null) {
        return jobMsgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobMsg_);
      }
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.job.JobMessage.Builder addJobMsgBuilder() {
      return getJobMsgFieldBuilder().addBuilder(
          com.kptl.proto.job.JobMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.job.JobMessage.Builder addJobMsgBuilder(
        int index) {
      return getJobMsgFieldBuilder().addBuilder(
          index, com.kptl.proto.job.JobMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .job.JobMessage jobMsg = 2;</code>
     */
    public java.util.List<com.kptl.proto.job.JobMessage.Builder> 
         getJobMsgBuilderList() {
      return getJobMsgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kptl.proto.job.JobMessage, com.kptl.proto.job.JobMessage.Builder, com.kptl.proto.job.JobMessageOrBuilder> 
        getJobMsgFieldBuilder() {
      if (jobMsgBuilder_ == null) {
        jobMsgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kptl.proto.job.JobMessage, com.kptl.proto.job.JobMessage.Builder, com.kptl.proto.job.JobMessageOrBuilder>(
                jobMsg_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        jobMsg_ = null;
      }
      return jobMsgBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:job.FindJobResponse)
  }

  // @@protoc_insertion_point(class_scope:job.FindJobResponse)
  private static final com.kptl.proto.job.FindJobResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.job.FindJobResponse();
  }

  public static com.kptl.proto.job.FindJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindJobResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindJobResponse>() {
    public FindJobResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindJobResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindJobResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindJobResponse> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.job.FindJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

