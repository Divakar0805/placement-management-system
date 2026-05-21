package com.example.placementmanagementsystem.controller;

import com.example.placementmanagementsystem.model.Admin;
import com.example.placementmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public Admin registerAdmin(
            @RequestBody Admin admin) {

        return adminService.saveAdmin(admin);
    }
    @PostMapping("/login")
    public Admin loginAdmin(@RequestBody Admin admin) {
        return adminService.loginAdmin(admin.getUsername(), admin.getPassword());
    }
}
