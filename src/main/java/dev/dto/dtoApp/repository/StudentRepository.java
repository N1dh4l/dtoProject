package dev.dto.dtoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.dto.dtoApp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
