// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_types.proto

package io.lightcone.data.types;

/**
 * Protobuf type {@code io.lightcone.data.types.MarketMetadata}
 */
public  final class MarketMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.types.MarketMetadata)
    MarketMetadataOrBuilder {
  // Use MarketMetadata.newBuilder() to construct.
  private MarketMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MarketMetadata() {
    status_ = 0;
    quoteTokenSymbol_ = "";
    baseTokenSymbol_ = "";
    maxNumbersOfOrders_ = 0;
    priceDecimals_ = 0;
    orderbookAggLevels_ = 0;
    precisionForAmount_ = 0;
    precisionForTotal_ = 0;
    browsableInWallet_ = false;
    updatedAt_ = 0L;
    marketId_ = 0L;
    marketHash_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MarketMetadata(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            quoteTokenSymbol_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            baseTokenSymbol_ = s;
            break;
          }
          case 32: {

            maxNumbersOfOrders_ = input.readInt32();
            break;
          }
          case 40: {

            priceDecimals_ = input.readInt32();
            break;
          }
          case 48: {

            orderbookAggLevels_ = input.readInt32();
            break;
          }
          case 56: {

            precisionForAmount_ = input.readInt32();
            break;
          }
          case 64: {

            precisionForTotal_ = input.readInt32();
            break;
          }
          case 72: {

            browsableInWallet_ = input.readBool();
            break;
          }
          case 80: {

            updatedAt_ = input.readInt64();
            break;
          }
          case 160: {

            marketId_ = input.readUInt64();
            break;
          }
          case 170: {
            java.lang.String s = input.readStringRequireUtf8();

            marketHash_ = s;
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
    return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_MarketMetadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_MarketMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.types.MarketMetadata.class, io.lightcone.data.types.MarketMetadata.Builder.class);
  }

  /**
   * Protobuf enum {@code io.lightcone.data.types.MarketMetadata.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TERMINATED = 0;</code>
     */
    TERMINATED(0, 0),
    /**
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1, 1),
    /**
     * <code>READONLY = 2;</code>
     */
    READONLY(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>TERMINATED = 0;</code>
     */
    public static final int TERMINATED_VALUE = 0;
    /**
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     * <code>READONLY = 2;</code>
     */
    public static final int READONLY_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Status valueOf(int value) {
      switch (value) {
        case 0: return TERMINATED;
        case 1: return ACTIVE;
        case 2: return READONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.lightcone.data.types.MarketMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Status(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.lightcone.data.types.MarketMetadata.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
   */
  public io.lightcone.data.types.MarketMetadata.Status getStatus() {
    io.lightcone.data.types.MarketMetadata.Status result = io.lightcone.data.types.MarketMetadata.Status.valueOf(status_);
    return result == null ? io.lightcone.data.types.MarketMetadata.Status.UNRECOGNIZED : result;
  }

  public static final int QUOTE_TOKEN_SYMBOL_FIELD_NUMBER = 2;
  private volatile java.lang.Object quoteTokenSymbol_;
  /**
   * <code>optional string quote_token_symbol = 2;</code>
   */
  public java.lang.String getQuoteTokenSymbol() {
    java.lang.Object ref = quoteTokenSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quoteTokenSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>optional string quote_token_symbol = 2;</code>
   */
  public com.google.protobuf.ByteString
      getQuoteTokenSymbolBytes() {
    java.lang.Object ref = quoteTokenSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quoteTokenSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BASE_TOKEN_SYMBOL_FIELD_NUMBER = 3;
  private volatile java.lang.Object baseTokenSymbol_;
  /**
   * <code>optional string base_token_symbol = 3;</code>
   */
  public java.lang.String getBaseTokenSymbol() {
    java.lang.Object ref = baseTokenSymbol_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseTokenSymbol_ = s;
      return s;
    }
  }
  /**
   * <code>optional string base_token_symbol = 3;</code>
   */
  public com.google.protobuf.ByteString
      getBaseTokenSymbolBytes() {
    java.lang.Object ref = baseTokenSymbol_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseTokenSymbol_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_NUMBERS_OF_ORDERS_FIELD_NUMBER = 4;
  private int maxNumbersOfOrders_;
  /**
   * <code>optional int32 max_numbers_of_orders = 4;</code>
   */
  public int getMaxNumbersOfOrders() {
    return maxNumbersOfOrders_;
  }

  public static final int PRICE_DECIMALS_FIELD_NUMBER = 5;
  private int priceDecimals_;
  /**
   * <code>optional int32 price_decimals = 5;</code>
   */
  public int getPriceDecimals() {
    return priceDecimals_;
  }

  public static final int ORDERBOOK_AGG_LEVELS_FIELD_NUMBER = 6;
  private int orderbookAggLevels_;
  /**
   * <code>optional int32 orderbook_agg_levels = 6;</code>
   */
  public int getOrderbookAggLevels() {
    return orderbookAggLevels_;
  }

  public static final int PRECISION_FOR_AMOUNT_FIELD_NUMBER = 7;
  private int precisionForAmount_;
  /**
   * <code>optional int32 precision_for_amount = 7;</code>
   */
  public int getPrecisionForAmount() {
    return precisionForAmount_;
  }

  public static final int PRECISION_FOR_TOTAL_FIELD_NUMBER = 8;
  private int precisionForTotal_;
  /**
   * <code>optional int32 precision_for_total = 8;</code>
   */
  public int getPrecisionForTotal() {
    return precisionForTotal_;
  }

  public static final int BROWSABLE_IN_WALLET_FIELD_NUMBER = 9;
  private boolean browsableInWallet_;
  /**
   * <code>optional bool browsable_in_wallet = 9;</code>
   */
  public boolean getBrowsableInWallet() {
    return browsableInWallet_;
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 10;
  private long updatedAt_;
  /**
   * <code>optional int64 updated_at = 10;</code>
   */
  public long getUpdatedAt() {
    return updatedAt_;
  }

  public static final int MARKET_ID_FIELD_NUMBER = 20;
  private long marketId_;
  /**
   * <code>optional uint64 market_id = 20;</code>
   *
   * <pre>
   * computed
   * </pre>
   */
  public long getMarketId() {
    return marketId_;
  }

  public static final int MARKET_HASH_FIELD_NUMBER = 21;
  private volatile java.lang.Object marketHash_;
  /**
   * <code>optional string market_hash = 21;</code>
   *
   * <pre>
   * computed
   * </pre>
   */
  public java.lang.String getMarketHash() {
    java.lang.Object ref = marketHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      marketHash_ = s;
      return s;
    }
  }
  /**
   * <code>optional string market_hash = 21;</code>
   *
   * <pre>
   * computed
   * </pre>
   */
  public com.google.protobuf.ByteString
      getMarketHashBytes() {
    java.lang.Object ref = marketHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      marketHash_ = b;
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
    if (status_ != io.lightcone.data.types.MarketMetadata.Status.TERMINATED.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!getQuoteTokenSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, quoteTokenSymbol_);
    }
    if (!getBaseTokenSymbolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, baseTokenSymbol_);
    }
    if (maxNumbersOfOrders_ != 0) {
      output.writeInt32(4, maxNumbersOfOrders_);
    }
    if (priceDecimals_ != 0) {
      output.writeInt32(5, priceDecimals_);
    }
    if (orderbookAggLevels_ != 0) {
      output.writeInt32(6, orderbookAggLevels_);
    }
    if (precisionForAmount_ != 0) {
      output.writeInt32(7, precisionForAmount_);
    }
    if (precisionForTotal_ != 0) {
      output.writeInt32(8, precisionForTotal_);
    }
    if (browsableInWallet_ != false) {
      output.writeBool(9, browsableInWallet_);
    }
    if (updatedAt_ != 0L) {
      output.writeInt64(10, updatedAt_);
    }
    if (marketId_ != 0L) {
      output.writeUInt64(20, marketId_);
    }
    if (!getMarketHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 21, marketHash_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != io.lightcone.data.types.MarketMetadata.Status.TERMINATED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!getQuoteTokenSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, quoteTokenSymbol_);
    }
    if (!getBaseTokenSymbolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, baseTokenSymbol_);
    }
    if (maxNumbersOfOrders_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxNumbersOfOrders_);
    }
    if (priceDecimals_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, priceDecimals_);
    }
    if (orderbookAggLevels_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, orderbookAggLevels_);
    }
    if (precisionForAmount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, precisionForAmount_);
    }
    if (precisionForTotal_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, precisionForTotal_);
    }
    if (browsableInWallet_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, browsableInWallet_);
    }
    if (updatedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, updatedAt_);
    }
    if (marketId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(20, marketId_);
    }
    if (!getMarketHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(21, marketHash_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.types.MarketMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.types.MarketMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.types.MarketMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.types.MarketMetadata prototype) {
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
   * Protobuf type {@code io.lightcone.data.types.MarketMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.types.MarketMetadata)
      io.lightcone.data.types.MarketMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_MarketMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_MarketMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.types.MarketMetadata.class, io.lightcone.data.types.MarketMetadata.Builder.class);
    }

    // Construct using io.lightcone.data.types.MarketMetadata.newBuilder()
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
      status_ = 0;

      quoteTokenSymbol_ = "";

      baseTokenSymbol_ = "";

      maxNumbersOfOrders_ = 0;

      priceDecimals_ = 0;

      orderbookAggLevels_ = 0;

      precisionForAmount_ = 0;

      precisionForTotal_ = 0;

      browsableInWallet_ = false;

      updatedAt_ = 0L;

      marketId_ = 0L;

      marketHash_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_MarketMetadata_descriptor;
    }

    public io.lightcone.data.types.MarketMetadata getDefaultInstanceForType() {
      return io.lightcone.data.types.MarketMetadata.getDefaultInstance();
    }

    public io.lightcone.data.types.MarketMetadata build() {
      io.lightcone.data.types.MarketMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.types.MarketMetadata buildPartial() {
      io.lightcone.data.types.MarketMetadata result = new io.lightcone.data.types.MarketMetadata(this);
      result.status_ = status_;
      result.quoteTokenSymbol_ = quoteTokenSymbol_;
      result.baseTokenSymbol_ = baseTokenSymbol_;
      result.maxNumbersOfOrders_ = maxNumbersOfOrders_;
      result.priceDecimals_ = priceDecimals_;
      result.orderbookAggLevels_ = orderbookAggLevels_;
      result.precisionForAmount_ = precisionForAmount_;
      result.precisionForTotal_ = precisionForTotal_;
      result.browsableInWallet_ = browsableInWallet_;
      result.updatedAt_ = updatedAt_;
      result.marketId_ = marketId_;
      result.marketHash_ = marketHash_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.types.MarketMetadata) {
        return mergeFrom((io.lightcone.data.types.MarketMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.types.MarketMetadata other) {
      if (other == io.lightcone.data.types.MarketMetadata.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getQuoteTokenSymbol().isEmpty()) {
        quoteTokenSymbol_ = other.quoteTokenSymbol_;
        onChanged();
      }
      if (!other.getBaseTokenSymbol().isEmpty()) {
        baseTokenSymbol_ = other.baseTokenSymbol_;
        onChanged();
      }
      if (other.getMaxNumbersOfOrders() != 0) {
        setMaxNumbersOfOrders(other.getMaxNumbersOfOrders());
      }
      if (other.getPriceDecimals() != 0) {
        setPriceDecimals(other.getPriceDecimals());
      }
      if (other.getOrderbookAggLevels() != 0) {
        setOrderbookAggLevels(other.getOrderbookAggLevels());
      }
      if (other.getPrecisionForAmount() != 0) {
        setPrecisionForAmount(other.getPrecisionForAmount());
      }
      if (other.getPrecisionForTotal() != 0) {
        setPrecisionForTotal(other.getPrecisionForTotal());
      }
      if (other.getBrowsableInWallet() != false) {
        setBrowsableInWallet(other.getBrowsableInWallet());
      }
      if (other.getUpdatedAt() != 0L) {
        setUpdatedAt(other.getUpdatedAt());
      }
      if (other.getMarketId() != 0L) {
        setMarketId(other.getMarketId());
      }
      if (!other.getMarketHash().isEmpty()) {
        marketHash_ = other.marketHash_;
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
      io.lightcone.data.types.MarketMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.types.MarketMetadata) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
     */
    public io.lightcone.data.types.MarketMetadata.Status getStatus() {
      io.lightcone.data.types.MarketMetadata.Status result = io.lightcone.data.types.MarketMetadata.Status.valueOf(status_);
      return result == null ? io.lightcone.data.types.MarketMetadata.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
     */
    public Builder setStatus(io.lightcone.data.types.MarketMetadata.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.MarketMetadata.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object quoteTokenSymbol_ = "";
    /**
     * <code>optional string quote_token_symbol = 2;</code>
     */
    public java.lang.String getQuoteTokenSymbol() {
      java.lang.Object ref = quoteTokenSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quoteTokenSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string quote_token_symbol = 2;</code>
     */
    public com.google.protobuf.ByteString
        getQuoteTokenSymbolBytes() {
      java.lang.Object ref = quoteTokenSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quoteTokenSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string quote_token_symbol = 2;</code>
     */
    public Builder setQuoteTokenSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      quoteTokenSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_token_symbol = 2;</code>
     */
    public Builder clearQuoteTokenSymbol() {
      
      quoteTokenSymbol_ = getDefaultInstance().getQuoteTokenSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_token_symbol = 2;</code>
     */
    public Builder setQuoteTokenSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      quoteTokenSymbol_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object baseTokenSymbol_ = "";
    /**
     * <code>optional string base_token_symbol = 3;</code>
     */
    public java.lang.String getBaseTokenSymbol() {
      java.lang.Object ref = baseTokenSymbol_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseTokenSymbol_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string base_token_symbol = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBaseTokenSymbolBytes() {
      java.lang.Object ref = baseTokenSymbol_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseTokenSymbol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string base_token_symbol = 3;</code>
     */
    public Builder setBaseTokenSymbol(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      baseTokenSymbol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_token_symbol = 3;</code>
     */
    public Builder clearBaseTokenSymbol() {
      
      baseTokenSymbol_ = getDefaultInstance().getBaseTokenSymbol();
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_token_symbol = 3;</code>
     */
    public Builder setBaseTokenSymbolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      baseTokenSymbol_ = value;
      onChanged();
      return this;
    }

    private int maxNumbersOfOrders_ ;
    /**
     * <code>optional int32 max_numbers_of_orders = 4;</code>
     */
    public int getMaxNumbersOfOrders() {
      return maxNumbersOfOrders_;
    }
    /**
     * <code>optional int32 max_numbers_of_orders = 4;</code>
     */
    public Builder setMaxNumbersOfOrders(int value) {
      
      maxNumbersOfOrders_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 max_numbers_of_orders = 4;</code>
     */
    public Builder clearMaxNumbersOfOrders() {
      
      maxNumbersOfOrders_ = 0;
      onChanged();
      return this;
    }

    private int priceDecimals_ ;
    /**
     * <code>optional int32 price_decimals = 5;</code>
     */
    public int getPriceDecimals() {
      return priceDecimals_;
    }
    /**
     * <code>optional int32 price_decimals = 5;</code>
     */
    public Builder setPriceDecimals(int value) {
      
      priceDecimals_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 price_decimals = 5;</code>
     */
    public Builder clearPriceDecimals() {
      
      priceDecimals_ = 0;
      onChanged();
      return this;
    }

    private int orderbookAggLevels_ ;
    /**
     * <code>optional int32 orderbook_agg_levels = 6;</code>
     */
    public int getOrderbookAggLevels() {
      return orderbookAggLevels_;
    }
    /**
     * <code>optional int32 orderbook_agg_levels = 6;</code>
     */
    public Builder setOrderbookAggLevels(int value) {
      
      orderbookAggLevels_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 orderbook_agg_levels = 6;</code>
     */
    public Builder clearOrderbookAggLevels() {
      
      orderbookAggLevels_ = 0;
      onChanged();
      return this;
    }

    private int precisionForAmount_ ;
    /**
     * <code>optional int32 precision_for_amount = 7;</code>
     */
    public int getPrecisionForAmount() {
      return precisionForAmount_;
    }
    /**
     * <code>optional int32 precision_for_amount = 7;</code>
     */
    public Builder setPrecisionForAmount(int value) {
      
      precisionForAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 precision_for_amount = 7;</code>
     */
    public Builder clearPrecisionForAmount() {
      
      precisionForAmount_ = 0;
      onChanged();
      return this;
    }

    private int precisionForTotal_ ;
    /**
     * <code>optional int32 precision_for_total = 8;</code>
     */
    public int getPrecisionForTotal() {
      return precisionForTotal_;
    }
    /**
     * <code>optional int32 precision_for_total = 8;</code>
     */
    public Builder setPrecisionForTotal(int value) {
      
      precisionForTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 precision_for_total = 8;</code>
     */
    public Builder clearPrecisionForTotal() {
      
      precisionForTotal_ = 0;
      onChanged();
      return this;
    }

    private boolean browsableInWallet_ ;
    /**
     * <code>optional bool browsable_in_wallet = 9;</code>
     */
    public boolean getBrowsableInWallet() {
      return browsableInWallet_;
    }
    /**
     * <code>optional bool browsable_in_wallet = 9;</code>
     */
    public Builder setBrowsableInWallet(boolean value) {
      
      browsableInWallet_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool browsable_in_wallet = 9;</code>
     */
    public Builder clearBrowsableInWallet() {
      
      browsableInWallet_ = false;
      onChanged();
      return this;
    }

    private long updatedAt_ ;
    /**
     * <code>optional int64 updated_at = 10;</code>
     */
    public long getUpdatedAt() {
      return updatedAt_;
    }
    /**
     * <code>optional int64 updated_at = 10;</code>
     */
    public Builder setUpdatedAt(long value) {
      
      updatedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 updated_at = 10;</code>
     */
    public Builder clearUpdatedAt() {
      
      updatedAt_ = 0L;
      onChanged();
      return this;
    }

    private long marketId_ ;
    /**
     * <code>optional uint64 market_id = 20;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public long getMarketId() {
      return marketId_;
    }
    /**
     * <code>optional uint64 market_id = 20;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public Builder setMarketId(long value) {
      
      marketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 market_id = 20;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public Builder clearMarketId() {
      
      marketId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object marketHash_ = "";
    /**
     * <code>optional string market_hash = 21;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public java.lang.String getMarketHash() {
      java.lang.Object ref = marketHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        marketHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string market_hash = 21;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMarketHashBytes() {
      java.lang.Object ref = marketHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        marketHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string market_hash = 21;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public Builder setMarketHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      marketHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string market_hash = 21;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public Builder clearMarketHash() {
      
      marketHash_ = getDefaultInstance().getMarketHash();
      onChanged();
      return this;
    }
    /**
     * <code>optional string market_hash = 21;</code>
     *
     * <pre>
     * computed
     * </pre>
     */
    public Builder setMarketHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      marketHash_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.types.MarketMetadata)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.types.MarketMetadata)
  private static final io.lightcone.data.types.MarketMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.types.MarketMetadata();
  }

  public static io.lightcone.data.types.MarketMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketMetadata>
      PARSER = new com.google.protobuf.AbstractParser<MarketMetadata>() {
    public MarketMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MarketMetadata(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<MarketMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketMetadata> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.types.MarketMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
