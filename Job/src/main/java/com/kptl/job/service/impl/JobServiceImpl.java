package com.kptl.job.service.impl;

import com.kptl.job.dao.JobMapper;
import com.kptl.job.dto.JobDTO;
import com.kptl.job.service.JobService;
import com.kptl.proto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobMapper jobMapper;
    @Override
    public List<JobMessage> findJobs(FindJobRequest request) throws Exception{
        List<JobDTO> jobsByRecruiter = new ArrayList<>();
        if (request.getRole() == 2) {
            jobsByRecruiter = jobMapper.findJobsByRecruiter(request);
        } else if (request.getRole() == 3) {
            jobsByRecruiter = jobMapper.findJobsByCompany(request);
        } else {
            jobsByRecruiter = jobMapper.findAllJobs(request.getIndex(), request.getSize());
        }
        if (jobsByRecruiter.isEmpty()) {
            return null;
        }
        return copyToJobMessage(jobsByRecruiter);
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
        List<JobDTO> jobByName = jobMapper.findJobByName(request);
        if (jobByName != null) {
            return copyToJobMessage(jobByName);
        }
        return null;
    }

    @Override
    public JobMessage findJobById(FindJobByIdRequest request) {
        List<JobDTO> jobById = jobMapper.findJobById(request.getJobId());
        return copyToJobMessage(jobById).get(0);
    }

    @Override
    public List<JobMessage> findAllJobs(FindAllJobRequest request) {
        List<JobDTO> allJobs = jobMapper.findAllJobs(request.getIndex(), request.getSize());
        return copyToJobMessage(allJobs);
    }

    private List<JobMessage> copyToJobMessage(List<JobDTO> allJobs) {
        if (allJobs == null) {
            return null;
        }
        List<JobMessage> jobMessages = new ArrayList<>();
        for (JobDTO job : allJobs) {
            JobMessage.Builder jobMessage = JobMessage.newBuilder();
            jobMessage.setJobId(job.getJobId());
            jobMessage.setJobName(job.getJobName());
            jobMessage.setJobMoney(job.getJobMoney());
            jobMessage.setJobReq(job.getJobReq());
            jobMessage.setJobLocation(job.getJobLocation());
            jobMessage.setCompanyId(job.getCompanyId());
            jobMessage.setRecruiterName(job.getRecruiterName());
            jobMessage.setRecruiterPhone(job.getRecruiterPhone());
            jobMessage.setOpenTime(job.getOpenTime().getTime());
            jobMessage.setJobTags(job.getJobTags());
            jobMessage.setUpdateTime(job.getUpdateTime().getTime());
            jobMessage.setIndustry(job.getIndustry());
            jobMessages.add(jobMessage.build());
        }
        return jobMessages;
    }
}
