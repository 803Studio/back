package com.kptl.job.dao;

import com.kptl.proto.FindJobRequest;
import com.kptl.proto.JobMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobMapper {
    List<JobMessage> findJobs(FindJobRequest request);

    Boolean saveJob(@Param("job") JobMessage job);

    Boolean updateJob(@Param("job") JobMessage job);

    List<JobMessage> findJobByName(@Param("jobName") String jobName);

    JobMessage findJobById(@Param("jobId") String jobId);

    List<JobMessage> findAllJobs(@Param("index") Integer index, @Param("size") Integer size);

    List<JobMessage> findJobsByRecruiter(@Param("request") FindJobRequest request);

    List<JobMessage> findJobsByCompany(@Param("request") FindJobRequest request);
}
