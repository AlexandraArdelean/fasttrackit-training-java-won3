package org.fasttrackittrainingjavawon3.springuniversityapp.service.model;

public class AssignmentsDto {
    private Long studentId;
    private Long scheduledCourseId;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getScheduledCourseId() {
        return scheduledCourseId;
    }

    public void setScheduledCourseId(Long scheduledCourseId) {
        this.scheduledCourseId = scheduledCourseId;
    }
}
