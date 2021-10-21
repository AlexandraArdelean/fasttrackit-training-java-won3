package org.fasttrackittrainingjavawon3.springuniversityapp.controller;

import org.fasttrackittrainingjavawon3.springuniversityapp.service.SchedulesService;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.SchedulesDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchedulesController {
    private final SchedulesService service;

    public SchedulesController(SchedulesService service) {
        this.service = service;
    }

    @GetMapping("/api/schedules/{id}")
    public SchedulesDto getScheduleById(@PathVariable(name = "id") Long scheduleId){
        return this.service.getById(scheduleId);

    }

    @GetMapping("/api/schedules/all")
    public List<SchedulesDto> getAllSchedules(){
        return service.getAll();

    }

    @PostMapping("/api/schedules")
    public ResponseEntity<SchedulesDto> createNewSchedule(@RequestBody SchedulesDto schedulesDto){
        return ResponseEntity.ok(service.createNewSchedule(schedulesDto));
    }

    @PutMapping("/api/schedules")
    public ResponseEntity<SchedulesDto> updateSchedule(@RequestBody SchedulesDto updateRequest) {
        if (updateRequest.getId() == null || updateRequest.getId() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(updateRequest);
        }
        return ResponseEntity.ok(service.updateSchedule(updateRequest));
    }

        @DeleteMapping("/api/schedules")
    public void deleteSchedule (@PathVariable(name = "id") Long idToDelete){
        this.service.deleteById(idToDelete);
    }
}
