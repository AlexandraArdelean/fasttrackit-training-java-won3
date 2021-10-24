package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.*;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.*;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final SchedulesRepository schedulesRepository;
    private final ProfessorRepository professorRepository;
    private final SemesterRepository semesterRepository;
    private final CourseRepository courseRepository;



    public StudentService(StudentRepository studentRepository,
                          SchedulesRepository schedulesRepository, ProfessorRepository professorRepository,
                          SemesterRepository semesterRepository,
                          CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.schedulesRepository = schedulesRepository;

        this.professorRepository = professorRepository;
        this.semesterRepository = semesterRepository;
        this.courseRepository = courseRepository;

    }

    // method to map student Entity to DTO
    private StudentDto mapEntityToDTO(StudentEntity entity) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(entity.getId());
        studentDto.setFirstname(entity.getFirstname());
        studentDto.setLastname(entity.getLastname());
        studentDto.setCnp(entity.getCnp());

        return studentDto;
    }

    //create or update a student
    public void createOrUpdateStudent(StudentDto toCreate) {
        StudentEntity createOrUpdateMe = new StudentEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        createOrUpdateMe.setCnp(toCreate.getCnp());

        this.studentRepository.save(createOrUpdateMe);

    }

    //method to return the students
    public List<StudentDto> getAllStudents() {
        return this.studentRepository.findAll()
                .stream()
                .map((entity -> mapEntityToDTO(entity)))
                .collect(Collectors.toList());
    }

    //method to return a single student by id
    public StudentDto returnById(Long studentIdToFind) {
        Optional<StudentEntity> studentFound = studentRepository.findById(studentIdToFind);
        if (studentFound.isEmpty()) {
            return null;
        }
        return studentFound
                .map(studentEntity -> mapEntityToDTO(studentEntity))
                .get();

    }

    // method to delete a student
    public void deleteStudentById(Long studentIdToDelete) {
        this.studentRepository.deleteById(studentIdToDelete);
    }


}