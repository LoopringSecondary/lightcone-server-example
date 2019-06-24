// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.OffchainWithdrawalalRes}
 */
public  final class OffchainWithdrawalalRes extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.OffchainWithdrawalalRes)
    OffchainWithdrawalalResOrBuilder {
  // Use OffchainWithdrawalalRes.newBuilder() to construct.
  private OffchainWithdrawalalRes(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private OffchainWithdrawalalRes() {
    withdrwalUuid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private OffchainWithdrawalalRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            withdrwalUuid_ = input.readUInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_OffchainWithdrawalalRes_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_OffchainWithdrawalalRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.OffchainWithdrawalalRes.class, io.lightcone.data.dex.OffchainWithdrawalalRes.Builder.class);
  }

  public static final int WITHDRWAL_UUID_FIELD_NUMBER = 1;
  private long withdrwalUuid_;
  /**
   * <code>optional uint64 withdrwal_uuid = 1;</code>
   */
  public long getWithdrwalUuid() {
    return withdrwalUuid_;
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
    if (withdrwalUuid_ != 0L) {
      output.writeUInt64(1, withdrwalUuid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (withdrwalUuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, withdrwalUuid_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.OffchainWithdrawalalRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.OffchainWithdrawalalRes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.lightcone.data.dex.OffchainWithdrawalalRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.OffchainWithdrawalalRes)
      io.lightcone.data.dex.OffchainWithdrawalalResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_OffchainWithdrawalalRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_OffchainWithdrawalalRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.OffchainWithdrawalalRes.class, io.lightcone.data.dex.OffchainWithdrawalalRes.Builder.class);
    }

    // Construct using io.lightcone.data.dex.OffchainWithdrawalalRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      withdrwalUuid_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_OffchainWithdrawalalRes_descriptor;
    }

    public io.lightcone.data.dex.OffchainWithdrawalalRes getDefaultInstanceForType() {
      return io.lightcone.data.dex.OffchainWithdrawalalRes.getDefaultInstance();
    }

    public io.lightcone.data.dex.OffchainWithdrawalalRes build() {
      io.lightcone.data.dex.OffchainWithdrawalalRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.OffchainWithdrawalalRes buildPartial() {
      io.lightcone.data.dex.OffchainWithdrawalalRes result = new io.lightcone.data.dex.OffchainWithdrawalalRes(this);
      result.withdrwalUuid_ = withdrwalUuid_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.OffchainWithdrawalalRes) {
        return mergeFrom((io.lightcone.data.dex.OffchainWithdrawalalRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.OffchainWithdrawalalRes other) {
      if (other == io.lightcone.data.dex.OffchainWithdrawalalRes.getDefaultInstance()) return this;
      if (other.getWithdrwalUuid() != 0L) {
        setWithdrwalUuid(other.getWithdrwalUuid());
      }
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
      io.lightcone.data.dex.OffchainWithdrawalalRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.OffchainWithdrawalalRes) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long withdrwalUuid_ ;
    /**
     * <code>optional uint64 withdrwal_uuid = 1;</code>
     */
    public long getWithdrwalUuid() {
      return withdrwalUuid_;
    }
    /**
     * <code>optional uint64 withdrwal_uuid = 1;</code>
     */
    public Builder setWithdrwalUuid(long value) {

      withdrwalUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 withdrwal_uuid = 1;</code>
     */
    public Builder clearWithdrwalUuid() {

      withdrwalUuid_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.OffchainWithdrawalalRes)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.OffchainWithdrawalalRes)
  private static final io.lightcone.data.dex.OffchainWithdrawalalRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.OffchainWithdrawalalRes();
  }

  public static io.lightcone.data.dex.OffchainWithdrawalalRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OffchainWithdrawalalRes>
      PARSER = new com.google.protobuf.AbstractParser<OffchainWithdrawalalRes>() {
    public OffchainWithdrawalalRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new OffchainWithdrawalalRes(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<OffchainWithdrawalalRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OffchainWithdrawalalRes> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.OffchainWithdrawalalRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

