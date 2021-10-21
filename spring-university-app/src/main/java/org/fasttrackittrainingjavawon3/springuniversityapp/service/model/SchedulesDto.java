package org.fasttrackittrainingjavawon3.springuniversityapp.service.model;

public class SchedulesDto {
    private Long id;
    private Long courseId;
    private Long semesterId;
    private Long professorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "SchedulesDto{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", semesterId=" + semesterId +
                ", professorId=" + professorId +
                '}';
    }
}
