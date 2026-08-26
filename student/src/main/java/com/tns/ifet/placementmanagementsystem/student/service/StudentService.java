package com.tns.ifet.placementmanagementsystem.student.service;

import com.tns.ifet.placementmanagementsystem.student.repository.StudentRepository;
import com.tns.ifet.placementmanagementsystem.student.studententity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Long id, Student details) {
        return studentRepository.findById(id).map(student -> {
            student.setName(details.getName());
            student.setEmail(details.getEmail());
            student.setPhoneNumber(details.getPhoneNumber());
            student.setDepartment(details.getDepartment());
            student.setCgpa(details.getCgpa());
            student.setPassingYear(details.getPassingYear());
            student.setSkills(details.getSkills());
            student.setResumeUrl(details.getResumeUrl());
            student.setPlaced(details.isPlaced());
            return studentRepository.save(student);
        });
    }

    public boolean deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
