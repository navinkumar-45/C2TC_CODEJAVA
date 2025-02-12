package com.tns.ifet.placementmanagementsystem.student.service;
import com.tns.ifet.placementmanagement.model.Student;
import com.tns.ifet.placementmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;	
	@Service
	public class StudentService {

	    @Autowired
	    private StudentRepository studentRepository;

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Student getStudentById(Long id) {
	        return studentRepository.findById(id).orElse(null);
	    }

	    public Student addStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public Student updateStudent(Long id, Student studentDetails) {
	        Optional<Student> optionalStudent = studentRepository.findById(id);
	        if (optionalStudent.isPresent()) {
	            Student student = optionalStudent.get();
	            student.setName(studentDetails.getName());
	            student.setEmail(studentDetails.getEmail());
	            student.setPhoneNumber(studentDetails.getPhoneNumber());
	            student.setDepartment(studentDetails.getDepartment());
	            student.setCgpa(studentDetails.getCgpa());
	            student.setPassingYear(studentDetails.getPassingYear());
	            student.setSkills(studentDetails.getSkills());
	            student.setResumeUrl(studentDetails.getResumeUrl());
	            student.setPlaced(studentDetails.isPlaced());
	            return studentRepository.save(student);
	        }
	        return null;
	    }

	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }
	}

