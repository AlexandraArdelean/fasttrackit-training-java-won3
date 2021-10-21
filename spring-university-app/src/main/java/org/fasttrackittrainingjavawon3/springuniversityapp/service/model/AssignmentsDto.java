package org.fasttrackittrainingjavawon3.springuniversityapp.service.model;

import java.util.List;
import java.util.Objects;

public class AssignmentsDto {
    private List<Long> studentIds;
    private String universityDepartment;
    private String universityYear;
    private Long semesterNumber;

    public AssignmentsDto() {
    }

    public AssignmentsDto(List<Long> studentId,
                          String universityDepartment,
                          String universityYear,
                          Long semesterNumber) {


        this.studentIds = studentId;
        this.universityDepartment = universityDepartment;
        this.universityYear = universityYear;
        this.semesterNumber = semesterNumber;
    }

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }

    public String getUniversityDepartment() {
        return universityDepartment;
    }

    public void setUniversityDepartment(String universityDepartment) {
        this.universityDepartment = universityDepartment;
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear;
    }

    public Long getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(Long semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssignmentsDto that = (AssignmentsDto) o;
        return Objects.equals(studentIds, that.studentIds)
                && Objects.equals(universityDepartment, that.universityDepartment)
                && Objects.equals(universityYear, that.universityYear)
                && Objects.equals(semesterNumber, that.semesterNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentIds, universityDepartment, universityYear, semesterNumber);
    }

    @Override
    public String toString() {
        return "AssignmentsDto{" +
                "studentId=" + studentIds +
                ", universityDepartment='" + universityDepartment + '\'' +
                ", universityYear='" + universityYear + '\'' +
                ", semesterNumber=" + semesterNumber +
                '}';
    }


}
