// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_types.proto

package io.lightcone.data.types;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.lightcone.data.types.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .io.lightcone.data.types.ErrorCode code = 1;</code>
   */
  int getCodeValue();
  /**
   * <code>optional .io.lightcone.data.types.ErrorCode code = 1;</code>
   */
  io.lightcone.data.types.ErrorCode getCode();

  /**
   * <code>optional string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
