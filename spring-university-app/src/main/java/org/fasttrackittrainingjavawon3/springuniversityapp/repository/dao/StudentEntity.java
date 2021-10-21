package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "students")
public class StudentEntity extends Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String cnp;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_courses",
            joinColumns = {
                    @JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "scheduled_course_id")})
    private List<SchedulesEntity> schedules = new ArrayList<>();

    public List<SchedulesEntity> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<SchedulesEntity> schedules) {
        this.schedules = schedules;
    }

    public StudentEntity() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getCnp() {
        return cnp;
    }

    @Override
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }




}


