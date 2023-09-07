package com.kptl.job.service.impl;

import com.kptl.job.dao.JobMapper;
import com.kptl.job.dto.JobDTO;
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
        JobDTO jobDTO = new JobDTO();
        jobDTO.setJobName(request.getJobName());
        jobDTO.setJobLocation(request.getJobLocation());
        jobDTO.setCompanyId(request.getCompanyId());
        jobDTO.setRecruiterId(request.getRecruiterId());
        jobDTO.setRecruiterPhone(request.getRecruiterPhone());
        return jobMapper.saveJob(request);
    }
}
