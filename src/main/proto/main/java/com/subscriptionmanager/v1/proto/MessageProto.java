// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscriptionmanager/v1/proto/message.proto

package com.subscriptionmanager.v1.proto;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_News_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_News_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_Genre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_Genre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_CreateGenreRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_CreateGenreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_Subscription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_Subscription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_CreateSubscriptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_CreateSubscriptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_ListSubscriptionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_ListSubscriptionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_AddSubscriptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_AddSubscriptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_RenewSubscriptionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_RenewSubscriptionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_Newsletter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_Newsletter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriptionmanager_v1_proto_NewsletterMailInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscriptionmanager_v1_proto_NewsletterMailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*subscriptionmanager/v1/proto/message.p" +
      "roto\022\034subscriptionmanager.v1.proto\032\037goog" +
      "le/api/field_behavior.proto\"\334\001\n\004User\022\021\n\004" +
      "name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340" +
      "A\002\022\025\n\010email_id\030\003 \001(\tB\003\340A\002\022\025\n\010password\030\004 " +
      "\001(\tB\003\340A\002\022:\n\004role\030\005 \001(\0162\'.subscriptionman" +
      "ager.v1.proto.User.RoleB\003\340A\002\"<\n\004Role\022\024\n\020" +
      "ROLE_UNSPECIFIED\020\000\022\r\n\tROLE_USER\020\001\022\017\n\013ROL" +
      "E_WRITER\020\002\"J\n\021CreateUserRequest\0225\n\004user\030" +
      "\001 \001(\0132\".subscriptionmanager.v1.proto.Use" +
      "rB\003\340A\002\"G\n\004News\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\022\n\005tit" +
      "le\030\002 \001(\tB\003\340A\002\022\030\n\013description\030\003 \001(\tB\003\340A\002\"" +
      "_\n\021CreateNewsRequest\022\023\n\006parent\030\001 \001(\tB\003\340A" +
      "\002\0225\n\004news\030\002 \001(\0132\".subscriptionmanager.v1" +
      ".proto.NewsB\003\340A\002\"5\n\005Genre\022\021\n\004name\030\001 \001(\tB" +
      "\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\"b\n\022Creat" +
      "eGenreRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\0227\n\005ge" +
      "nre\030\002 \001(\0132#.subscriptionmanager.v1.proto" +
      ".GenreB\003\340A\002\"g\n\014Subscription\022\021\n\004name\030\001 \001(" +
      "\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\022\n\005pri" +
      "ce\030\003 \001(\005B\003\340A\002\022\025\n\010validity\030\004 \001(\005B\003\340A\002\"b\n\031" +
      "CreateSubscriptionRequest\022E\n\014subscriptio" +
      "n\030\001 \001(\0132*.subscriptionmanager.v1.proto.S" +
      "ubscriptionB\003\340A\002\"/\n\030ListSubscriptionsReq" +
      "uest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\"]\n\031ListSubscri" +
      "ptionsResponse\022@\n\014subscription\030\001 \003(\0132*.s" +
      "ubscriptionmanager.v1.proto.Subscription" +
      "\"K\n\026AddSubscriptionRequest\022\023\n\006parent\030\001 \001" +
      "(\tB\003\340A\002\022\034\n\017subscription_id\030\002 \001(\tB\003\340A\002\"\\\n" +
      "\027AddSubscriptionResponse\022A\n\rsubscription" +
      "s\030\001 \003(\0132*.subscriptionmanager.v1.proto.S" +
      "ubscription\"O\n\031RemoveSubscriptionRequest" +
      "\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\035\n\020subscription_ui" +
      "d\030\002 \001(\tB\003\340A\002\"_\n\032RemoveSubscriptionRespon" +
      "se\022A\n\rsubscriptions\030\001 \003(\0132*.subscription" +
      "manager.v1.proto.Subscription\"N\n\030RenewSu" +
      "bscriptionRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\035" +
      "\n\020subscription_uid\030\002 \001(\tB\003\340A\002\"^\n\031RenewSu" +
      "bscriptionResponse\022A\n\rsubscriptions\030\001 \003(" +
      "\0132*.subscriptionmanager.v1.proto.Subscri" +
      "ption\"\032\n\nNewsletter\022\014\n\004news\030\001 \003(\t\"d\n\022New" +
      "sletterMailInfo\022<\n\nnewsletter\030\001 \001(\0132(.su" +
      "bscriptionmanager.v1.proto.Newsletter\022\020\n" +
      "\010email_id\030\002 \003(\tB2\n com.subscriptionmanag" +
      "er.v1.protoB\014MessageProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_subscriptionmanager_v1_proto_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_subscriptionmanager_v1_proto_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_User_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "EmailId", "Password", "Role", });
    internal_static_subscriptionmanager_v1_proto_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_subscriptionmanager_v1_proto_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_CreateUserRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_subscriptionmanager_v1_proto_News_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_subscriptionmanager_v1_proto_News_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_News_descriptor,
        new java.lang.String[] { "Name", "Title", "Description", });
    internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_CreateNewsRequest_descriptor,
        new java.lang.String[] { "Parent", "News", });
    internal_static_subscriptionmanager_v1_proto_Genre_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_subscriptionmanager_v1_proto_Genre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_Genre_descriptor,
        new java.lang.String[] { "Name", "DisplayName", });
    internal_static_subscriptionmanager_v1_proto_CreateGenreRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_subscriptionmanager_v1_proto_CreateGenreRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_CreateGenreRequest_descriptor,
        new java.lang.String[] { "Parent", "Genre", });
    internal_static_subscriptionmanager_v1_proto_Subscription_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_subscriptionmanager_v1_proto_Subscription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_Subscription_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Price", "Validity", });
    internal_static_subscriptionmanager_v1_proto_CreateSubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_subscriptionmanager_v1_proto_CreateSubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_CreateSubscriptionRequest_descriptor,
        new java.lang.String[] { "Subscription", });
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_ListSubscriptionsRequest_descriptor,
        new java.lang.String[] { "Parent", });
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_subscriptionmanager_v1_proto_ListSubscriptionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_ListSubscriptionsResponse_descriptor,
        new java.lang.String[] { "Subscription", });
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_AddSubscriptionRequest_descriptor,
        new java.lang.String[] { "Parent", "SubscriptionId", });
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_subscriptionmanager_v1_proto_AddSubscriptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_AddSubscriptionResponse_descriptor,
        new java.lang.String[] { "Subscriptions", });
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionRequest_descriptor,
        new java.lang.String[] { "Parent", "SubscriptionUid", });
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_RemoveSubscriptionResponse_descriptor,
        new java.lang.String[] { "Subscriptions", });
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_RenewSubscriptionRequest_descriptor,
        new java.lang.String[] { "Parent", "SubscriptionUid", });
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_subscriptionmanager_v1_proto_RenewSubscriptionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_RenewSubscriptionResponse_descriptor,
        new java.lang.String[] { "Subscriptions", });
    internal_static_subscriptionmanager_v1_proto_Newsletter_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_subscriptionmanager_v1_proto_Newsletter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_Newsletter_descriptor,
        new java.lang.String[] { "News", });
    internal_static_subscriptionmanager_v1_proto_NewsletterMailInfo_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_subscriptionmanager_v1_proto_NewsletterMailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscriptionmanager_v1_proto_NewsletterMailInfo_descriptor,
        new java.lang.String[] { "Newsletter", "EmailId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
