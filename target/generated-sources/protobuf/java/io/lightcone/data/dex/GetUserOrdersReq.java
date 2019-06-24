// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.GetUserOrdersReq}
 */
public  final class GetUserOrdersReq extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.GetUserOrdersReq)
    GetUserOrdersReqOrBuilder {
  // Use GetUserOrdersReq.newBuilder() to construct.
  private GetUserOrdersReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetUserOrdersReq() {
    accountId_ = 0L;
    baseTokenId_ = "";
    quoteTokenId_ = "";
    statuses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetUserOrdersReq(
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

            accountId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            baseTokenId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            quoteTokenId_ = s;
            break;
          }
          case 34: {
            io.lightcone.data.types.CursorPaging.Builder subBuilder = null;
            if (paging_ != null) {
              subBuilder = paging_.toBuilder();
            }
            paging_ = input.readMessage(io.lightcone.data.types.CursorPaging.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(paging_);
              paging_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              statuses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            statuses_.add(s);
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        statuses_ = statuses_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetUserOrdersReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetUserOrdersReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.GetUserOrdersReq.class, io.lightcone.data.dex.GetUserOrdersReq.Builder.class);
  }

  private int bitField0_;
  public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
  private long accountId_;
  /**
   * <code>optional uint64 account_id = 1;</code>
   */
  public long getAccountId() {
    return accountId_;
  }

  public static final int BASE_TOKEN_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object baseTokenId_;
  /**
   * <code>optional string base_token_id = 2;</code>
   */
  public java.lang.String getBaseTokenId() {
    java.lang.Object ref = baseTokenId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseTokenId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string base_token_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBaseTokenIdBytes() {
    java.lang.Object ref = baseTokenId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseTokenId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUOTE_TOKEN_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object quoteTokenId_;
  /**
   * <code>optional string quote_token_id = 3;</code>
   */
  public java.lang.String getQuoteTokenId() {
    java.lang.Object ref = quoteTokenId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quoteTokenId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string quote_token_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getQuoteTokenIdBytes() {
    java.lang.Object ref = quoteTokenId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quoteTokenId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGING_FIELD_NUMBER = 4;
  private io.lightcone.data.types.CursorPaging paging_;
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  public boolean hasPaging() {
    return paging_ != null;
  }
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  public io.lightcone.data.types.CursorPaging getPaging() {
    return paging_ == null ? io.lightcone.data.types.CursorPaging.getDefaultInstance() : paging_;
  }
  /**
   * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
   */
  public io.lightcone.data.types.CursorPagingOrBuilder getPagingOrBuilder() {
    return getPaging();
  }

  public static final int STATUSES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList statuses_;
  /**
   * <code>repeated string statuses = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getStatusesList() {
    return statuses_;
  }
  /**
   * <code>repeated string statuses = 5;</code>
   */
  public int getStatusesCount() {
    return statuses_.size();
  }
  /**
   * <code>repeated string statuses = 5;</code>
   */
  public java.lang.String getStatuses(int index) {
    return statuses_.get(index);
  }
  /**
   * <code>repeated string statuses = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStatusesBytes(int index) {
    return statuses_.getByteString(index);
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
    if (accountId_ != 0L) {
      output.writeUInt64(1, accountId_);
    }
    if (!getBaseTokenIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, baseTokenId_);
    }
    if (!getQuoteTokenIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, quoteTokenId_);
    }
    if (paging_ != null) {
      output.writeMessage(4, getPaging());
    }
    for (int i = 0; i < statuses_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, statuses_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, accountId_);
    }
    if (!getBaseTokenIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, baseTokenId_);
    }
    if (!getQuoteTokenIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, quoteTokenId_);
    }
    if (paging_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPaging());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < statuses_.size(); i++) {
        dataSize += computeStringSizeNoTag(statuses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStatusesList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetUserOrdersReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.GetUserOrdersReq prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.GetUserOrdersReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.GetUserOrdersReq)
      io.lightcone.data.dex.GetUserOrdersReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetUserOrdersReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetUserOrdersReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.GetUserOrdersReq.class, io.lightcone.data.dex.GetUserOrdersReq.Builder.class);
    }

    // Construct using io.lightcone.data.dex.GetUserOrdersReq.newBuilder()
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
      accountId_ = 0L;

      baseTokenId_ = "";

      quoteTokenId_ = "";

      if (pagingBuilder_ == null) {
        paging_ = null;
      } else {
        paging_ = null;
        pagingBuilder_ = null;
      }
      statuses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetUserOrdersReq_descriptor;
    }

    public io.lightcone.data.dex.GetUserOrdersReq getDefaultInstanceForType() {
      return io.lightcone.data.dex.GetUserOrdersReq.getDefaultInstance();
    }

    public io.lightcone.data.dex.GetUserOrdersReq build() {
      io.lightcone.data.dex.GetUserOrdersReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.GetUserOrdersReq buildPartial() {
      io.lightcone.data.dex.GetUserOrdersReq result = new io.lightcone.data.dex.GetUserOrdersReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.accountId_ = accountId_;
      result.baseTokenId_ = baseTokenId_;
      result.quoteTokenId_ = quoteTokenId_;
      if (pagingBuilder_ == null) {
        result.paging_ = paging_;
      } else {
        result.paging_ = pagingBuilder_.build();
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        statuses_ = statuses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.statuses_ = statuses_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.GetUserOrdersReq) {
        return mergeFrom((io.lightcone.data.dex.GetUserOrdersReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.GetUserOrdersReq other) {
      if (other == io.lightcone.data.dex.GetUserOrdersReq.getDefaultInstance()) return this;
      if (other.getAccountId() != 0L) {
        setAccountId(other.getAccountId());
      }
      if (!other.getBaseTokenId().isEmpty()) {
        baseTokenId_ = other.baseTokenId_;
        onChanged();
      }
      if (!other.getQuoteTokenId().isEmpty()) {
        quoteTokenId_ = other.quoteTokenId_;
        onChanged();
      }
      if (other.hasPaging()) {
        mergePaging(other.getPaging());
      }
      if (!other.statuses_.isEmpty()) {
        if (statuses_.isEmpty()) {
          statuses_ = other.statuses_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureStatusesIsMutable();
          statuses_.addAll(other.statuses_);
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
      io.lightcone.data.dex.GetUserOrdersReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.GetUserOrdersReq) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long accountId_ ;
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public long getAccountId() {
      return accountId_;
    }
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public Builder setAccountId(long value) {

      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public Builder clearAccountId() {

      accountId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object baseTokenId_ = "";
    /**
     * <code>optional string base_token_id = 2;</code>
     */
    public java.lang.String getBaseTokenId() {
      java.lang.Object ref = baseTokenId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseTokenId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string base_token_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBaseTokenIdBytes() {
      java.lang.Object ref = baseTokenId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseTokenId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string base_token_id = 2;</code>
     */
    public Builder setBaseTokenId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      baseTokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_token_id = 2;</code>
     */
    public Builder clearBaseTokenId() {

      baseTokenId_ = getDefaultInstance().getBaseTokenId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string base_token_id = 2;</code>
     */
    public Builder setBaseTokenIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      baseTokenId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object quoteTokenId_ = "";
    /**
     * <code>optional string quote_token_id = 3;</code>
     */
    public java.lang.String getQuoteTokenId() {
      java.lang.Object ref = quoteTokenId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quoteTokenId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string quote_token_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getQuoteTokenIdBytes() {
      java.lang.Object ref = quoteTokenId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quoteTokenId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string quote_token_id = 3;</code>
     */
    public Builder setQuoteTokenId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      quoteTokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_token_id = 3;</code>
     */
    public Builder clearQuoteTokenId() {

      quoteTokenId_ = getDefaultInstance().getQuoteTokenId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_token_id = 3;</code>
     */
    public Builder setQuoteTokenIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      quoteTokenId_ = value;
      onChanged();
      return this;
    }

    private io.lightcone.data.types.CursorPaging paging_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.CursorPaging, io.lightcone.data.types.CursorPaging.Builder, io.lightcone.data.types.CursorPagingOrBuilder> pagingBuilder_;
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public boolean hasPaging() {
      return pagingBuilder_ != null || paging_ != null;
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public io.lightcone.data.types.CursorPaging getPaging() {
      if (pagingBuilder_ == null) {
        return paging_ == null ? io.lightcone.data.types.CursorPaging.getDefaultInstance() : paging_;
      } else {
        return pagingBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public Builder setPaging(io.lightcone.data.types.CursorPaging value) {
      if (pagingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paging_ = value;
        onChanged();
      } else {
        pagingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public Builder setPaging(
        io.lightcone.data.types.CursorPaging.Builder builderForValue) {
      if (pagingBuilder_ == null) {
        paging_ = builderForValue.build();
        onChanged();
      } else {
        pagingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public Builder mergePaging(io.lightcone.data.types.CursorPaging value) {
      if (pagingBuilder_ == null) {
        if (paging_ != null) {
          paging_ =
            io.lightcone.data.types.CursorPaging.newBuilder(paging_).mergeFrom(value).buildPartial();
        } else {
          paging_ = value;
        }
        onChanged();
      } else {
        pagingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public Builder clearPaging() {
      if (pagingBuilder_ == null) {
        paging_ = null;
        onChanged();
      } else {
        paging_ = null;
        pagingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public io.lightcone.data.types.CursorPaging.Builder getPagingBuilder() {

      onChanged();
      return getPagingFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    public io.lightcone.data.types.CursorPagingOrBuilder getPagingOrBuilder() {
      if (pagingBuilder_ != null) {
        return pagingBuilder_.getMessageOrBuilder();
      } else {
        return paging_ == null ?
            io.lightcone.data.types.CursorPaging.getDefaultInstance() : paging_;
      }
    }
    /**
     * <code>optional .io.lightcone.data.types.CursorPaging paging = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.lightcone.data.types.CursorPaging, io.lightcone.data.types.CursorPaging.Builder, io.lightcone.data.types.CursorPagingOrBuilder>
        getPagingFieldBuilder() {
      if (pagingBuilder_ == null) {
        pagingBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.lightcone.data.types.CursorPaging, io.lightcone.data.types.CursorPaging.Builder, io.lightcone.data.types.CursorPagingOrBuilder>(
                getPaging(),
                getParentForChildren(),
                isClean());
        paging_ = null;
      }
      return pagingBuilder_;
    }

    private com.google.protobuf.LazyStringList statuses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStatusesIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        statuses_ = new com.google.protobuf.LazyStringArrayList(statuses_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getStatusesList() {
      return statuses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public int getStatusesCount() {
      return statuses_.size();
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public java.lang.String getStatuses(int index) {
      return statuses_.get(index);
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStatusesBytes(int index) {
      return statuses_.getByteString(index);
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public Builder setStatuses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatusesIsMutable();
      statuses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public Builder addStatuses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStatusesIsMutable();
      statuses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public Builder addAllStatuses(
        java.lang.Iterable<java.lang.String> values) {
      ensureStatusesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, statuses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public Builder clearStatuses() {
      statuses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string statuses = 5;</code>
     */
    public Builder addStatusesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureStatusesIsMutable();
      statuses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.GetUserOrdersReq)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.GetUserOrdersReq)
  private static final io.lightcone.data.dex.GetUserOrdersReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.GetUserOrdersReq();
  }

  public static io.lightcone.data.dex.GetUserOrdersReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserOrdersReq>
      PARSER = new com.google.protobuf.AbstractParser<GetUserOrdersReq>() {
    public GetUserOrdersReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetUserOrdersReq(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetUserOrdersReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserOrdersReq> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.GetUserOrdersReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

