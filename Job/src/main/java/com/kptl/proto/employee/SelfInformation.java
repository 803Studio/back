// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.kptl.proto.employee;

/**
 * Protobuf type {@code employee.SelfInformation}
 */
public  final class SelfInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employee.SelfInformation)
    SelfInformationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SelfInformation.newBuilder() to construct.
  private SelfInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SelfInformation() {
    isMarry_ = 0;
    education_ = 0;
    jobStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SelfInformation(
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
            com.kptl.proto.employee.SimpleInformation.Builder subBuilder = null;
            if (simpleInfo_ != null) {
              subBuilder = simpleInfo_.toBuilder();
            }
            simpleInfo_ = input.readMessage(com.kptl.proto.employee.SimpleInformation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(simpleInfo_);
              simpleInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            isMarry_ = input.readInt32();
            break;
          }
          case 24: {

            education_ = input.readInt32();
            break;
          }
          case 32: {

            jobStatus_ = input.readInt32();
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
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SelfInformation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SelfInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.employee.SelfInformation.class, com.kptl.proto.employee.SelfInformation.Builder.class);
  }

  public static final int SIMPLEINFO_FIELD_NUMBER = 1;
  private com.kptl.proto.employee.SimpleInformation simpleInfo_;
  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  public boolean hasSimpleInfo() {
    return simpleInfo_ != null;
  }
  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  public com.kptl.proto.employee.SimpleInformation getSimpleInfo() {
    return simpleInfo_ == null ? com.kptl.proto.employee.SimpleInformation.getDefaultInstance() : simpleInfo_;
  }
  /**
   * <code>.employee.SimpleInformation simpleInfo = 1;</code>
   */
  public com.kptl.proto.employee.SimpleInformationOrBuilder getSimpleInfoOrBuilder() {
    return getSimpleInfo();
  }

  public static final int ISMARRY_FIELD_NUMBER = 2;
  private int isMarry_;
  /**
   * <code>int32 isMarry = 2;</code>
   */
  public int getIsMarry() {
    return isMarry_;
  }

  public static final int EDUCATION_FIELD_NUMBER = 3;
  private int education_;
  /**
   * <code>int32 education = 3;</code>
   */
  public int getEducation() {
    return education_;
  }

  public static final int JOBSTATUS_FIELD_NUMBER = 4;
  private int jobStatus_;
  /**
   * <code>int32 jobStatus = 4;</code>
   */
  public int getJobStatus() {
    return jobStatus_;
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
    if (simpleInfo_ != null) {
      output.writeMessage(1, getSimpleInfo());
    }
    if (isMarry_ != 0) {
      output.writeInt32(2, isMarry_);
    }
    if (education_ != 0) {
      output.writeInt32(3, education_);
    }
    if (jobStatus_ != 0) {
      output.writeInt32(4, jobStatus_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (simpleInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSimpleInfo());
    }
    if (isMarry_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, isMarry_);
    }
    if (education_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, education_);
    }
    if (jobStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, jobStatus_);
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
    if (!(obj instanceof com.kptl.proto.employee.SelfInformation)) {
      return super.equals(obj);
    }
    com.kptl.proto.employee.SelfInformation other = (com.kptl.proto.employee.SelfInformation) obj;

    boolean result = true;
    result = result && (hasSimpleInfo() == other.hasSimpleInfo());
    if (hasSimpleInfo()) {
      result = result && getSimpleInfo()
          .equals(other.getSimpleInfo());
    }
    result = result && (getIsMarry()
        == other.getIsMarry());
    result = result && (getEducation()
        == other.getEducation());
    result = result && (getJobStatus()
        == other.getJobStatus());
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
    if (hasSimpleInfo()) {
      hash = (37 * hash) + SIMPLEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getSimpleInfo().hashCode();
    }
    hash = (37 * hash) + ISMARRY_FIELD_NUMBER;
    hash = (53 * hash) + getIsMarry();
    hash = (37 * hash) + EDUCATION_FIELD_NUMBER;
    hash = (53 * hash) + getEducation();
    hash = (37 * hash) + JOBSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getJobStatus();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.employee.SelfInformation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.SelfInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SelfInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SelfInformation parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.employee.SelfInformation prototype) {
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
   * Protobuf type {@code employee.SelfInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employee.SelfInformation)
      com.kptl.proto.employee.SelfInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SelfInformation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SelfInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.employee.SelfInformation.class, com.kptl.proto.employee.SelfInformation.Builder.class);
    }

    // Construct using com.kptl.proto.employee.SelfInformation.newBuilder()
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
      if (simpleInfoBuilder_ == null) {
        simpleInfo_ = null;
      } else {
        simpleInfo_ = null;
        simpleInfoBuilder_ = null;
      }
      isMarry_ = 0;

      education_ = 0;

      jobStatus_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SelfInformation_descriptor;
    }

    public com.kptl.proto.employee.SelfInformation getDefaultInstanceForType() {
      return com.kptl.proto.employee.SelfInformation.getDefaultInstance();
    }

    public com.kptl.proto.employee.SelfInformation build() {
      com.kptl.proto.employee.SelfInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.employee.SelfInformation buildPartial() {
      com.kptl.proto.employee.SelfInformation result = new com.kptl.proto.employee.SelfInformation(this);
      if (simpleInfoBuilder_ == null) {
        result.simpleInfo_ = simpleInfo_;
      } else {
        result.simpleInfo_ = simpleInfoBuilder_.build();
      }
      result.isMarry_ = isMarry_;
      result.education_ = education_;
      result.jobStatus_ = jobStatus_;
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
      if (other instanceof com.kptl.proto.employee.SelfInformation) {
        return mergeFrom((com.kptl.proto.employee.SelfInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.employee.SelfInformation other) {
      if (other == com.kptl.proto.employee.SelfInformation.getDefaultInstance()) return this;
      if (other.hasSimpleInfo()) {
        mergeSimpleInfo(other.getSimpleInfo());
      }
      if (other.getIsMarry() != 0) {
        setIsMarry(other.getIsMarry());
      }
      if (other.getEducation() != 0) {
        setEducation(other.getEducation());
      }
      if (other.getJobStatus() != 0) {
        setJobStatus(other.getJobStatus());
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
      com.kptl.proto.employee.SelfInformation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.employee.SelfInformation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.kptl.proto.employee.SimpleInformation simpleInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.SimpleInformation, com.kptl.proto.employee.SimpleInformation.Builder, com.kptl.proto.employee.SimpleInformationOrBuilder> simpleInfoBuilder_;
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public boolean hasSimpleInfo() {
      return simpleInfoBuilder_ != null || simpleInfo_ != null;
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public com.kptl.proto.employee.SimpleInformation getSimpleInfo() {
      if (simpleInfoBuilder_ == null) {
        return simpleInfo_ == null ? com.kptl.proto.employee.SimpleInformation.getDefaultInstance() : simpleInfo_;
      } else {
        return simpleInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public Builder setSimpleInfo(com.kptl.proto.employee.SimpleInformation value) {
      if (simpleInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        simpleInfo_ = value;
        onChanged();
      } else {
        simpleInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public Builder setSimpleInfo(
        com.kptl.proto.employee.SimpleInformation.Builder builderForValue) {
      if (simpleInfoBuilder_ == null) {
        simpleInfo_ = builderForValue.build();
        onChanged();
      } else {
        simpleInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public Builder mergeSimpleInfo(com.kptl.proto.employee.SimpleInformation value) {
      if (simpleInfoBuilder_ == null) {
        if (simpleInfo_ != null) {
          simpleInfo_ =
            com.kptl.proto.employee.SimpleInformation.newBuilder(simpleInfo_).mergeFrom(value).buildPartial();
        } else {
          simpleInfo_ = value;
        }
        onChanged();
      } else {
        simpleInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public Builder clearSimpleInfo() {
      if (simpleInfoBuilder_ == null) {
        simpleInfo_ = null;
        onChanged();
      } else {
        simpleInfo_ = null;
        simpleInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public com.kptl.proto.employee.SimpleInformation.Builder getSimpleInfoBuilder() {
      
      onChanged();
      return getSimpleInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    public com.kptl.proto.employee.SimpleInformationOrBuilder getSimpleInfoOrBuilder() {
      if (simpleInfoBuilder_ != null) {
        return simpleInfoBuilder_.getMessageOrBuilder();
      } else {
        return simpleInfo_ == null ?
            com.kptl.proto.employee.SimpleInformation.getDefaultInstance() : simpleInfo_;
      }
    }
    /**
     * <code>.employee.SimpleInformation simpleInfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.SimpleInformation, com.kptl.proto.employee.SimpleInformation.Builder, com.kptl.proto.employee.SimpleInformationOrBuilder> 
        getSimpleInfoFieldBuilder() {
      if (simpleInfoBuilder_ == null) {
        simpleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.employee.SimpleInformation, com.kptl.proto.employee.SimpleInformation.Builder, com.kptl.proto.employee.SimpleInformationOrBuilder>(
                getSimpleInfo(),
                getParentForChildren(),
                isClean());
        simpleInfo_ = null;
      }
      return simpleInfoBuilder_;
    }

    private int isMarry_ ;
    /**
     * <code>int32 isMarry = 2;</code>
     */
    public int getIsMarry() {
      return isMarry_;
    }
    /**
     * <code>int32 isMarry = 2;</code>
     */
    public Builder setIsMarry(int value) {
      
      isMarry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 isMarry = 2;</code>
     */
    public Builder clearIsMarry() {
      
      isMarry_ = 0;
      onChanged();
      return this;
    }

    private int education_ ;
    /**
     * <code>int32 education = 3;</code>
     */
    public int getEducation() {
      return education_;
    }
    /**
     * <code>int32 education = 3;</code>
     */
    public Builder setEducation(int value) {
      
      education_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 education = 3;</code>
     */
    public Builder clearEducation() {
      
      education_ = 0;
      onChanged();
      return this;
    }

    private int jobStatus_ ;
    /**
     * <code>int32 jobStatus = 4;</code>
     */
    public int getJobStatus() {
      return jobStatus_;
    }
    /**
     * <code>int32 jobStatus = 4;</code>
     */
    public Builder setJobStatus(int value) {
      
      jobStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jobStatus = 4;</code>
     */
    public Builder clearJobStatus() {
      
      jobStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:employee.SelfInformation)
  }

  // @@protoc_insertion_point(class_scope:employee.SelfInformation)
  private static final com.kptl.proto.employee.SelfInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.employee.SelfInformation();
  }

  public static com.kptl.proto.employee.SelfInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SelfInformation>
      PARSER = new com.google.protobuf.AbstractParser<SelfInformation>() {
    public SelfInformation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SelfInformation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SelfInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SelfInformation> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.employee.SelfInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

