package com.kptl.job.service.impl;

import com.kptl.job.dao.JobMapper;
import com.kptl.job.dto.BrowseRecordDTO;
import com.kptl.job.dto.JobDTO;
import com.kptl.job.service.JobService;
import com.kptl.job.util.RedisUtil;
import com.kptl.proto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobMapper jobMapper;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private static Long SEVEN_DAY = 604800L; // 七天
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
        return jobMapper.saveJob(jobCast(request));
    }
    private JobDTO jobCast(JobMessage request) {
        JobDTO jobDTO = new JobDTO();
        jobDTO.setJobName(request.getJobBaseMsg().getJobName());
        jobDTO.setJobLocation(request.getJobBaseMsg().getJobLocation());
        jobDTO.setCompanyName(request.getJobBaseMsg().getCompanyName());
        jobDTO.setJobTags(request.getJobBaseMsg().getJobTags());
        jobDTO.setCompanyId(request.getJobBaseMsg().getCompanyId());
        jobDTO.setJobMoneyType(request.getJobBaseMsg().getJobMoney().getType().toString());
        jobDTO.setSalaryLow(request.getJobBaseMsg().getJobMoney().getLow());
        jobDTO.setSalaryTop(request.getJobBaseMsg().getJobMoney().getHigh());
        jobDTO.setJobReq(request.getJobReq());
        jobDTO.setJobNeed(request.getJobNeed());
        jobDTO.setIndustry(request.getIndustry());
        jobDTO.setRecruiterName(request.getRecruiterName());
        jobDTO.setRecruiterPhone(request.getRecruiterPhone());
        jobDTO.setRecruiterId(request.getRecruiterId());
        return jobDTO;
    }

    @Override
    public Boolean updateJob(JobMessage request) {
        JobDTO jobDTO = jobCast(request);
        jobDTO.setJobId(request.getJobBaseMsg().getJobId());
        return jobMapper.updateJob(jobDTO);
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
    public List<JobMessage> findJobsByIndustry(FindJobsByIndustryReq request) {
        List<JobDTO> jobByIndustry = jobMapper.findJobsByIndustry(request);
        return copyToJobMessage(jobByIndustry);
    }

    @Override
    public JobMessage findJobById(FindJobByIdRequest request) {
        addBrowseRecord(String.valueOf(request.getId()), request.getJobId());
        List<JobDTO> jobById = jobMapper.findJobById(request.getJobId());
        if (jobById == null || jobById.isEmpty()) {
            return null;
        }
        return copyToJobMessage(jobById).get(0);
    }

    public void addBrowseRecord(String userId, int jobId) {
        Long time = System.currentTimeMillis();
        Map<String, Object> record = new HashMap<>();
        redisTemplate.opsForHash().put(userId, String.valueOf(jobId), time);
        redisTemplate.expire(userId, 7, TimeUnit.DAYS); // 设置过期时间为七天
    }

    @Override
    public List<JobMessage> findAllJobs(FindAllJobRequest request) {
        System.out.println("begin findAllJobs");
        List<JobDTO> allJobs = jobMapper.findAllJobs(request.getIndex(), request.getSize());
        return copyToJobMessage(allJobs);
    }

    @Override
    public List<JobSimplifyMessage> findJobsSimplify(FindAllJobRequest request) {
        System.out.println("begin findAllJobs");
        List<JobDTO> allJobs = jobMapper.findJobsSimplify(request.getIndex(), request.getSize());

        return copyToSimp(allJobs);
    }

    @Override
    public List<JobSimplifyMessage> findJobsByType(FindJobsByTypeReq request) {
        List<JobDTO> jobsByType = jobMapper.findJobsByType(request);
        return copyToSimp(jobsByType);
    }

    private List<JobSimplifyMessage> copyToSimp(List<JobDTO> allJobs) {
        if (allJobs == null || allJobs.size() == 0) {
            return null;
        }
        List<JobSimplifyMessage> jobMessages = new ArrayList<>();
        for (JobDTO job : allJobs) {
            JobSimplifyMessage.Builder jobMessage = JobSimplifyMessage.newBuilder();
            JobMoney.Builder money = JobMoney.newBuilder();
            money.setType(JobMoneyType.valueOf(job.getJobMoneyType()));
            money.setLow(job.getSalaryLow());
            money.setHigh(job.getSalaryTop());
            jobMessage.setJobMoney(money.build());
            jobMessage.setJobId(job.getJobId());
            jobMessage.setJobName(job.getJobName());
            jobMessage.setJobLocation(job.getJobLocation());
            jobMessage.setCompanyId(job.getCompanyId());
            jobMessage.setOpenTime(job.getOpenTime().getTime());
            jobMessage.setJobTags(job.getJobTags());
            jobMessage.setCompanyName(job.getCompanyName());
            jobMessage.setJobType(JobType.valueOf(job.getJobType()));
            jobMessages.add(jobMessage.build());
        }
        return jobMessages;
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
            JobSimplifyMessage.Builder jobSimp = JobSimplifyMessage.newBuilder();
            JobMoney.Builder money = JobMoney.newBuilder();
            money.setType(JobMoneyType.valueOf(job.getJobMoneyType()));
            money.setLow(job.getSalaryLow());
            money.setHigh(job.getSalaryTop());
            jobSimp.setJobMoney(money.build());
            jobSimp.setJobId(job.getJobId());
            jobSimp.setJobName(job.getJobName());
            jobSimp.setJobLocation(job.getJobLocation());
            jobSimp.setCompanyName(job.getCompanyName());
            jobSimp.setCompanyId(job.getCompanyId());
            jobSimp.setOpenTime(job.getOpenTime().getTime());
            jobSimp.setJobTags(job.getJobTags());
            jobSimp.setJobType(JobType.valueOf(job.getJobType()));
            jobMessage.setJobReq(job.getJobReq());
            jobMessage.setRecruiterName(job.getRecruiterName());
            jobMessage.setRecruiterPhone(job.getRecruiterPhone());
            jobMessage.setUpdateTime(job.getUpdateTime().getTime());
            jobMessage.setIndustry(job.getIndustry());
            jobMessage.setJobBaseMsg(jobSimp.build());
            jobMessages.add(jobMessage.build());
        }
        System.out.println("return");
        return jobMessages;
    }
}
