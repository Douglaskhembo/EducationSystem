package com.education.Education.mapper;

import com.education.Education.dto.StudentDto;
import com.education.Education.model.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        return  new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getStudentAge(),
                student.getStudentEmail()
        );
    }

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getStudentAge(),
                studentDto.getStudentEmail()
        );
    }
}
