package com.kptl.job.util;

import com.kptl.job.dto.JobDTO;
import com.kptl.proto.job.JobMessage;
import org.springframework.stereotype.Component;

@Component
public class JobUtil {

    public JobDTO jobCast(JobMessage request) {
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
}
