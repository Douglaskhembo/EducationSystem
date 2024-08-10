package com.education.Education.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ed_student_profile")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stp_id")
    private Long id;
    @Column(name = "stp_bio")
    private String bio;
    @Column(name = "std_classForm")
    private String classForm;
    @Column(name = "std_formStream")
    private Long formStream;
    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(String bio, String classForm, Long formStream) {
        this.bio = bio;
        this.classForm = classForm;
        this.formStream = formStream;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
