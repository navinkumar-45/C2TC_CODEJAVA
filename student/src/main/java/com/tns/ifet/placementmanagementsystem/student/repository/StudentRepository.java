package com.tns.ifet.placementmanagementsystem.student.repository;

import com.tns.ifet.placementmanagementsystem.student.studententity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
