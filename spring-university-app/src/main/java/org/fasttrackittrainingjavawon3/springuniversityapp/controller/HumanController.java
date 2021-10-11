//package org.fasttrackittrainingjavawon3.springuniversityapp.controller;
//import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.HumanEntity;
//import org.fasttrackittrainingjavawon3.springuniversityapp.service.HumanService;
//import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.HumanDto;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class HumanController {
//
//    private final HumanService humanService;
//
//    public HumanController(HumanService service) {
//
//        this.humanService = service;
//    }
//
//
//  //  //GET to retrieve all Humans
//
//    @GetMapping("/api/humans")
//    public ResponseEntity<List<HumanDto>> getAllHumans() {
//        return ResponseEntity.ok(humanService.getAllHumans());
//
//    }
//
//    //GET by ID to retrieve a single Human by an ID given as a Request Parameter
//
//    @GetMapping("/api/humans/{id}")
//    public ResponseEntity getById(@RequestParam(value = "id", required = false) Long id) {
//
//        return ResponseEntity.ok(humanService.returnById(id));
//
//    }
//    //POST to create or update a new Human by ID
//
//    @PostMapping("/api/humans")
//    public ResponseEntity createOrUpdateHuman(@RequestBody HumanDto humanRequest) {
//        this.humanService.createOrUpdateHuman(humanRequest);
//        return ResponseEntity.ok().build();
//    }
//
//    //DELETE to delete a Human by ID
//    @DeleteMapping("/api/humans")
//    public void deleteHumanById(@PathVariable(value = "id") Long id) {
//        this.humanService.deleteHumanById(id);
//    }
//
//}