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
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "subscriptionmanager.v1.proto.UserService";

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
    if ((getListUserSubscriptionsMethod = UserServiceGrpc.getListUserSubscriptionsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUserSubscriptionsMethod = UserServiceGrpc.getListUserSubscriptionsMethod) == null) {
          UserServiceGrpc.getListUserSubscriptionsMethod = getListUserSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest, com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListUserSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListUserSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUserSubscriptions"))
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
    if ((getAddUserSubscriptionMethod = UserServiceGrpc.getAddUserSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserSubscriptionMethod = UserServiceGrpc.getAddUserSubscriptionMethod) == null) {
          UserServiceGrpc.getAddUserSubscriptionMethod = getAddUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest, com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddUserSubscription"))
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
    if ((getRenewUserSubscriptionMethod = UserServiceGrpc.getRenewUserSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRenewUserSubscriptionMethod = UserServiceGrpc.getRenewUserSubscriptionMethod) == null) {
          UserServiceGrpc.getRenewUserSubscriptionMethod = getRenewUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RenewUserSubscription"))
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
    if ((getRemoveUserSubscriptionMethod = UserServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveUserSubscriptionMethod = UserServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
          UserServiceGrpc.getRemoveUserSubscriptionMethod = getRemoveUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest, com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveUserSubscription"))
              .build();
        }
      }
    }
    return getRemoveUserSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *Service for user related functionalities
   * </pre>
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

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
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
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
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
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
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
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
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.subscription.v1.proto.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
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
