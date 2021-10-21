package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "courses")
public class CoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String num;
    @Column
    private String title;

    @OneToMany(mappedBy = "semester")
    private Set<ScheduledCoursesEntity> scheduledCourses;

    public CoursesEntity() {
    }

    public CoursesEntity(String num, String title) {
        this.num = num;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<ScheduledCoursesEntity> getScheduledCourses() {
        return scheduledCourses;
    }

    public void setScheduledCourses(Set<ScheduledCoursesEntity> scheduledCourses) {
        this.scheduledCourses = scheduledCourses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesEntity that = (CoursesEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(num, that.num)
                && Objects.equals(title, that.title) && Objects.equals(scheduledCourses, that.scheduledCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num, title, scheduledCourses);
    }

    @Override
    public String toString() {
        return "CoursesEntity{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", title='" + title + '\'' +
                ", semesters=" + scheduledCourses +
                '}';
    }
}
