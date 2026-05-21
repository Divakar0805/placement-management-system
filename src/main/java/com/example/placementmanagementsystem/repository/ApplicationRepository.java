package com.example.placementmanagementsystem.repository;

import com.example.placementmanagementsystem.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    List<Application> findByStudentId(int studentId);
}