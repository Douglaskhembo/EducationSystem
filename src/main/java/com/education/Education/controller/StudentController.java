package com.education.Education.controller;

import com.education.Education.dto.StudentDto;
import com.education.Education.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create-student")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
        StudentDto savedStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/list-students")
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        List<StudentDto> students = studentService.getAllStudent();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{student-id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("student-id") Long studentId){
        StudentDto studentDto = studentService.getStudentById(studentId);
        return ResponseEntity.ok(studentDto);
    }

    @GetMapping("/student-name")
    public ResponseEntity<List<StudentDto>> getStudentByName(
            @RequestParam(value = "firstname", required = false) String firstName,
            @RequestParam(value = "lastName", required = false) String lastName){
        List<StudentDto> students = studentService.getStudentByName(firstName, lastName);
        return ResponseEntity.ok(students);
    }

    @PutMapping("/update-student/{student-id}")
    public ResponseEntity<StudentDto> updateStudent(
            @PathVariable("student-id") Long studentId, @RequestBody StudentDto studentDto){
        StudentDto studentDto1 = studentService.updateStudent(studentId,studentDto);
        return ResponseEntity.ok(studentDto1);
    }

    @DeleteMapping("/delete-student/{student-id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("student-id") Long studentId){
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok("Student deleted successfully for id " + studentId);
    }
}
