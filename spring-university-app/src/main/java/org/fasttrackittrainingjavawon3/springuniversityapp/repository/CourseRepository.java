package org.fasttrackittrainingjavawon3.springuniversityapp.repository;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CoursesEntity, Long>{
}
