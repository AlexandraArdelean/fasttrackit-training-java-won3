package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.AssignmentsRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.CourseRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SchedulesRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.StudentRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.AssignmentsEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SchedulesEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.AssignmentsDto;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.SchedulesDto;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.StudentDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentsService {
    @Value("${server.port}")
    private String serverPort;

    private final AssignmentsRepository repository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final SchedulesRepository schedulesRepository;


    public AssignmentsService(AssignmentsRepository repository,
                              StudentRepository studentRepository,
                              CourseRepository courseRepository,
                              SchedulesRepository schedulesRepository) {
        this.repository = repository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.schedulesRepository = schedulesRepository;
    }

}