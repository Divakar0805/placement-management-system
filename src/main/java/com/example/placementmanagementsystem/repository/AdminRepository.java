package com.example.placementmanagementsystem.repository;

import com.example.placementmanagementsystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByUsernameAndPassword(
            String username,
            String password);
}
