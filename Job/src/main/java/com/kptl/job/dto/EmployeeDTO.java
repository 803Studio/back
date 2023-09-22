package com.kptl.job.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {
    Integer id;

    String realName = "";

    Integer sex = 0;

    Integer workYear = 0;

    String expectedLocation = "";

    String industry = "";

    Integer isMarry = 0;

    Integer education = 0;

    Integer jobStatus = 0;

    String jobType = "LONG";

    Date createTime;

    Date updateTime;
}
