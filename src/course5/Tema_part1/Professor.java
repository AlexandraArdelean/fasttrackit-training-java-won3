package course5.Tema_part1;

import java.util.Objects;

public class Professor implements Human{
    String dateOfHiring;
    String specializationName;

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
    public void firstName() {
        System.out.print("Ciprian ");
    }

    @Override
    public void lastName() {
        System.out.print("Pop. ");

    }

    @Override
    public void dateOfBirth() {
        System.out.println("Nascut la 01 martie 1969.");

    }

    @Override
    public String toString() {
        return "Professor{" +
                "dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(dateOfHiring, professor.dateOfHiring)
                && Objects.equals(specializationName, professor.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfHiring, specializationName);
    }
}
