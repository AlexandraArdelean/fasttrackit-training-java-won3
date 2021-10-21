package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.repository.ProfessorRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.ProfessorEntity;
import org.fasttrackittrainingjavawon3.springuniversityapp.service.model.ProfessorDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    // method to map Entity to DTO
    public ProfessorDto mapEntityToDTO(ProfessorEntity entity) {
        ProfessorDto professorDto = new ProfessorDto();
        professorDto.setId(entity.getId());
        professorDto.setFirstname(entity.getFirstname());
        professorDto.setLastname(entity.getLastname());
        professorDto.setCnp(entity.getCnp());
        return professorDto;
    }

    //create or update a human by id
    public void createOrUpdateProfessor(ProfessorDto toCreate) {

        ProfessorEntity createOrUpdateMe = new ProfessorEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        this.professorRepository.save(createOrUpdateMe);
    }


    //method to get all professors
    public List<ProfessorDto> getAllProfessors() {
        return this.professorRepository.findAll()
                .stream()
                .map(entity->mapEntityToDTO(entity))
                .collect(Collectors.toList());

    }



    //method to return a single professor by id
    public ProfessorDto returnById(Long professorIdToFind) {
        Optional<ProfessorEntity> professorFound = professorRepository.findById(professorIdToFind);
        if (professorFound.isEmpty()) {
            return null;
        }
        return professorFound
                .map(entity->mapEntityToDTO(entity))
                .get();
    }

    // method to delete a professor
    public void deleteProfessorById(Long professorIdToDelete) {
        this.professorRepository.deleteById(professorIdToDelete);
    }
}
