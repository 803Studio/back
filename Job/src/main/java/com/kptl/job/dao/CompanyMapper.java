package com.kptl.job.dao;

import com.kptl.proto.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {
    void registeredCompany(@Param("company") Company company);

    void updateCompany(@Param("company") Company company);

    List<Company> findCompanies();

    List<Company> findCompanyByName(@Param("companyName") String companyName);

    List<Company> findCompanyByIndustry(@Param("industry") String industry);
}
