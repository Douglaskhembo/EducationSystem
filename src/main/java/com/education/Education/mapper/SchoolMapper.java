package com.education.Education.mapper;

import com.education.Education.dto.SchoolDto;
import com.education.Education.model.School;

public class SchoolMapper {
    public static SchoolDto mapToSchoolDto(School school){
        return new SchoolDto(
                school.getId(),
                school.getSchoolName(),
                school.getSchoolEmail(),
                school.getSchoolPhone(),
                school.getSchoolCountry(),
                school.getSchoolCounty()
        );
    }

    public static School mapToSchool(SchoolDto schoolDto){
        return new School(
                schoolDto.getId(),
                schoolDto.getSchoolName(),
                schoolDto.getSchoolEmail(),
                schoolDto.getSchoolPhone(),
                schoolDto.getSchoolCountry(),
                schoolDto.getSchoolCounty()
        );
    }
}
