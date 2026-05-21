package com.example.placementmanagementsystem.controller;

import com.example.placementmanagementsystem.model.Application;
import com.example.placementmanagementsystem.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/apply")
    public Application applyCompany(
            @RequestBody Application application) {

        return applicationService
                .saveApplication(application);
    }
    @GetMapping("/student/{studentId}")
    public List<Application> getStudentApplications(@PathVariable int studentId) {
        return applicationService.getStudentApplications(studentId);
    }
    @GetMapping("/all")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }
    @PutMapping("/update-status/{id}")

    public Application updateStatus(@PathVariable int id, @RequestBody Application application) {
        return applicationService.updateStatus(id, application.getStatus());
    }
}