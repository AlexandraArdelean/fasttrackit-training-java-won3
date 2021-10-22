package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.AssignmentsRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SchedulesRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.AssignmentsEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.AssignmentsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AssignmentsService {
    @Value("${server.port}")
    private String serverPort;

    private final AssignmentsRepository repository;
    private final SchedulesRepository schedulesRepository;

    public AssignmentsService(AssignmentsRepository repository,
                              SchedulesRepository schedulesRepository) {
        this.repository = repository;
        this.schedulesRepository = schedulesRepository;
    }

    //post

    public AssignmentsDto createNewAssignment (AssignmentsDto request){
        AssignmentsEntity newAssignment = new AssignmentsEntity();
        newAssignment.setSchedules(schedulesRepository.findById(request.getSchedulesId()).get());
        newAssignment.setUniversityDepartment(request.getUniversityDepartment());
        newAssignment.setSemesterNumber(request.getSemesterNumber());
        newAssignment.setUniversityYear(request.getUniversityYear());
        AssignmentsEntity saveEntity=this.repository.save(newAssignment);
        return mapEntityToAssignmentResponse(saveEntity);
    }

    public AssignmentsDto mapEntityToAssignmentResponse(AssignmentsEntity entity){
        AssignmentsDto response= new AssignmentsDto();
        response.setId(entity.getId());
        response.setSchedulesId(entity.getSchedules().getId());
        response.setUniversityDepartment(entity.getUniversityDepartment());
        response.setSemesterNumber(entity.getSemesterNumber());
        response.setUniversityYear(entity.getUniversityYear());
        return response;

    }
}
