// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

/**
 * <pre>
 *Request to create new news
 * </pre>
 *
 * Protobuf type {@code subscriptionmanager.v1.proto.CreateNewsRequest}
 */
public final class CreateNewsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subscriptionmanager.v1.proto.CreateNewsRequest)
    CreateNewsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNewsRequest.newBuilder() to construct.
  private CreateNewsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNewsRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNewsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.subscriptionmanager.v1.proto.CreateNewsRequest.class, com.subscriptionmanager.v1.proto.CreateNewsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The parent resource where this news will be created.
   * Format: genres/{genre}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parent resource where this news will be created.
   * Format: genres/{genre}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWS_FIELD_NUMBER = 2;
  private com.subscriptionmanager.v1.proto.News news_;
  /**
   * <pre>
   *The news to create
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the news field is set.
   */
  @java.lang.Override
  public boolean hasNews() {
    return news_ != null;
  }
  /**
   * <pre>
   *The news to create
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The news.
   */
  @java.lang.Override
  public com.subscriptionmanager.v1.proto.News getNews() {
    return news_ == null ? com.subscriptionmanager.v1.proto.News.getDefaultInstance() : news_;
  }
  /**
   * <pre>
   *The news to create
   * </pre>
   *
   * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.subscriptionmanager.v1.proto.NewsOrBuilder getNewsOrBuilder() {
    return getNews();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (news_ != null) {
      output.writeMessage(2, getNews());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (news_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNews());
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
    if (!(obj instanceof com.subscriptionmanager.v1.proto.CreateNewsRequest)) {
      return super.equals(obj);
    }
    com.subscriptionmanager.v1.proto.CreateNewsRequest other = (com.subscriptionmanager.v1.proto.CreateNewsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasNews() != other.hasNews()) return false;
    if (hasNews()) {
      if (!getNews()
          .equals(other.getNews())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasNews()) {
      hash = (37 * hash) + NEWS_FIELD_NUMBER;
      hash = (53 * hash) + getNews().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.subscriptionmanager.v1.proto.CreateNewsRequest parseFrom(
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
  public static Builder newBuilder(com.subscriptionmanager.v1.proto.CreateNewsRequest prototype) {
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
   *Request to create new news
   * </pre>
   *
   * Protobuf type {@code subscriptionmanager.v1.proto.CreateNewsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subscriptionmanager.v1.proto.CreateNewsRequest)
      com.subscriptionmanager.v1.proto.CreateNewsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.subscriptionmanager.v1.proto.CreateNewsRequest.class, com.subscriptionmanager.v1.proto.CreateNewsRequest.Builder.class);
    }

    // Construct using com.subscriptionmanager.v1.proto.CreateNewsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (newsBuilder_ == null) {
        news_ = null;
      } else {
        news_ = null;
        newsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.subscriptionmanager.v1.proto.MessageProto.internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor;
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.CreateNewsRequest getDefaultInstanceForType() {
      return com.subscriptionmanager.v1.proto.CreateNewsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.CreateNewsRequest build() {
      com.subscriptionmanager.v1.proto.CreateNewsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.subscriptionmanager.v1.proto.CreateNewsRequest buildPartial() {
      com.subscriptionmanager.v1.proto.CreateNewsRequest result = new com.subscriptionmanager.v1.proto.CreateNewsRequest(this);
      result.parent_ = parent_;
      if (newsBuilder_ == null) {
        result.news_ = news_;
      } else {
        result.news_ = newsBuilder_.build();
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
      if (other instanceof com.subscriptionmanager.v1.proto.CreateNewsRequest) {
        return mergeFrom((com.subscriptionmanager.v1.proto.CreateNewsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.subscriptionmanager.v1.proto.CreateNewsRequest other) {
      if (other == com.subscriptionmanager.v1.proto.CreateNewsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasNews()) {
        mergeNews(other.getNews());
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
              parent_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNewsFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The parent resource where this news will be created.
     * Format: genres/{genre}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parent resource where this news will be created.
     * Format: genres/{genre}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parent resource where this news will be created.
     * Format: genres/{genre}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource where this news will be created.
     * Format: genres/{genre}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parent resource where this news will be created.
     * Format: genres/{genre}
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.subscriptionmanager.v1.proto.News news_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionmanager.v1.proto.News, com.subscriptionmanager.v1.proto.News.Builder, com.subscriptionmanager.v1.proto.NewsOrBuilder> newsBuilder_;
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the news field is set.
     */
    public boolean hasNews() {
      return newsBuilder_ != null || news_ != null;
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The news.
     */
    public com.subscriptionmanager.v1.proto.News getNews() {
      if (newsBuilder_ == null) {
        return news_ == null ? com.subscriptionmanager.v1.proto.News.getDefaultInstance() : news_;
      } else {
        return newsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNews(com.subscriptionmanager.v1.proto.News value) {
      if (newsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        news_ = value;
        onChanged();
      } else {
        newsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNews(
        com.subscriptionmanager.v1.proto.News.Builder builderForValue) {
      if (newsBuilder_ == null) {
        news_ = builderForValue.build();
        onChanged();
      } else {
        newsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNews(com.subscriptionmanager.v1.proto.News value) {
      if (newsBuilder_ == null) {
        if (news_ != null) {
          news_ =
            com.subscriptionmanager.v1.proto.News.newBuilder(news_).mergeFrom(value).buildPartial();
        } else {
          news_ = value;
        }
        onChanged();
      } else {
        newsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNews() {
      if (newsBuilder_ == null) {
        news_ = null;
        onChanged();
      } else {
        news_ = null;
        newsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.subscriptionmanager.v1.proto.News.Builder getNewsBuilder() {
      
      onChanged();
      return getNewsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.subscriptionmanager.v1.proto.NewsOrBuilder getNewsOrBuilder() {
      if (newsBuilder_ != null) {
        return newsBuilder_.getMessageOrBuilder();
      } else {
        return news_ == null ?
            com.subscriptionmanager.v1.proto.News.getDefaultInstance() : news_;
      }
    }
    /**
     * <pre>
     *The news to create
     * </pre>
     *
     * <code>.subscriptionmanager.v1.proto.News news = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.subscriptionmanager.v1.proto.News, com.subscriptionmanager.v1.proto.News.Builder, com.subscriptionmanager.v1.proto.NewsOrBuilder> 
        getNewsFieldBuilder() {
      if (newsBuilder_ == null) {
        newsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.subscriptionmanager.v1.proto.News, com.subscriptionmanager.v1.proto.News.Builder, com.subscriptionmanager.v1.proto.NewsOrBuilder>(
                getNews(),
                getParentForChildren(),
                isClean());
        news_ = null;
      }
      return newsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:subscriptionmanager.v1.proto.CreateNewsRequest)
  }

  // @@protoc_insertion_point(class_scope:subscriptionmanager.v1.proto.CreateNewsRequest)
  private static final com.subscriptionmanager.v1.proto.CreateNewsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.subscriptionmanager.v1.proto.CreateNewsRequest();
  }

  public static com.subscriptionmanager.v1.proto.CreateNewsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNewsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNewsRequest>() {
    @java.lang.Override
    public CreateNewsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateNewsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNewsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.subscriptionmanager.v1.proto.CreateNewsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

