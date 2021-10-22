package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "semester")
public class SemesterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String department;
    @Column
    private String year;
    @Column
    private Long semester;
    @Column
    private String starting;
    @Column
    private String ending;

    public SemesterEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Long getSemester() {
        return semester;
    }

    public void setSemester(Long semester) {
        this.semester = semester;
    }

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }

    @Override
    public String toString() {
        return "SemesterEntity{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", year='" + year + '\'' +
                ", semester=" + semester +
                ", starting='" + starting + '\'' +
                ", ending='" + ending + '\'' +
                '}';
    }
}
