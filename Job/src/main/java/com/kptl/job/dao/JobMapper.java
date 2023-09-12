package com.kptl.job.dao;

import com.kptl.job.dto.JobDTO;
import com.kptl.proto.FindJobByNameRequest;
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

    List<JobDTO> findJobByName(@Param("request") FindJobByNameRequest request);

    List<JobDTO> findJobById(@Param("jobId") Integer jobId);

    List<JobDTO> findAllJobs(@Param("index") Integer index, @Param("size") Integer size);

    List<JobDTO> findJobsByRecruiter(@Param("request") FindJobRequest request);

    List<JobDTO>  findJobsByCompany(@Param("request") FindJobRequest request);
}
