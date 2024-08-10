package com.education.Education.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ed_students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "std_firstName")
    private String firstName;
    @Column(name = "std_lastName")
    private String lastName;
    @Column(name = "std_age")
    private Long studentAge;
    @Column(name = "std_email", unique = true)
    private String studentEmail;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, Long studentAge, String studentEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
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

    public void setStudentAge(Long age) {
        this.studentAge = age;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String email) {
        this.studentEmail = email;
    }
}
