package com.example.placementmanagementsystem.service;

import com.example.placementmanagementsystem.model.Company;
import com.example.placementmanagementsystem.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }
    public List <Company> getAllCompanies() {

        return companyRepository.findAll();
    }
}
