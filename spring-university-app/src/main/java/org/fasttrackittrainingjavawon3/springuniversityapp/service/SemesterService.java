package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SemesterRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.CoursesEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.ScheduledCoursesEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SemesterEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.CourseDto;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.SemesterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SemesterService {

    private final SemesterRepository semesterRepository;

    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }


    //  method to map Semester Entity to DTO
    private SemesterDto mapSemesterEntityToDto(SemesterEntity entity) {
        SemesterDto newSemester = new SemesterDto();
        newSemester.setId(entity.getId());
        newSemester.setDepartment(entity.getDepartment());
        newSemester.setSemester(entity.getSemester());
        newSemester.setYear(entity.getYear());
        newSemester.setStarting(entity.getStarting());
        newSemester.setEnding(entity.getEnding());

        return newSemester;

    }


    //method to add a semester
    public void addSemester(SemesterDto toAdd) {
        SemesterEntity semesterEntity = new SemesterEntity();
        semesterEntity.setId(toAdd.getId());
        semesterEntity.setDepartment(toAdd.getDepartment());
        semesterEntity.setSemester(toAdd.getSemester());
        semesterEntity.setYear(toAdd.getYear());
        semesterEntity.setStarting(toAdd.getStarting());
        semesterEntity.setEnding(toAdd.getEnding());

        semesterEntity.setCourses(toAdd.getCourses().stream().map(courseDto -> {
            ScheduledCoursesEntity entity = new ScheduledCoursesEntity();
            entity.setSemester(semesterEntity);
            entity.setCourse(new CoursesEntity(courseDto.getNum(), courseDto.getTitle()));
            return entity;
        }).collect(Collectors.toSet()));
        this.semesterRepository.save(semesterEntity);
    }
    // method to get all semesters

    public List<SemesterDto> getAll() {
        return this.semesterRepository.findAll()
                .stream()
                .map((this::mapSemesterEntityToDto))
                .collect(Collectors.toList());
    }

    // method to return a semester by id

    public SemesterDto returnById(Long semesterIdToFind) {
        Optional<SemesterEntity> semesterFound = semesterRepository.findById(semesterIdToFind);
        if (semesterFound.isEmpty()) {
            return null;
        }
        return semesterFound
                .map(semesterEntity -> mapSemesterEntityToDto(semesterEntity))
                .get();
    }

    //method to delete a semester by id

    public void deleteSemester(Long id) {
        this.semesterRepository.deleteById(id);
    }

}


