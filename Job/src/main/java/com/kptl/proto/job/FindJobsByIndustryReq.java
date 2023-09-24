// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto.job;

/**
 * Protobuf type {@code job.FindJobsByIndustryReq}
 */
public  final class FindJobsByIndustryReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.FindJobsByIndustryReq)
    FindJobsByIndustryReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindJobsByIndustryReq.newBuilder() to construct.
  private FindJobsByIndustryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindJobsByIndustryReq() {
    industry_ = "";
    index_ = 0;
    size_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindJobsByIndustryReq(
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
            java.lang.String s = input.readStringRequireUtf8();

            industry_ = s;
            break;
          }
          case 16: {

            index_ = input.readInt32();
            break;
          }
          case 24: {

            size_ = input.readInt32();
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
    return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobsByIndustryReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobsByIndustryReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.job.FindJobsByIndustryReq.class, com.kptl.proto.job.FindJobsByIndustryReq.Builder.class);
  }

  public static final int INDUSTRY_FIELD_NUMBER = 1;
  private volatile java.lang.Object industry_;
  /**
   * <code>string industry = 1;</code>
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
   * <code>string industry = 1;</code>
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

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_;
  /**
   * <code>int32 index = 2;</code>
   */
  public int getIndex() {
    return index_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_;
  /**
   * <code>int32 size = 3;</code>
   */
  public int getSize() {
    return size_;
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
    if (!getIndustryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, industry_);
    }
    if (index_ != 0) {
      output.writeInt32(2, index_);
    }
    if (size_ != 0) {
      output.writeInt32(3, size_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIndustryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, industry_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, index_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, size_);
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
    if (!(obj instanceof com.kptl.proto.job.FindJobsByIndustryReq)) {
      return super.equals(obj);
    }
    com.kptl.proto.job.FindJobsByIndustryReq other = (com.kptl.proto.job.FindJobsByIndustryReq) obj;

    boolean result = true;
    result = result && getIndustry()
        .equals(other.getIndustry());
    result = result && (getIndex()
        == other.getIndex());
    result = result && (getSize()
        == other.getSize());
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
    hash = (37 * hash) + INDUSTRY_FIELD_NUMBER;
    hash = (53 * hash) + getIndustry().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.job.FindJobsByIndustryReq parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.job.FindJobsByIndustryReq prototype) {
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
   * Protobuf type {@code job.FindJobsByIndustryReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.FindJobsByIndustryReq)
      com.kptl.proto.job.FindJobsByIndustryReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobsByIndustryReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobsByIndustryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.job.FindJobsByIndustryReq.class, com.kptl.proto.job.FindJobsByIndustryReq.Builder.class);
    }

    // Construct using com.kptl.proto.job.FindJobsByIndustryReq.newBuilder()
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
      industry_ = "";

      index_ = 0;

      size_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.job.JobOuterClass.internal_static_job_FindJobsByIndustryReq_descriptor;
    }

    public com.kptl.proto.job.FindJobsByIndustryReq getDefaultInstanceForType() {
      return com.kptl.proto.job.FindJobsByIndustryReq.getDefaultInstance();
    }

    public com.kptl.proto.job.FindJobsByIndustryReq build() {
      com.kptl.proto.job.FindJobsByIndustryReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.job.FindJobsByIndustryReq buildPartial() {
      com.kptl.proto.job.FindJobsByIndustryReq result = new com.kptl.proto.job.FindJobsByIndustryReq(this);
      result.industry_ = industry_;
      result.index_ = index_;
      result.size_ = size_;
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
      if (other instanceof com.kptl.proto.job.FindJobsByIndustryReq) {
        return mergeFrom((com.kptl.proto.job.FindJobsByIndustryReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.job.FindJobsByIndustryReq other) {
      if (other == com.kptl.proto.job.FindJobsByIndustryReq.getDefaultInstance()) return this;
      if (!other.getIndustry().isEmpty()) {
        industry_ = other.industry_;
        onChanged();
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
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
      com.kptl.proto.job.FindJobsByIndustryReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.job.FindJobsByIndustryReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object industry_ = "";
    /**
     * <code>string industry = 1;</code>
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
     * <code>string industry = 1;</code>
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
     * <code>string industry = 1;</code>
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
     * <code>string industry = 1;</code>
     */
    public Builder clearIndustry() {
      
      industry_ = getDefaultInstance().getIndustry();
      onChanged();
      return this;
    }
    /**
     * <code>string industry = 1;</code>
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

    private int index_ ;
    /**
     * <code>int32 index = 2;</code>
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <code>int32 index = 2;</code>
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 index = 2;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 3;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 3;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 3;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
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


    // @@protoc_insertion_point(builder_scope:job.FindJobsByIndustryReq)
  }

  // @@protoc_insertion_point(class_scope:job.FindJobsByIndustryReq)
  private static final com.kptl.proto.job.FindJobsByIndustryReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.job.FindJobsByIndustryReq();
  }

  public static com.kptl.proto.job.FindJobsByIndustryReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindJobsByIndustryReq>
      PARSER = new com.google.protobuf.AbstractParser<FindJobsByIndustryReq>() {
    public FindJobsByIndustryReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindJobsByIndustryReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindJobsByIndustryReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindJobsByIndustryReq> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.job.FindJobsByIndustryReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
