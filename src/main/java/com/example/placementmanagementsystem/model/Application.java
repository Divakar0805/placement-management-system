package com.example.placementmanagementsystem.model;

import jakarta.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Company company;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(
            ApplicationStatus status) {

        this.status = status;
    }
}