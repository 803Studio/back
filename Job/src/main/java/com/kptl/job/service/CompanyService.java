package com.kptl.job.service;


import com.kptl.proto.Company;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    void registeredCompany(Company company);

    void updateCompany(Company company);
}
