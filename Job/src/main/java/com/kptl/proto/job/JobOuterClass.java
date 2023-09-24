// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Job.proto

package com.kptl.proto.job;

public final class JobOuterClass {
  private JobOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobsByIndustryReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobsByIndustryReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindAllJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindAllJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobsByTypeReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobsByTypeReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_FindSimplifyJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_FindSimplifyJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_SaveJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_SaveJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_ResponseHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_ResponseHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_CommonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_CommonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_JobMoney_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_JobMoney_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_JobMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_JobMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_JobSimplifyMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_JobSimplifyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tJob.proto\022\003job\"U\n\016FindJobRequest\022\n\n\002id" +
      "\030\001 \001(\005\022\014\n\004role\030\002 \001(\005\022\014\n\004byId\030\003 \001(\005\022\r\n\005in" +
      "dex\030\004 \001(\005\022\014\n\004size\030\005 \001(\005\"D\n\024FindJobByName" +
      "Request\022\017\n\007jobName\030\001 \001(\t\022\r\n\005index\030\002 \001(\005\022" +
      "\014\n\004size\030\003 \001(\005\"/\n\022FindJobByIdRequest\022\r\n\005j" +
      "obId\030\001 \001(\005\022\n\n\002id\030\002 \001(\005\"F\n\025FindJobsByIndu" +
      "stryReq\022\020\n\010industry\030\001 \001(\t\022\r\n\005index\030\002 \001(\005" +
      "\022\014\n\004size\030\003 \001(\005\"0\n\021FindAllJobRequest\022\r\n\005i" +
      "ndex\030\001 \001(\005\022\014\n\004size\030\002 \001(\005\"A\n\021FindJobsByTy" +
      "peReq\022\r\n\005index\030\001 \001(\005\022\014\n\004size\030\002 \001(\005\022\017\n\007jo" +
      "bType\030\003 \001(\005\"W\n\017FindJobResponse\022#\n\006header" +
      "\030\001 \001(\0132\023.job.ResponseHeader\022\037\n\006jobMsg\030\002 " +
      "\003(\0132\017.job.JobMessage\"g\n\027FindSimplifyJobR" +
      "esponse\022#\n\006header\030\001 \001(\0132\023.job.ResponseHe" +
      "ader\022\'\n\006jobMsg\030\002 \003(\0132\027.job.JobSimplifyMe" +
      "ssage\"6\n\017SaveJobResponse\022#\n\006header\030\001 \001(\013" +
      "2\023.job.ResponseHeader\"F\n\016ResponseHeader\022" +
      "#\n\006status\030\001 \001(\0162\023.job.ResponseStatus\022\017\n\007" +
      "message\030\002 \001(\t\"5\n\016CommonResponse\022#\n\006heade" +
      "r\030\001 \001(\0132\023.job.ResponseHeader\"F\n\010JobMoney" +
      "\022\037\n\004type\030\001 \001(\0162\021.job.JobMoneyType\022\013\n\003low" +
      "\030\002 \001(\005\022\014\n\004high\030\003 \001(\005\"\304\001\n\nJobMessage\022+\n\nj" +
      "obBaseMsg\030\001 \001(\0132\027.job.JobSimplifyMessage" +
      "\022\016\n\006jobReq\030\002 \001(\t\022\017\n\007jobNeed\030\003 \001(\005\022\020\n\010ind" +
      "ustry\030\005 \001(\t\022\025\n\rrecruiterName\030\006 \001(\t\022\026\n\016re" +
      "cruiterPhone\030\007 \001(\t\022\023\n\013recruiterId\030\010 \001(\005\022" +
      "\022\n\nupdateTime\030\t \001(\003\"\324\001\n\022JobSimplifyMessa" +
      "ge\022\r\n\005jobId\030\001 \001(\005\022\017\n\007jobName\030\002 \001(\t\022\023\n\013jo" +
      "bLocation\030\003 \001(\t\022\023\n\013companyName\030\004 \001(\t\022\017\n\007" +
      "jobTags\030\005 \001(\t\022\021\n\tcompanyId\030\006 \001(\005\022\020\n\010open" +
      "Time\030\007 \001(\003\022\037\n\010jobMoney\030\010 \001(\0132\r.job.JobMo" +
      "ney\022\035\n\007jobType\030\t \001(\0162\014.job.JobType*=\n\014Jo" +
      "bMoneyType\022\007\n\003F2F\020\000\022\007\n\003DAY\020\001\022\007\n\003MON\020\002\022\010\n" +
      "\004TIME\020\003\022\010\n\004HOUR\020\004*/\n\007JobType\022\010\n\004LONG\020\000\022\t" +
      "\n\005SHORT\020\001\022\017\n\013PARTTIMEJOB\020\002*)\n\016ResponseSt" +
      "atus\022\006\n\002OK\020\000\022\017\n\013InternalErr\020\0012\313\004\n\003Job\022=\n" +
      "\013findAllJobs\022\026.job.FindAllJobRequest\032\024.j" +
      "ob.FindJobResponse\"\000\022B\n\rfindJobByName\022\031." +
      "job.FindJobByNameRequest\032\024.job.FindJobRe" +
      "sponse\"\000\022>\n\013findJobById\022\027.job.FindJobByI" +
      "dRequest\032\024.job.FindJobResponse\"\000\022H\n\022find" +
      "JobsByIndustry\022\032.job.FindJobsByIndustryR" +
      "eq\032\024.job.FindJobResponse\"\000\0227\n\010findJobs\022\023" +
      ".job.FindJobRequest\032\024.job.FindJobRespons" +
      "e\"\000\022H\n\016findJobsByType\022\026.job.FindJobsByTy" +
      "peReq\032\034.job.FindSimplifyJobResponse\"\000\0223\n" +
      "\010saveJobs\022\017.job.JobMessage\032\024.job.SaveJob" +
      "Response\"\000\022H\n\020findJobsSimplify\022\026.job.Fin" +
      "dAllJobRequest\032\034.job.FindSimplifyJobResp" +
      "onse\0225\n\nupdateJobs\022\017.job.JobMessage\032\024.jo" +
      "b.SaveJobResponse\"\000B\035\n\022com.kptl.proto.jo" +
      "bP\001Z\005./jobb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_job_FindJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_job_FindJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobRequest_descriptor,
        new java.lang.String[] { "Id", "Role", "ById", "Index", "Size", });
    internal_static_job_FindJobByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_job_FindJobByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobByNameRequest_descriptor,
        new java.lang.String[] { "JobName", "Index", "Size", });
    internal_static_job_FindJobByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_job_FindJobByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobByIdRequest_descriptor,
        new java.lang.String[] { "JobId", "Id", });
    internal_static_job_FindJobsByIndustryReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_job_FindJobsByIndustryReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobsByIndustryReq_descriptor,
        new java.lang.String[] { "Industry", "Index", "Size", });
    internal_static_job_FindAllJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_job_FindAllJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindAllJobRequest_descriptor,
        new java.lang.String[] { "Index", "Size", });
    internal_static_job_FindJobsByTypeReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_job_FindJobsByTypeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobsByTypeReq_descriptor,
        new java.lang.String[] { "Index", "Size", "JobType", });
    internal_static_job_FindJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_job_FindJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindJobResponse_descriptor,
        new java.lang.String[] { "Header", "JobMsg", });
    internal_static_job_FindSimplifyJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_job_FindSimplifyJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_FindSimplifyJobResponse_descriptor,
        new java.lang.String[] { "Header", "JobMsg", });
    internal_static_job_SaveJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_job_SaveJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_SaveJobResponse_descriptor,
        new java.lang.String[] { "Header", });
    internal_static_job_ResponseHeader_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_job_ResponseHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_ResponseHeader_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_job_CommonResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_job_CommonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_CommonResponse_descriptor,
        new java.lang.String[] { "Header", });
    internal_static_job_JobMoney_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_job_JobMoney_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_JobMoney_descriptor,
        new java.lang.String[] { "Type", "Low", "High", });
    internal_static_job_JobMessage_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_job_JobMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_JobMessage_descriptor,
        new java.lang.String[] { "JobBaseMsg", "JobReq", "JobNeed", "Industry", "RecruiterName", "RecruiterPhone", "RecruiterId", "UpdateTime", });
    internal_static_job_JobSimplifyMessage_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_job_JobSimplifyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_JobSimplifyMessage_descriptor,
        new java.lang.String[] { "JobId", "JobName", "JobLocation", "CompanyName", "JobTags", "CompanyId", "OpenTime", "JobMoney", "JobType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}