// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.subscription.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.subscriptionmanager.User)
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
   * <code>string email_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The emailId.
   */
  java.lang.String getEmailId();
  /**
   * <code>string email_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for emailId.
   */
  com.google.protobuf.ByteString
      getEmailIdBytes();

  /**
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>.com.subscriptionmanager.User.Role role = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <code>.com.subscriptionmanager.User.Role role = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The role.
   */
  com.subscription.proto.User.Role getRole();
}
