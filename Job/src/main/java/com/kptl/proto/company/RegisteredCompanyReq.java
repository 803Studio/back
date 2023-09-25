// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: company/company.proto

package com.kptl.proto.company;

/**
 * Protobuf type {@code company.RegisteredCompanyReq}
 */
public  final class RegisteredCompanyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:company.RegisteredCompanyReq)
    RegisteredCompanyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisteredCompanyReq.newBuilder() to construct.
  private RegisteredCompanyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisteredCompanyReq() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisteredCompanyReq(
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
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_RegisteredCompanyReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kptl.proto.company.CompanyOuterClass.internal_static_company_RegisteredCompanyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kptl.proto.company.RegisteredCompanyReq.class, com.kptl.proto.company.RegisteredCompanyReq.Builder.class);
  }

  public static final int COMPANY_FIELD_NUMBER = 1;
  private com.kptl.proto.company.Company company_;
  /**
   * <code>.company.Company company = 1;</code>
   */
  public boolean hasCompany() {
    return company_ != null;
  }
  /**
   * <code>.company.Company company = 1;</code>
   */
  public com.kptl.proto.company.Company getCompany() {
    return company_ == null ? com.kptl.proto.company.Company.getDefaultInstance() : company_;
  }
  /**
   * <code>.company.Company company = 1;</code>
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
    if (company_ != null) {
      output.writeMessage(1, getCompany());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (company_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCompany());
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
    if (!(obj instanceof com.kptl.proto.company.RegisteredCompanyReq)) {
      return super.equals(obj);
    }
    com.kptl.proto.company.RegisteredCompanyReq other = (com.kptl.proto.company.RegisteredCompanyReq) obj;

    boolean result = true;
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
    if (hasCompany()) {
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kptl.proto.company.RegisteredCompanyReq parseFrom(
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
  public static Builder newBuilder(com.kptl.proto.company.RegisteredCompanyReq prototype) {
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
   * Protobuf type {@code company.RegisteredCompanyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:company.RegisteredCompanyReq)
      com.kptl.proto.company.RegisteredCompanyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_RegisteredCompanyReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_RegisteredCompanyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kptl.proto.company.RegisteredCompanyReq.class, com.kptl.proto.company.RegisteredCompanyReq.Builder.class);
    }

    // Construct using com.kptl.proto.company.RegisteredCompanyReq.newBuilder()
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
      return com.kptl.proto.company.CompanyOuterClass.internal_static_company_RegisteredCompanyReq_descriptor;
    }

    public com.kptl.proto.company.RegisteredCompanyReq getDefaultInstanceForType() {
      return com.kptl.proto.company.RegisteredCompanyReq.getDefaultInstance();
    }

    public com.kptl.proto.company.RegisteredCompanyReq build() {
      com.kptl.proto.company.RegisteredCompanyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.kptl.proto.company.RegisteredCompanyReq buildPartial() {
      com.kptl.proto.company.RegisteredCompanyReq result = new com.kptl.proto.company.RegisteredCompanyReq(this);
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
      if (other instanceof com.kptl.proto.company.RegisteredCompanyReq) {
        return mergeFrom((com.kptl.proto.company.RegisteredCompanyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kptl.proto.company.RegisteredCompanyReq other) {
      if (other == com.kptl.proto.company.RegisteredCompanyReq.getDefaultInstance()) return this;
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
      com.kptl.proto.company.RegisteredCompanyReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.kptl.proto.company.RegisteredCompanyReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.kptl.proto.company.Company company_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kptl.proto.company.Company, com.kptl.proto.company.Company.Builder, com.kptl.proto.company.CompanyOrBuilder> companyBuilder_;
    /**
     * <code>.company.Company company = 1;</code>
     */
    public boolean hasCompany() {
      return companyBuilder_ != null || company_ != null;
    }
    /**
     * <code>.company.Company company = 1;</code>
     */
    public com.kptl.proto.company.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null ? com.kptl.proto.company.Company.getDefaultInstance() : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     * <code>.company.Company company = 1;</code>
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
     * <code>.company.Company company = 1;</code>
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
     * <code>.company.Company company = 1;</code>
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
     * <code>.company.Company company = 1;</code>
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
     * <code>.company.Company company = 1;</code>
     */
    public com.kptl.proto.company.Company.Builder getCompanyBuilder() {
      
      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     * <code>.company.Company company = 1;</code>
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
     * <code>.company.Company company = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:company.RegisteredCompanyReq)
  }

  // @@protoc_insertion_point(class_scope:company.RegisteredCompanyReq)
  private static final com.kptl.proto.company.RegisteredCompanyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kptl.proto.company.RegisteredCompanyReq();
  }

  public static com.kptl.proto.company.RegisteredCompanyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisteredCompanyReq>
      PARSER = new com.google.protobuf.AbstractParser<RegisteredCompanyReq>() {
    public RegisteredCompanyReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisteredCompanyReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisteredCompanyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisteredCompanyReq> getParserForType() {
    return PARSER;
  }

  public com.kptl.proto.company.RegisteredCompanyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

