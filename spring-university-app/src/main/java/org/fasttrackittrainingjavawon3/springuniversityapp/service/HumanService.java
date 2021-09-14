package org.fasttrackittrainingjavawon3.springuniversityapp.service;

import org.fasttrackittrainingjavawon3.springuniversityapp.model.Human;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.HumanRepository;
import org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao.HumanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HumanService {

    private final HumanRepository humanRepository;

    @Autowired
    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    //method to retrieve all humans

    public List<Human> getAllHumans() {
        final List<HumanEntity> allHumans = this.humanRepository.findAll();
        return allHumans.stream()
                .map(humanEntity -> {
                    Human humanCreated = new Human();
                    humanCreated.setId(humanEntity.getId());
                    humanCreated.setFirstname((humanEntity.getFirstname()));
                    humanCreated.setLastname(humanEntity.getLastname());
                    humanCreated.setCnp(humanEntity.getCnp());
                    return humanCreated;
                })
                .collect(Collectors.toList());


    }

    //create or update a human by id
    public void createOrUpdateHuman(Human toCreate) {

        HumanEntity createOrUpdateMe = new HumanEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        createOrUpdateMe.setCnp(toCreate.getCnp());
        this.humanRepository.save(createOrUpdateMe);
    }

    //method to return a single human by id


    public Human returnById(Long humanIdToFind) {
        Optional<HumanEntity> humanFound = humanRepository.findById(humanIdToFind);
        if (humanFound.isEmpty()) {
            return null;
        }
        HumanEntity human = humanFound.get();
        Human returnHuman = new Human();

        returnHuman.setId(human.getId());
        returnHuman.setFirstname(human.getFirstname());
        returnHuman.setLastname(human.getLastname());
        returnHuman.setCnp(human.getCnp());

        return returnHuman;
    }


    public void deleteHumanById(Long humanIdToDelete) {
        this.humanRepository.deleteById(humanIdToDelete);
    }
}
