package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;

@Table(name = "humans")
@Embeddable
public class HumanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //possibly no longer needed?
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private String cnp;

    public HumanEntity() {
    }

    public HumanEntity(String lastname, String firstname, String cnp) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.cnp = cnp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }


}

