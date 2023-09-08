package com.kptl.job.service.impl;

import com.kptl.job.dao.JobMapper;
import com.kptl.job.service.JobService;
import com.kptl.proto.FindJobRequest;
import com.kptl.proto.JobMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobMapper jobMapper;
    @Override
    public List<JobMessage> findJobs(FindJobRequest request) {
        if (request.getRole() == 1) {

        } else if (request.getRole() == 2) {

        } else if (request.getRole() == 3) {

        }
        return null;
    }

    @Override
    public Boolean saveJob(JobMessage request) {
        return jobMapper.saveJob(request);
    }

    @Override
    public Boolean updateJob(JobMessage request) {
        return jobMapper.updateJob(request);
    }
}
