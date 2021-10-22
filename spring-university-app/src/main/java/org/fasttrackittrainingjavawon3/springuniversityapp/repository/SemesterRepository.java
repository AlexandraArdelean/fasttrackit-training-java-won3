package org.fasttrackittrainingjavawon3.springuniversityapp.repository;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.SemesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SemesterRepository extends JpaRepository<SemesterEntity, Long> {

    @Query(value = "select * from semester s where s.department = :department and s.year= :year", nativeQuery = true)

    List<SemesterEntity> findByUniversityDepartmentAndYear(
            @Param("department") String department,
            @Param("year") String year);
}
