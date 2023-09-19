package com.kptl.job.service;


import com.kptl.proto.Company;
import com.kptl.proto.FindAllCompaniesReq;
import com.kptl.proto.FindCompanyByNameReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    void registeredCompany(Company company);

    void updateCompany(Company company);

    void verifyCompany(Integer id);

    List<Company> findCompanies(FindAllCompaniesReq request);

    List<Company> findCompanyByName(FindCompanyByNameReq request);

    List<Company> findCompanyByIndustry(String industry);

    Company findCompaniesById(Integer id);
}
