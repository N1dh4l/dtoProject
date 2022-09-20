package dev.dto.dtoApp.service;

import java.util.List;
import dev.dto.dtoApp.model.Student;
import dev.dto.dtoApp.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepo;
    
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
