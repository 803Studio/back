package com.kptl.job.dto;

import lombok.Data;

import java.util.Date;

@Data
public class JobDTO {
    private Integer jobId;                        //职位id
    private String jobName;                     //职位名称
    private Integer jobMoney;                     //薪资
    private String jobReq;                      //职位要求
    private String jobLocation;                 //职位地址
    private Integer companyId;                    //公司id(用户id)
    private String recruiterName;               //招聘者
    private String recruiterPhone;              //招聘者手机号
    private String jobNeed;                     //招聘人数
    private Integer recruiterId;                 //招聘者id
    private Date openTime;                    //职位发布时间
    private String jobTags;                    //职位标签
    private Date updateTime;                  //职位刷新时间
}
