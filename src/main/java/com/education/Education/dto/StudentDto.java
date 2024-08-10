package com.education.Education.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private Long studentAge;
    private String studentEmail;

    public StudentDto(Long id, String firstName, String lastName, Long studentAge, String studentEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
