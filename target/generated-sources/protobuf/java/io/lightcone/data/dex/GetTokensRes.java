// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.GetTokensRes}
 */
public  final class GetTokensRes extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.GetTokensRes)
    GetTokensResOrBuilder {
  // Use GetTokensRes.newBuilder() to construct.
  private GetTokensRes(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetTokensRes() {
    tokens_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetTokensRes(
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
              tokens_ = new java.util.ArrayList<io.lightcone.data.types.Token>();
              mutable_bitField0_ |= 0x00000001;
            }
            tokens_.add(input.readMessage(io.lightcone.data.types.Token.parser(), extensionRegistry));
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
        tokens_ = java.util.Collections.unmodifiableList(tokens_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensRes_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.GetTokensRes.class, io.lightcone.data.dex.GetTokensRes.Builder.class);
  }

  public static final int TOKENS_FIELD_NUMBER = 1;
  private java.util.List<io.lightcone.data.types.Token> tokens_;
  /**
   * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
   */
  public java.util.List<io.lightcone.data.types.Token> getTokensList() {
    return tokens_;
  }
  /**
   * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
   */
  public java.util.List<? extends io.lightcone.data.types.TokenOrBuilder>
      getTokensOrBuilderList() {
    return tokens_;
  }
  /**
   * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
   */
  public int getTokensCount() {
    return tokens_.size();
  }
  /**
   * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
   */
  public io.lightcone.data.types.Token getTokens(int index) {
    return tokens_.get(index);
  }
  /**
   * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
   */
  public io.lightcone.data.types.TokenOrBuilder getTokensOrBuilder(
      int index) {
    return tokens_.get(index);
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
    for (int i = 0; i < tokens_.size(); i++) {
      output.writeMessage(1, tokens_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tokens_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tokens_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.GetTokensRes prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.GetTokensRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.GetTokensRes)
      io.lightcone.data.dex.GetTokensResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.GetTokensRes.class, io.lightcone.data.dex.GetTokensRes.Builder.class);
    }

    // Construct using io.lightcone.data.dex.GetTokensRes.newBuilder()
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
        getTokensFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (tokensBuilder_ == null) {
        tokens_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tokensBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensRes_descriptor;
    }

    public io.lightcone.data.dex.GetTokensRes getDefaultInstanceForType() {
      return io.lightcone.data.dex.GetTokensRes.getDefaultInstance();
    }

    public io.lightcone.data.dex.GetTokensRes build() {
      io.lightcone.data.dex.GetTokensRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.GetTokensRes buildPartial() {
      io.lightcone.data.dex.GetTokensRes result = new io.lightcone.data.dex.GetTokensRes(this);
      int from_bitField0_ = bitField0_;
      if (tokensBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          tokens_ = java.util.Collections.unmodifiableList(tokens_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tokens_ = tokens_;
      } else {
        result.tokens_ = tokensBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.GetTokensRes) {
        return mergeFrom((io.lightcone.data.dex.GetTokensRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.GetTokensRes other) {
      if (other == io.lightcone.data.dex.GetTokensRes.getDefaultInstance()) return this;
      if (tokensBuilder_ == null) {
        if (!other.tokens_.isEmpty()) {
          if (tokens_.isEmpty()) {
            tokens_ = other.tokens_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTokensIsMutable();
            tokens_.addAll(other.tokens_);
          }
          onChanged();
        }
      } else {
        if (!other.tokens_.isEmpty()) {
          if (tokensBuilder_.isEmpty()) {
            tokensBuilder_.dispose();
            tokensBuilder_ = null;
            tokens_ = other.tokens_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tokensBuilder_ =
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getTokensFieldBuilder() : null;
          } else {
            tokensBuilder_.addAllMessages(other.tokens_);
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
      io.lightcone.data.dex.GetTokensRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.GetTokensRes) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.lightcone.data.types.Token> tokens_ =
      java.util.Collections.emptyList();
    private void ensureTokensIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        tokens_ = new java.util.ArrayList<io.lightcone.data.types.Token>(tokens_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        io.lightcone.data.types.Token, io.lightcone.data.types.Token.Builder, io.lightcone.data.types.TokenOrBuilder> tokensBuilder_;

    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public java.util.List<io.lightcone.data.types.Token> getTokensList() {
      if (tokensBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tokens_);
      } else {
        return tokensBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public int getTokensCount() {
      if (tokensBuilder_ == null) {
        return tokens_.size();
      } else {
        return tokensBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public io.lightcone.data.types.Token getTokens(int index) {
      if (tokensBuilder_ == null) {
        return tokens_.get(index);
      } else {
        return tokensBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder setTokens(
        int index, io.lightcone.data.types.Token value) {
      if (tokensBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensIsMutable();
        tokens_.set(index, value);
        onChanged();
      } else {
        tokensBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder setTokens(
        int index, io.lightcone.data.types.Token.Builder builderForValue) {
      if (tokensBuilder_ == null) {
        ensureTokensIsMutable();
        tokens_.set(index, builderForValue.build());
        onChanged();
      } else {
        tokensBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder addTokens(io.lightcone.data.types.Token value) {
      if (tokensBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensIsMutable();
        tokens_.add(value);
        onChanged();
      } else {
        tokensBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder addTokens(
        int index, io.lightcone.data.types.Token value) {
      if (tokensBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTokensIsMutable();
        tokens_.add(index, value);
        onChanged();
      } else {
        tokensBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder addTokens(
        io.lightcone.data.types.Token.Builder builderForValue) {
      if (tokensBuilder_ == null) {
        ensureTokensIsMutable();
        tokens_.add(builderForValue.build());
        onChanged();
      } else {
        tokensBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder addTokens(
        int index, io.lightcone.data.types.Token.Builder builderForValue) {
      if (tokensBuilder_ == null) {
        ensureTokensIsMutable();
        tokens_.add(index, builderForValue.build());
        onChanged();
      } else {
        tokensBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder addAllTokens(
        java.lang.Iterable<? extends io.lightcone.data.types.Token> values) {
      if (tokensBuilder_ == null) {
        ensureTokensIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tokens_);
        onChanged();
      } else {
        tokensBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder clearTokens() {
      if (tokensBuilder_ == null) {
        tokens_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tokensBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public Builder removeTokens(int index) {
      if (tokensBuilder_ == null) {
        ensureTokensIsMutable();
        tokens_.remove(index);
        onChanged();
      } else {
        tokensBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public io.lightcone.data.types.Token.Builder getTokensBuilder(
        int index) {
      return getTokensFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public io.lightcone.data.types.TokenOrBuilder getTokensOrBuilder(
        int index) {
      if (tokensBuilder_ == null) {
        return tokens_.get(index);  } else {
        return tokensBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public java.util.List<? extends io.lightcone.data.types.TokenOrBuilder>
         getTokensOrBuilderList() {
      if (tokensBuilder_ != null) {
        return tokensBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tokens_);
      }
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public io.lightcone.data.types.Token.Builder addTokensBuilder() {
      return getTokensFieldBuilder().addBuilder(
          io.lightcone.data.types.Token.getDefaultInstance());
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public io.lightcone.data.types.Token.Builder addTokensBuilder(
        int index) {
      return getTokensFieldBuilder().addBuilder(
          index, io.lightcone.data.types.Token.getDefaultInstance());
    }
    /**
     * <code>repeated .io.lightcone.data.types.Token tokens = 1;</code>
     */
    public java.util.List<io.lightcone.data.types.Token.Builder>
         getTokensBuilderList() {
      return getTokensFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        io.lightcone.data.types.Token, io.lightcone.data.types.Token.Builder, io.lightcone.data.types.TokenOrBuilder>
        getTokensFieldBuilder() {
      if (tokensBuilder_ == null) {
        tokensBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            io.lightcone.data.types.Token, io.lightcone.data.types.Token.Builder, io.lightcone.data.types.TokenOrBuilder>(
                tokens_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        tokens_ = null;
      }
      return tokensBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.GetTokensRes)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.GetTokensRes)
  private static final io.lightcone.data.dex.GetTokensRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.GetTokensRes();
  }

  public static io.lightcone.data.dex.GetTokensRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTokensRes>
      PARSER = new com.google.protobuf.AbstractParser<GetTokensRes>() {
    public GetTokensRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetTokensRes(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetTokensRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTokensRes> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.GetTokensRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
