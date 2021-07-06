package course5_6.Tema1;

import java.util.Objects;

public class Professor implements Human {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String specializationName;
    ProfessorType type;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {this.firstName = firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {this.lastName = lastName;

    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;

    }

    @Override
    public ScholarType getType() {
        return type;
    }



    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(lastName, professor.lastName) && Objects.equals(firstName, professor.firstName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, dateOfBirth, dateOfHiring, specializationName);
    }
}