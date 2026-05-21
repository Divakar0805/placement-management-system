package com.example.placementmanagementsystem.service;

import com.example.placementmanagementsystem.model.Admin;
import com.example.placementmanagementsystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
    public Admin loginAdmin(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }
}
