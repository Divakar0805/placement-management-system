package com.example.placementmanagementsystem.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String companyName;
    private String role;
    private double packageAmount;
    private String location;
    private String eligibility;
    private String jobType;
    private String experience;
    private String skillsRequired;
    private String bond;
    private String interviewMode;
    private String interviewDate;
    private String lastDateToApply;
    private int vacancies;
    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Application> applications;

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getPackageAmount() {
        return packageAmount;
    }
    public void setPackageAmount(double packageAmount) {
        this.packageAmount = packageAmount;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getEligibility() {
        return eligibility;
    }
    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
    public String getJobType() {
        return jobType;
    }
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getSkillsRequired() {
        return skillsRequired;
    }
    public void setSkillsRequired(String skillsRequired) {
        this.skillsRequired = skillsRequired;
    }
    public String getBond() {
        return bond;
    }
    public void setBond(String bond) {
        this.bond = bond;
    }
    public String getInterviewMode() {
        return interviewMode;
    }
    public void setInterviewMode(String interviewMode) {
        this.interviewMode = interviewMode;
    }
    public String getInterviewDate() {
        return interviewDate;
    }
    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }
    public String getLastDateToApply() {
        return lastDateToApply;
    }
    public void setLastDateToApply(String lastDateToApply) {
        this.lastDateToApply = lastDateToApply;
    }
    public int getVacancies() {
        return vacancies;
    }
    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }
    public int getAppliedStudentsCount() {
        return applications != null ? applications.size() : 0;
    }
}