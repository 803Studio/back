package com.kptl.job.service;

import com.kptl.job.dto.JobDTO;
import com.kptl.proto.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface JobService {
    List<JobMessage> findJobs(FindJobRequest request) throws Exception;

    Boolean saveJob(JobMessage request);

    Boolean updateJob(JobMessage request);

    List<JobMessage> findJobByName(FindJobByNameRequest request);

    JobMessage findJobById(FindJobByIdRequest request);

    List<JobMessage> findAllJobs(FindAllJobRequest request);

    List<JobSimplifyMessage> findJobsSimplify(FindAllJobRequest request);
}
