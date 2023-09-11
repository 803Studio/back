package com.kptl.job.service.impl;

import com.kptl.job.dao.JobMapper;
import com.kptl.job.service.JobService;
import com.kptl.proto.*;
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
            return jobMapper.findAllJobs(request.getIndex(), request.getSize());
        } else if (request.getRole() == 2) {
            return jobMapper.findJobsByRecruiter(request);
        } else if (request.getRole() == 3) {
            return jobMapper.findJobsByCompany(request);
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

    @Override
    public List<JobMessage> findJobByName(FindJobByNameRequest request) {
        return jobMapper.findJobByName(request.getJobName());
    }

    @Override
    public JobMessage findJobById(FindJobByIdRequest request) {
        return jobMapper.findJobById(request.getJobId());
    }

    @Override
    public List<JobMessage> findAllJobs(FindAllJobRequest request) {
        return jobMapper.findAllJobs(request.getIndex(), request.getSize());
    }
}
