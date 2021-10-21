package org.fasttrackittrainingjavawon3.springuniversityapp.controller;

import org.fasttrackittrainingjavawon3.springuniversityapp.service.ProfessorService;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.ProfessorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    // GET to return all professors

    @GetMapping("/api/professors")
    public ResponseEntity<List<ProfessorDto>> getAllProfessors() {
        return ResponseEntity.ok(professorService.getAllProfessors());
    }


    //GET by ID to retrieve a single professor by an ID given as a Request Parameter

    @GetMapping("/api/professors/{id}")
    public ResponseEntity getById(@RequestParam(value = "id", required = false) Long id) {

        return ResponseEntity.ok(professorService.returnById(id));

    }

    //POST to create or update a new professor by ID

    @PostMapping("/api/professors")
    public ResponseEntity createOrUpdateStudent(@RequestBody ProfessorDto professorRequest) {
        this.professorService.createOrUpdateProfessor(professorRequest);
        return ResponseEntity.ok().build();
    }

    //DELETE to delete a professor by ID
    @DeleteMapping("/api/professors")
    public void deleteProfessorById(@PathVariable(value = "id") Long id) {
        this.professorService.deleteProfessorById(id);
    }

}
