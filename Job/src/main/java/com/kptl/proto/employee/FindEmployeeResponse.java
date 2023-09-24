// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee.proto

package com.kptl.proto.employee;

/**
 * Protobuf type {@code employee.FindEmployeeResponse}
 */
public  final class FindEmployeeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:employee.FindEmployeeResponse)
    FindEmployeeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindEmployeeResponse.newBuilder() to construct.
  private FindEmployeeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindEmployeeResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindEmployeeResponse(
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
            com.kptl.proto.employee.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.kptl.proto.employee.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.kptl.proto.employee.SelfInformation.Builder subBuilder = null;
            if (selfInfo_ != null) {
              subBuilder = selfInfo_.toBuilder();
            }
            selfInfo_ = input.readMessage(com.kptl.proto.employee.SelfInformation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(selfInfo_);
              selfInfo_ = subBuilder.buildPartial();
            }

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
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_FindEmployeeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_FindEmployeeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.employee.FindEmployeeResponse.class, com.kptl.proto.employee.FindEmployeeResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.kptl.proto.employee.ResponseHeader header_;
  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  public com.kptl.proto.employee.ResponseHeader getHeader() {
    return header_ == null ? com.kptl.proto.employee.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.employee.ResponseHeader header = 1;</code>
   */
  public com.kptl.proto.employee.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int SELFINFO_FIELD_NUMBER = 2;
  private com.kptl.proto.employee.SelfInformation selfInfo_;
  /**
   * <code>.employee.SelfInformation selfInfo = 2;</code>
   */
  public boolean hasSelfInfo() {
    return selfInfo_ != null;
  }
  /**
   * <code>.employee.SelfInformation selfInfo = 2;</code>
   */
  public com.kptl.proto.employee.SelfInformation getSelfInfo() {
    return selfInfo_ == null ? com.kptl.proto.employee.SelfInformation.getDefaultInstance() : selfInfo_;
  }
  /**
   * <code>.employee.SelfInformation selfInfo = 2;</code>
   */
  public com.kptl.proto.employee.SelfInformationOrBuilder getSelfInfoOrBuilder() {
    return getSelfInfo();
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
    if (selfInfo_ != null) {
      output.writeMessage(2, getSelfInfo());
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
    if (selfInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSelfInfo());
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
    if (!(obj instanceof com.kptl.proto.employee.FindEmployeeResponse)) {
      return super.equals(obj);
    }
    com.kptl.proto.employee.FindEmployeeResponse other = (com.kptl.proto.employee.FindEmployeeResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (hasSelfInfo() == other.hasSelfInfo());
    if (hasSelfInfo()) {
      result = result && getSelfInfo()
          .equals(other.getSelfInfo());
    }
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
    if (hasSelfInfo()) {
      hash = (37 * hash) + SELFINFO_FIELD_NUMBER;
      hash = (53 * hash) + getSelfInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.employee.FindEmployeeResponse parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.employee.FindEmployeeResponse prototype) {
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
   * Protobuf type {@code employee.FindEmployeeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:employee.FindEmployeeResponse)
      com.kptl.proto.employee.FindEmployeeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_FindEmployeeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_FindEmployeeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.employee.FindEmployeeResponse.class, com.kptl.proto.employee.FindEmployeeResponse.Builder.class);
    }

    // Construct using com.kptl.proto.employee.FindEmployeeResponse.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (selfInfoBuilder_ == null) {
        selfInfo_ = null;
      } else {
        selfInfo_ = null;
        selfInfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.employee.EmployeeOuterClass.internal_static_employee_FindEmployeeResponse_descriptor;
    }

    public com.kptl.proto.employee.FindEmployeeResponse getDefaultInstanceForType() {
      return com.kptl.proto.employee.FindEmployeeResponse.getDefaultInstance();
    }

    public com.kptl.proto.employee.FindEmployeeResponse build() {
      com.kptl.proto.employee.FindEmployeeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.employee.FindEmployeeResponse buildPartial() {
      com.kptl.proto.employee.FindEmployeeResponse result = new com.kptl.proto.employee.FindEmployeeResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (selfInfoBuilder_ == null) {
        result.selfInfo_ = selfInfo_;
      } else {
        result.selfInfo_ = selfInfoBuilder_.build();
      }
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
      if (other instanceof com.kptl.proto.employee.FindEmployeeResponse) {
        return mergeFrom((com.kptl.proto.employee.FindEmployeeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.employee.FindEmployeeResponse other) {
      if (other == com.kptl.proto.employee.FindEmployeeResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasSelfInfo()) {
        mergeSelfInfo(other.getSelfInfo());
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
      com.kptl.proto.employee.FindEmployeeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.employee.FindEmployeeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.kptl.proto.employee.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.ResponseHeader, com.kptl.proto.employee.ResponseHeader.Builder, com.kptl.proto.employee.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.employee.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.kptl.proto.employee.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(com.kptl.proto.employee.ResponseHeader value) {
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
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        com.kptl.proto.employee.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(com.kptl.proto.employee.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.kptl.proto.employee.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
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
     * <code>.employee.ResponseHeader header = 1;</code>
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
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.employee.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    public com.kptl.proto.employee.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.kptl.proto.employee.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.employee.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.ResponseHeader, com.kptl.proto.employee.ResponseHeader.Builder, com.kptl.proto.employee.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.employee.ResponseHeader, com.kptl.proto.employee.ResponseHeader.Builder, com.kptl.proto.employee.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.kptl.proto.employee.SelfInformation selfInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.SelfInformation, com.kptl.proto.employee.SelfInformation.Builder, com.kptl.proto.employee.SelfInformationOrBuilder> selfInfoBuilder_;
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public boolean hasSelfInfo() {
      return selfInfoBuilder_ != null || selfInfo_ != null;
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public com.kptl.proto.employee.SelfInformation getSelfInfo() {
      if (selfInfoBuilder_ == null) {
        return selfInfo_ == null ? com.kptl.proto.employee.SelfInformation.getDefaultInstance() : selfInfo_;
      } else {
        return selfInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public Builder setSelfInfo(com.kptl.proto.employee.SelfInformation value) {
      if (selfInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selfInfo_ = value;
        onChanged();
      } else {
        selfInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public Builder setSelfInfo(
        com.kptl.proto.employee.SelfInformation.Builder builderForValue) {
      if (selfInfoBuilder_ == null) {
        selfInfo_ = builderForValue.build();
        onChanged();
      } else {
        selfInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public Builder mergeSelfInfo(com.kptl.proto.employee.SelfInformation value) {
      if (selfInfoBuilder_ == null) {
        if (selfInfo_ != null) {
          selfInfo_ =
            com.kptl.proto.employee.SelfInformation.newBuilder(selfInfo_).mergeFrom(value).buildPartial();
        } else {
          selfInfo_ = value;
        }
        onChanged();
      } else {
        selfInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public Builder clearSelfInfo() {
      if (selfInfoBuilder_ == null) {
        selfInfo_ = null;
        onChanged();
      } else {
        selfInfo_ = null;
        selfInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public com.kptl.proto.employee.SelfInformation.Builder getSelfInfoBuilder() {
      
      onChanged();
      return getSelfInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    public com.kptl.proto.employee.SelfInformationOrBuilder getSelfInfoOrBuilder() {
      if (selfInfoBuilder_ != null) {
        return selfInfoBuilder_.getMessageOrBuilder();
      } else {
        return selfInfo_ == null ?
            com.kptl.proto.employee.SelfInformation.getDefaultInstance() : selfInfo_;
      }
    }
    /**
     * <code>.employee.SelfInformation selfInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.employee.SelfInformation, com.kptl.proto.employee.SelfInformation.Builder, com.kptl.proto.employee.SelfInformationOrBuilder> 
        getSelfInfoFieldBuilder() {
      if (selfInfoBuilder_ == null) {
        selfInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.employee.SelfInformation, com.kptl.proto.employee.SelfInformation.Builder, com.kptl.proto.employee.SelfInformationOrBuilder>(
                getSelfInfo(),
                getParentForChildren(),
                isClean());
        selfInfo_ = null;
      }
      return selfInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:employee.FindEmployeeResponse)
  }

  // @@protoc_insertion_point(class_scope:employee.FindEmployeeResponse)
  private static final com.kptl.proto.employee.FindEmployeeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.employee.FindEmployeeResponse();
  }

  public static com.kptl.proto.employee.FindEmployeeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindEmployeeResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindEmployeeResponse>() {
    public FindEmployeeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindEmployeeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindEmployeeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindEmployeeResponse> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.employee.FindEmployeeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
