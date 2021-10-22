package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.List;

@Entity(name = "scheduled_courses")
public class SchedulesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CoursesEntity course;
    @ManyToOne
    private SemesterEntity semester;
    @ManyToOne
    private ProfessorEntity professor;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AssignmentsEntity> assignments;

    public SchedulesEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CoursesEntity getCourse() {
        return course;
    }

    public void setCourse(CoursesEntity course) {
        this.course = course;
    }

    public SemesterEntity getSemester() {
        return semester;
    }

    public void setSemester(SemesterEntity semester) {
        this.semester = semester;
    }

    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    public List<AssignmentsEntity> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<AssignmentsEntity> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "SchedulesEntity{" +
                "id=" + id +
                ", course=" + course +
                ", semester=" + semester +
                ", professor=" + professor +
                ", assignments=" + assignments +
                '}';
    }
}
