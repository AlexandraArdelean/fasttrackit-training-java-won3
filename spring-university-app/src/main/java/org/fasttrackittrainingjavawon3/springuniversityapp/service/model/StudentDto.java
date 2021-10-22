package org.fasttrackittrainingjavawon3.springuniversityapp.service.model;


import java.util.ArrayList;
import java.util.List;

public class StudentDto extends HumanDto {

    public StudentDto() {
    }

//    public List<SchedulesDto> scheduledCourses = new ArrayList<>();
//
//    public <R> StudentDto(Long id, String firstname, String lastname, String cnp, R collect) {
//        super();
//    }
//
//    public List<SchedulesDto> getScheduledCourses() {
//        return scheduledCourses;
//    }
//
//    public void setScheduledCourses(List<SchedulesDto> scheduledCourses) {
//        this.scheduledCourses = scheduledCourses;
//    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getLastname() {
        return super.getLastname();
    }

    @Override
    public void setLastname(String lastname) {
        super.setLastname(lastname);
    }

    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public void setFirstname(String firstname) {
        super.setFirstname(firstname);
    }

    @Override
    public String getCnp() {
        return super.getCnp();
    }

    @Override
    public void setCnp(String cnp) {
        super.setCnp(cnp);
    }


}


