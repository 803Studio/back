package com.kptl.job.service.impl;

import com.kptl.job.dao.CompanyMapper;
import com.kptl.job.dto.CompanyDTO;
import com.kptl.job.service.CompanyService;
import com.kptl.proto.company.Company;
import com.kptl.proto.company.FindAllCompaniesReq;
import com.kptl.proto.company.FindCompanyByIndustryReq;
import com.kptl.proto.company.FindCompanyByNameReq;
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
        System.out.println("registeredCompany");
        System.out.println(company.getCompanyName());
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setCompanyId(company.getCompanyId());
        companyDTO.setCompanyName(company.getCompanyName());
        companyDTO.setIndustry(company.getIndustry());
        companyDTO.setCompanyLocation(company.getCompanyLocation());
        companyDTO.setId(company.getId());
        companyMapper.registeredCompany(companyDTO);
    }

    @Override
    public void updateCompany(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setCompanyId(company.getCompanyId());
        companyDTO.setCompanyName(company.getCompanyName());
        companyDTO.setIndustry(company.getIndustry());
        companyDTO.setCompanyLocation(company.getCompanyLocation());
        companyMapper.updateCompany(companyDTO);
    }

    @Override
    public void verifyCompany(Integer id) {
        companyMapper.verifyCompany(id);
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
    public List<Company> findCompanyByIndustry(FindCompanyByIndustryReq request) {
        List<CompanyDTO> companyByIndustry = companyMapper.findCompanyByIndustry(request);
        return copyToCompany(companyByIndustry);
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
            newCompany.setCompanyId(company.getCompanyId());
            newCompany.setCompanyName(company.getCompanyName());
            newCompany.setCompanyLocation(company.getCompanyLocation());
            newCompany.setIsCertified(company.getIsCertified());
            newCompany.setIsVip(company.getIsVip());
            newCompany.setIndustry(company.getIndustry());
            newCompany.setRegisterTime(company.getRegisterTime().getTime() / 1000);
            newCompany.setUpdateTime(company.getUpdateTime().getTime() / 1000);
            newCompany.setId(company.getId());
            companyList.add(newCompany.build());
        }
        return companyList;
    }
}
