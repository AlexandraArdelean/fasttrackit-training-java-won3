package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackittrainingjavawon3.springuniversityapp.message.AssignmentsMessageDtoSender;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.AssignmentsRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SchedulesRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.AssignmentsEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.AssignmentsDto;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AssignmentsService {
    @Value("${server.port}")
    private String serverPort;

    private final AssignmentsRepository repository;
    private final SchedulesRepository schedulesRepository;
    private final RabbitTemplate rabbitMqTemplate;
    private final DirectExchange directExchange;

    public AssignmentsService(AssignmentsRepository repository,
                              SchedulesRepository schedulesRepository,
                              RabbitTemplate rabbitMqTemplate,
                              DirectExchange directExchange) {
        this.repository = repository;
        this.schedulesRepository = schedulesRepository;
        this.rabbitMqTemplate = rabbitMqTemplate;
        this.directExchange = directExchange;
    }

    //post

    public AssignmentsDto createNewAssignment (AssignmentsDto request){
        AssignmentsEntity newAssignment = new AssignmentsEntity();
        newAssignment.setSchedules(schedulesRepository.findById(request.getSchedulesId()).get());
        newAssignment.setUniversityDepartment(request.getUniversityDepartment());
        newAssignment.setSemesterNumber(request.getSemesterNumber());
        newAssignment.setUniversityYear(request.getUniversityYear());

        AssignmentsEntity saveEntity=this.repository.save(newAssignment);

        AssignmentsMessageDtoSender assignmentCreatedMessage= new AssignmentsMessageDtoSender();
        assignmentCreatedMessage.setSchedulesId(newAssignment.getSchedules().getId());
        assignmentCreatedMessage.setUniversityDepartment(newAssignment.getUniversityDepartment());
        assignmentCreatedMessage.setSemesterNumber(newAssignment.getSemesterNumber());
        assignmentCreatedMessage.setUniversityYear(newAssignment.getUniversityYear());
        ObjectMapper objectMapper = new ObjectMapper();


        try{
            String stringMessageConverted=objectMapper.writeValueAsString(assignmentCreatedMessage);
            rabbitMqTemplate.convertAndSend(directExchange.getName(), "assignments", stringMessageConverted);

        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
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
