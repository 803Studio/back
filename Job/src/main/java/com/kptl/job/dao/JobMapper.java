package com.kptl.job.dao;

import com.kptl.job.dto.JobDTO;
import com.kptl.proto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobMapper {
    List<JobMessage> findJobs(FindJobRequest request);

    Boolean saveJob(@Param("job") JobDTO job);

    Boolean updateJob(@Param("job") JobDTO job);

    List<JobDTO> findJobByName(@Param("request") FindJobByNameRequest request);

    List<JobDTO> findJobById(@Param("jobId") Integer jobId);

    List<JobDTO> findJobsByIndustry(@Param("request") FindJobsByIndustryReq request);

    List<JobDTO> findAllJobs(@Param("index") Integer index, @Param("size") Integer size);

    List<JobDTO> findJobsByRecruiter(@Param("request") FindJobRequest request);

    List<JobDTO>  findJobsByCompany(@Param("request") FindJobRequest request);

    List<JobDTO> findJobsSimplify(@Param("index") Integer index, @Param("size") Integer size);

    List<JobDTO> findJobsByType(@Param("request") FindJobsByTypeReq request);
}
