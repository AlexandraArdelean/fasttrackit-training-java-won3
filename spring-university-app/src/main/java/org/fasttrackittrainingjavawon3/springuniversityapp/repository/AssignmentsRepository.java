package org.fasttrackittrainingjavawon3.springuniversityapp.repository;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.AssignmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentsRepository extends JpaRepository<AssignmentsEntity, Long> {
}
