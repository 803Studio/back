package com.kptl.job.service;


import com.kptl.proto.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    void registeredCompany(Company company);

    void updateCompany(Company company);

    List<Company> findCompanies();

    List<Company> findCompanyByName(String companyName);

    List<Company> findCompanyByIndustry(String industry);
}
