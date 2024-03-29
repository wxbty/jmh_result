// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Tracing.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public final class Tracing {
  private Tracing() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentObject_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentReference_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SpanObject_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SpanObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_Log_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_Log_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_ID_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_ID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SegmentCollection_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SegmentCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SpanAttachedEvent_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SpanAttachedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_skywalking_v3_SpanAttachedEvent_SpanReference_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_skywalking_v3_SpanAttachedEvent_SpanReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034language-agent/Tracing.proto\022\rskywalki" +
      "ng.v3\032\023common/Common.proto\032\024common/Comma" +
      "nd.proto\"\243\001\n\rSegmentObject\022\017\n\007traceId\030\001 " +
      "\001(\t\022\026\n\016traceSegmentId\030\002 \001(\t\022(\n\005spans\030\003 \003" +
      "(\0132\031.skywalking.v3.SpanObject\022\017\n\007service" +
      "\030\004 \001(\t\022\027\n\017serviceInstance\030\005 \001(\t\022\025\n\risSiz" +
      "eLimited\030\006 \001(\010\"\360\001\n\020SegmentReference\022\'\n\007r" +
      "efType\030\001 \001(\0162\026.skywalking.v3.RefType\022\017\n\007" +
      "traceId\030\002 \001(\t\022\034\n\024parentTraceSegmentId\030\003 " +
      "\001(\t\022\024\n\014parentSpanId\030\004 \001(\005\022\025\n\rparentServi" +
      "ce\030\005 \001(\t\022\035\n\025parentServiceInstance\030\006 \001(\t\022" +
      "\026\n\016parentEndpoint\030\007 \001(\t\022 \n\030networkAddres" +
      "sUsedAtPeer\030\010 \001(\t\"\221\003\n\nSpanObject\022\016\n\006span" +
      "Id\030\001 \001(\005\022\024\n\014parentSpanId\030\002 \001(\005\022\021\n\tstartT" +
      "ime\030\003 \001(\003\022\017\n\007endTime\030\004 \001(\003\022-\n\004refs\030\005 \003(\013" +
      "2\037.skywalking.v3.SegmentReference\022\025\n\rope" +
      "rationName\030\006 \001(\t\022\014\n\004peer\030\007 \001(\t\022)\n\010spanTy" +
      "pe\030\010 \001(\0162\027.skywalking.v3.SpanType\022+\n\tspa" +
      "nLayer\030\t \001(\0162\030.skywalking.v3.SpanLayer\022\023" +
      "\n\013componentId\030\n \001(\005\022\017\n\007isError\030\013 \001(\010\022/\n\004" +
      "tags\030\014 \003(\0132!.skywalking.v3.KeyStringValu" +
      "ePair\022 \n\004logs\030\r \003(\0132\022.skywalking.v3.Log\022" +
      "\024\n\014skipAnalysis\030\016 \001(\010\"D\n\003Log\022\014\n\004time\030\001 \001" +
      "(\003\022/\n\004data\030\002 \003(\0132!.skywalking.v3.KeyStri" +
      "ngValuePair\"\020\n\002ID\022\n\n\002id\030\001 \003(\t\"C\n\021Segment" +
      "Collection\022.\n\010segments\030\001 \003(\0132\034.skywalkin" +
      "g.v3.SegmentObject\"\334\003\n\021SpanAttachedEvent" +
      "\022)\n\tstartTime\030\001 \001(\0132\026.skywalking.v3.Inst" +
      "ant\022\r\n\005event\030\002 \001(\t\022\'\n\007endTime\030\003 \001(\0132\026.sk" +
      "ywalking.v3.Instant\022/\n\004tags\030\004 \003(\0132!.skyw" +
      "alking.v3.KeyStringValuePair\022/\n\007summary\030" +
      "\005 \003(\0132\036.skywalking.v3.KeyIntValuePair\022D\n" +
      "\014traceContext\030\006 \001(\0132..skywalking.v3.Span" +
      "AttachedEvent.SpanReference\032\212\001\n\rSpanRefe" +
      "rence\022@\n\004type\030\001 \001(\01622.skywalking.v3.Span" +
      "AttachedEvent.SpanReferenceType\022\017\n\007trace" +
      "Id\030\002 \001(\t\022\026\n\016traceSegmentId\030\003 \001(\t\022\016\n\006span" +
      "Id\030\004 \001(\t\"/\n\021SpanReferenceType\022\016\n\nSKYWALK" +
      "ING\020\000\022\n\n\006ZIPKIN\020\001**\n\010SpanType\022\t\n\005Entry\020\000" +
      "\022\010\n\004Exit\020\001\022\t\n\005Local\020\002*,\n\007RefType\022\020\n\014Cros" +
      "sProcess\020\000\022\017\n\013CrossThread\020\001*_\n\tSpanLayer" +
      "\022\013\n\007Unknown\020\000\022\014\n\010Database\020\001\022\020\n\014RPCFramew" +
      "ork\020\002\022\010\n\004Http\020\003\022\006\n\002MQ\020\004\022\t\n\005Cache\020\005\022\010\n\004FA" +
      "AS\020\0062\257\001\n\031TraceSegmentReportService\022D\n\007co" +
      "llect\022\034.skywalking.v3.SegmentObject\032\027.sk" +
      "ywalking.v3.Commands\"\000(\001\022L\n\rcollectInSyn" +
      "c\022 .skywalking.v3.SegmentCollection\032\027.sk" +
      "ywalking.v3.Commands\"\0002j\n\036SpanAttachedEv" +
      "entReportService\022H\n\007collect\022 .skywalking" +
      ".v3.SpanAttachedEvent\032\027.skywalking.v3.Co" +
      "mmands\"\000(\001B\223\001\n3org.apache.skywalking.apm" +
      ".network.language.agent.v3P\001Z:skywalking" +
      ".apache.org/repo/goapi/collect/language/" +
      "agent/v3\252\002\035SkyWalking.NetworkProtocol.V3" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.Common.getDescriptor(),
          org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor(),
        });
    internal_static_skywalking_v3_SegmentObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_skywalking_v3_SegmentObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentObject_descriptor,
        new String[] { "TraceId", "TraceSegmentId", "Spans", "Service", "ServiceInstance", "IsSizeLimited", });
    internal_static_skywalking_v3_SegmentReference_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_skywalking_v3_SegmentReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentReference_descriptor,
        new String[] { "RefType", "TraceId", "ParentTraceSegmentId", "ParentSpanId", "ParentService", "ParentServiceInstance", "ParentEndpoint", "NetworkAddressUsedAtPeer", });
    internal_static_skywalking_v3_SpanObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_skywalking_v3_SpanObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SpanObject_descriptor,
        new String[] { "SpanId", "ParentSpanId", "StartTime", "EndTime", "Refs", "OperationName", "Peer", "SpanType", "SpanLayer", "ComponentId", "IsError", "Tags", "Logs", "SkipAnalysis", });
    internal_static_skywalking_v3_Log_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_skywalking_v3_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_Log_descriptor,
        new String[] { "Time", "Data", });
    internal_static_skywalking_v3_ID_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_skywalking_v3_ID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_ID_descriptor,
        new String[] { "Id", });
    internal_static_skywalking_v3_SegmentCollection_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_skywalking_v3_SegmentCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SegmentCollection_descriptor,
        new String[] { "Segments", });
    internal_static_skywalking_v3_SpanAttachedEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_skywalking_v3_SpanAttachedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SpanAttachedEvent_descriptor,
        new String[] { "StartTime", "Event", "EndTime", "Tags", "Summary", "TraceContext", });
    internal_static_skywalking_v3_SpanAttachedEvent_SpanReference_descriptor =
      internal_static_skywalking_v3_SpanAttachedEvent_descriptor.getNestedTypes().get(0);
    internal_static_skywalking_v3_SpanAttachedEvent_SpanReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_skywalking_v3_SpanAttachedEvent_SpanReference_descriptor,
        new String[] { "Type", "TraceId", "TraceSegmentId", "SpanId", });
    org.apache.skywalking.apm.network.common.v3.Common.getDescriptor();
    org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
