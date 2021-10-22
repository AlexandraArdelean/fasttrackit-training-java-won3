package org.fasttrackittrainingjavawon3.springuniversityapp.controller;

import org.fasttrackittrainingjavawon3.springuniversityapp.service.AssignmentsService;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.AssignmentsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentsController {
    private final AssignmentsService service;

    public AssignmentsController(AssignmentsService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AssignmentsDto> createNewAssignment(@RequestBody AssignmentsDto assignmentsDto){
        return ResponseEntity.ok(service.createNewAssignment(assignmentsDto));
    }
}
