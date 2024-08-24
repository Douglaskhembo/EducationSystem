package com.education.Education.dto;

import com.education.Education.model.School;
import com.education.Education.model.StudentProfile;

import java.io.Serializable;

public class StudentDto implements Serializable {
    private Long stdId;
    private String firstName;
    private String lastName;
    private Long studentAge;
    private String studentEmail;
    private StudentProfileDto studentProfile;
    private SchoolDto school;
    public StudentDto(Long stdId, String firstName, String lastName, Long studentAge, String studentEmail,
                      StudentProfileDto studentProfile, SchoolDto school) {
        this.stdId = stdId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentProfile = studentProfile;
        this.school = school;
    }

    public Long getStdId() {
        return stdId;
    }

    public void setStdId(Long stdId) {
        this.stdId = stdId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Long studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public StudentProfileDto getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfileDto studentProfile) {
        this.studentProfile = studentProfile;
    }

    public SchoolDto getSchool() {
        return school;
    }

    public void setSchool(SchoolDto school) {
        this.school = school;
    }
}
