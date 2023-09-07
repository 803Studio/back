package com.kptl.job.service;

import com.kptl.proto.FindJobRequest;
import com.kptl.proto.JobMessage;

import java.util.List;

public interface JobService {
    List<JobMessage> findJobs(FindJobRequest request);

    Boolean saveJob(JobMessage request);
}
