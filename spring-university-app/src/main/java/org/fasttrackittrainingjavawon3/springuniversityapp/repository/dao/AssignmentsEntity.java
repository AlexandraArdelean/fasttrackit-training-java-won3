package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;

@Entity(name = "student_courses")
public class AssignmentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String universityDepartment;
    @Column
    private String universityYear;
    @Column
    private String semesterNumber;
    @ManyToOne
    private SchedulesEntity schedules;

    public AssignmentsEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(String semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public SchedulesEntity getSchedules() {
        return schedules;
    }

    public void setSchedules(SchedulesEntity schedules) {
        this.schedules = schedules;
    }


}
