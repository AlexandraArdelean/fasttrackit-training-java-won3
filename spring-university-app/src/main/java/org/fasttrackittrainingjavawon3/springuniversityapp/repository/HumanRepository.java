package org.fasttrackittrainingjavawon3.springuniversityapp.repository;


import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Long> {
    List<HumanEntity> findAllByIdContains(Long id);


}
