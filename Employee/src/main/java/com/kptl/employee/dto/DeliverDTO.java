package com.kptl.employee.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DeliverDTO {
    private String deliverId;

    private Integer id;

    private Integer jobId;

    private Date deliverTime;
}
