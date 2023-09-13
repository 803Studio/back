package com.kptl.job.service.impl;

import com.kptl.job.dao.CompanyMapper;
import com.kptl.job.dto.CompanyDTO;
import com.kptl.job.dto.JobDTO;
import com.kptl.job.service.CompanyService;
import com.kptl.proto.Company;
import com.kptl.proto.FindAllCompaniesReq;
import com.kptl.proto.FindCompanyByNameReq;
import com.kptl.proto.JobMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Company> findCompanies(FindAllCompaniesReq request) {
        List<CompanyDTO> companies = companyMapper.findCompanies(request);
        return copyToCompany(companies);
    }

    @Override
    public List<Company> findCompanyByName(FindCompanyByNameReq request) {
        List<CompanyDTO> companyByName = companyMapper.findCompanyByName(request);
        return copyToCompany(companyByName);
    }

    @Override
    public List<Company> findCompanyByIndustry(String industry) {
        return companyMapper.findCompanyByIndustry(industry);
    }

    @Override
    public Company findCompaniesById(Integer id) {
        List<CompanyDTO> companiesById = companyMapper.findCompaniesById(id);
        return copyToCompany(companiesById).get(0);
    }

    private List<Company> copyToCompany(List<CompanyDTO> companyS) {
        if (companyS == null || companyS.size() == 0) {
            return null;
        }
        List<Company> companyList = new ArrayList<>();
        for (CompanyDTO company : companyS) {
            Company.Builder newCompany = Company.newBuilder();
            newCompany.setId(company.getCompanyId());
            newCompany.setCompanyName(company.getCompanyName());
            newCompany.setCompanyLocation(company.getCompanyLocation());
            newCompany.setIsCertified(company.getIsCertified());
            newCompany.setIsVip(company.getIsVip());
            newCompany.setIndustry(company.getIndustry());
            newCompany.setRegisterTime(company.getRegisterTime().getTime());
            newCompany.setUpdateTime(company.getUpdateTime().getTime());
            companyList.add(newCompany.build());
        }
        return companyList;
    }
}
