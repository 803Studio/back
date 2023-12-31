// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee/employee.proto

package com.kptl.proto.employee;

/**
 * Protobuf type {@code employee.SimpleInformation}
 */
public  final class SimpleInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employee.SimpleInformation)
    SimpleInformationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleInformation.newBuilder() to construct.
  private SimpleInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleInformation() {
    id_ = 0;
    realName_ = "";
    sex_ = 0;
    workYear_ = 0;
    expectedLocation_ = "";
    industry_ = "";
    jobType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimpleInformation(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            realName_ = s;
            break;
          }
          case 24: {

            sex_ = input.readInt32();
            break;
          }
          case 32: {

            workYear_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            expectedLocation_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            industry_ = s;
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            jobType_ = rawValue;
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
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SimpleInformation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SimpleInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.employee.SimpleInformation.class, com.kptl.proto.employee.SimpleInformation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   *用户id
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int REALNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object realName_;
  /**
   * <pre>
   *真实名字
   * </pre>
   *
   * <code>string realName = 2;</code>
   */
  public java.lang.String getRealName() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      realName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *真实名字
   * </pre>
   *
   * <code>string realName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRealNameBytes() {
    java.lang.Object ref = realName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      realName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEX_FIELD_NUMBER = 3;
  private int sex_;
  /**
   * <pre>
   *性别，0男，1女
   * </pre>
   *
   * <code>int32 sex = 3;</code>
   */
  public int getSex() {
    return sex_;
  }

  public static final int WORKYEAR_FIELD_NUMBER = 4;
  private int workYear_;
  /**
   * <pre>
   *工作年限
   * </pre>
   *
   * <code>int32 workYear = 4;</code>
   */
  public int getWorkYear() {
    return workYear_;
  }

  public static final int EXPECTEDLOCATION_FIELD_NUMBER = 5;
  private volatile java.lang.Object expectedLocation_;
  /**
   * <pre>
   *期望工作地点
   * </pre>
   *
   * <code>string expectedLocation = 5;</code>
   */
  public java.lang.String getExpectedLocation() {
    java.lang.Object ref = expectedLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expectedLocation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *期望工作地点
   * </pre>
   *
   * <code>string expectedLocation = 5;</code>
   */
  public com.google.protobuf.ByteString
      getExpectedLocationBytes() {
    java.lang.Object ref = expectedLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expectedLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDUSTRY_FIELD_NUMBER = 6;
  private volatile java.lang.Object industry_;
  /**
   * <pre>
   *行业
   * </pre>
   *
   * <code>string industry = 6;</code>
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
   * <code>string industry = 6;</code>
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

  public static final int JOBTYPE_FIELD_NUMBER = 7;
  private int jobType_;
  /**
   * <pre>
   * </pre>
   *
   * <code>.employee.JobType jobType = 7;</code>
   */
  public int getJobTypeValue() {
    return jobType_;
  }
  /**
   * <pre>
   * </pre>
   *
   * <code>.employee.JobType jobType = 7;</code>
   */
  public com.kptl.proto.employee.JobType getJobType() {
    com.kptl.proto.employee.JobType result = com.kptl.proto.employee.JobType.valueOf(jobType_);
    return result == null ? com.kptl.proto.employee.JobType.UNRECOGNIZED : result;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getRealNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, realName_);
    }
    if (sex_ != 0) {
      output.writeInt32(3, sex_);
    }
    if (workYear_ != 0) {
      output.writeInt32(4, workYear_);
    }
    if (!getExpectedLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, expectedLocation_);
    }
    if (!getIndustryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, industry_);
    }
    if (jobType_ != com.kptl.proto.employee.JobType.LONG.getNumber()) {
      output.writeEnum(7, jobType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getRealNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, realName_);
    }
    if (sex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, sex_);
    }
    if (workYear_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, workYear_);
    }
    if (!getExpectedLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, expectedLocation_);
    }
    if (!getIndustryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, industry_);
    }
    if (jobType_ != com.kptl.proto.employee.JobType.LONG.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, jobType_);
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
    if (!(obj instanceof com.kptl.proto.employee.SimpleInformation)) {
      return super.equals(obj);
    }
    com.kptl.proto.employee.SimpleInformation other = (com.kptl.proto.employee.SimpleInformation) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getRealName()
        .equals(other.getRealName());
    result = result && (getSex()
        == other.getSex());
    result = result && (getWorkYear()
        == other.getWorkYear());
    result = result && getExpectedLocation()
        .equals(other.getExpectedLocation());
    result = result && getIndustry()
        .equals(other.getIndustry());
    result = result && jobType_ == other.jobType_;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + REALNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRealName().hashCode();
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + getSex();
    hash = (37 * hash) + WORKYEAR_FIELD_NUMBER;
    hash = (53 * hash) + getWorkYear();
    hash = (37 * hash) + EXPECTEDLOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getExpectedLocation().hashCode();
    hash = (37 * hash) + INDUSTRY_FIELD_NUMBER;
    hash = (53 * hash) + getIndustry().hashCode();
    hash = (37 * hash) + JOBTYPE_FIELD_NUMBER;
    hash = (53 * hash) + jobType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.SimpleInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SimpleInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.SimpleInformation parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.employee.SimpleInformation prototype) {
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
   * Protobuf type {@code employee.SimpleInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employee.SimpleInformation)
      com.kptl.proto.employee.SimpleInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SimpleInformation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SimpleInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.employee.SimpleInformation.class, com.kptl.proto.employee.SimpleInformation.Builder.class);
    }

    // Construct using com.kptl.proto.employee.SimpleInformation.newBuilder()
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
      id_ = 0;

      realName_ = "";

      sex_ = 0;

      workYear_ = 0;

      expectedLocation_ = "";

      industry_ = "";

      jobType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_SimpleInformation_descriptor;
    }

    public com.kptl.proto.employee.SimpleInformation getDefaultInstanceForType() {
      return com.kptl.proto.employee.SimpleInformation.getDefaultInstance();
    }

    public com.kptl.proto.employee.SimpleInformation build() {
      com.kptl.proto.employee.SimpleInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.employee.SimpleInformation buildPartial() {
      com.kptl.proto.employee.SimpleInformation result = new com.kptl.proto.employee.SimpleInformation(this);
      result.id_ = id_;
      result.realName_ = realName_;
      result.sex_ = sex_;
      result.workYear_ = workYear_;
      result.expectedLocation_ = expectedLocation_;
      result.industry_ = industry_;
      result.jobType_ = jobType_;
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
      if (other instanceof com.kptl.proto.employee.SimpleInformation) {
        return mergeFrom((com.kptl.proto.employee.SimpleInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.employee.SimpleInformation other) {
      if (other == com.kptl.proto.employee.SimpleInformation.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getRealName().isEmpty()) {
        realName_ = other.realName_;
        onChanged();
      }
      if (other.getSex() != 0) {
        setSex(other.getSex());
      }
      if (other.getWorkYear() != 0) {
        setWorkYear(other.getWorkYear());
      }
      if (!other.getExpectedLocation().isEmpty()) {
        expectedLocation_ = other.expectedLocation_;
        onChanged();
      }
      if (!other.getIndustry().isEmpty()) {
        industry_ = other.industry_;
        onChanged();
      }
      if (other.jobType_ != 0) {
        setJobTypeValue(other.getJobTypeValue());
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
      com.kptl.proto.employee.SimpleInformation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.employee.SimpleInformation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object realName_ = "";
    /**
     * <pre>
     *真实名字
     * </pre>
     *
     * <code>string realName = 2;</code>
     */
    public java.lang.String getRealName() {
      java.lang.Object ref = realName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        realName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *真实名字
     * </pre>
     *
     * <code>string realName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRealNameBytes() {
      java.lang.Object ref = realName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        realName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *真实名字
     * </pre>
     *
     * <code>string realName = 2;</code>
     */
    public Builder setRealName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      realName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *真实名字
     * </pre>
     *
     * <code>string realName = 2;</code>
     */
    public Builder clearRealName() {
      
      realName_ = getDefaultInstance().getRealName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *真实名字
     * </pre>
     *
     * <code>string realName = 2;</code>
     */
    public Builder setRealNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      realName_ = value;
      onChanged();
      return this;
    }

    private int sex_ ;
    /**
     * <pre>
     *性别，0男，1女
     * </pre>
     *
     * <code>int32 sex = 3;</code>
     */
    public int getSex() {
      return sex_;
    }
    /**
     * <pre>
     *性别，0男，1女
     * </pre>
     *
     * <code>int32 sex = 3;</code>
     */
    public Builder setSex(int value) {
      
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *性别，0男，1女
     * </pre>
     *
     * <code>int32 sex = 3;</code>
     */
    public Builder clearSex() {
      
      sex_ = 0;
      onChanged();
      return this;
    }

    private int workYear_ ;
    /**
     * <pre>
     *工作年限
     * </pre>
     *
     * <code>int32 workYear = 4;</code>
     */
    public int getWorkYear() {
      return workYear_;
    }
    /**
     * <pre>
     *工作年限
     * </pre>
     *
     * <code>int32 workYear = 4;</code>
     */
    public Builder setWorkYear(int value) {
      
      workYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *工作年限
     * </pre>
     *
     * <code>int32 workYear = 4;</code>
     */
    public Builder clearWorkYear() {
      
      workYear_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object expectedLocation_ = "";
    /**
     * <pre>
     *期望工作地点
     * </pre>
     *
     * <code>string expectedLocation = 5;</code>
     */
    public java.lang.String getExpectedLocation() {
      java.lang.Object ref = expectedLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expectedLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *期望工作地点
     * </pre>
     *
     * <code>string expectedLocation = 5;</code>
     */
    public com.google.protobuf.ByteString
        getExpectedLocationBytes() {
      java.lang.Object ref = expectedLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expectedLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *期望工作地点
     * </pre>
     *
     * <code>string expectedLocation = 5;</code>
     */
    public Builder setExpectedLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expectedLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *期望工作地点
     * </pre>
     *
     * <code>string expectedLocation = 5;</code>
     */
    public Builder clearExpectedLocation() {
      
      expectedLocation_ = getDefaultInstance().getExpectedLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *期望工作地点
     * </pre>
     *
     * <code>string expectedLocation = 5;</code>
     */
    public Builder setExpectedLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expectedLocation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object industry_ = "";
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 6;</code>
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
     * <code>string industry = 6;</code>
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
     * <code>string industry = 6;</code>
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
     * <code>string industry = 6;</code>
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
     * <code>string industry = 6;</code>
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

    private int jobType_ = 0;
    /**
     * <pre>
     * </pre>
     *
     * <code>.employee.JobType jobType = 7;</code>
     */
    public int getJobTypeValue() {
      return jobType_;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.employee.JobType jobType = 7;</code>
     */
    public Builder setJobTypeValue(int value) {
      jobType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.employee.JobType jobType = 7;</code>
     */
    public com.kptl.proto.employee.JobType getJobType() {
      com.kptl.proto.employee.JobType result = com.kptl.proto.employee.JobType.valueOf(jobType_);
      return result == null ? com.kptl.proto.employee.JobType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.employee.JobType jobType = 7;</code>
     */
    public Builder setJobType(com.kptl.proto.employee.JobType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jobType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * </pre>
     *
     * <code>.employee.JobType jobType = 7;</code>
     */
    public Builder clearJobType() {
      
      jobType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:employee.SimpleInformation)
  }

  // @@protoc_insertion_point(class_scope:employee.SimpleInformation)
  private static final com.kptl.proto.employee.SimpleInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.employee.SimpleInformation();
  }

  public static com.kptl.proto.employee.SimpleInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleInformation>
      PARSER = new com.google.protobuf.AbstractParser<SimpleInformation>() {
    public SimpleInformation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimpleInformation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleInformation> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.employee.SimpleInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

