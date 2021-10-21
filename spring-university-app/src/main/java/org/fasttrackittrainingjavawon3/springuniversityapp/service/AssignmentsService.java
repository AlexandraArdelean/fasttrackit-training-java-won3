package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.CourseRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SchedulesRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AssignmentsService {
    @Value("${server.port}")
    private String serverPort;


}