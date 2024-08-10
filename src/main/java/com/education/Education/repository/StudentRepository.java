package com.education.Education.repository;

import com.education.Education.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s WHERE" +
            "(:firstName IS NULL OR LOWER(CAST(s.firstName AS string)) = LOWER(CAST(:firstName AS string))) AND" +
            "(:lastName IS NULL OR LOWER(CAST(s.lastName AS string)) = LOWER(CAST(:lastName AS string)))")
    List<Student> findStudentByName(@Param("firstName") String firstName,
                                    @Param("lastName") String lastName);

}
