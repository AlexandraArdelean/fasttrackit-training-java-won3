package org.fasttrackittrainingjavawon3.springuniversityapp.controller;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.SemesterService;;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.SemesterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SemesterController {
    private final SemesterService semesterService;

    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }


    //GET to retrieve all semesters

    @GetMapping("/api/semesters")
    public ResponseEntity<List<SemesterDto>> getAll() {
        return ResponseEntity.ok(semesterService.getAll());

    }

    // create a new semester
    @PostMapping(path = "/api/semesters")
    public ResponseEntity getSemesters(@RequestBody SemesterDto toAdd){
        this.semesterService.addSemester(toAdd);
        return ResponseEntity.ok().build();
    }

    // get by id as a request param
    @GetMapping(path = "api/semesters/{id}")
    public void getById(@RequestParam(value = "id", required = false) Long id){
        this.semesterService.returnById(id);
    }



    // delete by id
    @DeleteMapping(path = "/api/semesters/{id}")
    public void deleteSemester(@RequestParam(value = "id", required = false) Long id){
        this.semesterService.deleteSemester(id);
    }
}
