# Placement Management System – Student Module

A Spring Boot REST API for managing student placement information. This project demonstrates backend development using Java, Spring Boot, Spring Data JPA, PostgreSQL, validation, and a layered architecture.

## Features

- Create, view, update, and delete student records
- Store academic information, technical skills, resume links, and placement status
- Validate email, Indian phone number, CGPA, and passing year
- Persist data in PostgreSQL using Spring Data JPA
- Return appropriate HTTP responses for found and missing records

## Tech Stack

- Java 21
- Spring Boot 3.4
- Spring Web
- Spring Data JPA
- Bean Validation
- PostgreSQL
- Maven

## Project Structure

```text
student/
├── src/main/java/.../student/
│   ├── controller/StudentController.java
│   ├── service/StudentService.java
│   ├── repository/StudentRepository.java
│   ├── studententity/Student.java
│   └── StudentApplication.java
├── src/main/resources/application.properties
└── pom.xml
```

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get one student |
| POST | `/api/students` | Create a student |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |

## Sample Request

```json
{
  "name": "Navinkumar J",
  "email": "navinkumar@example.com",
  "phoneNumber": "9876543210",
  "department": "Computer Science and Engineering",
  "cgpa": 7.17,
  "passingYear": 2025,
  "skills": ["Java", "Spring Boot", "PostgreSQL"],
  "resumeUrl": "https://example.com/resume",
  "placed": false
}
```

## Run Locally

### Prerequisites

- Java 21
- PostgreSQL
- Git

### Setup

1. Clone the repository:

```bash
git clone https://github.com/navinkumar-45/C2TC_CODEJAVA.git
cd C2TC_CODEJAVA/student
```

2. Create a PostgreSQL database named `placement_service`.

3. Set the database password as an environment variable.

Linux/macOS:

```bash
export DB_PASSWORD="your_database_password"
```

Windows PowerShell:

```powershell
$env:DB_PASSWORD="your_database_password"
```

You can also override `DB_URL` and `DB_USERNAME`.

4. Start the application:

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The API will run at `http://localhost:8080/api/students`.

## What I Learned

- Designing RESTful CRUD APIs
- Applying controller, service, repository, and entity layers
- Integrating Spring Boot with PostgreSQL
- Using JPA repositories and entity validation
- Protecting database credentials with environment variables

## Author

**Navinkumar J**  
B.E. Computer Science and Engineering, 2025  
Interested in Associate Software Engineer, Java Developer, Backend Developer, and Software Developer opportunities.
