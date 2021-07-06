package course5.Tema_var2;

import java.util.Objects;

public class Student implements Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private String facultyName;
    private String specializationName;
    StudentType type;



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
    public StudentType getType() {
        return type;
    }




    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName);
    }
}