package com.education.Education.controller;

import com.education.Education.dto.SchoolDto;
import com.education.Education.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/create-school")
    public ResponseEntity<SchoolDto> createSchool(@RequestBody SchoolDto schoolDto){
        SchoolDto savedSchool = schoolService.createSchool(schoolDto);
        return new ResponseEntity<>(savedSchool, HttpStatus.CREATED);
    }

    @GetMapping("/list-school/{school-id}")
    public ResponseEntity<SchoolDto> getSchoolId(@PathVariable("school-id") Long schoolId){
        SchoolDto schoolDto = schoolService.getSchoolById(schoolId);
        return ResponseEntity.ok(schoolDto);
    }
    @GetMapping("/list-schools")
    public ResponseEntity<List<SchoolDto>> getAllSchools(){
        List<SchoolDto> schoolDtos = schoolService.getAllSchools();
        return ResponseEntity.ok(schoolDtos);
    }

    @GetMapping("/school-name")
    public ResponseEntity<List<SchoolDto>> getSchoolByName(
            @RequestParam(value = "schoolName", required = false) String schoolName){
        List<SchoolDto> schoolDtoList = schoolService.getSchoolByName(schoolName);
        return ResponseEntity.ok(schoolDtoList);
    }

    @PutMapping("school-update")
    public ResponseEntity<SchoolDto> updateSchool(Long schoolId, SchoolDto schoolDto){
        SchoolDto schoolDto1 = schoolService.updateSchool(schoolId, schoolDto);
        return ResponseEntity.ok(schoolDto1);
    }

    @DeleteMapping("delete-school/{school-id}")
    public ResponseEntity<String> deleteSchool(@PathVariable("school-id") Long schoolId){
        schoolService.deleteSchool(schoolId);
        return ResponseEntity.ok("School deleted successfully for id, " +schoolId);
    }
}
