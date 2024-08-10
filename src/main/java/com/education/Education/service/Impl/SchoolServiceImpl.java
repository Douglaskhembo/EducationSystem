package com.education.Education.service.Impl;

import com.education.Education.dto.SchoolDto;
import com.education.Education.exception.ResourceNotFoundException;
import com.education.Education.mapper.SchoolMapper;
import com.education.Education.model.School;
import com.education.Education.repository.SchoolRepository;
import com.education.Education.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public SchoolDto createSchool(SchoolDto schoolDto) {
        School school = SchoolMapper.mapToSchool(schoolDto);
        School savedSchool = schoolRepository.save(school);
        return SchoolMapper.mapToSchoolDto(savedSchool);
    }

    @Override
    public SchoolDto getSchoolById(Long schoolId) {
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(()-> new ResourceNotFoundException("School not found for id, " +schoolId));
        return SchoolMapper.mapToSchoolDto(school);
    }

    @Override
    public List<SchoolDto> getAllSchools() {
        List<School> schools = schoolRepository.findAll();
        return schools.stream().map((SchoolMapper::mapToSchoolDto))
                .collect(Collectors.toList());
    }

    @Override
    public SchoolDto updateSchool(Long schoolId, SchoolDto schoolDto) {
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(()-> new ResourceNotFoundException("School not found for id, " +schoolId));

        school.setSchoolName(schoolDto.getSchoolName());
        school.setSchoolEmail(schoolDto.getSchoolEmail());
        school.setSchoolPhone(schoolDto.getSchoolPhone());
        school.setSchoolCountry(schoolDto.getSchoolCountry());
        school.setSchoolCounty(schoolDto.getSchoolCounty());

        School school1 = schoolRepository.save(school);
        return SchoolMapper.mapToSchoolDto(school1);
    }

    @Override
    public List<SchoolDto> getSchoolByName(String schoolName) {
        List<School> schools = schoolRepository.findSchoolByName(schoolName);
        if (schools.isEmpty()){
            throw new ResourceNotFoundException("School not found for name, " +schoolName);
        }
        return schools.stream().map((SchoolMapper::mapToSchoolDto))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSchool(Long schoolId) {
        School school = schoolRepository.findById(schoolId)
                .orElseThrow(()-> new ResourceNotFoundException("School not found for id, " +schoolId));
        schoolRepository.delete(school);
    }
}
