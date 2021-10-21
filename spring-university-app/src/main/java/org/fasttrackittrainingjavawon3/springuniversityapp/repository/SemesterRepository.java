package org.fasttrackittrainingjavawon3.springuniversityapp.repository;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepository extends JpaRepository <SemesterEntity, Long>{

}
