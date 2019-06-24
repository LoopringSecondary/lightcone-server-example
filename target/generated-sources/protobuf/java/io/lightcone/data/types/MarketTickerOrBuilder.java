// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_types.proto

package io.lightcone.data.types;

public interface MarketTickerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.types.MarketTicker)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string base_token = 1;</code>
   *
   * <pre>
   * base token address
   * </pre>
   */
  java.lang.String getBaseToken();
  /**
   * <code>optional string base_token = 1;</code>
   *
   * <pre>
   * base token address
   * </pre>
   */
  com.google.protobuf.ByteString
      getBaseTokenBytes();

  /**
   * <code>optional string quote_token = 2;</code>
   *
   * <pre>
   * quote token address
   * </pre>
   */
  java.lang.String getQuoteToken();
  /**
   * <code>optional string quote_token = 2;</code>
   *
   * <pre>
   * quote token address
   * </pre>
   */
  com.google.protobuf.ByteString
      getQuoteTokenBytes();

  /**
   * <code>optional double exchange_rate = 3;</code>
   *
   * <pre>
   * exchange rate for base token to quote token
   * </pre>
   */
  double getExchangeRate();

  /**
   * <code>optional double price = 4;</code>
   *
   * <pre>
   * price of quote currency
   * </pre>
   */
  double getPrice();

  /**
   * <code>optional double volume_24h = 5;</code>
   *
   * <pre>
   * volume of quote token
   * </pre>
   */
  double getVolume24H();

  /**
   * <code>optional double percent_change_1h = 6;</code>
   */
  double getPercentChange1H();

  /**
   * <code>optional double percent_change_24h = 7;</code>
   */
  double getPercentChange24H();

  /**
   * <code>optional double percent_change_7d = 8;</code>
   */
  double getPercentChange7D();
}
