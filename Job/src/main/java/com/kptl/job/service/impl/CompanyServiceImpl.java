package com.kptl.job.service.impl;

import com.kptl.job.dao.CompanyMapper;
import com.kptl.job.service.CompanyService;
import com.kptl.proto.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public void registeredCompany(Company company) {
        companyMapper.registeredCompany(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyMapper.updateCompany(company);
    }

    @Override
    public List<Company> findCompanies() {
        return companyMapper.findCompanies();
    }

    @Override
    public List<Company> findCompanyByName(String companyName) {
        return companyMapper.findCompanyByName(companyName);
    }

    @Override
    public List<Company> findCompanyByIndustry(String industry) {
        return companyMapper.findCompanyByIndustry(industry);
    }
}
