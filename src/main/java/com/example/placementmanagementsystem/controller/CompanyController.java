package com.example.placementmanagementsystem.controller;

import com.example.placementmanagementsystem.model.Company;
import com.example.placementmanagementsystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/add")
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }
    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}
