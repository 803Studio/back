package com.kptl.job.dao;

import com.kptl.job.dto.CompanyDTO;
import com.kptl.proto.company.FindAllCompaniesReq;
import com.kptl.proto.company.FindCompanyByIndustryReq;
import com.kptl.proto.company.FindCompanyByNameReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {
    void registeredCompany(@Param("company") CompanyDTO company);

    void updateCompany(@Param("company") CompanyDTO company);

    void verifyCompany(@Param("id") Integer id);

    List<CompanyDTO> findCompanies(@Param("request") FindAllCompaniesReq request);

    List<CompanyDTO> findCompanyByName(@Param("request") FindCompanyByNameReq request);

    List<CompanyDTO> findCompanyByIndustry(@Param("request")FindCompanyByIndustryReq request);

    List<CompanyDTO> findCompaniesById(@Param("id") Integer id);

}
