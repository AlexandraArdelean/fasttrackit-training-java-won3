package org.fasttrackittrainingjavawon3.springuniversityapp.controller;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.CoursesService;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.CourseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    private final CoursesService coursesService;

    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    // Get method
    @GetMapping("/api/courses")

    public ResponseEntity<List<CourseDto>> getAllCourses() {
        return ResponseEntity.ok(coursesService.getAllCourses());
    }

    //POST to create a course

    @PostMapping("/api/courses")
    public ResponseEntity <CourseDto> createCourse(@RequestBody CourseDto courseDto) {
        this.coursesService.addCourses(courseDto);
        return ResponseEntity.ok().build();
    }


    // get by id as a request param
    @GetMapping(path = "api/courses/{id}")
    public void getById(@RequestParam(value = "id", required = false) Long id){
        this.coursesService.returnById(id);



    }
    //DELETE to delete a course by ID
    @DeleteMapping("/api/courses/{id}")
    public void deleteCourseById(@RequestParam(value = "id", required = false) Long idToDelete) {
        this.coursesService.deleteById(idToDelete);
    }
}
