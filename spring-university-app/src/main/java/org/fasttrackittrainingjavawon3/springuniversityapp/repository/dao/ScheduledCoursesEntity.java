package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "scheduled_courses")
public class ScheduledCoursesEntity {
    @EmbeddedId
    ScheduledCourseKey id;


    @ManyToOne
    @MapsId("semesterId")
    @JoinColumn(name = "course_id")
    private CoursesEntity course;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "semester_id")
    private SemesterEntity semester;


    @OneToMany
    private List<StudentEntity> students;

    @ManyToOne
    private ProfessorEntity professor;

    public ScheduledCoursesEntity() {
    }

    public ScheduledCourseKey getId() {
        return id;
    }

    public void setId(ScheduledCourseKey id) {
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

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduledCoursesEntity entity = (ScheduledCoursesEntity) o;
        return Objects.equals(id, entity.id) && Objects.equals(course, entity.course) && Objects.equals(semester, entity.semester) && Objects.equals(students, entity.students) && Objects.equals(professor, entity.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, semester, students, professor);
    }

    @Override
    public String toString() {
        return "ScheduledCoursesEntity{" +
                "id=" + id +
                ", course=" + course +
                ", semester=" + semester +
                ", students=" + students +
                ", professor=" + professor +
                '}';
    }
}
