package com.education.Education.mapper;

import com.education.Education.dto.SchoolDto;
import com.education.Education.model.School;

public class SchoolMapper {

    public static SchoolDto mapToSchoolDto(School school) {
        if (school == null) {
            return null;
        }
        return new SchoolDto(
                school.getSchId(),
                school.getSchoolName(),
                school.getSchoolEmail(),
                school.getSchoolPhone(),
                school.getSchoolCountry(),
                school.getSchoolCounty()
        );
    }

    public static School mapToSchool(SchoolDto schoolDto) {
        if (schoolDto == null) {
            return null;
        }
        return new School(
                schoolDto.getSchId(),
                schoolDto.getSchoolName(),
                schoolDto.getSchoolEmail(),
                schoolDto.getSchoolPhone(),
                schoolDto.getSchoolCountry(),
                schoolDto.getSchoolCounty()
        );
    }
}
