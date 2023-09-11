package com.kptl.job.service;

import com.kptl.proto.*;

import java.util.List;

public interface JobService {
    List<JobMessage> findJobs(FindJobRequest request);

    Boolean saveJob(JobMessage request);

    Boolean updateJob(JobMessage request);

    List<JobMessage> findJobByName(FindJobByNameRequest request);

    JobMessage findJobById(FindJobByIdRequest request);

    List<JobMessage> findAllJobs(FindAllJobRequest request);


}
