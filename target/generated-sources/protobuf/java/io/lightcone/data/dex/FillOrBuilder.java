// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

public interface FillOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.dex.Fill)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 uuid = 1;</code>
   */
  long getUuid();

  /**
   * <code>optional uint64 order_uuid = 2;</code>
   */
  long getOrderUuid();

  /**
   * <code>optional bool is_taker = 3;</code>
   */
  boolean getIsTaker();

  /**
   * <code>optional bool is_sell = 4;</code>
   */
  boolean getIsSell();

  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  boolean hasBaseTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  io.lightcone.data.types.TokenID getBaseTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID base_token_id = 5;</code>
   */
  io.lightcone.data.types.TokenIDOrBuilder getBaseTokenIdOrBuilder();

  /**
   * <code>optional string base_fill_amount = 6;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  java.lang.String getBaseFillAmount();
  /**
   * <code>optional string base_fill_amount = 6;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  com.google.protobuf.ByteString
      getBaseFillAmountBytes();

  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  boolean hasQuoteTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  io.lightcone.data.types.TokenID getQuoteTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID quote_token_id = 7;</code>
   */
  io.lightcone.data.types.TokenIDOrBuilder getQuoteTokenIdOrBuilder();

  /**
   * <code>optional string quote_fill_amount = 8;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  java.lang.String getQuoteFillAmount();
  /**
   * <code>optional string quote_fill_amount = 8;</code>
   *
   * <pre>
   * DVS
   * </pre>
   */
  com.google.protobuf.ByteString
      getQuoteFillAmountBytes();

  /**
   * <code>optional uint64 timestamp = 9;</code>
   */
  long getTimestamp();
}
