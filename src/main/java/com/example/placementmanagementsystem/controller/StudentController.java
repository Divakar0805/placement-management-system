package com.example.placementmanagementsystem.controller;

import com.example.placementmanagementsystem.model.PlacementStatus;
import com.example.placementmanagementsystem.model.Student;
import com.example.placementmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/all")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        return studentService.deleteStudent(id);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {

        return studentService.updateStudent(student);
    }
    @PutMapping("/status/{id}")
    public Student updatePlacementStatus(
            @PathVariable int id,
            @RequestParam PlacementStatus status) {
        return studentService.updatePlacementStatus(id, status);
    }
    @PostMapping("/login")
    public Student loginStudent(@RequestBody Student student) {
        return studentService.loginStudent(student.getEmail(), student.getPassword());
    }
    @GetMapping("/email/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }
    @DeleteMapping("/deleteAll")
    public String deleteAllStudents() {
        studentService.deleteAllStudents();
        return "All Students Deleted";
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent( id, student);
    }
    @PutMapping("/reset-password")
    public Student resetPassword(
            @RequestBody Student student) {

        Student existingStudent =
                studentService.getStudentByEmail(
                        student.getEmail()
                );

        if(existingStudent != null) {

            existingStudent.setPassword(
                    student.getPassword()
            );

            return studentService
                    .saveStudent(existingStudent);
        }

        return null;
    }
}
