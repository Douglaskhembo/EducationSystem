package com.education.Education.service.Impl;

import com.education.Education.dto.StudentDto;
import com.education.Education.exception.ResourceNotFoundException;
import com.education.Education.mapper.StudentMapper;
import com.education.Education.model.Student;
import com.education.Education.repository.StudentRepository;
import com.education.Education.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found for id" +studentId));
        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map((StudentMapper::mapToStudentDto))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto studentDto) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found for id," + studentId));

        student.setStudentAge(studentDto.getStudentAge());
        student.setStudentEmail(student.getStudentEmail());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());

        Student student1 = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(student1);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found for id," +studentId));
        studentRepository.delete(student);
    }

    @Override
    public List<StudentDto> getStudentByName(String firstName, String lastName) {
        List<Student> studentName = studentRepository.findStudentByName(firstName, lastName);
        if (studentName.isEmpty()){
            throw new ResourceNotFoundException("No student found with the given name(s)" +
                    (firstName != null ? "First Name: " + firstName : "") +
                    (lastName != null ? "Last Name: " + lastName : ""));
        }
        return studentName.stream().map((StudentMapper::mapToStudentDto))
                .collect(Collectors.toList());
    }

}
