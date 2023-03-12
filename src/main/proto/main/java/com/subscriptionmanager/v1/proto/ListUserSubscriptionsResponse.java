// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

/**
 * <pre>
 *Response to listing subscription
 * </pre>
 *
 * Protobuf type {@code subscriptionmanager.v1.proto.ListUserSubscriptionsResponse}
 */
public final class ListUserSubscriptionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)
    ListUserSubscriptionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUserSubscriptionsResponse.newBuilder() to construct.
  private ListUserSubscriptionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUserSubscriptionsResponse() {
    userSubscription_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUserSubscriptionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_ListUserSubscriptionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_ListUserSubscriptionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.class, com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.Builder.class);
  }

  public static final int USERSUBSCRIPTION_FIELD_NUMBER = 1;
  private java.util.List<com.subscriptionmanager.v1.proto.UserSubscription> userSubscription_;
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.subscriptionmanager.v1.proto.UserSubscription> getUserSubscriptionList() {
    return userSubscription_;
  }
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder> 
      getUserSubscriptionOrBuilderList() {
    return userSubscription_;
  }
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
   */
  @java.lang.Override
  public int getUserSubscriptionCount() {
    return userSubscription_.size();
  }
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
   */
  @java.lang.Override
  public com.subscriptionmanager.v1.proto.UserSubscription getUserSubscription(int index) {
    return userSubscription_.get(index);
  }
  /**
   * <pre>
   * The subscriptions from the specified user.
   * </pre>
   *
   * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
   */
  @java.lang.Override
  public com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder getUserSubscriptionOrBuilder(
      int index) {
    return userSubscription_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userSubscription_.size(); i++) {
      output.writeMessage(1, userSubscription_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userSubscription_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userSubscription_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)) {
      return super.equals(obj);
    }
    com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse other = (com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse) obj;

    if (!getUserSubscriptionList()
        .equals(other.getUserSubscriptionList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUserSubscriptionCount() > 0) {
      hash = (37 * hash) + USERSUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getUserSubscriptionList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *Response to listing subscription
   * </pre>
   *
   * Protobuf type {@code subscriptionmanager.v1.proto.ListUserSubscriptionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)
      com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_ListUserSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_ListUserSubscriptionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.class, com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.Builder.class);
    }

    // Construct using com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userSubscriptionBuilder_ == null) {
        userSubscription_ = java.util.Collections.emptyList();
      } else {
        userSubscription_ = null;
        userSubscriptionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_ListUserSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse getDefaultInstanceForType() {
      return com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse build() {
      com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse buildPartial() {
      com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse result = new com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (userSubscriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userSubscription_ = java.util.Collections.unmodifiableList(userSubscription_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userSubscription_ = userSubscription_;
      } else {
        result.userSubscription_ = userSubscriptionBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse) {
        return mergeFrom((com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse other) {
      if (other == com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.getDefaultInstance()) return this;
      if (userSubscriptionBuilder_ == null) {
        if (!other.userSubscription_.isEmpty()) {
          if (userSubscription_.isEmpty()) {
            userSubscription_ = other.userSubscription_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserSubscriptionIsMutable();
            userSubscription_.addAll(other.userSubscription_);
          }
          onChanged();
        }
      } else {
        if (!other.userSubscription_.isEmpty()) {
          if (userSubscriptionBuilder_.isEmpty()) {
            userSubscriptionBuilder_.dispose();
            userSubscriptionBuilder_ = null;
            userSubscription_ = other.userSubscription_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userSubscriptionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserSubscriptionFieldBuilder() : null;
          } else {
            userSubscriptionBuilder_.addAllMessages(other.userSubscription_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.subscriptionmanager.v1.proto.UserSubscription m =
                  input.readMessage(
                      com.subscriptionmanager.v1.proto.UserSubscription.parser(),
                      extensionRegistry);
              if (userSubscriptionBuilder_ == null) {
                ensureUserSubscriptionIsMutable();
                userSubscription_.add(m);
              } else {
                userSubscriptionBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.subscriptionmanager.v1.proto.UserSubscription> userSubscription_ =
      java.util.Collections.emptyList();
    private void ensureUserSubscriptionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userSubscription_ = new java.util.ArrayList<com.subscriptionmanager.v1.proto.UserSubscription>(userSubscription_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.subscriptionmanager.v1.proto.UserSubscription, com.subscriptionmanager.v1.proto.UserSubscription.Builder, com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder> userSubscriptionBuilder_;

    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public java.util.List<com.subscriptionmanager.v1.proto.UserSubscription> getUserSubscriptionList() {
      if (userSubscriptionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userSubscription_);
      } else {
        return userSubscriptionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public int getUserSubscriptionCount() {
      if (userSubscriptionBuilder_ == null) {
        return userSubscription_.size();
      } else {
        return userSubscriptionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public com.subscriptionmanager.v1.proto.UserSubscription getUserSubscription(int index) {
      if (userSubscriptionBuilder_ == null) {
        return userSubscription_.get(index);
      } else {
        return userSubscriptionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder setUserSubscription(
        int index, com.subscriptionmanager.v1.proto.UserSubscription value) {
      if (userSubscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserSubscriptionIsMutable();
        userSubscription_.set(index, value);
        onChanged();
      } else {
        userSubscriptionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder setUserSubscription(
        int index, com.subscriptionmanager.v1.proto.UserSubscription.Builder builderForValue) {
      if (userSubscriptionBuilder_ == null) {
        ensureUserSubscriptionIsMutable();
        userSubscription_.set(index, builderForValue.build());
        onChanged();
      } else {
        userSubscriptionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder addUserSubscription(com.subscriptionmanager.v1.proto.UserSubscription value) {
      if (userSubscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserSubscriptionIsMutable();
        userSubscription_.add(value);
        onChanged();
      } else {
        userSubscriptionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder addUserSubscription(
        int index, com.subscriptionmanager.v1.proto.UserSubscription value) {
      if (userSubscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserSubscriptionIsMutable();
        userSubscription_.add(index, value);
        onChanged();
      } else {
        userSubscriptionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder addUserSubscription(
        com.subscriptionmanager.v1.proto.UserSubscription.Builder builderForValue) {
      if (userSubscriptionBuilder_ == null) {
        ensureUserSubscriptionIsMutable();
        userSubscription_.add(builderForValue.build());
        onChanged();
      } else {
        userSubscriptionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder addUserSubscription(
        int index, com.subscriptionmanager.v1.proto.UserSubscription.Builder builderForValue) {
      if (userSubscriptionBuilder_ == null) {
        ensureUserSubscriptionIsMutable();
        userSubscription_.add(index, builderForValue.build());
        onChanged();
      } else {
        userSubscriptionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder addAllUserSubscription(
        java.lang.Iterable<? extends com.subscriptionmanager.v1.proto.UserSubscription> values) {
      if (userSubscriptionBuilder_ == null) {
        ensureUserSubscriptionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userSubscription_);
        onChanged();
      } else {
        userSubscriptionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder clearUserSubscription() {
      if (userSubscriptionBuilder_ == null) {
        userSubscription_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userSubscriptionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public Builder removeUserSubscription(int index) {
      if (userSubscriptionBuilder_ == null) {
        ensureUserSubscriptionIsMutable();
        userSubscription_.remove(index);
        onChanged();
      } else {
        userSubscriptionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public com.subscriptionmanager.v1.proto.UserSubscription.Builder getUserSubscriptionBuilder(
        int index) {
      return getUserSubscriptionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder getUserSubscriptionOrBuilder(
        int index) {
      if (userSubscriptionBuilder_ == null) {
        return userSubscription_.get(index);  } else {
        return userSubscriptionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public java.util.List<? extends com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder> 
         getUserSubscriptionOrBuilderList() {
      if (userSubscriptionBuilder_ != null) {
        return userSubscriptionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userSubscription_);
      }
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public com.subscriptionmanager.v1.proto.UserSubscription.Builder addUserSubscriptionBuilder() {
      return getUserSubscriptionFieldBuilder().addBuilder(
          com.subscriptionmanager.v1.proto.UserSubscription.getDefaultInstance());
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public com.subscriptionmanager.v1.proto.UserSubscription.Builder addUserSubscriptionBuilder(
        int index) {
      return getUserSubscriptionFieldBuilder().addBuilder(
          index, com.subscriptionmanager.v1.proto.UserSubscription.getDefaultInstance());
    }
    /**
     * <pre>
     * The subscriptions from the specified user.
     * </pre>
     *
     * <code>repeated .subscriptionmanager.v1.proto.UserSubscription userSubscription = 1;</code>
     */
    public java.util.List<com.subscriptionmanager.v1.proto.UserSubscription.Builder> 
         getUserSubscriptionBuilderList() {
      return getUserSubscriptionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.subscriptionmanager.v1.proto.UserSubscription, com.subscriptionmanager.v1.proto.UserSubscription.Builder, com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder> 
        getUserSubscriptionFieldBuilder() {
      if (userSubscriptionBuilder_ == null) {
        userSubscriptionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.subscriptionmanager.v1.proto.UserSubscription, com.subscriptionmanager.v1.proto.UserSubscription.Builder, com.subscriptionmanager.v1.proto.UserSubscriptionOrBuilder>(
                userSubscription_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userSubscription_ = null;
      }
      return userSubscriptionBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)
  }

  // @@protoc_insertion_point(class_scope:subscriptionmanager.v1.proto.ListUserSubscriptionsResponse)
  private static final com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse();
  }

  public static com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUserSubscriptionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUserSubscriptionsResponse>() {
    @java.lang.Override
    public ListUserSubscriptionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListUserSubscriptionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUserSubscriptionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

