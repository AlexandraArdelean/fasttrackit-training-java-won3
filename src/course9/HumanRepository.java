package course9;

import course5_6hw.Tema1.*;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.stream.Collectors;

public class HumanRepository<T extends Human> {

    List<T> humans = new ArrayList<>();

    //2.1. A method add(T humanToAdd) to add a human T to the list.

    public void add(T toAdd) {
        humans.add(toAdd);

    }
    //2.2. A method getAll() to read all humans inside the list.

    public List<T> getAll() {
        return humans.stream()
                .collect(Collectors.toList());
    }

    //2.3. A method deleteById(String id)  to delete a human based on an ID


    public void deleteById(String id) {
        humans.removeIf(human -> human.getId().equals(id));
    }

    //2.4. A method updateById(String id, T humanUpdate) to modify a human based on its given ID

    public void updateById(String id, T humanUpdate) {
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
    }
    //2.6. A method getAllByName(String name) to read all humans by name.

    public void getAllByName(String name) {
         humans.removeIf(human->!human.getFirstName().equals(name));




    }


}









