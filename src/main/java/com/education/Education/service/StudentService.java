package com.education.Education.service;

import com.education.Education.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);
    List<StudentDto> getAllStudent();
    StudentDto updateStudent(Long studentId, StudentDto studentDto);
    void deleteStudent(Long studentId);
    StudentDto getStudentByName(String firstName);
}
