package com.education.Education.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "ed_student_profile")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stpId;
    @Column(name = "stp_bio", unique = true)
    private String bio;
    @Column(name = "std_classForm")
    private String classForm;
    @Column(name = "std_formStream")
    private Long formStream;
    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    @JsonBackReference
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(Long stpId, String bio, String classForm, Long formStream, Student student) {
        this.stpId = stpId;
        this.bio = bio;
        this.classForm = classForm;
        this.formStream = formStream;
        this.student = student;
    }

    public Long getStpId() {
        return stpId;
    }

    public void setStpId(Long stpId) {
        this.stpId = stpId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getClassForm() {
        return classForm;
    }

    public void setClassForm(String classForm) {
        this.classForm = classForm;
    }

    public Long getFormStream() {
        return formStream;
    }

    public void setFormStream(Long formStream) {
        this.formStream = formStream;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
