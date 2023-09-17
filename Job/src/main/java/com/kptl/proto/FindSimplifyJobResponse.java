// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto;

/**
 * Protobuf type {@code job.FindSimplifyJobResponse}
 */
public  final class FindSimplifyJobResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.FindSimplifyJobResponse)
    FindSimplifyJobResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindSimplifyJobResponse.newBuilder() to construct.
  private FindSimplifyJobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindSimplifyJobResponse() {
    jobMsg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindSimplifyJobResponse(
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
            com.kptl.proto.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.kptl.proto.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              jobMsg_ = new java.util.ArrayList<com.kptl.proto.JobSimplifyMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            jobMsg_.add(
                input.readMessage(com.kptl.proto.JobSimplifyMessage.parser(), extensionRegistry));
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
    return com.kptl.proto.JobOuterClass.internal_static_job_FindSimplifyJobResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.JobOuterClass.internal_static_job_FindSimplifyJobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.FindSimplifyJobResponse.class, com.kptl.proto.FindSimplifyJobResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.kptl.proto.ResponseHeader header_;
  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  public com.kptl.proto.ResponseHeader getHeader() {
    return header_ == null ? com.kptl.proto.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.job.ResponseHeader header = 1;</code>
   */
  public com.kptl.proto.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int JOBMSG_FIELD_NUMBER = 2;
  private java.util.List<com.kptl.proto.JobSimplifyMessage> jobMsg_;
  /**
   * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
   */
  public java.util.List<com.kptl.proto.JobSimplifyMessage> getJobMsgList() {
    return jobMsg_;
  }
  /**
   * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
   */
  public java.util.List<? extends com.kptl.proto.JobSimplifyMessageOrBuilder> 
      getJobMsgOrBuilderList() {
    return jobMsg_;
  }
  /**
   * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
   */
  public int getJobMsgCount() {
    return jobMsg_.size();
  }
  /**
   * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
   */
  public com.kptl.proto.JobSimplifyMessage getJobMsg(int index) {
    return jobMsg_.get(index);
  }
  /**
   * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
   */
  public com.kptl.proto.JobSimplifyMessageOrBuilder getJobMsgOrBuilder(
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
    if (!(obj instanceof com.kptl.proto.FindSimplifyJobResponse)) {
      return super.equals(obj);
    }
    com.kptl.proto.FindSimplifyJobResponse other = (com.kptl.proto.FindSimplifyJobResponse) obj;

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

  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.FindSimplifyJobResponse parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.FindSimplifyJobResponse prototype) {
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
   * Protobuf type {@code job.FindSimplifyJobResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.FindSimplifyJobResponse)
      com.kptl.proto.FindSimplifyJobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.JobOuterClass.internal_static_job_FindSimplifyJobResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.JobOuterClass.internal_static_job_FindSimplifyJobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.FindSimplifyJobResponse.class, com.kptl.proto.FindSimplifyJobResponse.Builder.class);
    }

    // Construct using com.kptl.proto.FindSimplifyJobResponse.newBuilder()
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
      return com.kptl.proto.JobOuterClass.internal_static_job_FindSimplifyJobResponse_descriptor;
    }

    public com.kptl.proto.FindSimplifyJobResponse getDefaultInstanceForType() {
      return com.kptl.proto.FindSimplifyJobResponse.getDefaultInstance();
    }

    public com.kptl.proto.FindSimplifyJobResponse build() {
      com.kptl.proto.FindSimplifyJobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.FindSimplifyJobResponse buildPartial() {
      com.kptl.proto.FindSimplifyJobResponse result = new com.kptl.proto.FindSimplifyJobResponse(this);
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
      if (other instanceof com.kptl.proto.FindSimplifyJobResponse) {
        return mergeFrom((com.kptl.proto.FindSimplifyJobResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.FindSimplifyJobResponse other) {
      if (other == com.kptl.proto.FindSimplifyJobResponse.getDefaultInstance()) return this;
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
      com.kptl.proto.FindSimplifyJobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.FindSimplifyJobResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.kptl.proto.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.ResponseHeader, com.kptl.proto.ResponseHeader.Builder, com.kptl.proto.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.kptl.proto.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(com.kptl.proto.ResponseHeader value) {
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
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        com.kptl.proto.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(com.kptl.proto.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.kptl.proto.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
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
     * <code>.job.ResponseHeader header = 1;</code>
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
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.kptl.proto.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.job.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.ResponseHeader, com.kptl.proto.ResponseHeader.Builder, com.kptl.proto.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.ResponseHeader, com.kptl.proto.ResponseHeader.Builder, com.kptl.proto.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<com.kptl.proto.JobSimplifyMessage> jobMsg_ =
      java.util.Collections.emptyList();
    private void ensureJobMsgIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        jobMsg_ = new java.util.ArrayList<com.kptl.proto.JobSimplifyMessage>(jobMsg_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kptl.proto.JobSimplifyMessage, com.kptl.proto.JobSimplifyMessage.Builder, com.kptl.proto.JobSimplifyMessageOrBuilder> jobMsgBuilder_;

    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public java.util.List<com.kptl.proto.JobSimplifyMessage> getJobMsgList() {
      if (jobMsgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobMsg_);
      } else {
        return jobMsgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public int getJobMsgCount() {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.size();
      } else {
        return jobMsgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.JobSimplifyMessage getJobMsg(int index) {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.get(index);
      } else {
        return jobMsgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder setJobMsg(
        int index, com.kptl.proto.JobSimplifyMessage value) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder setJobMsg(
        int index, com.kptl.proto.JobSimplifyMessage.Builder builderForValue) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(com.kptl.proto.JobSimplifyMessage value) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        int index, com.kptl.proto.JobSimplifyMessage value) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        com.kptl.proto.JobSimplifyMessage.Builder builderForValue) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder addJobMsg(
        int index, com.kptl.proto.JobSimplifyMessage.Builder builderForValue) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public Builder addAllJobMsg(
        java.lang.Iterable<? extends com.kptl.proto.JobSimplifyMessage> values) {
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
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
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.JobSimplifyMessage.Builder getJobMsgBuilder(
        int index) {
      return getJobMsgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.JobSimplifyMessageOrBuilder getJobMsgOrBuilder(
        int index) {
      if (jobMsgBuilder_ == null) {
        return jobMsg_.get(index);  } else {
        return jobMsgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public java.util.List<? extends com.kptl.proto.JobSimplifyMessageOrBuilder> 
         getJobMsgOrBuilderList() {
      if (jobMsgBuilder_ != null) {
        return jobMsgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobMsg_);
      }
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.JobSimplifyMessage.Builder addJobMsgBuilder() {
      return getJobMsgFieldBuilder().addBuilder(
          com.kptl.proto.JobSimplifyMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public com.kptl.proto.JobSimplifyMessage.Builder addJobMsgBuilder(
        int index) {
      return getJobMsgFieldBuilder().addBuilder(
          index, com.kptl.proto.JobSimplifyMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .job.JobSimplifyMessage jobMsg = 2;</code>
     */
    public java.util.List<com.kptl.proto.JobSimplifyMessage.Builder> 
         getJobMsgBuilderList() {
      return getJobMsgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kptl.proto.JobSimplifyMessage, com.kptl.proto.JobSimplifyMessage.Builder, com.kptl.proto.JobSimplifyMessageOrBuilder> 
        getJobMsgFieldBuilder() {
      if (jobMsgBuilder_ == null) {
        jobMsgBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kptl.proto.JobSimplifyMessage, com.kptl.proto.JobSimplifyMessage.Builder, com.kptl.proto.JobSimplifyMessageOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:job.FindSimplifyJobResponse)
  }

  // @@protoc_insertion_point(class_scope:job.FindSimplifyJobResponse)
  private static final com.kptl.proto.FindSimplifyJobResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.FindSimplifyJobResponse();
  }

  public static com.kptl.proto.FindSimplifyJobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindSimplifyJobResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindSimplifyJobResponse>() {
    public FindSimplifyJobResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindSimplifyJobResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindSimplifyJobResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindSimplifyJobResponse> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.FindSimplifyJobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

