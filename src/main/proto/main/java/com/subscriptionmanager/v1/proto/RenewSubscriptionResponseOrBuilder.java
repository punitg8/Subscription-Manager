// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

public interface RenewSubscriptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscriptionmanager.v1.proto.RenewSubscriptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.Subscription subscription = 1;</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.Subscription subscription = 1;</code>
   * @return The subscription.
   */
  com.subscriptionmanager.v1.proto.Subscription getSubscription();
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.Subscription subscription = 1;</code>
   */
  com.subscriptionmanager.v1.proto.SubscriptionOrBuilder getSubscriptionOrBuilder();

  /**
   * <pre>
   *expiry date
   * </pre>
   *
   * <code>.google.type.Date expiry_date = 2;</code>
   * @return Whether the expiryDate field is set.
   */
  boolean hasExpiryDate();
  /**
   * <pre>
   *expiry date
   * </pre>
   *
   * <code>.google.type.Date expiry_date = 2;</code>
   * @return The expiryDate.
   */
  com.google.type.Date getExpiryDate();
  /**
   * <pre>
   *expiry date
   * </pre>
   *
   * <code>.google.type.Date expiry_date = 2;</code>
   */
  com.google.type.DateOrBuilder getExpiryDateOrBuilder();
}
