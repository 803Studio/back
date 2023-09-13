package com.kptl.job.dao;

import com.kptl.job.dto.DeliverDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeDeliverMapper {
    boolean deliver(@Param("deliverDTO")DeliverDTO deliverDTO);

    List<Integer> deliverRecords(@Param("id") Integer id);
}
