package com.kptl.job.dao;

import com.kptl.job.dto.CompanyDTO;
import com.kptl.proto.Company;
import com.kptl.proto.FindAllCompaniesReq;
import com.kptl.proto.FindCompanyByNameReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyMapper {
    void registeredCompany(@Param("company") Company company);

    void updateCompany(@Param("company") Company company);

    List<CompanyDTO> findCompanies(@Param("request") FindAllCompaniesReq request);

    List<CompanyDTO> findCompanyByName(@Param("request") FindCompanyByNameReq request);

    List<Company> findCompanyByIndustry(@Param("industry") String industry);

    List<CompanyDTO> findCompaniesById(@Param("id") Integer id);
}
