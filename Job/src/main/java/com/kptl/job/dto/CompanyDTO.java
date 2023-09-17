package com.kptl.job.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyDTO {
    Integer companyId;

    String companyName;

    String companyLocation;

    Integer isCertified;

    Integer isVip;

    String industry;

    Date registerTime;

    Date updateTime;

    Integer id;
}
