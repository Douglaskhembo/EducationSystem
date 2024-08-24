package com.education.Education.dto;

import java.util.Collections;
import java.util.List;

public class SchoolDto {
    private Long schId;
    private String schoolName;
    private String schoolEmail;
    private String schoolPhone;
    private String schoolCountry;
    private String schoolCounty;
    private List<StudentDto> students = Collections.emptyList();

    public SchoolDto(Long schId, String schoolName, String schoolEmail, String schoolPhone,
                     String schoolCountry, String schoolCounty) {
        this.schId = schId;
        this.schoolName = schoolName;
        this.schoolEmail = schoolEmail;
        this.schoolPhone = schoolPhone;
        this.schoolCountry = schoolCountry;
        this.schoolCounty = schoolCounty;
    }

    // Getters and Setters
    public Long getSchId() {
        return schId;
    }

    public void setSchId(Long schId) {
        this.schId = schId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public String getSchoolCountry() {
        return schoolCountry;
    }

    public void setSchoolCountry(String schoolCountry) {
        this.schoolCountry = schoolCountry;
    }

    public String getSchoolCounty() {
        return schoolCounty;
    }

    public void setSchoolCounty(String schoolCounty) {
        this.schoolCounty = schoolCounty;
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }
}
