package org.fasttrackit.course9_10;

import org.fasttrackit.course5_6hw.Tema1.*;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.stream.Collectors;

public class HumanRepository<T extends Human> {

    List<T> humans = new ArrayList<>();

    //2.1. A method add(T humanToAdd) to add a human T to the list.
    //Throw ValidationException when add is called with a null "toAdd" object

    public void add(T toAdd) throws ValidationException {
        if (toAdd == null) {
            throw new ValidationException("Null value provided!");
        }
        humans.add(toAdd);


    }
    //2.2. A method getAll() to read all humans inside the list.

    public List<T> getAll() {
        return humans.stream()
                .collect(Collectors.toList());
    }

    //2.3. A method deleteById(String id)  to delete a human based on an ID
    // Throw EntityNotFoundException when deleteById is called, but there is no object for the given ID.

    public void deleteById(String id) throws EntityNotFoundException {

        humans.removeIf(human -> human.getId().equals(id));

        throw new EntityNotFoundException("The Id provided doesn't exists!");

    }


    //2.4. A method updateById(String id, T humanUpdate) to modify a human based on its given ID
    //Throw EntityNotFoundException when updateById is called, but there is no object for the given ID.
    //Throw ValidationException when updateById is called with a null "T human" value

    public void updateById(String id, T humanUpdate) throws EntityNotFoundException, ValidationException {

        if (humanUpdate == null) {
            throw new ValidationException("Null value provided!");

        }

        humans.stream()
                .filter(human1 -> human1.getId().equals(id))
                .forEach(human1 -> {
                    human1.setFirstName(humanUpdate.getFirstName());
                    human1.setLastName(humanUpdate.getLastName());
                    human1.setDateOfBirth(humanUpdate.getDateOfBirth());
                    human1.setDateOfEnrollment(humanUpdate.getDateOfEnrollment());
                    human1.setFacultyName(humanUpdate.getFacultyName());
                    human1.setSpecializationName(humanUpdate.getSpecializationName());
                });
        throw new EntityNotFoundException("The ID doesn't exists!");

    }


    //2.6. A method getAllByName(String name) to read all humans by name.
    //Throw ValidationException when getAllByName is called with a null "name" String

    public void getAllByName(String name) throws ValidationException {
        if (name == null) {
            throw new ValidationException("The name provided is null. Please check your input!");
        }

        humans.removeIf(human -> !human.getFirstName().equals(name));


    }


}










