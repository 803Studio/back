// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto.job;

/**
 * Protobuf type {@code job.JobMessage}
 */
public  final class JobMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.JobMessage)
    JobMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobMessage.newBuilder() to construct.
  private JobMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobMessage() {
    jobReq_ = "";
    jobNeed_ = 0;
    industry_ = "";
    recruiterName_ = "";
    recruiterPhone_ = "";
    recruiterId_ = 0;
    updateTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobMessage(
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
            com.kptl.proto.job.JobSimplifyMessage.Builder subBuilder = null;
            if (jobBaseMsg_ != null) {
              subBuilder = jobBaseMsg_.toBuilder();
            }
            jobBaseMsg_ = input.readMessage(com.kptl.proto.job.JobSimplifyMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jobBaseMsg_);
              jobBaseMsg_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jobReq_ = s;
            break;
          }
          case 24: {

            jobNeed_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            industry_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            recruiterName_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            recruiterPhone_ = s;
            break;
          }
          case 64: {

            recruiterId_ = input.readInt32();
            break;
          }
          case 72: {

            updateTime_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kptl.proto.job.JobOuterClass.internal_static_job_JobMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.job.JobOuterClass.internal_static_job_JobMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.job.JobMessage.class, com.kptl.proto.job.JobMessage.Builder.class);
  }

  public static final int JOBBASEMSG_FIELD_NUMBER = 1;
  private com.kptl.proto.job.JobSimplifyMessage jobBaseMsg_;
  /**
   * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
   */
  public boolean hasJobBaseMsg() {
    return jobBaseMsg_ != null;
  }
  /**
   * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
   */
  public com.kptl.proto.job.JobSimplifyMessage getJobBaseMsg() {
    return jobBaseMsg_ == null ? com.kptl.proto.job.JobSimplifyMessage.getDefaultInstance() : jobBaseMsg_;
  }
  /**
   * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
   */
  public com.kptl.proto.job.JobSimplifyMessageOrBuilder getJobBaseMsgOrBuilder() {
    return getJobBaseMsg();
  }

  public static final int JOBREQ_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobReq_;
  /**
   * <pre>
   *职位要求
   * </pre>
   *
   * <code>string jobReq = 2;</code>
   */
  public java.lang.String getJobReq() {
    java.lang.Object ref = jobReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobReq_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *职位要求
   * </pre>
   *
   * <code>string jobReq = 2;</code>
   */
  public com.google.protobuf.ByteString
      getJobReqBytes() {
    java.lang.Object ref = jobReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOBNEED_FIELD_NUMBER = 3;
  private int jobNeed_;
  /**
   * <pre>
   *招聘人数
   * </pre>
   *
   * <code>int32 jobNeed = 3;</code>
   */
  public int getJobNeed() {
    return jobNeed_;
  }

  public static final int INDUSTRY_FIELD_NUMBER = 5;
  private volatile java.lang.Object industry_;
  /**
   * <pre>
   *行业
   * </pre>
   *
   * <code>string industry = 5;</code>
   */
  public java.lang.String getIndustry() {
    java.lang.Object ref = industry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      industry_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *行业
   * </pre>
   *
   * <code>string industry = 5;</code>
   */
  public com.google.protobuf.ByteString
      getIndustryBytes() {
    java.lang.Object ref = industry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      industry_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECRUITERNAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object recruiterName_;
  /**
   * <pre>
   *招聘者
   * </pre>
   *
   * <code>string recruiterName = 6;</code>
   */
  public java.lang.String getRecruiterName() {
    java.lang.Object ref = recruiterName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recruiterName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *招聘者
   * </pre>
   *
   * <code>string recruiterName = 6;</code>
   */
  public com.google.protobuf.ByteString
      getRecruiterNameBytes() {
    java.lang.Object ref = recruiterName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recruiterName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECRUITERPHONE_FIELD_NUMBER = 7;
  private volatile java.lang.Object recruiterPhone_;
  /**
   * <pre>
   *招聘者手机号
   * </pre>
   *
   * <code>string recruiterPhone = 7;</code>
   */
  public java.lang.String getRecruiterPhone() {
    java.lang.Object ref = recruiterPhone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recruiterPhone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *招聘者手机号
   * </pre>
   *
   * <code>string recruiterPhone = 7;</code>
   */
  public com.google.protobuf.ByteString
      getRecruiterPhoneBytes() {
    java.lang.Object ref = recruiterPhone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recruiterPhone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECRUITERID_FIELD_NUMBER = 8;
  private int recruiterId_;
  /**
   * <pre>
   *招聘者id
   * </pre>
   *
   * <code>int32 recruiterId = 8;</code>
   */
  public int getRecruiterId() {
    return recruiterId_;
  }

  public static final int UPDATETIME_FIELD_NUMBER = 9;
  private long updateTime_;
  /**
   * <pre>
   *职位刷新时间
   * </pre>
   *
   * <code>int64 updateTime = 9;</code>
   */
  public long getUpdateTime() {
    return updateTime_;
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
    if (jobBaseMsg_ != null) {
      output.writeMessage(1, getJobBaseMsg());
    }
    if (!getJobReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobReq_);
    }
    if (jobNeed_ != 0) {
      output.writeInt32(3, jobNeed_);
    }
    if (!getIndustryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, industry_);
    }
    if (!getRecruiterNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, recruiterName_);
    }
    if (!getRecruiterPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, recruiterPhone_);
    }
    if (recruiterId_ != 0) {
      output.writeInt32(8, recruiterId_);
    }
    if (updateTime_ != 0L) {
      output.writeInt64(9, updateTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jobBaseMsg_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJobBaseMsg());
    }
    if (!getJobReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobReq_);
    }
    if (jobNeed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, jobNeed_);
    }
    if (!getIndustryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, industry_);
    }
    if (!getRecruiterNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, recruiterName_);
    }
    if (!getRecruiterPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, recruiterPhone_);
    }
    if (recruiterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, recruiterId_);
    }
    if (updateTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, updateTime_);
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
    if (!(obj instanceof com.kptl.proto.job.JobMessage)) {
      return super.equals(obj);
    }
    com.kptl.proto.job.JobMessage other = (com.kptl.proto.job.JobMessage) obj;

    boolean result = true;
    result = result && (hasJobBaseMsg() == other.hasJobBaseMsg());
    if (hasJobBaseMsg()) {
      result = result && getJobBaseMsg()
          .equals(other.getJobBaseMsg());
    }
    result = result && getJobReq()
        .equals(other.getJobReq());
    result = result && (getJobNeed()
        == other.getJobNeed());
    result = result && getIndustry()
        .equals(other.getIndustry());
    result = result && getRecruiterName()
        .equals(other.getRecruiterName());
    result = result && getRecruiterPhone()
        .equals(other.getRecruiterPhone());
    result = result && (getRecruiterId()
        == other.getRecruiterId());
    result = result && (getUpdateTime()
        == other.getUpdateTime());
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
    if (hasJobBaseMsg()) {
      hash = (37 * hash) + JOBBASEMSG_FIELD_NUMBER;
      hash = (53 * hash) + getJobBaseMsg().hashCode();
    }
    hash = (37 * hash) + JOBREQ_FIELD_NUMBER;
    hash = (53 * hash) + getJobReq().hashCode();
    hash = (37 * hash) + JOBNEED_FIELD_NUMBER;
    hash = (53 * hash) + getJobNeed();
    hash = (37 * hash) + INDUSTRY_FIELD_NUMBER;
    hash = (53 * hash) + getIndustry().hashCode();
    hash = (37 * hash) + RECRUITERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRecruiterName().hashCode();
    hash = (37 * hash) + RECRUITERPHONE_FIELD_NUMBER;
    hash = (53 * hash) + getRecruiterPhone().hashCode();
    hash = (37 * hash) + RECRUITERID_FIELD_NUMBER;
    hash = (53 * hash) + getRecruiterId();
    hash = (37 * hash) + UPDATETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.job.JobMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.JobMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.JobMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.JobMessage parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.job.JobMessage prototype) {
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
   * Protobuf type {@code job.JobMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.JobMessage)
      com.kptl.proto.job.JobMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_JobMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_JobMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.job.JobMessage.class, com.kptl.proto.job.JobMessage.Builder.class);
    }

    // Construct using com.kptl.proto.job.JobMessage.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (jobBaseMsgBuilder_ == null) {
        jobBaseMsg_ = null;
      } else {
        jobBaseMsg_ = null;
        jobBaseMsgBuilder_ = null;
      }
      jobReq_ = "";

      jobNeed_ = 0;

      industry_ = "";

      recruiterName_ = "";

      recruiterPhone_ = "";

      recruiterId_ = 0;

      updateTime_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_JobMessage_descriptor;
    }

    public com.kptl.proto.job.JobMessage getDefaultInstanceForType() {
      return com.kptl.proto.job.JobMessage.getDefaultInstance();
    }

    public com.kptl.proto.job.JobMessage build() {
      com.kptl.proto.job.JobMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.job.JobMessage buildPartial() {
      com.kptl.proto.job.JobMessage result = new com.kptl.proto.job.JobMessage(this);
      if (jobBaseMsgBuilder_ == null) {
        result.jobBaseMsg_ = jobBaseMsg_;
      } else {
        result.jobBaseMsg_ = jobBaseMsgBuilder_.build();
      }
      result.jobReq_ = jobReq_;
      result.jobNeed_ = jobNeed_;
      result.industry_ = industry_;
      result.recruiterName_ = recruiterName_;
      result.recruiterPhone_ = recruiterPhone_;
      result.recruiterId_ = recruiterId_;
      result.updateTime_ = updateTime_;
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
      if (other instanceof com.kptl.proto.job.JobMessage) {
        return mergeFrom((com.kptl.proto.job.JobMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.job.JobMessage other) {
      if (other == com.kptl.proto.job.JobMessage.getDefaultInstance()) return this;
      if (other.hasJobBaseMsg()) {
        mergeJobBaseMsg(other.getJobBaseMsg());
      }
      if (!other.getJobReq().isEmpty()) {
        jobReq_ = other.jobReq_;
        onChanged();
      }
      if (other.getJobNeed() != 0) {
        setJobNeed(other.getJobNeed());
      }
      if (!other.getIndustry().isEmpty()) {
        industry_ = other.industry_;
        onChanged();
      }
      if (!other.getRecruiterName().isEmpty()) {
        recruiterName_ = other.recruiterName_;
        onChanged();
      }
      if (!other.getRecruiterPhone().isEmpty()) {
        recruiterPhone_ = other.recruiterPhone_;
        onChanged();
      }
      if (other.getRecruiterId() != 0) {
        setRecruiterId(other.getRecruiterId());
      }
      if (other.getUpdateTime() != 0L) {
        setUpdateTime(other.getUpdateTime());
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
      com.kptl.proto.job.JobMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.job.JobMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.kptl.proto.job.JobSimplifyMessage jobBaseMsg_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.job.JobSimplifyMessage, com.kptl.proto.job.JobSimplifyMessage.Builder, com.kptl.proto.job.JobSimplifyMessageOrBuilder> jobBaseMsgBuilder_;
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public boolean hasJobBaseMsg() {
      return jobBaseMsgBuilder_ != null || jobBaseMsg_ != null;
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public com.kptl.proto.job.JobSimplifyMessage getJobBaseMsg() {
      if (jobBaseMsgBuilder_ == null) {
        return jobBaseMsg_ == null ? com.kptl.proto.job.JobSimplifyMessage.getDefaultInstance() : jobBaseMsg_;
      } else {
        return jobBaseMsgBuilder_.getMessage();
      }
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public Builder setJobBaseMsg(com.kptl.proto.job.JobSimplifyMessage value) {
      if (jobBaseMsgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jobBaseMsg_ = value;
        onChanged();
      } else {
        jobBaseMsgBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public Builder setJobBaseMsg(
        com.kptl.proto.job.JobSimplifyMessage.Builder builderForValue) {
      if (jobBaseMsgBuilder_ == null) {
        jobBaseMsg_ = builderForValue.build();
        onChanged();
      } else {
        jobBaseMsgBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public Builder mergeJobBaseMsg(com.kptl.proto.job.JobSimplifyMessage value) {
      if (jobBaseMsgBuilder_ == null) {
        if (jobBaseMsg_ != null) {
          jobBaseMsg_ =
            com.kptl.proto.job.JobSimplifyMessage.newBuilder(jobBaseMsg_).mergeFrom(value).buildPartial();
        } else {
          jobBaseMsg_ = value;
        }
        onChanged();
      } else {
        jobBaseMsgBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public Builder clearJobBaseMsg() {
      if (jobBaseMsgBuilder_ == null) {
        jobBaseMsg_ = null;
        onChanged();
      } else {
        jobBaseMsg_ = null;
        jobBaseMsgBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public com.kptl.proto.job.JobSimplifyMessage.Builder getJobBaseMsgBuilder() {
      
      onChanged();
      return getJobBaseMsgFieldBuilder().getBuilder();
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    public com.kptl.proto.job.JobSimplifyMessageOrBuilder getJobBaseMsgOrBuilder() {
      if (jobBaseMsgBuilder_ != null) {
        return jobBaseMsgBuilder_.getMessageOrBuilder();
      } else {
        return jobBaseMsg_ == null ?
            com.kptl.proto.job.JobSimplifyMessage.getDefaultInstance() : jobBaseMsg_;
      }
    }
    /**
     * <code>.job.JobSimplifyMessage jobBaseMsg = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.job.JobSimplifyMessage, com.kptl.proto.job.JobSimplifyMessage.Builder, com.kptl.proto.job.JobSimplifyMessageOrBuilder> 
        getJobBaseMsgFieldBuilder() {
      if (jobBaseMsgBuilder_ == null) {
        jobBaseMsgBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.job.JobSimplifyMessage, com.kptl.proto.job.JobSimplifyMessage.Builder, com.kptl.proto.job.JobSimplifyMessageOrBuilder>(
                getJobBaseMsg(),
                getParentForChildren(),
                isClean());
        jobBaseMsg_ = null;
      }
      return jobBaseMsgBuilder_;
    }

    private java.lang.Object jobReq_ = "";
    /**
     * <pre>
     *职位要求
     * </pre>
     *
     * <code>string jobReq = 2;</code>
     */
    public java.lang.String getJobReq() {
      java.lang.Object ref = jobReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *职位要求
     * </pre>
     *
     * <code>string jobReq = 2;</code>
     */
    public com.google.protobuf.ByteString
        getJobReqBytes() {
      java.lang.Object ref = jobReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *职位要求
     * </pre>
     *
     * <code>string jobReq = 2;</code>
     */
    public Builder setJobReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *职位要求
     * </pre>
     *
     * <code>string jobReq = 2;</code>
     */
    public Builder clearJobReq() {
      
      jobReq_ = getDefaultInstance().getJobReq();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *职位要求
     * </pre>
     *
     * <code>string jobReq = 2;</code>
     */
    public Builder setJobReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobReq_ = value;
      onChanged();
      return this;
    }

    private int jobNeed_ ;
    /**
     * <pre>
     *招聘人数
     * </pre>
     *
     * <code>int32 jobNeed = 3;</code>
     */
    public int getJobNeed() {
      return jobNeed_;
    }
    /**
     * <pre>
     *招聘人数
     * </pre>
     *
     * <code>int32 jobNeed = 3;</code>
     */
    public Builder setJobNeed(int value) {
      
      jobNeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘人数
     * </pre>
     *
     * <code>int32 jobNeed = 3;</code>
     */
    public Builder clearJobNeed() {
      
      jobNeed_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object industry_ = "";
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 5;</code>
     */
    public java.lang.String getIndustry() {
      java.lang.Object ref = industry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        industry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 5;</code>
     */
    public com.google.protobuf.ByteString
        getIndustryBytes() {
      java.lang.Object ref = industry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        industry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 5;</code>
     */
    public Builder setIndustry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      industry_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 5;</code>
     */
    public Builder clearIndustry() {
      
      industry_ = getDefaultInstance().getIndustry();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 5;</code>
     */
    public Builder setIndustryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      industry_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recruiterName_ = "";
    /**
     * <pre>
     *招聘者
     * </pre>
     *
     * <code>string recruiterName = 6;</code>
     */
    public java.lang.String getRecruiterName() {
      java.lang.Object ref = recruiterName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recruiterName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *招聘者
     * </pre>
     *
     * <code>string recruiterName = 6;</code>
     */
    public com.google.protobuf.ByteString
        getRecruiterNameBytes() {
      java.lang.Object ref = recruiterName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recruiterName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *招聘者
     * </pre>
     *
     * <code>string recruiterName = 6;</code>
     */
    public Builder setRecruiterName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recruiterName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘者
     * </pre>
     *
     * <code>string recruiterName = 6;</code>
     */
    public Builder clearRecruiterName() {
      
      recruiterName_ = getDefaultInstance().getRecruiterName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘者
     * </pre>
     *
     * <code>string recruiterName = 6;</code>
     */
    public Builder setRecruiterNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recruiterName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recruiterPhone_ = "";
    /**
     * <pre>
     *招聘者手机号
     * </pre>
     *
     * <code>string recruiterPhone = 7;</code>
     */
    public java.lang.String getRecruiterPhone() {
      java.lang.Object ref = recruiterPhone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recruiterPhone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *招聘者手机号
     * </pre>
     *
     * <code>string recruiterPhone = 7;</code>
     */
    public com.google.protobuf.ByteString
        getRecruiterPhoneBytes() {
      java.lang.Object ref = recruiterPhone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recruiterPhone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *招聘者手机号
     * </pre>
     *
     * <code>string recruiterPhone = 7;</code>
     */
    public Builder setRecruiterPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recruiterPhone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘者手机号
     * </pre>
     *
     * <code>string recruiterPhone = 7;</code>
     */
    public Builder clearRecruiterPhone() {
      
      recruiterPhone_ = getDefaultInstance().getRecruiterPhone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘者手机号
     * </pre>
     *
     * <code>string recruiterPhone = 7;</code>
     */
    public Builder setRecruiterPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recruiterPhone_ = value;
      onChanged();
      return this;
    }

    private int recruiterId_ ;
    /**
     * <pre>
     *招聘者id
     * </pre>
     *
     * <code>int32 recruiterId = 8;</code>
     */
    public int getRecruiterId() {
      return recruiterId_;
    }
    /**
     * <pre>
     *招聘者id
     * </pre>
     *
     * <code>int32 recruiterId = 8;</code>
     */
    public Builder setRecruiterId(int value) {
      
      recruiterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *招聘者id
     * </pre>
     *
     * <code>int32 recruiterId = 8;</code>
     */
    public Builder clearRecruiterId() {
      
      recruiterId_ = 0;
      onChanged();
      return this;
    }

    private long updateTime_ ;
    /**
     * <pre>
     *职位刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 9;</code>
     */
    public long getUpdateTime() {
      return updateTime_;
    }
    /**
     * <pre>
     *职位刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 9;</code>
     */
    public Builder setUpdateTime(long value) {
      
      updateTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *职位刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 9;</code>
     */
    public Builder clearUpdateTime() {
      
      updateTime_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:job.JobMessage)
  }

  // @@protoc_insertion_point(class_scope:job.JobMessage)
  private static final com.kptl.proto.job.JobMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.job.JobMessage();
  }

  public static com.kptl.proto.job.JobMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobMessage>
      PARSER = new com.google.protobuf.AbstractParser<JobMessage>() {
    public JobMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobMessage> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.job.JobMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
