// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.UserTransaction}
 *
 * <pre>
 * TODO: check with yadong
 * </pre>
 */
public  final class UserTransaction extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.UserTransaction)
    UserTransactionOrBuilder {
  // Use UserTransaction.newBuilder() to construct.
  private UserTransaction(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UserTransaction() {
    requestId_ = 0L;
    accountId_ = 0L;
    tokenId_ = 0;
    amount_ = "";
    submittedAt_ = 0L;
    updatedAt_ = 0L;
    status_ = "";
    transactionType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UserTransaction(
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

            requestId_ = input.readUInt64();
            break;
          }
          case 16: {

            accountId_ = input.readUInt64();
            break;
          }
          case 24: {

            tokenId_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            amount_ = s;
            break;
          }
          case 40: {

            submittedAt_ = input.readUInt64();
            break;
          }
          case 48: {

            updatedAt_ = input.readUInt64();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionType_ = s;
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
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_UserTransaction_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_UserTransaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.UserTransaction.class, io.lightcone.data.dex.UserTransaction.Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private long requestId_;
  /**
   * <code>optional uint64 request_id = 1;</code>
   */
  public long getRequestId() {
    return requestId_;
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 2;
  private long accountId_;
  /**
   * <code>optional uint64 account_id = 2;</code>
   */
  public long getAccountId() {
    return accountId_;
  }

  public static final int TOKEN_ID_FIELD_NUMBER = 3;
  private int tokenId_;
  /**
   * <code>optional uint32 token_id = 3;</code>
   */
  public int getTokenId() {
    return tokenId_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 4;
  private volatile java.lang.Object amount_;
  /**
   * <code>optional string amount = 4;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public java.lang.String getAmount() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amount_ = s;
      return s;
    }
  }
  /**
   * <code>optional string amount = 4;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  public com.google.protobuf.ByteString
      getAmountBytes() {
    java.lang.Object ref = amount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBMITTED_AT_FIELD_NUMBER = 5;
  private long submittedAt_;
  /**
   * <code>optional uint64 submitted_at = 5;</code>
   */
  public long getSubmittedAt() {
    return submittedAt_;
  }

  public static final int UPDATED_AT_FIELD_NUMBER = 6;
  private long updatedAt_;
  /**
   * <code>optional uint64 updated_at = 6;</code>
   */
  public long getUpdatedAt() {
    return updatedAt_;
  }

  public static final int STATUS_FIELD_NUMBER = 7;
  private volatile java.lang.Object status_;
  /**
   * <code>optional string status = 7;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>optional string status = 7;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_TYPE_FIELD_NUMBER = 8;
  private volatile java.lang.Object transactionType_;
  /**
   * <code>optional string transaction_type = 8;</code>
   *
   * <pre>
   * `deposit`, `withdrawal` or `transfer`
   * </pre>
   */
  public java.lang.String getTransactionType() {
    java.lang.Object ref = transactionType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionType_ = s;
      return s;
    }
  }
  /**
   * <code>optional string transaction_type = 8;</code>
   *
   * <pre>
   * `deposit`, `withdrawal` or `transfer`
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTransactionTypeBytes() {
    java.lang.Object ref = transactionType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionType_ = b;
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
    if (requestId_ != 0L) {
      output.writeUInt64(1, requestId_);
    }
    if (accountId_ != 0L) {
      output.writeUInt64(2, accountId_);
    }
    if (tokenId_ != 0) {
      output.writeUInt32(3, tokenId_);
    }
    if (!getAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, amount_);
    }
    if (submittedAt_ != 0L) {
      output.writeUInt64(5, submittedAt_);
    }
    if (updatedAt_ != 0L) {
      output.writeUInt64(6, updatedAt_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 7, status_);
    }
    if (!getTransactionTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 8, transactionType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, requestId_);
    }
    if (accountId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, accountId_);
    }
    if (tokenId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, tokenId_);
    }
    if (!getAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, amount_);
    }
    if (submittedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, submittedAt_);
    }
    if (updatedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, updatedAt_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(7, status_);
    }
    if (!getTransactionTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(8, transactionType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.UserTransaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.UserTransaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.UserTransaction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.UserTransaction prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.UserTransaction}
   *
   * <pre>
   * TODO: check with yadong
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.UserTransaction)
      io.lightcone.data.dex.UserTransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_UserTransaction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_UserTransaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.UserTransaction.class, io.lightcone.data.dex.UserTransaction.Builder.class);
    }

    // Construct using io.lightcone.data.dex.UserTransaction.newBuilder()
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
      requestId_ = 0L;

      accountId_ = 0L;

      tokenId_ = 0;

      amount_ = "";

      submittedAt_ = 0L;

      updatedAt_ = 0L;

      status_ = "";

      transactionType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_UserTransaction_descriptor;
    }

    public io.lightcone.data.dex.UserTransaction getDefaultInstanceForType() {
      return io.lightcone.data.dex.UserTransaction.getDefaultInstance();
    }

    public io.lightcone.data.dex.UserTransaction build() {
      io.lightcone.data.dex.UserTransaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.UserTransaction buildPartial() {
      io.lightcone.data.dex.UserTransaction result = new io.lightcone.data.dex.UserTransaction(this);
      result.requestId_ = requestId_;
      result.accountId_ = accountId_;
      result.tokenId_ = tokenId_;
      result.amount_ = amount_;
      result.submittedAt_ = submittedAt_;
      result.updatedAt_ = updatedAt_;
      result.status_ = status_;
      result.transactionType_ = transactionType_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.UserTransaction) {
        return mergeFrom((io.lightcone.data.dex.UserTransaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.UserTransaction other) {
      if (other == io.lightcone.data.dex.UserTransaction.getDefaultInstance()) return this;
      if (other.getRequestId() != 0L) {
        setRequestId(other.getRequestId());
      }
      if (other.getAccountId() != 0L) {
        setAccountId(other.getAccountId());
      }
      if (other.getTokenId() != 0) {
        setTokenId(other.getTokenId());
      }
      if (!other.getAmount().isEmpty()) {
        amount_ = other.amount_;
        onChanged();
      }
      if (other.getSubmittedAt() != 0L) {
        setSubmittedAt(other.getSubmittedAt());
      }
      if (other.getUpdatedAt() != 0L) {
        setUpdatedAt(other.getUpdatedAt());
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (!other.getTransactionType().isEmpty()) {
        transactionType_ = other.transactionType_;
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
      io.lightcone.data.dex.UserTransaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.UserTransaction) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long requestId_ ;
    /**
     * <code>optional uint64 request_id = 1;</code>
     */
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <code>optional uint64 request_id = 1;</code>
     */
    public Builder setRequestId(long value) {

      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 request_id = 1;</code>
     */
    public Builder clearRequestId() {

      requestId_ = 0L;
      onChanged();
      return this;
    }

    private long accountId_ ;
    /**
     * <code>optional uint64 account_id = 2;</code>
     */
    public long getAccountId() {
      return accountId_;
    }
    /**
     * <code>optional uint64 account_id = 2;</code>
     */
    public Builder setAccountId(long value) {

      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 account_id = 2;</code>
     */
    public Builder clearAccountId() {

      accountId_ = 0L;
      onChanged();
      return this;
    }

    private int tokenId_ ;
    /**
     * <code>optional uint32 token_id = 3;</code>
     */
    public int getTokenId() {
      return tokenId_;
    }
    /**
     * <code>optional uint32 token_id = 3;</code>
     */
    public Builder setTokenId(int value) {

      tokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 token_id = 3;</code>
     */
    public Builder clearTokenId() {

      tokenId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object amount_ = "";
    /**
     * <code>optional string amount = 4;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public java.lang.String getAmount() {
      java.lang.Object ref = amount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string amount = 4;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public com.google.protobuf.ByteString
        getAmountBytes() {
      java.lang.Object ref = amount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string amount = 4;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string amount = 4;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder clearAmount() {

      amount_ = getDefaultInstance().getAmount();
      onChanged();
      return this;
    }
    /**
     * <code>optional string amount = 4;</code>
     *
     * <pre>
     * DVS
     * </pre>
     */
    public Builder setAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      amount_ = value;
      onChanged();
      return this;
    }

    private long submittedAt_ ;
    /**
     * <code>optional uint64 submitted_at = 5;</code>
     */
    public long getSubmittedAt() {
      return submittedAt_;
    }
    /**
     * <code>optional uint64 submitted_at = 5;</code>
     */
    public Builder setSubmittedAt(long value) {

      submittedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 submitted_at = 5;</code>
     */
    public Builder clearSubmittedAt() {

      submittedAt_ = 0L;
      onChanged();
      return this;
    }

    private long updatedAt_ ;
    /**
     * <code>optional uint64 updated_at = 6;</code>
     */
    public long getUpdatedAt() {
      return updatedAt_;
    }
    /**
     * <code>optional uint64 updated_at = 6;</code>
     */
    public Builder setUpdatedAt(long value) {

      updatedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 updated_at = 6;</code>
     */
    public Builder clearUpdatedAt() {

      updatedAt_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>optional string status = 7;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string status = 7;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string status = 7;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string status = 7;</code>
     */
    public Builder clearStatus() {

      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>optional string status = 7;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      status_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transactionType_ = "";
    /**
     * <code>optional string transaction_type = 8;</code>
     *
     * <pre>
     * `deposit`, `withdrawal` or `transfer`
     * </pre>
     */
    public java.lang.String getTransactionType() {
      java.lang.Object ref = transactionType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string transaction_type = 8;</code>
     *
     * <pre>
     * `deposit`, `withdrawal` or `transfer`
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTransactionTypeBytes() {
      java.lang.Object ref = transactionType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string transaction_type = 8;</code>
     *
     * <pre>
     * `deposit`, `withdrawal` or `transfer`
     * </pre>
     */
    public Builder setTransactionType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      transactionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string transaction_type = 8;</code>
     *
     * <pre>
     * `deposit`, `withdrawal` or `transfer`
     * </pre>
     */
    public Builder clearTransactionType() {

      transactionType_ = getDefaultInstance().getTransactionType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string transaction_type = 8;</code>
     *
     * <pre>
     * `deposit`, `withdrawal` or `transfer`
     * </pre>
     */
    public Builder setTransactionTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      transactionType_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.UserTransaction)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.UserTransaction)
  private static final io.lightcone.data.dex.UserTransaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.UserTransaction();
  }

  public static io.lightcone.data.dex.UserTransaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTransaction>
      PARSER = new com.google.protobuf.AbstractParser<UserTransaction>() {
    public UserTransaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UserTransaction(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UserTransaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTransaction> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.UserTransaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

