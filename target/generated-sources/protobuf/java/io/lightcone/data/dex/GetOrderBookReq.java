// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.GetOrderBookReq}
 */
public  final class GetOrderBookReq extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.GetOrderBookReq)
    GetOrderBookReqOrBuilder {
  // Use GetOrderBookReq.newBuilder() to construct.
  private GetOrderBookReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetOrderBookReq() {
    marketId_ = 0L;
    aggregationLevel_ = 0;
    fiatSymbol_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetOrderBookReq(
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

            marketId_ = input.readUInt64();
            break;
          }
          case 16: {

            aggregationLevel_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fiatSymbol_ = s;
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
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetOrderBookReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetOrderBookReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.GetOrderBookReq.class, io.lightcone.data.dex.GetOrderBookReq.Builder.class);
  }

  public static final int MARKET_ID_FIELD_NUMBER = 1;
  private long marketId_;
  /**
   * <code>optional uint64 market_id = 1;</code>
   *
   * <pre>
   * 32bit base_token_id + 32bit quote_token_id
   * </pre>
   */
  public long getMarketId() {
    return marketId_;
  }

  public static final int AGGREGATION_LEVEL_FIELD_NUMBER = 2;
  private int aggregationLevel_;
  /**
   * <code>optional uint32 aggregation_level = 2;</code>
   */
  public int getAggregationLevel() {
    return aggregationLevel_;
  }

  public static final int FIAT_SYMBOL_FIELD_NUMBER = 3;
  private volatile java.lang.Object fiatSymbol_;
  /**
   * <code>optional string fiat_symbol = 3;</code>
   */
  public java.lang.String getFiatSymbol() {
    java.lang.Object ref = fiatSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fiatSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>optional string fiat_symbol = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFiatSymbolBytes() {
    java.lang.Object ref = fiatSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fiatSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (marketId_ != 0L) {
      output.writeUInt64(1, marketId_);
    }
    if (aggregationLevel_ != 0) {
      output.writeUInt32(2, aggregationLevel_);
    }
    if (!getFiatSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, fiatSymbol_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (marketId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, marketId_);
    }
    if (aggregationLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, aggregationLevel_);
    }
    if (!getFiatSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, fiatSymbol_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetOrderBookReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.GetOrderBookReq prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.GetOrderBookReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.GetOrderBookReq)
      io.lightcone.data.dex.GetOrderBookReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetOrderBookReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetOrderBookReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.GetOrderBookReq.class, io.lightcone.data.dex.GetOrderBookReq.Builder.class);
    }

    // Construct using io.lightcone.data.dex.GetOrderBookReq.newBuilder()
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
      marketId_ = 0L;

      aggregationLevel_ = 0;

      fiatSymbol_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetOrderBookReq_descriptor;
    }

    public io.lightcone.data.dex.GetOrderBookReq getDefaultInstanceForType() {
      return io.lightcone.data.dex.GetOrderBookReq.getDefaultInstance();
    }

    public io.lightcone.data.dex.GetOrderBookReq build() {
      io.lightcone.data.dex.GetOrderBookReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.GetOrderBookReq buildPartial() {
      io.lightcone.data.dex.GetOrderBookReq result = new io.lightcone.data.dex.GetOrderBookReq(this);
      result.marketId_ = marketId_;
      result.aggregationLevel_ = aggregationLevel_;
      result.fiatSymbol_ = fiatSymbol_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.GetOrderBookReq) {
        return mergeFrom((io.lightcone.data.dex.GetOrderBookReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.GetOrderBookReq other) {
      if (other == io.lightcone.data.dex.GetOrderBookReq.getDefaultInstance()) return this;
      if (other.getMarketId() != 0L) {
        setMarketId(other.getMarketId());
      }
      if (other.getAggregationLevel() != 0) {
        setAggregationLevel(other.getAggregationLevel());
      }
      if (!other.getFiatSymbol().isEmpty()) {
        fiatSymbol_ = other.fiatSymbol_;
        onChanged();
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
      io.lightcone.data.dex.GetOrderBookReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.GetOrderBookReq) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long marketId_ ;
    /**
     * <code>optional uint64 market_id = 1;</code>
     *
     * <pre>
     * 32bit base_token_id + 32bit quote_token_id
     * </pre>
     */
    public long getMarketId() {
      return marketId_;
    }
    /**
     * <code>optional uint64 market_id = 1;</code>
     *
     * <pre>
     * 32bit base_token_id + 32bit quote_token_id
     * </pre>
     */
    public Builder setMarketId(long value) {

      marketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 market_id = 1;</code>
     *
     * <pre>
     * 32bit base_token_id + 32bit quote_token_id
     * </pre>
     */
    public Builder clearMarketId() {

      marketId_ = 0L;
      onChanged();
      return this;
    }

    private int aggregationLevel_ ;
    /**
     * <code>optional uint32 aggregation_level = 2;</code>
     */
    public int getAggregationLevel() {
      return aggregationLevel_;
    }
    /**
     * <code>optional uint32 aggregation_level = 2;</code>
     */
    public Builder setAggregationLevel(int value) {

      aggregationLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 aggregation_level = 2;</code>
     */
    public Builder clearAggregationLevel() {

      aggregationLevel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fiatSymbol_ = "";
    /**
     * <code>optional string fiat_symbol = 3;</code>
     */
    public java.lang.String getFiatSymbol() {
      java.lang.Object ref = fiatSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fiatSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string fiat_symbol = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFiatSymbolBytes() {
      java.lang.Object ref = fiatSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fiatSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string fiat_symbol = 3;</code>
     */
    public Builder setFiatSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      fiatSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string fiat_symbol = 3;</code>
     */
    public Builder clearFiatSymbol() {

      fiatSymbol_ = getDefaultInstance().getFiatSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>optional string fiat_symbol = 3;</code>
     */
    public Builder setFiatSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      fiatSymbol_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.GetOrderBookReq)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.GetOrderBookReq)
  private static final io.lightcone.data.dex.GetOrderBookReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.GetOrderBookReq();
  }

  public static io.lightcone.data.dex.GetOrderBookReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOrderBookReq>
      PARSER = new com.google.protobuf.AbstractParser<GetOrderBookReq>() {
    public GetOrderBookReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetOrderBookReq(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetOrderBookReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOrderBookReq> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.GetOrderBookReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

