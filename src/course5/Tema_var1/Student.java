package course5.Tema_var1;

import java.util.Objects;

public class Student implements Human {

    String dateOfEnrollment;
    String facultyName;
    String specializationName;



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
    public void firstName() {
        System.out.print("Alexandra ");
    }

    @Override
    public void lastName() {
        System.out.print("Ardelean. ");
    }

    @Override
    public void dateOfBirth() {
        System.out.println("Nascuta la 24 noiembrie 1991.");

    }



    @Override
    public String toString() {
        return "Student{" +
                "dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(dateOfEnrollment, student.dateOfEnrollment)
                && Objects.equals(facultyName, student.facultyName)
                && Objects.equals(specializationName, student.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfEnrollment, facultyName, specializationName);
    }
}

