package com.education.Education.mapper;

import com.education.Education.dto.StudentDto;
import com.education.Education.model.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student) {
        if (student == null) {
            return null;
        }
        return new StudentDto(
                student.getStdId(),
                student.getFirstName(),
                student.getLastName(),
                student.getStudentAge(),
                student.getStudentEmail(),
                StudentProfileMapper.mapToStudentProfileDto(student.getStudentProfile()),
                SchoolMapper.mapToSchoolDto(student.getSchool())
        );
    }

    public static Student mapToStudent(StudentDto studentDto) {
        if (studentDto == null) {
            return null;
        }
        Student student = new Student(
                studentDto.getStdId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getStudentAge(),
                studentDto.getStudentEmail()
        );
        return student;
    }
}
