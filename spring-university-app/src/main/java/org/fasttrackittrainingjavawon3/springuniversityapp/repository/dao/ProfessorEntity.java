package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "professors")
public class ProfessorEntity extends Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String cnp;
//
//    @OneToMany (cascade = CascadeType.ALL)
//    private List<EnrolmentEntity> schedules;
//
//    public List<EnrolmentEntity> getSchedules() {
//        return schedules;
//    }
//
//    public void setSchedules(List<EnrolmentEntity> schedules) {
//        this.schedules = schedules;
//    }

    public ProfessorEntity() {
    }

    public ProfessorEntity(String firstname, String lastname, String cnp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cnp = cnp;
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
