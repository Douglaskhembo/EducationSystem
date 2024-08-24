package com.education.Education.dto;

public class StudentProfileDto {

    private Long stpId;
    private String bio;
    private String classForm;
    private Long formStream;
    private StudentDto student;

    public StudentProfileDto(Long stpId, String bio, String classForm, Long formStream, StudentDto student) {
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

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }
}
