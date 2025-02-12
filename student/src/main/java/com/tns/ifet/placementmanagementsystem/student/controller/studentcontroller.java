	
	package com.tns.ifet.placementmanagementsystem.student.controller;

	import com.tns.ifet.placementmanagement.model.Student;
	import com.tns.ifet.placementmanagement.service.StudentService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/students")
	public class StudentController {

	    @Autowired
	    private StudentService studentService;

	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PostMapping
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.addStudent(student);
	    }

	    @PutMapping("/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
	        return studentService.updateStudent(id, student);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	        return "Student with ID " + id + " deleted successfully!";
	    }
	}

}
