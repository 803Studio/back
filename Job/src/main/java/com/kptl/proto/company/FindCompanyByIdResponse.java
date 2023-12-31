// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: company/company.proto

package com.kptl.proto.company;

/**
 * Protobuf type {@code company.FindCompanyByIdResponse}
 */
public  final class FindCompanyByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:company.FindCompanyByIdResponse)
    FindCompanyByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindCompanyByIdResponse.newBuilder() to construct.
  private FindCompanyByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindCompanyByIdResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindCompanyByIdResponse(
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
            com.kptl.proto.company.Company.Builder subBuilder = null;
            if (company_ != null) {
              subBuilder = company_.toBuilder();
            }
            company_ = input.readMessage(com.kptl.proto.company.Company.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(company_);
              company_ = subBuilder.buildPartial();
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
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_FindCompanyByIdResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_FindCompanyByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.company.FindCompanyByIdResponse.class, com.kptl.proto.company.FindCompanyByIdResponse.Builder.class);
  }

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

  public static final int COMPANY_FIELD_NUMBER = 2;
  private com.kptl.proto.company.Company company_;
  /**
   * <code>.company.Company company = 2;</code>
   */
  public boolean hasCompany() {
    return company_ != null;
  }
  /**
   * <code>.company.Company company = 2;</code>
   */
  public com.kptl.proto.company.Company getCompany() {
    return company_ == null ? com.kptl.proto.company.Company.getDefaultInstance() : company_;
  }
  /**
   * <code>.company.Company company = 2;</code>
   */
  public com.kptl.proto.company.CompanyOrBuilder getCompanyOrBuilder() {
    return getCompany();
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
    if (company_ != null) {
      output.writeMessage(2, getCompany());
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
    if (company_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCompany());
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
    if (!(obj instanceof com.kptl.proto.company.FindCompanyByIdResponse)) {
      return super.equals(obj);
    }
    com.kptl.proto.company.FindCompanyByIdResponse other = (com.kptl.proto.company.FindCompanyByIdResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (hasCompany() == other.hasCompany());
    if (hasCompany()) {
      result = result && getCompany()
          .equals(other.getCompany());
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
    if (hasCompany()) {
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.FindCompanyByIdResponse parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.company.FindCompanyByIdResponse prototype) {
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
   * Protobuf type {@code company.FindCompanyByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:company.FindCompanyByIdResponse)
      com.kptl.proto.company.FindCompanyByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_FindCompanyByIdResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_FindCompanyByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.company.FindCompanyByIdResponse.class, com.kptl.proto.company.FindCompanyByIdResponse.Builder.class);
    }

    // Construct using com.kptl.proto.company.FindCompanyByIdResponse.newBuilder()
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
      if (companyBuilder_ == null) {
        company_ = null;
      } else {
        company_ = null;
        companyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_FindCompanyByIdResponse_descriptor;
    }

    public com.kptl.proto.company.FindCompanyByIdResponse getDefaultInstanceForType() {
      return com.kptl.proto.company.FindCompanyByIdResponse.getDefaultInstance();
    }

    public com.kptl.proto.company.FindCompanyByIdResponse build() {
      com.kptl.proto.company.FindCompanyByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.company.FindCompanyByIdResponse buildPartial() {
      com.kptl.proto.company.FindCompanyByIdResponse result = new com.kptl.proto.company.FindCompanyByIdResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (companyBuilder_ == null) {
        result.company_ = company_;
      } else {
        result.company_ = companyBuilder_.build();
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
      if (other instanceof com.kptl.proto.company.FindCompanyByIdResponse) {
        return mergeFrom((com.kptl.proto.company.FindCompanyByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.company.FindCompanyByIdResponse other) {
      if (other == com.kptl.proto.company.FindCompanyByIdResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.hasCompany()) {
        mergeCompany(other.getCompany());
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
      com.kptl.proto.company.FindCompanyByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.company.FindCompanyByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private com.kptl.proto.company.Company company_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.company.Company, com.kptl.proto.company.Company.Builder, com.kptl.proto.company.CompanyOrBuilder> companyBuilder_;
    /**
     * <code>.company.Company company = 2;</code>
     */
    public boolean hasCompany() {
      return companyBuilder_ != null || company_ != null;
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public com.kptl.proto.company.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null ? com.kptl.proto.company.Company.getDefaultInstance() : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public Builder setCompany(com.kptl.proto.company.Company value) {
      if (companyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        company_ = value;
        onChanged();
      } else {
        companyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public Builder setCompany(
        com.kptl.proto.company.Company.Builder builderForValue) {
      if (companyBuilder_ == null) {
        company_ = builderForValue.build();
        onChanged();
      } else {
        companyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public Builder mergeCompany(com.kptl.proto.company.Company value) {
      if (companyBuilder_ == null) {
        if (company_ != null) {
          company_ =
            com.kptl.proto.company.Company.newBuilder(company_).mergeFrom(value).buildPartial();
        } else {
          company_ = value;
        }
        onChanged();
      } else {
        companyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public Builder clearCompany() {
      if (companyBuilder_ == null) {
        company_ = null;
        onChanged();
      } else {
        company_ = null;
        companyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public com.kptl.proto.company.Company.Builder getCompanyBuilder() {
      
      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    public com.kptl.proto.company.CompanyOrBuilder getCompanyOrBuilder() {
      if (companyBuilder_ != null) {
        return companyBuilder_.getMessageOrBuilder();
      } else {
        return company_ == null ?
            com.kptl.proto.company.Company.getDefaultInstance() : company_;
      }
    }
    /**
     * <code>.company.Company company = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.company.Company, com.kptl.proto.company.Company.Builder, com.kptl.proto.company.CompanyOrBuilder> 
        getCompanyFieldBuilder() {
      if (companyBuilder_ == null) {
        companyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kptl.proto.company.Company, com.kptl.proto.company.Company.Builder, com.kptl.proto.company.CompanyOrBuilder>(
                getCompany(),
                getParentForChildren(),
                isClean());
        company_ = null;
      }
      return companyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:company.FindCompanyByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:company.FindCompanyByIdResponse)
  private static final com.kptl.proto.company.FindCompanyByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.company.FindCompanyByIdResponse();
  }

  public static com.kptl.proto.company.FindCompanyByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindCompanyByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindCompanyByIdResponse>() {
    public FindCompanyByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindCompanyByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindCompanyByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindCompanyByIdResponse> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.company.FindCompanyByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

