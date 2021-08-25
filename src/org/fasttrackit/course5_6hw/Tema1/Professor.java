package org.fasttrackit.course5_6hw.Tema1;

import java.util.Objects;

public class Professor implements Human {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String specializationName;
    private String dateOfEnrollment;
    private String facultyName;
    ProfessorType type;
    private String id;


    public Professor(String lastName, String firstName, String dateOfBirth, String dateOfHiring,
                     String specializationName, String dateOfEnrollment,
                     String facultyName, ProfessorType type, String id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.specializationName = specializationName;
        this.dateOfEnrollment = dateOfEnrollment;
        this.facultyName = facultyName;
        this.type = type;
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName=firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName=lastName;

    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth=dateOfBirth;

    }

    @Override
    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    @Override
    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment=dateOfEnrollment;

    }

    @Override
    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public void setFacultyName(String facultyName) {
        this.facultyName=facultyName;

    }

    @Override
    public String getSpecializationName() {
        return specializationName;
    }

    @Override
    public void setSpecializationName(String specializationName) {
        this.specializationName=specializationName;

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id=id;

    }

    @Override
    public ScholarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", type=" + type +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(lastName, professor.lastName) && Objects.equals(firstName, professor.firstName)
                && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring)
                && Objects.equals(specializationName, professor.specializationName) &&
                Objects.equals(dateOfEnrollment, professor.dateOfEnrollment) && Objects.equals(facultyName, professor.facultyName)
                && type == professor.type && Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, dateOfBirth, dateOfHiring, specializationName, dateOfEnrollment,
                facultyName, type, id);
    }
}
