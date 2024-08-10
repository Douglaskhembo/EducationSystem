package com.education.Education.dto;

import jakarta.persistence.Column;

public class SchoolDto {
    private Long id;
    private String schoolName;
    private String schoolEmail;
    private String schoolPhone;
    private String schoolCountry;
    private String schoolCounty;

    public SchoolDto(Long id, String schoolName, String schoolEmail, String schoolPhone,
                     String schoolCountry, String schoolCounty) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolEmail = schoolEmail;
        this.schoolPhone = schoolPhone;
        this.schoolCountry = schoolCountry;
        this.schoolCounty = schoolCounty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
