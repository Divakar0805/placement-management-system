package com.example.placementmanagementsystem.service;

import com.example.placementmanagementsystem.model.PlacementStatus;
import com.example.placementmanagementsystem.model.Student;
import com.example.placementmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student Deleted";
    }
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updatePlacementStatus(
            int id, PlacementStatus placementStatus) {
        Student student =
                studentRepository.findById(id).orElse(null);
        if(student != null) {
            student.setPlacementStatus(placementStatus);
            return studentRepository.save(student);
        }
        return null;
    }
    public Student loginStudent(String email, String password) {
        Student student = studentRepository.findByEmail(email);

        if(student != null && student.getPassword().equals(password)) {
            return student;
        }
        return null;
    }
    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
    public void deleteAllStudents() {

        studentRepository.deleteAll();
    }
    public Student updateStudent(int id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElse(null);
        if(student != null) {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            student.setDegree(updatedStudent.getDegree());
            student.setDepartment(updatedStudent.getDepartment());
            student.setCollege(updatedStudent.getCollege());
            student.setPhoneNumber(updatedStudent.getPhoneNumber());
            student.setSkills(updatedStudent.getSkills());
            student.setCgpa(updatedStudent.getCgpa());
            student.setYear_Of_PassedOut(updatedStudent.getYear_Of_PassedOut());
            student.setGender(updatedStudent.getGender());
            student.setDateOfBirth(updatedStudent.getDateOfBirth());
            student.setAddress(updatedStudent.getAddress());
            return studentRepository.save(student);
        }

        return null;
    }
}
