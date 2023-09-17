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
        System.out.println("begin findjobs");
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
        System.out.println("begin findJobByName");
        List<JobDTO> jobByName = jobMapper.findJobByName(request);
        if (jobByName == null && jobByName.isEmpty()) {
            return null;
        }
        System.out.println("job by name not null");
        return copyToJobMessage(jobByName);
    }

    @Override
    public JobMessage findJobById(FindJobByIdRequest request) {
        System.out.println("begin findJobById");
        List<JobDTO> jobById = jobMapper.findJobById(request.getJobId());
        if (jobById == null || jobById.isEmpty()) {
            return null;
        }
        return copyToJobMessage(jobById).get(0);
    }

    @Override
    public List<JobMessage> findAllJobs(FindAllJobRequest request) {
        System.out.println("begin findAllJobs");
        List<JobDTO> allJobs = jobMapper.findAllJobs(request.getIndex(), request.getSize());
        return copyToJobMessage(allJobs);
    }

    private List<JobMessage> copyToJobMessage(List<JobDTO> allJobs) {
        System.out.println("begin copyToJobMessage");
        if (allJobs == null || allJobs.size() == 0) {
            return null;
        }
        System.out.println("begin copyToJobMessage not null");
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
        System.out.println("return");
        return jobMessages;
    }
}
