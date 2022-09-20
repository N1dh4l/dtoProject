package dev.dto.dtoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dto.dtoApp.model.Student;
import dev.dto.dtoApp.service.StudentService;

@RestController("/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }


}
