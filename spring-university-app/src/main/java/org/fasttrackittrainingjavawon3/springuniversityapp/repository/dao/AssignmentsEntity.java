package org.fasttrackittrainingjavawon3.springuniversityapp.repository.dao;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student_courses")
public class AssignmentsEntity {
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
