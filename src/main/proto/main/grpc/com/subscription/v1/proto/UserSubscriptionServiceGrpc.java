package com.subscription.v1.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *Service for user related functionalities
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: subscriptionmanager/v1/proto/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserSubscriptionServiceGrpc {

  private UserSubscriptionServiceGrpc() {}

  public static final String SERVICE_NAME = "subscriptionmanager.v1.proto.UserSubscriptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest,
      com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptions",
      requestType = com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest.class,
      responseType = com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest,
      com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest, com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;
    if ((getListUserSubscriptionsMethod = UserSubscriptionServiceGrpc.getListUserSubscriptionsMethod) == null) {
      synchronized (UserSubscriptionServiceGrpc.class) {
        if ((getListUserSubscriptionsMethod = UserSubscriptionServiceGrpc.getListUserSubscriptionsMethod) == null) {
          UserSubscriptionServiceGrpc.getListUserSubscriptionsMethod = getListUserSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest, com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSubscriptionServiceMethodDescriptorSupplier("ListUserSubscriptions"))
              .build();
        }
      }
    }
    return getListUserSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscription",
      requestType = com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> getAddUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest, com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;
    if ((getAddUserSubscriptionMethod = UserSubscriptionServiceGrpc.getAddUserSubscriptionMethod) == null) {
      synchronized (UserSubscriptionServiceGrpc.class) {
        if ((getAddUserSubscriptionMethod = UserSubscriptionServiceGrpc.getAddUserSubscriptionMethod) == null) {
          UserSubscriptionServiceGrpc.getAddUserSubscriptionMethod = getAddUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest, com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSubscriptionServiceMethodDescriptorSupplier("AddUserSubscription"))
              .build();
        }
      }
    }
    return getAddUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> getRenewUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewUserSubscription",
      requestType = com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> getRenewUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> getRenewUserSubscriptionMethod;
    if ((getRenewUserSubscriptionMethod = UserSubscriptionServiceGrpc.getRenewUserSubscriptionMethod) == null) {
      synchronized (UserSubscriptionServiceGrpc.class) {
        if ((getRenewUserSubscriptionMethod = UserSubscriptionServiceGrpc.getRenewUserSubscriptionMethod) == null) {
          UserSubscriptionServiceGrpc.getRenewUserSubscriptionMethod = getRenewUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSubscriptionServiceMethodDescriptorSupplier("RenewUserSubscription"))
              .build();
        }
      }
    }
    return getRenewUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscription",
      requestType = com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;
    if ((getRemoveUserSubscriptionMethod = UserSubscriptionServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
      synchronized (UserSubscriptionServiceGrpc.class) {
        if ((getRemoveUserSubscriptionMethod = UserSubscriptionServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
          UserSubscriptionServiceGrpc.getRemoveUserSubscriptionMethod = getRemoveUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSubscriptionServiceMethodDescriptorSupplier("RemoveUserSubscription"))
              .build();
        }
      }
    }
    return getRemoveUserSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserSubscriptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceStub>() {
        @java.lang.Override
        public UserSubscriptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSubscriptionServiceStub(channel, callOptions);
        }
      };
    return UserSubscriptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserSubscriptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceBlockingStub>() {
        @java.lang.Override
        public UserSubscriptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSubscriptionServiceBlockingStub(channel, callOptions);
        }
      };
    return UserSubscriptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserSubscriptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSubscriptionServiceFutureStub>() {
        @java.lang.Override
        public UserSubscriptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSubscriptionServiceFutureStub(channel, callOptions);
        }
      };
    return UserSubscriptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Service for user related functionalities
   * </pre>
   */
  public static abstract class UserSubscriptionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Request to list a subscription from user
     * </pre>
     */
    public void listUserSubscriptions(com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public void addUserSubscription(com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public void renewUserSubscription(com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public void removeUserSubscription(com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUserSubscriptionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest,
                com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse>(
                  this, METHODID_LIST_USER_SUBSCRIPTIONS)))
          .addMethod(
            getAddUserSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest,
                com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse>(
                  this, METHODID_ADD_USER_SUBSCRIPTION)))
          .addMethod(
            getRenewUserSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest,
                com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse>(
                  this, METHODID_RENEW_USER_SUBSCRIPTION)))
          .addMethod(
            getRemoveUserSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest,
                com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse>(
                  this, METHODID_REMOVE_USER_SUBSCRIPTION)))
          .build();
    }
  }

  /**
   * <pre>
   *Service for user related functionalities
   * </pre>
   */
  public static final class UserSubscriptionServiceStub extends io.grpc.stub.AbstractAsyncStub<UserSubscriptionServiceStub> {
    private UserSubscriptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSubscriptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSubscriptionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request to list a subscription from user
     * </pre>
     */
    public void listUserSubscriptions(com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public void addUserSubscription(com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public void renewUserSubscription(com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public void removeUserSubscription(com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service for user related functionalities
   * </pre>
   */
  public static final class UserSubscriptionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserSubscriptionServiceBlockingStub> {
    private UserSubscriptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSubscriptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSubscriptionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request to list a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse listUserSubscriptions(com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse addUserSubscription(com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse renewUserSubscription(com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse removeUserSubscription(com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service for user related functionalities
   * </pre>
   */
  public static final class UserSubscriptionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserSubscriptionServiceFutureStub> {
    private UserSubscriptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSubscriptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSubscriptionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Request to list a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse> listUserSubscriptions(
        com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse> addUserSubscription(
        com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse> renewUserSubscription(
        com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse> removeUserSubscription(
        com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USER_SUBSCRIPTIONS = 0;
  private static final int METHODID_ADD_USER_SUBSCRIPTION = 1;
  private static final int METHODID_RENEW_USER_SUBSCRIPTION = 2;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserSubscriptionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserSubscriptionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USER_SUBSCRIPTIONS:
          serviceImpl.listUserSubscriptions((com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION:
          serviceImpl.addUserSubscription((com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_RENEW_USER_SUBSCRIPTION:
          serviceImpl.renewUserSubscription((com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION:
          serviceImpl.removeUserSubscription((com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserSubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserSubscriptionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.v1.proto.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserSubscriptionService");
    }
  }

  private static final class UserSubscriptionServiceFileDescriptorSupplier
      extends UserSubscriptionServiceBaseDescriptorSupplier {
    UserSubscriptionServiceFileDescriptorSupplier() {}
  }

  private static final class UserSubscriptionServiceMethodDescriptorSupplier
      extends UserSubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserSubscriptionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserSubscriptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserSubscriptionServiceFileDescriptorSupplier())
              .addMethod(getListUserSubscriptionsMethod())
              .addMethod(getAddUserSubscriptionMethod())
              .addMethod(getRenewUserSubscriptionMethod())
              .addMethod(getRemoveUserSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
