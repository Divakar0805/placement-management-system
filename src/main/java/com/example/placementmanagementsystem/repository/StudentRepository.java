package com.example.placementmanagementsystem.repository;
import com.example.placementmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);

}
