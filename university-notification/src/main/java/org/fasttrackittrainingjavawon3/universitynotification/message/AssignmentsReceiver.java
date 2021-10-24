package org.fasttrackittrainingjavawon3.universitynotification.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackittrainingjavawon3.universitynotification.model.AssignmentsMessageDto;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
@RabbitListener(queues = "assignments")
public class AssignmentsReceiver {


    @RabbitHandler
    public void receiveAssignments(String assignmentMessage){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            AssignmentsMessageDto messageReceiver=
                    objectMapper.readValue(assignmentMessage, AssignmentsMessageDto.class);
            System.out.println("SchedulesId: " + messageReceiver.getSchedulesId());
            System.out.println("University Department: " + messageReceiver.getUniversityDepartment());
            System.out.println("University Year: " + messageReceiver.getUniversityYear());
            System.out.println("Semester Number: " + messageReceiver.getSemesterNumber());

        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
