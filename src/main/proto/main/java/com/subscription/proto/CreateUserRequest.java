// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.subscription.proto;

/**
 * Protobuf type {@code com.subscriptionmanager.CreateUserRequest}
 */
public final class CreateUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.subscriptionmanager.CreateUserRequest)
    CreateUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUserRequest.newBuilder() to construct.
  private CreateUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUserRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUserRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscription.proto.Message.internal_static_com_subscriptionmanager_CreateUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscription.proto.Message.internal_static_com_subscriptionmanager_CreateUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscription.proto.CreateUserRequest.class, com.subscription.proto.CreateUserRequest.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private com.subscription.proto.User user_;
  /**
   * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The user.
   */
  @java.lang.Override
  public com.subscription.proto.User getUser() {
    return user_ == null ? com.subscription.proto.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.subscription.proto.UserOrBuilder getUserOrBuilder() {
    return getUser();
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
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
    if (!(obj instanceof com.subscription.proto.CreateUserRequest)) {
      return super.equals(obj);
    }
    com.subscription.proto.CreateUserRequest other = (com.subscription.proto.CreateUserRequest) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscription.proto.CreateUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscription.proto.CreateUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscription.proto.CreateUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscription.proto.CreateUserRequest parseFrom(
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
  public static Builder newBuilder(com.subscription.proto.CreateUserRequest prototype) {
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
   * Protobuf type {@code com.subscriptionmanager.CreateUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.subscriptionmanager.CreateUserRequest)
      com.subscription.proto.CreateUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscription.proto.Message.internal_static_com_subscriptionmanager_CreateUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscription.proto.Message.internal_static_com_subscriptionmanager_CreateUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscription.proto.CreateUserRequest.class, com.subscription.proto.CreateUserRequest.Builder.class);
    }

    // Construct using com.subscription.proto.CreateUserRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscription.proto.Message.internal_static_com_subscriptionmanager_CreateUserRequest_descriptor;
    }

    @java.lang.Override
    public com.subscription.proto.CreateUserRequest getDefaultInstanceForType() {
      return com.subscription.proto.CreateUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscription.proto.CreateUserRequest build() {
      com.subscription.proto.CreateUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscription.proto.CreateUserRequest buildPartial() {
      com.subscription.proto.CreateUserRequest result = new com.subscription.proto.CreateUserRequest(this);
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
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
      if (other instanceof com.subscription.proto.CreateUserRequest) {
        return mergeFrom((com.subscription.proto.CreateUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscription.proto.CreateUserRequest other) {
      if (other == com.subscription.proto.CreateUserRequest.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
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
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.subscription.proto.User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscription.proto.User, com.subscription.proto.User.Builder, com.subscription.proto.UserOrBuilder> userBuilder_;
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The user.
     */
    public com.subscription.proto.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.subscription.proto.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUser(com.subscription.proto.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUser(
        com.subscription.proto.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUser(com.subscription.proto.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.subscription.proto.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.subscription.proto.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.subscription.proto.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.subscription.proto.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.com.subscriptionmanager.User user = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscription.proto.User, com.subscription.proto.User.Builder, com.subscription.proto.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.subscription.proto.User, com.subscription.proto.User.Builder, com.subscription.proto.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.subscriptionmanager.CreateUserRequest)
  }

  // @@protoc_insertion_point(class_scope:com.subscriptionmanager.CreateUserRequest)
  private static final com.subscription.proto.CreateUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscription.proto.CreateUserRequest();
  }

  public static com.subscription.proto.CreateUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUserRequest>() {
    @java.lang.Override
    public CreateUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscription.proto.CreateUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

