package com.example.placementmanagementsystem.service;

import com.example.placementmanagementsystem.model.Application;
import com.example.placementmanagementsystem.model.ApplicationStatus;
import com.example.placementmanagementsystem.model.PlacementStatus;
import com.example.placementmanagementsystem.model.Student;
import com.example.placementmanagementsystem.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application saveApplication(Application application) {

        application.setStatus(ApplicationStatus.PENDING);

        return applicationRepository.save(application);
    }
    public List<Application> getStudentApplications(int studentId) {
        return applicationRepository.findByStudentId(studentId);
    }
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
    public Application updateStatus(int id, ApplicationStatus status) {

        Application application =
                applicationRepository.findById(id).orElse(null);

        if(application != null) {

            application.setStatus(status);

            if(status == ApplicationStatus.SELECTED) {

                Student student = application.getStudent();

                student.setPlacementStatus(
                        PlacementStatus.SELECTED
                );
            }

            return applicationRepository.save(application);
        }

        return null;
    }

}