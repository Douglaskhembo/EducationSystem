package com.education.Education.mapper;

import com.education.Education.dto.StudentProfileDto;
import com.education.Education.model.StudentProfile;

public class StudentProfileMapper {

    public static StudentProfileDto mapToStudentProfileDto(StudentProfile studentProfile) {
        if (studentProfile == null) {
            return null;
        }
        return new StudentProfileDto(
                studentProfile.getStpId(),
                studentProfile.getBio(),
                studentProfile.getClassForm(),
                studentProfile.getFormStream(),
                StudentMapper.mapToStudentDto(studentProfile.getStudent())
        );
    }

    public static StudentProfile mapToStudentProfile(StudentProfileDto studentProfileDto) {
        if (studentProfileDto == null) {
            return null;
        }
        return new StudentProfile(
                studentProfileDto.getStpId(),
                studentProfileDto.getBio(),
                studentProfileDto.getClassForm(),
                studentProfileDto.getFormStream(),
                StudentMapper.mapToStudent(studentProfileDto.getStudent())
        );
    }
}
