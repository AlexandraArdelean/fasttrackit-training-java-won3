package org.fasttrackittrainingjavawon3.springuniversityapp.repository;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SchedulesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchedulesRepository extends JpaRepository<SchedulesEntity, Long> {
    @Query(value = "select * from scheduled_courses sc where sc.semester_id = :semester_id and sc.course_id= :course_id", nativeQuery = true)
    Optional<SchedulesEntity> findScheduleByCourseAndSemester(
            @Param("course_id") Long courseId,
            @Param("semester_id") Long semesterId);
}
