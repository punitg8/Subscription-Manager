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
  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListSubscriptionsRequest,
      com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> getListSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubscriptions",
      requestType = com.subscriptionmanager.v1.proto.ListSubscriptionsRequest.class,
      responseType = com.subscriptionmanager.v1.proto.ListSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListSubscriptionsRequest,
      com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> getListSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.ListSubscriptionsRequest, com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> getListSubscriptionsMethod;
    if ((getListSubscriptionsMethod = UserServiceGrpc.getListSubscriptionsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListSubscriptionsMethod = UserServiceGrpc.getListSubscriptionsMethod) == null) {
          UserServiceGrpc.getListSubscriptionsMethod = getListSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.ListSubscriptionsRequest, com.subscriptionmanager.v1.proto.ListSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.ListSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListSubscriptions"))
              .build();
        }
      }
    }
    return getListSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddSubscriptionRequest,
      com.subscriptionmanager.v1.proto.AddSubscriptionResponse> getAddSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscription",
      requestType = com.subscriptionmanager.v1.proto.AddSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.AddSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddSubscriptionRequest,
      com.subscriptionmanager.v1.proto.AddSubscriptionResponse> getAddSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.AddSubscriptionRequest, com.subscriptionmanager.v1.proto.AddSubscriptionResponse> getAddSubscriptionMethod;
    if ((getAddSubscriptionMethod = UserServiceGrpc.getAddSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddSubscriptionMethod = UserServiceGrpc.getAddSubscriptionMethod) == null) {
          UserServiceGrpc.getAddSubscriptionMethod = getAddSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.AddSubscriptionRequest, com.subscriptionmanager.v1.proto.AddSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.AddSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddSubscription"))
              .build();
        }
      }
    }
    return getAddSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewSubscription",
      requestType = com.subscriptionmanager.v1.proto.RenewSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.RenewSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RenewSubscriptionRequest, com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> getRenewSubscriptionMethod;
    if ((getRenewSubscriptionMethod = UserServiceGrpc.getRenewSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRenewSubscriptionMethod = UserServiceGrpc.getRenewSubscriptionMethod) == null) {
          UserServiceGrpc.getRenewSubscriptionMethod = getRenewSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RenewSubscriptionRequest, com.subscriptionmanager.v1.proto.RenewSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RenewSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RenewSubscription"))
              .build();
        }
      }
    }
    return getRenewSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> getRemoveSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubscription",
      requestType = com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest.class,
      responseType = com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest,
      com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> getRemoveSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest, com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> getRemoveSubscriptionMethod;
    if ((getRemoveSubscriptionMethod = UserServiceGrpc.getRemoveSubscriptionMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveSubscriptionMethod = UserServiceGrpc.getRemoveSubscriptionMethod) == null) {
          UserServiceGrpc.getRemoveSubscriptionMethod = getRemoveSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest, com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveSubscription"))
              .build();
        }
      }
    }
    return getRemoveSubscriptionMethod;
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
    public void listSubscriptions(com.subscriptionmanager.v1.proto.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public void addSubscription(com.subscriptionmanager.v1.proto.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public void renewSubscription(com.subscriptionmanager.v1.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public void removeSubscription(com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSubscriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSubscriptionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.ListSubscriptionsRequest,
                com.subscriptionmanager.v1.proto.ListSubscriptionsResponse>(
                  this, METHODID_LIST_SUBSCRIPTIONS)))
          .addMethod(
            getAddSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.AddSubscriptionRequest,
                com.subscriptionmanager.v1.proto.AddSubscriptionResponse>(
                  this, METHODID_ADD_SUBSCRIPTION)))
          .addMethod(
            getRenewSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.RenewSubscriptionRequest,
                com.subscriptionmanager.v1.proto.RenewSubscriptionResponse>(
                  this, METHODID_RENEW_SUBSCRIPTION)))
          .addMethod(
            getRemoveSubscriptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest,
                com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse>(
                  this, METHODID_REMOVE_SUBSCRIPTION)))
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
    public void listSubscriptions(com.subscriptionmanager.v1.proto.ListSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public void addSubscription(com.subscriptionmanager.v1.proto.AddSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public void renewSubscription(com.subscriptionmanager.v1.proto.RenewSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public void removeSubscription(com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSubscriptionMethod(), getCallOptions()), request, responseObserver);
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
    public com.subscriptionmanager.v1.proto.ListSubscriptionsResponse listSubscriptions(com.subscriptionmanager.v1.proto.ListSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.AddSubscriptionResponse addSubscription(com.subscriptionmanager.v1.proto.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.RenewSubscriptionResponse renewSubscription(com.subscriptionmanager.v1.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse removeSubscription(com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSubscriptionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.ListSubscriptionsResponse> listSubscriptions(
        com.subscriptionmanager.v1.proto.ListSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to add a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.AddSubscriptionResponse> addSubscription(
        com.subscriptionmanager.v1.proto.AddSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to renew a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.RenewSubscriptionResponse> renewSubscription(
        com.subscriptionmanager.v1.proto.RenewSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Request to remove a subscription from user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse> removeSubscription(
        com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SUBSCRIPTIONS = 0;
  private static final int METHODID_ADD_SUBSCRIPTION = 1;
  private static final int METHODID_RENEW_SUBSCRIPTION = 2;
  private static final int METHODID_REMOVE_SUBSCRIPTION = 3;

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
        case METHODID_LIST_SUBSCRIPTIONS:
          serviceImpl.listSubscriptions((com.subscriptionmanager.v1.proto.ListSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.ListSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIPTION:
          serviceImpl.addSubscription((com.subscriptionmanager.v1.proto.AddSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.AddSubscriptionResponse>) responseObserver);
          break;
        case METHODID_RENEW_SUBSCRIPTION:
          serviceImpl.renewSubscription((com.subscriptionmanager.v1.proto.RenewSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RenewSubscriptionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIPTION:
          serviceImpl.removeSubscription((com.subscriptionmanager.v1.proto.RemoveSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.subscriptionmanager.v1.proto.RemoveSubscriptionResponse>) responseObserver);
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
              .addMethod(getListSubscriptionsMethod())
              .addMethod(getAddSubscriptionMethod())
              .addMethod(getRenewSubscriptionMethod())
              .addMethod(getRemoveSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
