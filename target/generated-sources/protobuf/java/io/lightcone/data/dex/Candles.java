// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.Candles}
 *
 * <pre>
 *message OHLCData {
 *repeated  double  data      = 1;
 *int64    starting_point     = 2;
 *double     quality          = 3;
 *double     amount           = 4;
 *double     opening_price    = 5;
 *double     closing_price    = 6;
 *double     highest_price    = 7;
 *double     lowest_price     = 8;
 *}
 * </pre>
 */
public  final class Candles extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.Candles)
    CandlesOrBuilder {
  // Use Candles.newBuilder() to construct.
  private Candles(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Candles() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Candles(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              data_ = new java.util.ArrayList<io.lightcone.data.dex.Candles.OHLC>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(input.readMessage(io.lightcone.data.dex.Candles.OHLC.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.Candles.class, io.lightcone.data.dex.Candles.Builder.class);
  }

  public interface OHLCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.lightcone.data.dex.Candles.OHLC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated double ohlc = 1;</code>
     */
    java.util.List<java.lang.Double> getOhlcList();
    /**
     * <code>repeated double ohlc = 1;</code>
     */
    int getOhlcCount();
    /**
     * <code>repeated double ohlc = 1;</code>
     */
    double getOhlc(int index);
  }
  /**
   * Protobuf type {@code io.lightcone.data.dex.Candles.OHLC}
   */
  public  static final class OHLC extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.Candles.OHLC)
      OHLCOrBuilder {
    // Use OHLC.newBuilder() to construct.
    private OHLC(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private OHLC() {
      ohlc_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private OHLC(
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
            case 9: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                ohlc_ = new java.util.ArrayList<java.lang.Double>();
                mutable_bitField0_ |= 0x00000001;
              }
              ohlc_.add(input.readDouble());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                ohlc_ = new java.util.ArrayList<java.lang.Double>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                ohlc_.add(input.readDouble());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          ohlc_ = java.util.Collections.unmodifiableList(ohlc_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_OHLC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_OHLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.Candles.OHLC.class, io.lightcone.data.dex.Candles.OHLC.Builder.class);
    }

    public static final int OHLC_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Double> ohlc_;
    /**
     * <code>repeated double ohlc = 1;</code>
     */
    public java.util.List<java.lang.Double>
        getOhlcList() {
      return ohlc_;
    }
    /**
     * <code>repeated double ohlc = 1;</code>
     */
    public int getOhlcCount() {
      return ohlc_.size();
    }
    /**
     * <code>repeated double ohlc = 1;</code>
     */
    public double getOhlc(int index) {
      return ohlc_.get(index);
    }
    private int ohlcMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getOhlcList().size() > 0) {
        output.writeRawVarint32(10);
        output.writeRawVarint32(ohlcMemoizedSerializedSize);
      }
      for (int i = 0; i < ohlc_.size(); i++) {
        output.writeDoubleNoTag(ohlc_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        dataSize = 8 * getOhlcList().size();
        size += dataSize;
        if (!getOhlcList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        ohlcMemoizedSerializedSize = dataSize;
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static io.lightcone.data.dex.Candles.OHLC parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.lightcone.data.dex.Candles.OHLC prototype) {
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
     * Protobuf type {@code io.lightcone.data.dex.Candles.OHLC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.Candles.OHLC)
        io.lightcone.data.dex.Candles.OHLCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_OHLC_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_OHLC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.lightcone.data.dex.Candles.OHLC.class, io.lightcone.data.dex.Candles.OHLC.Builder.class);
      }

      // Construct using io.lightcone.data.dex.Candles.OHLC.newBuilder()
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
        ohlc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_OHLC_descriptor;
      }

      public io.lightcone.data.dex.Candles.OHLC getDefaultInstanceForType() {
        return io.lightcone.data.dex.Candles.OHLC.getDefaultInstance();
      }

      public io.lightcone.data.dex.Candles.OHLC build() {
        io.lightcone.data.dex.Candles.OHLC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.lightcone.data.dex.Candles.OHLC buildPartial() {
        io.lightcone.data.dex.Candles.OHLC result = new io.lightcone.data.dex.Candles.OHLC(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ohlc_ = java.util.Collections.unmodifiableList(ohlc_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ohlc_ = ohlc_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.lightcone.data.dex.Candles.OHLC) {
          return mergeFrom((io.lightcone.data.dex.Candles.OHLC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.lightcone.data.dex.Candles.OHLC other) {
        if (other == io.lightcone.data.dex.Candles.OHLC.getDefaultInstance()) return this;
        if (!other.ohlc_.isEmpty()) {
          if (ohlc_.isEmpty()) {
            ohlc_ = other.ohlc_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOhlcIsMutable();
            ohlc_.addAll(other.ohlc_);
          }
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
        io.lightcone.data.dex.Candles.OHLC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.lightcone.data.dex.Candles.OHLC) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Double> ohlc_ = java.util.Collections.emptyList();
      private void ensureOhlcIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          ohlc_ = new java.util.ArrayList<java.lang.Double>(ohlc_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public java.util.List<java.lang.Double>
          getOhlcList() {
        return java.util.Collections.unmodifiableList(ohlc_);
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public int getOhlcCount() {
        return ohlc_.size();
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public double getOhlc(int index) {
        return ohlc_.get(index);
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public Builder setOhlc(
          int index, double value) {
        ensureOhlcIsMutable();
        ohlc_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public Builder addOhlc(double value) {
        ensureOhlcIsMutable();
        ohlc_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public Builder addAllOhlc(
          java.lang.Iterable<? extends java.lang.Double> values) {
        ensureOhlcIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ohlc_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated double ohlc = 1;</code>
       */
      public Builder clearOhlc() {
        ohlc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.Candles.OHLC)
    }

    // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.Candles.OHLC)
    private static final io.lightcone.data.dex.Candles.OHLC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.lightcone.data.dex.Candles.OHLC();
    }

    public static io.lightcone.data.dex.Candles.OHLC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OHLC>
        PARSER = new com.google.protobuf.AbstractParser<OHLC>() {
      public OHLC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new OHLC(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<OHLC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OHLC> getParserForType() {
      return PARSER;
    }

    public io.lightcone.data.dex.Candles.OHLC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int DATA_FIELD_NUMBER = 1;
  private java.util.List<io.lightcone.data.dex.Candles.OHLC> data_;
  /**
   * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
   */
  public java.util.List<io.lightcone.data.dex.Candles.OHLC> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
   */
  public java.util.List<? extends io.lightcone.data.dex.Candles.OHLCOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
   */
  public io.lightcone.data.dex.Candles.OHLC getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
   */
  public io.lightcone.data.dex.Candles.OHLCOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.Candles parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.Candles parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.Candles parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.Candles parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.Candles parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.Candles parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.Candles parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.Candles parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.Candles parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.Candles parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.Candles prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.Candles}
   *
   * <pre>
   *message OHLCData {
   *repeated  double  data      = 1;
   *int64    starting_point     = 2;
   *double     quality          = 3;
   *double     amount           = 4;
   *double     opening_price    = 5;
   *double     closing_price    = 6;
   *double     highest_price    = 7;
   *double     lowest_price     = 8;
   *}
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.Candles)
      io.lightcone.data.dex.CandlesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.Candles.class, io.lightcone.data.dex.Candles.Builder.class);
    }

    // Construct using io.lightcone.data.dex.Candles.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_Candles_descriptor;
    }

    public io.lightcone.data.dex.Candles getDefaultInstanceForType() {
      return io.lightcone.data.dex.Candles.getDefaultInstance();
    }

    public io.lightcone.data.dex.Candles build() {
      io.lightcone.data.dex.Candles result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.Candles buildPartial() {
      io.lightcone.data.dex.Candles result = new io.lightcone.data.dex.Candles(this);
      int from_bitField0_ = bitField0_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.Candles) {
        return mergeFrom((io.lightcone.data.dex.Candles)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.Candles other) {
      if (other == io.lightcone.data.dex.Candles.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
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
      io.lightcone.data.dex.Candles parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.Candles) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.lightcone.data.dex.Candles.OHLC> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        data_ = new java.util.ArrayList<io.lightcone.data.dex.Candles.OHLC>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        io.lightcone.data.dex.Candles.OHLC, io.lightcone.data.dex.Candles.OHLC.Builder, io.lightcone.data.dex.Candles.OHLCOrBuilder> dataBuilder_;

    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public java.util.List<io.lightcone.data.dex.Candles.OHLC> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public io.lightcone.data.dex.Candles.OHLC getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder setData(
        int index, io.lightcone.data.dex.Candles.OHLC value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder setData(
        int index, io.lightcone.data.dex.Candles.OHLC.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder addData(io.lightcone.data.dex.Candles.OHLC value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder addData(
        int index, io.lightcone.data.dex.Candles.OHLC value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder addData(
        io.lightcone.data.dex.Candles.OHLC.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder addData(
        int index, io.lightcone.data.dex.Candles.OHLC.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends io.lightcone.data.dex.Candles.OHLC> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public io.lightcone.data.dex.Candles.OHLC.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public io.lightcone.data.dex.Candles.OHLCOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public java.util.List<? extends io.lightcone.data.dex.Candles.OHLCOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public io.lightcone.data.dex.Candles.OHLC.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          io.lightcone.data.dex.Candles.OHLC.getDefaultInstance());
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public io.lightcone.data.dex.Candles.OHLC.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, io.lightcone.data.dex.Candles.OHLC.getDefaultInstance());
    }
    /**
     * <code>repeated .io.lightcone.data.dex.Candles.OHLC data = 1;</code>
     */
    public java.util.List<io.lightcone.data.dex.Candles.OHLC.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        io.lightcone.data.dex.Candles.OHLC, io.lightcone.data.dex.Candles.OHLC.Builder, io.lightcone.data.dex.Candles.OHLCOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            io.lightcone.data.dex.Candles.OHLC, io.lightcone.data.dex.Candles.OHLC.Builder, io.lightcone.data.dex.Candles.OHLCOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.Candles)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.Candles)
  private static final io.lightcone.data.dex.Candles DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.Candles();
  }

  public static io.lightcone.data.dex.Candles getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Candles>
      PARSER = new com.google.protobuf.AbstractParser<Candles>() {
    public Candles parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Candles(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<Candles> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Candles> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.Candles getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

