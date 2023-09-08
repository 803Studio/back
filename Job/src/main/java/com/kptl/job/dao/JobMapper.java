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
}
