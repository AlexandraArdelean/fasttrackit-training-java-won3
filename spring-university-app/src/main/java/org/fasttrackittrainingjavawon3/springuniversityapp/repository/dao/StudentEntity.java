package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "semesterId", insertable = false, updatable = false),
            @JoinColumn(name = "courseId", insertable = false, updatable = false)
    })
    private ScheduledCoursesEntity schedule;


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

    public ScheduledCoursesEntity getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduledCoursesEntity schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(firstname, that.firstname)
                && Objects.equals(lastname, that.lastname)
                && Objects.equals(cnp, that.cnp) && Objects.equals(schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, cnp, schedule);
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cnp='" + cnp + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}


