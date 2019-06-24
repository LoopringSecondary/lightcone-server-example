// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_types.proto

package io.lightcone.data.types;

public interface TokenTickerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.types.TokenTicker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .io.lightcone.data.types.TokenID token_id = 1;</code>
   *
   * <pre>
   * token address
   * </pre>
   */
  boolean hasTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID token_id = 1;</code>
   *
   * <pre>
   * token address
   * </pre>
   */
  io.lightcone.data.types.TokenID getTokenId();
  /**
   * <code>optional .io.lightcone.data.types.TokenID token_id = 1;</code>
   *
   * <pre>
   * token address
   * </pre>
   */
  io.lightcone.data.types.TokenIDOrBuilder getTokenIdOrBuilder();

  /**
   * <code>optional double price = 2;</code>
   *
   * <pre>
   * price of current currency
   * </pre>
   */
  double getPrice();

  /**
   * <code>optional double volume_24h = 3;</code>
   *
   * <pre>
   * volume of current currency
   * </pre>
   */
  double getVolume24H();

  /**
   * <code>optional double percent_change_1h = 4;</code>
   */
  double getPercentChange1H();

  /**
   * <code>optional double percent_change_24h = 5;</code>
   */
  double getPercentChange24H();

  /**
   * <code>optional double percent_change_7d = 6;</code>
   */
  double getPercentChange7D();
}