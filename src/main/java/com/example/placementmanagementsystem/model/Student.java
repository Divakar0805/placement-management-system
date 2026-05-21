package com.example.placementmanagementsystem.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String degree;
    private String department;
    private String college;
    private String phoneNumber;
    private String skills;
    private double cgpa;
    private int year_Of_PassedOut;
    private String address;
    private String gender;
    private String dateOfBirth;
    @Enumerated(EnumType.STRING)
    private PlacementStatus placementStatus;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public int getYear_Of_PassedOut() {
        return year_Of_PassedOut;
    }
    public void setYear_Of_PassedOut(int year_Of_PassedOut) {
        this.year_Of_PassedOut = year_Of_PassedOut;
    }
    public PlacementStatus getPlacementStatus() {
        return placementStatus;
    }
    public void setPlacementStatus(PlacementStatus placementStatus) {
        this.placementStatus = placementStatus;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}