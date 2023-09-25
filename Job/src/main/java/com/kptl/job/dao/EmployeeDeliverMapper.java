package com.kptl.job.dao;

import com.kptl.job.dto.DeliverDTO;
import com.kptl.job.dto.EmployeeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeDeliverMapper {
    boolean deliver(@Param("deliverDTO")DeliverDTO deliverDTO);

    List<Integer> deliverRecords(@Param("id") Integer id);

    List<EmployeeDTO> findEmployeeSimpleInformation(@Param("index") Integer index, @Param("size") Integer size);

    EmployeeDTO findEmployeeInformation(@Param("id") Integer id);

    void completeSelfInformation(@Param("employee") EmployeeDTO employeeDTO);

    void updateSelfInformation(@Param("employee") EmployeeDTO employeeDTO);
}
