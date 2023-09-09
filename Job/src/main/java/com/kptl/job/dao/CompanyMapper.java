package com.kptl.job.dao;

import com.kptl.proto.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {
    void registeredCompany(@Param("company") Company company);

    void updateCompany(@Param("company") Company company);

}
