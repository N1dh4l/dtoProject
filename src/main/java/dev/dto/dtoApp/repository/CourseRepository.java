package dev.dto.dtoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.dto.dtoApp.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
