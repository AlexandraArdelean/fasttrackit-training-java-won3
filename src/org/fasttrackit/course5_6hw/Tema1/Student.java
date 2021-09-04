package org.fasttrackit.course5_6hw.Tema1;

import java.util.Objects;

public class Student implements Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private String facultyName;
    private String specializationName;
    StudentType type;
    private String id;


    public Student(String firstName, String lastName, String dateOfBirth, String dateOfEnrollment,
                   String facultyName, String specializationName, StudentType type, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.facultyName = facultyName;
        this.specializationName = specializationName;
        this.type = type;
        this.id = id;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;


    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    @Override
    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    @Override
    public void setDateOfEnrollment(String dateOfEnrollement) {
        this.dateOfEnrollment = dateOfEnrollement;

    }


    @Override
    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;

    }

    @Override
    public String getSpecializationName() {
        return specializationName;
    }

    @Override
    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;

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
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName) && type == student.type && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName, type, id);
    }
}


