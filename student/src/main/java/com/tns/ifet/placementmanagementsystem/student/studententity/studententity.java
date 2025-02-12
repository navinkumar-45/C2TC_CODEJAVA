package com.tns.ifet.placementmanagementsystem.student.studententity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Student ID (Primary Key)

    @Column(nullable = false)
    @Size(min = 3, max = 100, message = "Name should be between 3 to 100 characters")
    private String name;  // Student Name

    @Column(unique = true, nullable = false)
    @Email(message = "Invalid email format")
    private String email;  // Email (Unique)

    @Column(nullable = false)
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number")
    private String phoneNumber;  // Phone Number

    @Column(nullable = false)
    private String department;  // Department Name

    @Column(nullable = false)
    @Min(value = 0, message = "CGPA cannot be negative")
    @Max(value = 10, message = "CGPA cannot be greater than 10")
    private double cgpa;  // CGPA

    @Column(nullable = false)
    @Min(value = 2000, message = "Passing year must be after 2000")
    @Max(value = 2100, message = "Invalid passing year")
    private int passingYear;  // Passing Year

    @ElementCollection
    private List<String> skills;  // Skills as a List

    private String resumeUrl;  // Resume URL (Optional)

    @Column(nullable = false)
    private boolean isPlaced;  // Placement Status (true/false)

    // Constructors
    public Student() {}

    public Student(Long id, String name, String email, String phoneNumber, String department, double cgpa, int passingYear, List<String> skills, String resumeUrl, boolean isPlaced) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.cgpa = cgpa;
        this.passingYear = passingYear;
        this.skills = skills;
        this.resumeUrl = resumeUrl;
        this.isPlaced = isPlaced;
    }

    // Getters and Setters (Encapsulation)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public boolean isPlaced() {
        return isPlaced;
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    // Overridden toString() Method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", cgpa=" + cgpa +
                ", passingYear=" + passingYear +
                ", skills=" + skills +
                ", resumeUrl='" + resumeUrl + '\'' +
                ", isPlaced=" + isPlaced +
                '}';
    }
}








