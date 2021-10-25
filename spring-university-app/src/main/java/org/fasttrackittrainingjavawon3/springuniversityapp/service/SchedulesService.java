package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.CourseRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.ProfessorRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SchedulesRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.SemesterRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SchedulesEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.SchedulesDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SchedulesService {


    private final SchedulesRepository repository;
    private final CourseRepository courseRepository;
    private final SemesterRepository semesterRepository;
    private final ProfessorRepository professorRepository;

    public SchedulesService(SchedulesRepository repository,
                            CourseRepository courseRepository,
                            SemesterRepository semesterRepository,
                            ProfessorRepository professorRepository) {
        this.repository = repository;
        this.courseRepository = courseRepository;
        this.semesterRepository = semesterRepository;
        this.professorRepository = professorRepository;
    }

    private SchedulesDto mapEntityToScheduleDto (SchedulesEntity schedulesEntity){
        SchedulesDto response= new SchedulesDto();
        response.setId(schedulesEntity.getId());
        response.setCourseId(schedulesEntity.getCourse().getId());
        response.setSemesterId(schedulesEntity.getSemester().getId());
        response.setProfessorId(schedulesEntity.getProfessor().getId());
        return  response;
    }

    public SchedulesDto createNewSchedule (SchedulesDto request ){
        SchedulesEntity newSchedule = new SchedulesEntity();
        Optional<SchedulesEntity> optionalSchedule = repository.findScheduleByCourseAndSemester(request.getCourseId(),
                request.getSemesterId());
        if (optionalSchedule.isPresent()){
            newSchedule= optionalSchedule.get();
        }else {
            newSchedule.setCourse(courseRepository.findById(request.getCourseId()).get());
            newSchedule.setSemester(semesterRepository.findById(request.getSemesterId()).get());
        }
        newSchedule.setProfessor(professorRepository.findById(request.getProfessorId()).get());
        SchedulesEntity saveEntity=this.repository.save(newSchedule);
        return mapEntityToScheduleDto(saveEntity);
    }

    public SchedulesDto updateSchedule(SchedulesDto requestDto){
        SchedulesEntity entityUpdate=new SchedulesEntity();
        entityUpdate.setId(requestDto.getId());
        entityUpdate.setCourse(courseRepository.findById(requestDto.getCourseId()).get());
        entityUpdate.setSemester(semesterRepository.findById(requestDto.getSemesterId()).get());
        entityUpdate.setProfessor(professorRepository.findById(requestDto.getProfessorId()).get());

        SchedulesEntity updatedSchedule = this.repository.save(entityUpdate);
        return mapEntityToScheduleDto(updatedSchedule);
    }

    public SchedulesDto getById(Long scheduleId){
        return this.repository.findById(scheduleId)
                .map(entity -> mapEntityToScheduleDto(entity))
                .get();
    }

    public List<SchedulesDto> getAll(){
        return this.repository.findAll()
                .stream()
                .map(this::mapEntityToScheduleDto)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id){
        this.repository.deleteById(id);
    }
}
