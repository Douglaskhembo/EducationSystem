package com.education.Education.dto;

public class StudentProfileDto {
    private Long id;
    private String bio;
    private String classForm;
    private Long formStream;

    public StudentProfileDto(String bio, String classForm, Long formStream) {
        this.bio = bio;
        this.classForm = classForm;
        this.formStream = formStream;
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
