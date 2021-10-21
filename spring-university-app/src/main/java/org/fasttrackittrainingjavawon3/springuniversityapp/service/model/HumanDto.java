package org.fasttrackittrainingjavawon3.springuniversityapp.service.model;
import java.util.Objects;


public class HumanDto {
    private Long id;
    private String lastname;
    private String firstname;
    private String cnp;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanDto humanDto = (HumanDto) o;
        return Objects.equals(id, humanDto.id) && Objects.equals(lastname, humanDto.lastname)
                && Objects.equals(firstname, humanDto.firstname)
                && Objects.equals(cnp, humanDto.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, firstname, cnp);
    }

    @Override
    public String toString() {
        return "HumanDto{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
