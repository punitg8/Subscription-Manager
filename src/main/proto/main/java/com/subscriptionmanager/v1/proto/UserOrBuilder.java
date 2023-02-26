// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscriptionmanager.v1.proto.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *The unique identification id of the user
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   *The unique identification id of the user
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *The name of the user which would be displayed
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   *The name of the user which would be displayed
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   *The email id of the user
   * </pre>
   *
   * <code>string email_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The emailId.
   */
  java.lang.String getEmailId();
  /**
   * <pre>
   *The email id of the user
   * </pre>
   *
   * <code>string email_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for emailId.
   */
  com.google.protobuf.ByteString
      getEmailIdBytes();

  /**
   * <pre>
   *The password of the user
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   *The password of the user
   * </pre>
   *
   * <code>string password = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   *The role of the user
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.User.Role role = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   * <pre>
   *The role of the user
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.User.Role role = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The role.
   */
  com.subscriptionmanager.v1.proto.User.Role getRole();
}
