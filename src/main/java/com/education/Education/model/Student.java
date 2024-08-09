package com.education.Education.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "std_firstName")
    private String firstName;
    @Column(name = "std_lastName")
    private String lastName;
    @Column(name = "std_age")
    private Integer age;
    @Column(name = "std_email", unique = true)
    private String email;

    public String getEmail() {
        return email;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
