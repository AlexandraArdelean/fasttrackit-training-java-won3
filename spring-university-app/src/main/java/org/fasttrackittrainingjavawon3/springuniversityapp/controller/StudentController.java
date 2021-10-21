package org.fasttrackittrainingjavawon3.springuniversityapp.controller;

import org.fasttrackittrainingjavawon3.springuniversityapp.service.StudentService;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET to return all students
    @GetMapping("/api/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }


    //GET by ID to retrieve a single student by an ID given as a Request Parameter
    @GetMapping("/api/students/{id}")
    public ResponseEntity getById(@RequestParam(value = "id", required = false) Long id) {

        return ResponseEntity.ok(studentService.returnById(id));

    }

    //POST to create or update a new student by ID
    @PostMapping("/api/students")
    public ResponseEntity createOrUpdateStudent(@RequestBody StudentDto studentRequest) {
        this.studentService.createOrUpdateStudent(studentRequest);
        return ResponseEntity.ok().build();
    }

    //DELETE to delete a student by ID
    @DeleteMapping("/api/students")
    public void deleteStudentById(@PathVariable(value = "id") Long id) {
        this.studentService.deleteStudentById(id);
    }


}
