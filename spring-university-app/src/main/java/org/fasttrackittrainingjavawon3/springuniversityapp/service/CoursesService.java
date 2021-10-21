package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.CourseRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.CoursesEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//
@Service
public class CoursesService {


    private final CourseRepository courseRepository;

    public CoursesService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    //  method to map Course Entity to DTO
    private CourseDto mapCourseEntityToDto(CoursesEntity entity) {
        CourseDto course = new CourseDto();
       course.setId(entity.getId());
       course.setTitle(entity.getTitle());
       course.setNum(entity.getNum());
       return course;

    }

    // post mapping
    public void addCourses(CourseDto toAdd){
        CoursesEntity entity=new CoursesEntity();
        toAdd.setId(entity.getId());
        toAdd.setTitle(entity.getTitle());
        toAdd.setNum(entity.getNum());
        this.courseRepository.save(entity);
    }


    // get mapping
    public List<CourseDto> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(this::mapCourseEntityToDto)
                .collect(Collectors.toList());
    }
      // get by id

        public CourseDto returnById(Long id){
            Optional<CoursesEntity> found= courseRepository.findById(id);
            if(found.isEmpty()){
                return null;
            }
            return found
                    .map(this::mapCourseEntityToDto)
                    .get();
        }

        // delete by id

    public void deleteById(Long id){
        this.courseRepository.deleteById(id);
    }



}