package com.education.Education.repository;

import com.education.Education.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Long> {

    @Query("SELECT sch FROM School sch WHERE" +
            "(:schoolName IS NULL OR LOWER(CAST(sch.schoolName AS string ))=LOWER(CAST(sch.schoolName AS string )))")
    List<School> findSchoolByName(@Param("schoolName") String schoolName);
}
