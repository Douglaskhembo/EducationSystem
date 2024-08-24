package com.education.Education.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ed_school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schId;

    @Column(name = "sch_name", unique = true)
    private String schoolName;

    @Column(name = "sch_email", unique = true)
    private String schoolEmail;

    @Column(name = "sch_phoneNo", unique = true)
    private String schoolPhone;

    @Column(name = "sch_country")
    private String schoolCountry;

    @Column(name = "sch_county")
    private String schoolCounty;

    @OneToMany(
            mappedBy = "school"
    )
    @JsonManagedReference
    private List<Student> students;

    public School() {
    }

    public School(Long schId,String schoolName, String schoolEmail, String schoolPhone, String schoolCountry, String schoolCounty) {
        this.schoolName = schoolName;
        this.schoolEmail = schoolEmail;
        this.schoolPhone = schoolPhone;
        this.schoolCountry = schoolCountry;
        this.schoolCounty = schoolCounty;
        this.schId = schId;
    }

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
