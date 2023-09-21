package com.kptl.job.service;


import com.kptl.proto.company.Company;
import com.kptl.proto.company.FindAllCompaniesReq;
import com.kptl.proto.company.FindCompanyByIndustryReq;
import com.kptl.proto.company.FindCompanyByNameReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    void registeredCompany(Company company);

    void updateCompany(Company company);

    void verifyCompany(Integer id);

    List<Company> findCompanies(FindAllCompaniesReq request);

    List<Company> findCompanyByName(FindCompanyByNameReq request);

    List<Company> findCompanyByIndustry(FindCompanyByIndustryReq request);

    Company findCompaniesById(Integer id);
}
