// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

public interface AddSubscriptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscriptionmanager.v1.proto.AddSubscriptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.Subscription subscriptions = 1;</code>
   */
  java.util.List<com.subscriptionmanager.v1.proto.Subscription> 
      getSubscriptionsList();
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.Subscription subscriptions = 1;</code>
   */
  com.subscriptionmanager.v1.proto.Subscription getSubscriptions(int index);
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.Subscription subscriptions = 1;</code>
   */
  int getSubscriptionsCount();
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.Subscription subscriptions = 1;</code>
   */
  java.util.List<? extends com.subscriptionmanager.v1.proto.SubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList();
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.Subscription subscriptions = 1;</code>
   */
  com.subscriptionmanager.v1.proto.SubscriptionOrBuilder getSubscriptionsOrBuilder(
      int index);
}
