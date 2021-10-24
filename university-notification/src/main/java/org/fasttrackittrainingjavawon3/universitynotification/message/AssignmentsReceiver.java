package org.fasttrackittrainingjavawon3.universitynotification.message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackittrainingjavawon3.universitynotification.model.AssignmentsMessageReceiver;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
@RabbitListener(queues = "assignments")
public class AssignmentsReceiver {


    @RabbitHandler
    public void receiveAssignments(String assignmentMessage){


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            AssignmentsMessageReceiver messageReceived=
                    objectMapper.readValue(assignmentMessage, AssignmentsMessageReceiver.class);
            System.out.println("SchedulesId: " + messageReceived.getSchedulesId());
            System.out.println("University Department: " + messageReceived.getUniversityDepartment());
            System.out.println("University Year: " + messageReceived.getUniversityYear());
            System.out.println("Semester Number: " + messageReceived.getSemesterNumber());

        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
