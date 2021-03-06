// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.Fill}
 */
public  final class Fill extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.Fill)
    FillOrBuilder {
  // Use Fill.newBuilder() to construct.
  private Fill(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Fill() {
    uuid_ = 0L;
    orderUuid_ = 0L;
    isTaker_ = false;
    isSell_ = false;
    baseFillAmount_ = "";
    quoteFillAmount_ = "";
    timestamp_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Fill(
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

            uuid_ = input.readUInt64();
            break;
          }
          case 16: {

            orderUuid_ = input.readUInt64();
            break;
          }
          case 24: {

            isTaker_ = input.readBool();
            break;
          }
          case 32: {

            isSell_ = input.readBool();
            break;
          }
          case 42: {
            io.lightcone.data.types.TokenID.Builder subBuilder = null;
            if (baseTokenId_ != null) {
              subBuilder = baseTokenId_.toBuilder();
            }
            baseTokenId_ = input.readMessage(io.lightcone.data.types.TokenID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseTokenId_);
              baseTokenId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            baseFillAmount_ = s;
            break;
          }
          case 58: {
            io.lightcone.data.types.TokenID.Builder subBuilder = null;
            if (quoteTokenId_ != null) {
              subBuilder = quoteTokenId_.toBuilder();
            }
            quoteTokenId_ = input.readMessage(io.lightcone.data.types.TokenID.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(quoteTokenId_);
              quoteTokenId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            quoteFillAmount_ = s;
            break;
          }
          case 72: {

            timestamp_ = input.readUInt64();
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
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Fill_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Fill_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.Fill.class, io.lightcone.data.dex.Fill.Builder.class);
  }

  public static final int UUID_FIELD_NUMBER = 1;
  private long uuid_;
  /**
   * <code>optional uint64 uuid = 1;</code>
   */
  public long getUuid() {
    return uuid_;
  }

  public static final int ORDER_UUID_FIELD_NUMBER = 2;
  private long orderUuid_;
  /**
   * <code>optional uint64 order_uuid = 2;</code>
   */
  public long getOrderUuid() {
    return orderUuid_;
  }

  public static final int IS_TAKER_FIELD_NUMBER = 3;
  private boolean isTaker_;
  /**
   * <code>optional bool is_taker = 3;</code>
   */
  public boolean getIsTaker() {
    return isTaker_;
  }

  public static final int IS_SELL_FIELD_NUMBER = 4;
  private boolean isSell_;
  /**
   * <code>optional bool is_sell = 4;</code>
   */
  public boolean getIsSell() {
    return isSell_;
  }

  public static final int BASE_TOKEN_ID_FIELD_NUMBER = 5;
  private io.lightcone.data.types.TokenID baseTokenId_;
  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  public boolean hasBaseTokenId() {
    return baseTokenId_ != null;
  }
  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  public io.lightcone.data.types.TokenID getBaseTokenId() {
    return baseTokenId_ == null ? io.lightcone.data.types.TokenID.getDefaultInstance() : baseTokenId_;
  }
  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  public io.lightcone.data.types.TokenIDOrBuilder getBaseTokenIdOrBuilder() {
    return getBaseTokenId();
  }

  public static final int BASE_FILL_AMOUNT_FIELD_NUMBER = 6;
  private volatile java.lang.Object baseFillAmount_;
  /**
   * <code>optional string base_fill_amount = 6;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public java.lang.String getBaseFillAmount() {
    java.lang.Object ref = baseFillAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseFillAmount_ = s;
      return s;
    }
  }
  /**
   * <code>optional string base_fill_amount = 6;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public com.google.protobuf.ByteString
      getBaseFillAmountBytes() {
    java.lang.Object ref = baseFillAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseFillAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUOTE_TOKEN_ID_FIELD_NUMBER = 7;
  private io.lightcone.data.types.TokenID quoteTokenId_;
  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  public boolean hasQuoteTokenId() {
    return quoteTokenId_ != null;
  }
  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  public io.lightcone.data.types.TokenID getQuoteTokenId() {
    return quoteTokenId_ == null ? io.lightcone.data.types.TokenID.getDefaultInstance() : quoteTokenId_;
  }
  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  public io.lightcone.data.types.TokenIDOrBuilder getQuoteTokenIdOrBuilder() {
    return getQuoteTokenId();
  }

  public static final int QUOTE_FILL_AMOUNT_FIELD_NUMBER = 8;
  private volatile java.lang.Object quoteFillAmount_;
  /**
   * <code>optional string quote_fill_amount = 8;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public java.lang.String getQuoteFillAmount() {
    java.lang.Object ref = quoteFillAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quoteFillAmount_ = s;
      return s;
    }
  }
  /**
   * <code>optional string quote_fill_amount = 8;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public com.google.protobuf.ByteString
      getQuoteFillAmountBytes() {
    java.lang.Object ref = quoteFillAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quoteFillAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 9;
  private long timestamp_;
  /**
   * <code>optional uint64 timestamp = 9;</code>
   */
  public long getTimestamp() {
    return timestamp_;
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
    if (uuid_ != 0L) {
      output.writeUInt64(1, uuid_);
    }
    if (orderUuid_ != 0L) {
      output.writeUInt64(2, orderUuid_);
    }
    if (isTaker_ != false) {
      output.writeBool(3, isTaker_);
    }
    if (isSell_ != false) {
      output.writeBool(4, isSell_);
    }
    if (baseTokenId_ != null) {
      output.writeMessage(5, getBaseTokenId());
    }
    if (!getBaseFillAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 6, baseFillAmount_);
    }
    if (quoteTokenId_ != null) {
      output.writeMessage(7, getQuoteTokenId());
    }
    if (!getQuoteFillAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 8, quoteFillAmount_);
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(9, timestamp_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, uuid_);
    }
    if (orderUuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, orderUuid_);
    }
    if (isTaker_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isTaker_);
    }
    if (isSell_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isSell_);
    }
    if (baseTokenId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getBaseTokenId());
    }
    if (!getBaseFillAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(6, baseFillAmount_);
    }
    if (quoteTokenId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getQuoteTokenId());
    }
    if (!getQuoteFillAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(8, quoteFillAmount_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(9, timestamp_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.Fill parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.Fill parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.Fill parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.Fill parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.Fill parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.Fill parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.Fill parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.Fill parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.Fill parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.Fill parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.Fill prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.Fill}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.Fill)
      io.lightcone.data.dex.FillOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Fill_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Fill_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.Fill.class, io.lightcone.data.dex.Fill.Builder.class);
    }

    // Construct using io.lightcone.data.dex.Fill.newBuilder()
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
      uuid_ = 0L;

      orderUuid_ = 0L;

      isTaker_ = false;

      isSell_ = false;

      if (baseTokenIdBuilder_ == null) {
        baseTokenId_ = null;
      } else {
        baseTokenId_ = null;
        baseTokenIdBuilder_ = null;
      }
      baseFillAmount_ = "";

      if (quoteTokenIdBuilder_ == null) {
        quoteTokenId_ = null;
      } else {
        quoteTokenId_ = null;
        quoteTokenIdBuilder_ = null;
      }
      quoteFillAmount_ = "";

      timestamp_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Fill_descriptor;
    }

    public io.lightcone.data.dex.Fill getDefaultInstanceForType() {
      return io.lightcone.data.dex.Fill.getDefaultInstance();
    }

    public io.lightcone.data.dex.Fill build() {
      io.lightcone.data.dex.Fill result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.Fill buildPartial() {
      io.lightcone.data.dex.Fill result = new io.lightcone.data.dex.Fill(this);
      result.uuid_ = uuid_;
      result.orderUuid_ = orderUuid_;
      result.isTaker_ = isTaker_;
      result.isSell_ = isSell_;
      if (baseTokenIdBuilder_ == null) {
        result.baseTokenId_ = baseTokenId_;
      } else {
        result.baseTokenId_ = baseTokenIdBuilder_.build();
      }
      result.baseFillAmount_ = baseFillAmount_;
      if (quoteTokenIdBuilder_ == null) {
        result.quoteTokenId_ = quoteTokenId_;
      } else {
        result.quoteTokenId_ = quoteTokenIdBuilder_.build();
      }
      result.quoteFillAmount_ = quoteFillAmount_;
      result.timestamp_ = timestamp_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.Fill) {
        return mergeFrom((io.lightcone.data.dex.Fill)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.Fill other) {
      if (other == io.lightcone.data.dex.Fill.getDefaultInstance()) return this;
      if (other.getUuid() != 0L) {
        setUuid(other.getUuid());
      }
      if (other.getOrderUuid() != 0L) {
        setOrderUuid(other.getOrderUuid());
      }
      if (other.getIsTaker() != false) {
        setIsTaker(other.getIsTaker());
      }
      if (other.getIsSell() != false) {
        setIsSell(other.getIsSell());
      }
      if (other.hasBaseTokenId()) {
        mergeBaseTokenId(other.getBaseTokenId());
      }
      if (!other.getBaseFillAmount().isEmpty()) {
        baseFillAmount_ = other.baseFillAmount_;
        onChanged();
      }
      if (other.hasQuoteTokenId()) {
        mergeQuoteTokenId(other.getQuoteTokenId());
      }
      if (!other.getQuoteFillAmount().isEmpty()) {
        quoteFillAmount_ = other.quoteFillAmount_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
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
      io.lightcone.data.dex.Fill parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.Fill) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long uuid_ ;
    /**
     * <code>optional uint64 uuid = 1;</code>
     */
    public long getUuid() {
      return uuid_;
    }
    /**
     * <code>optional uint64 uuid = 1;</code>
     */
    public Builder setUuid(long value) {
      
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 uuid = 1;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = 0L;
      onChanged();
      return this;
    }

    private long orderUuid_ ;
    /**
     * <code>optional uint64 order_uuid = 2;</code>
     */
    public long getOrderUuid() {
      return orderUuid_;
    }
    /**
     * <code>optional uint64 order_uuid = 2;</code>
     */
    public Builder setOrderUuid(long value) {
      
      orderUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 order_uuid = 2;</code>
     */
    public Builder clearOrderUuid() {
      
      orderUuid_ = 0L;
      onChanged();
      return this;
    }

    private boolean isTaker_ ;
    /**
     * <code>optional bool is_taker = 3;</code>
     */
    public boolean getIsTaker() {
      return isTaker_;
    }
    /**
     * <code>optional bool is_taker = 3;</code>
     */
    public Builder setIsTaker(boolean value) {
      
      isTaker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_taker = 3;</code>
     */
    public Builder clearIsTaker() {
      
      isTaker_ = false;
      onChanged();
      return this;
    }

    private boolean isSell_ ;
    /**
     * <code>optional bool is_sell = 4;</code>
     */
    public boolean getIsSell() {
      return isSell_;
    }
    /**
     * <code>optional bool is_sell = 4;</code>
     */
    public Builder setIsSell(boolean value) {
      
      isSell_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool is_sell = 4;</code>
     */
    public Builder clearIsSell() {
      
      isSell_ = false;
      onChanged();
      return this;
    }

    private io.lightcone.data.types.TokenID baseTokenId_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder> baseTokenIdBuilder_;
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public boolean hasBaseTokenId() {
      return baseTokenIdBuilder_ != null || baseTokenId_ != null;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public io.lightcone.data.types.TokenID getBaseTokenId() {
      if (baseTokenIdBuilder_ == null) {
        return baseTokenId_ == null ? io.lightcone.data.types.TokenID.getDefaultInstance() : baseTokenId_;
      } else {
        return baseTokenIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public Builder setBaseTokenId(io.lightcone.data.types.TokenID value) {
      if (baseTokenIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseTokenId_ = value;
        onChanged();
      } else {
        baseTokenIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public Builder setBaseTokenId(
        io.lightcone.data.types.TokenID.Builder builderForValue) {
      if (baseTokenIdBuilder_ == null) {
        baseTokenId_ = builderForValue.build();
        onChanged();
      } else {
        baseTokenIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public Builder mergeBaseTokenId(io.lightcone.data.types.TokenID value) {
      if (baseTokenIdBuilder_ == null) {
        if (baseTokenId_ != null) {
          baseTokenId_ =
            io.lightcone.data.types.TokenID.newBuilder(baseTokenId_).mergeFrom(value).buildPartial();
        } else {
          baseTokenId_ = value;
        }
        onChanged();
      } else {
        baseTokenIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public Builder clearBaseTokenId() {
      if (baseTokenIdBuilder_ == null) {
        baseTokenId_ = null;
        onChanged();
      } else {
        baseTokenId_ = null;
        baseTokenIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public io.lightcone.data.types.TokenID.Builder getBaseTokenIdBuilder() {
      
      onChanged();
      return getBaseTokenIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    public io.lightcone.data.types.TokenIDOrBuilder getBaseTokenIdOrBuilder() {
      if (baseTokenIdBuilder_ != null) {
        return baseTokenIdBuilder_.getMessageOrBuilder();
      } else {
        return baseTokenId_ == null ?
            io.lightcone.data.types.TokenID.getDefaultInstance() : baseTokenId_;
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder> 
        getBaseTokenIdFieldBuilder() {
      if (baseTokenIdBuilder_ == null) {
        baseTokenIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder>(
                getBaseTokenId(),
                getParentForChildren(),
                isClean());
        baseTokenId_ = null;
      }
      return baseTokenIdBuilder_;
    }

    private java.lang.Object baseFillAmount_ = "";
    /**
     * <code>optional string base_fill_amount = 6;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public java.lang.String getBaseFillAmount() {
      java.lang.Object ref = baseFillAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseFillAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string base_fill_amount = 6;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public com.google.protobuf.ByteString
        getBaseFillAmountBytes() {
      java.lang.Object ref = baseFillAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseFillAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string base_fill_amount = 6;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setBaseFillAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      baseFillAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_fill_amount = 6;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder clearBaseFillAmount() {
      
      baseFillAmount_ = getDefaultInstance().getBaseFillAmount();
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_fill_amount = 6;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setBaseFillAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      baseFillAmount_ = value;
      onChanged();
      return this;
    }

    private io.lightcone.data.types.TokenID quoteTokenId_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder> quoteTokenIdBuilder_;
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public boolean hasQuoteTokenId() {
      return quoteTokenIdBuilder_ != null || quoteTokenId_ != null;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public io.lightcone.data.types.TokenID getQuoteTokenId() {
      if (quoteTokenIdBuilder_ == null) {
        return quoteTokenId_ == null ? io.lightcone.data.types.TokenID.getDefaultInstance() : quoteTokenId_;
      } else {
        return quoteTokenIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public Builder setQuoteTokenId(io.lightcone.data.types.TokenID value) {
      if (quoteTokenIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quoteTokenId_ = value;
        onChanged();
      } else {
        quoteTokenIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public Builder setQuoteTokenId(
        io.lightcone.data.types.TokenID.Builder builderForValue) {
      if (quoteTokenIdBuilder_ == null) {
        quoteTokenId_ = builderForValue.build();
        onChanged();
      } else {
        quoteTokenIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public Builder mergeQuoteTokenId(io.lightcone.data.types.TokenID value) {
      if (quoteTokenIdBuilder_ == null) {
        if (quoteTokenId_ != null) {
          quoteTokenId_ =
            io.lightcone.data.types.TokenID.newBuilder(quoteTokenId_).mergeFrom(value).buildPartial();
        } else {
          quoteTokenId_ = value;
        }
        onChanged();
      } else {
        quoteTokenIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public Builder clearQuoteTokenId() {
      if (quoteTokenIdBuilder_ == null) {
        quoteTokenId_ = null;
        onChanged();
      } else {
        quoteTokenId_ = null;
        quoteTokenIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public io.lightcone.data.types.TokenID.Builder getQuoteTokenIdBuilder() {
      
      onChanged();
      return getQuoteTokenIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    public io.lightcone.data.types.TokenIDOrBuilder getQuoteTokenIdOrBuilder() {
      if (quoteTokenIdBuilder_ != null) {
        return quoteTokenIdBuilder_.getMessageOrBuilder();
      } else {
        return quoteTokenId_ == null ?
            io.lightcone.data.types.TokenID.getDefaultInstance() : quoteTokenId_;
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder> 
        getQuoteTokenIdFieldBuilder() {
      if (quoteTokenIdBuilder_ == null) {
        quoteTokenIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.lightcone.data.types.TokenID, io.lightcone.data.types.TokenID.Builder, io.lightcone.data.types.TokenIDOrBuilder>(
                getQuoteTokenId(),
                getParentForChildren(),
                isClean());
        quoteTokenId_ = null;
      }
      return quoteTokenIdBuilder_;
    }

    private java.lang.Object quoteFillAmount_ = "";
    /**
     * <code>optional string quote_fill_amount = 8;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public java.lang.String getQuoteFillAmount() {
      java.lang.Object ref = quoteFillAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quoteFillAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string quote_fill_amount = 8;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public com.google.protobuf.ByteString
        getQuoteFillAmountBytes() {
      java.lang.Object ref = quoteFillAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quoteFillAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string quote_fill_amount = 8;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setQuoteFillAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      quoteFillAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_fill_amount = 8;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder clearQuoteFillAmount() {
      
      quoteFillAmount_ = getDefaultInstance().getQuoteFillAmount();
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_fill_amount = 8;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setQuoteFillAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      quoteFillAmount_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>optional uint64 timestamp = 9;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>optional uint64 timestamp = 9;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 timestamp = 9;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.Fill)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.Fill)
  private static final io.lightcone.data.dex.Fill DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.Fill();
  }

  public static io.lightcone.data.dex.Fill getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fill>
      PARSER = new com.google.protobuf.AbstractParser<Fill>() {
    public Fill parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Fill(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<Fill> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fill> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.Fill getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

