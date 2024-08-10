package com.education.Education.service;

import com.education.Education.dto.SchoolDto;

import java.util.List;

public interface SchoolService {

    SchoolDto createSchool(SchoolDto schoolDto);
    SchoolDto getSchoolById(Long schoolId);
    List<SchoolDto> getAllSchools();
    SchoolDto updateSchool(Long schoolId, SchoolDto schoolDto);
    SchoolDto getSchoolByName(String schoolName);
    void deleteSchool(Long schoolId);
}
