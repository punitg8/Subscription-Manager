// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.subscription.proto;

public interface SubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.subscriptionmanager.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>uint32 price = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>uint32 validity = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The validity.
   */
  int getValidity();
}
