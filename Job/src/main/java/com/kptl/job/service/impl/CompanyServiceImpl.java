package com.kptl.job.service.impl;

import com.kptl.job.dao.CompanyMapper;
import com.kptl.job.service.CompanyService;
import com.kptl.proto.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
