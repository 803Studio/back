// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: company/company.proto

package com.kptl.proto.company;

/**
 * Protobuf type {@code company.Company}
 */
public  final class Company extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:company.Company)
    CompanyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Company.newBuilder() to construct.
  private Company(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Company() {
    id_ = 0;
    companyName_ = "";
    companyLocation_ = "";
    isVip_ = 0;
    isCertified_ = 0;
    registerTime_ = 0L;
    updateTime_ = 0L;
    industry_ = "";
    companyId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Company(
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

            companyName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            companyLocation_ = s;
            break;
          }
          case 32: {

            isVip_ = input.readInt32();
            break;
          }
          case 40: {

            isCertified_ = input.readInt32();
            break;
          }
          case 48: {

            registerTime_ = input.readInt64();
            break;
          }
          case 56: {

            updateTime_ = input.readInt64();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            industry_ = s;
            break;
          }
          case 72: {

            companyId_ = input.readInt32();
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
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_Company_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_Company_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.company.Company.class, com.kptl.proto.company.Company.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   *id
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int COMPANYNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object companyName_;
  /**
   * <pre>
   *公司名称
   * </pre>
   *
   * <code>string companyName = 2;</code>
   */
  public java.lang.String getCompanyName() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *公司名称
   * </pre>
   *
   * <code>string companyName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCompanyNameBytes() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPANYLOCATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object companyLocation_;
  /**
   * <pre>
   *地址
   * </pre>
   *
   * <code>string companyLocation = 3;</code>
   */
  public java.lang.String getCompanyLocation() {
    java.lang.Object ref = companyLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyLocation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *地址
   * </pre>
   *
   * <code>string companyLocation = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCompanyLocationBytes() {
    java.lang.Object ref = companyLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companyLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISVIP_FIELD_NUMBER = 4;
  private int isVip_;
  /**
   * <pre>
   *是否会员
   * </pre>
   *
   * <code>int32 isVip = 4;</code>
   */
  public int getIsVip() {
    return isVip_;
  }

  public static final int ISCERTIFIED_FIELD_NUMBER = 5;
  private int isCertified_;
  /**
   * <pre>
   *是否认证
   * </pre>
   *
   * <code>int32 isCertified = 5;</code>
   */
  public int getIsCertified() {
    return isCertified_;
  }

  public static final int REGISTERTIME_FIELD_NUMBER = 6;
  private long registerTime_;
  /**
   * <pre>
   *注册时间
   * </pre>
   *
   * <code>int64 registerTime = 6;</code>
   */
  public long getRegisterTime() {
    return registerTime_;
  }

  public static final int UPDATETIME_FIELD_NUMBER = 7;
  private long updateTime_;
  /**
   * <pre>
   *刷新时间
   * </pre>
   *
   * <code>int64 updateTime = 7;</code>
   */
  public long getUpdateTime() {
    return updateTime_;
  }

  public static final int INDUSTRY_FIELD_NUMBER = 8;
  private volatile java.lang.Object industry_;
  /**
   * <pre>
   *行业
   * </pre>
   *
   * <code>string industry = 8;</code>
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
   * <code>string industry = 8;</code>
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

  public static final int COMPANYID_FIELD_NUMBER = 9;
  private int companyId_;
  /**
   * <pre>
   *公司id
   * </pre>
   *
   * <code>int32 companyId = 9;</code>
   */
  public int getCompanyId() {
    return companyId_;
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
    if (!getCompanyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companyName_);
    }
    if (!getCompanyLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, companyLocation_);
    }
    if (isVip_ != 0) {
      output.writeInt32(4, isVip_);
    }
    if (isCertified_ != 0) {
      output.writeInt32(5, isCertified_);
    }
    if (registerTime_ != 0L) {
      output.writeInt64(6, registerTime_);
    }
    if (updateTime_ != 0L) {
      output.writeInt64(7, updateTime_);
    }
    if (!getIndustryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, industry_);
    }
    if (companyId_ != 0) {
      output.writeInt32(9, companyId_);
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
    if (!getCompanyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companyName_);
    }
    if (!getCompanyLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, companyLocation_);
    }
    if (isVip_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, isVip_);
    }
    if (isCertified_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, isCertified_);
    }
    if (registerTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, registerTime_);
    }
    if (updateTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, updateTime_);
    }
    if (!getIndustryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, industry_);
    }
    if (companyId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, companyId_);
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
    if (!(obj instanceof com.kptl.proto.company.Company)) {
      return super.equals(obj);
    }
    com.kptl.proto.company.Company other = (com.kptl.proto.company.Company) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getCompanyName()
        .equals(other.getCompanyName());
    result = result && getCompanyLocation()
        .equals(other.getCompanyLocation());
    result = result && (getIsVip()
        == other.getIsVip());
    result = result && (getIsCertified()
        == other.getIsCertified());
    result = result && (getRegisterTime()
        == other.getRegisterTime());
    result = result && (getUpdateTime()
        == other.getUpdateTime());
    result = result && getIndustry()
        .equals(other.getIndustry());
    result = result && (getCompanyId()
        == other.getCompanyId());
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
    hash = (37 * hash) + COMPANYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyName().hashCode();
    hash = (37 * hash) + COMPANYLOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyLocation().hashCode();
    hash = (37 * hash) + ISVIP_FIELD_NUMBER;
    hash = (53 * hash) + getIsVip();
    hash = (37 * hash) + ISCERTIFIED_FIELD_NUMBER;
    hash = (53 * hash) + getIsCertified();
    hash = (37 * hash) + REGISTERTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegisterTime());
    hash = (37 * hash) + UPDATETIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateTime());
    hash = (37 * hash) + INDUSTRY_FIELD_NUMBER;
    hash = (53 * hash) + getIndustry().hashCode();
    hash = (37 * hash) + COMPANYID_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.company.Company parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.Company parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.Company parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.Company parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.Company parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.Company parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.Company parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.Company parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.Company parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.Company parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.Company parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.Company parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.company.Company prototype) {
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
   * Protobuf type {@code company.Company}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:company.Company)
      com.kptl.proto.company.CompanyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_Company_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_Company_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.company.Company.class, com.kptl.proto.company.Company.Builder.class);
    }

    // Construct using com.kptl.proto.company.Company.newBuilder()
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

      companyName_ = "";

      companyLocation_ = "";

      isVip_ = 0;

      isCertified_ = 0;

      registerTime_ = 0L;

      updateTime_ = 0L;

      industry_ = "";

      companyId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_Company_descriptor;
    }

    public com.kptl.proto.company.Company getDefaultInstanceForType() {
      return com.kptl.proto.company.Company.getDefaultInstance();
    }

    public com.kptl.proto.company.Company build() {
      com.kptl.proto.company.Company result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.company.Company buildPartial() {
      com.kptl.proto.company.Company result = new com.kptl.proto.company.Company(this);
      result.id_ = id_;
      result.companyName_ = companyName_;
      result.companyLocation_ = companyLocation_;
      result.isVip_ = isVip_;
      result.isCertified_ = isCertified_;
      result.registerTime_ = registerTime_;
      result.updateTime_ = updateTime_;
      result.industry_ = industry_;
      result.companyId_ = companyId_;
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
      if (other instanceof com.kptl.proto.company.Company) {
        return mergeFrom((com.kptl.proto.company.Company)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.company.Company other) {
      if (other == com.kptl.proto.company.Company.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getCompanyName().isEmpty()) {
        companyName_ = other.companyName_;
        onChanged();
      }
      if (!other.getCompanyLocation().isEmpty()) {
        companyLocation_ = other.companyLocation_;
        onChanged();
      }
      if (other.getIsVip() != 0) {
        setIsVip(other.getIsVip());
      }
      if (other.getIsCertified() != 0) {
        setIsCertified(other.getIsCertified());
      }
      if (other.getRegisterTime() != 0L) {
        setRegisterTime(other.getRegisterTime());
      }
      if (other.getUpdateTime() != 0L) {
        setUpdateTime(other.getUpdateTime());
      }
      if (!other.getIndustry().isEmpty()) {
        industry_ = other.industry_;
        onChanged();
      }
      if (other.getCompanyId() != 0) {
        setCompanyId(other.getCompanyId());
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
      com.kptl.proto.company.Company parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.company.Company) e.getUnfinishedMessage();
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
     *id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     *id
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
     *id
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object companyName_ = "";
    /**
     * <pre>
     *公司名称
     * </pre>
     *
     * <code>string companyName = 2;</code>
     */
    public java.lang.String getCompanyName() {
      java.lang.Object ref = companyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *公司名称
     * </pre>
     *
     * <code>string companyName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCompanyNameBytes() {
      java.lang.Object ref = companyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *公司名称
     * </pre>
     *
     * <code>string companyName = 2;</code>
     */
    public Builder setCompanyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      companyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *公司名称
     * </pre>
     *
     * <code>string companyName = 2;</code>
     */
    public Builder clearCompanyName() {
      
      companyName_ = getDefaultInstance().getCompanyName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *公司名称
     * </pre>
     *
     * <code>string companyName = 2;</code>
     */
    public Builder setCompanyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      companyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object companyLocation_ = "";
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string companyLocation = 3;</code>
     */
    public java.lang.String getCompanyLocation() {
      java.lang.Object ref = companyLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string companyLocation = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCompanyLocationBytes() {
      java.lang.Object ref = companyLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companyLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string companyLocation = 3;</code>
     */
    public Builder setCompanyLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      companyLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string companyLocation = 3;</code>
     */
    public Builder clearCompanyLocation() {
      
      companyLocation_ = getDefaultInstance().getCompanyLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *地址
     * </pre>
     *
     * <code>string companyLocation = 3;</code>
     */
    public Builder setCompanyLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      companyLocation_ = value;
      onChanged();
      return this;
    }

    private int isVip_ ;
    /**
     * <pre>
     *是否会员
     * </pre>
     *
     * <code>int32 isVip = 4;</code>
     */
    public int getIsVip() {
      return isVip_;
    }
    /**
     * <pre>
     *是否会员
     * </pre>
     *
     * <code>int32 isVip = 4;</code>
     */
    public Builder setIsVip(int value) {
      
      isVip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *是否会员
     * </pre>
     *
     * <code>int32 isVip = 4;</code>
     */
    public Builder clearIsVip() {
      
      isVip_ = 0;
      onChanged();
      return this;
    }

    private int isCertified_ ;
    /**
     * <pre>
     *是否认证
     * </pre>
     *
     * <code>int32 isCertified = 5;</code>
     */
    public int getIsCertified() {
      return isCertified_;
    }
    /**
     * <pre>
     *是否认证
     * </pre>
     *
     * <code>int32 isCertified = 5;</code>
     */
    public Builder setIsCertified(int value) {
      
      isCertified_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *是否认证
     * </pre>
     *
     * <code>int32 isCertified = 5;</code>
     */
    public Builder clearIsCertified() {
      
      isCertified_ = 0;
      onChanged();
      return this;
    }

    private long registerTime_ ;
    /**
     * <pre>
     *注册时间
     * </pre>
     *
     * <code>int64 registerTime = 6;</code>
     */
    public long getRegisterTime() {
      return registerTime_;
    }
    /**
     * <pre>
     *注册时间
     * </pre>
     *
     * <code>int64 registerTime = 6;</code>
     */
    public Builder setRegisterTime(long value) {
      
      registerTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *注册时间
     * </pre>
     *
     * <code>int64 registerTime = 6;</code>
     */
    public Builder clearRegisterTime() {
      
      registerTime_ = 0L;
      onChanged();
      return this;
    }

    private long updateTime_ ;
    /**
     * <pre>
     *刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 7;</code>
     */
    public long getUpdateTime() {
      return updateTime_;
    }
    /**
     * <pre>
     *刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 7;</code>
     */
    public Builder setUpdateTime(long value) {
      
      updateTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *刷新时间
     * </pre>
     *
     * <code>int64 updateTime = 7;</code>
     */
    public Builder clearUpdateTime() {
      
      updateTime_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object industry_ = "";
    /**
     * <pre>
     *行业
     * </pre>
     *
     * <code>string industry = 8;</code>
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
     * <code>string industry = 8;</code>
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
     * <code>string industry = 8;</code>
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
     * <code>string industry = 8;</code>
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
     * <code>string industry = 8;</code>
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

    private int companyId_ ;
    /**
     * <pre>
     *公司id
     * </pre>
     *
     * <code>int32 companyId = 9;</code>
     */
    public int getCompanyId() {
      return companyId_;
    }
    /**
     * <pre>
     *公司id
     * </pre>
     *
     * <code>int32 companyId = 9;</code>
     */
    public Builder setCompanyId(int value) {
      
      companyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *公司id
     * </pre>
     *
     * <code>int32 companyId = 9;</code>
     */
    public Builder clearCompanyId() {
      
      companyId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:company.Company)
  }

  // @@protoc_insertion_point(class_scope:company.Company)
  private static final com.kptl.proto.company.Company DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.company.Company();
  }

  public static com.kptl.proto.company.Company getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Company>
      PARSER = new com.google.protobuf.AbstractParser<Company>() {
    public Company parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Company(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Company> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Company> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.company.Company getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

