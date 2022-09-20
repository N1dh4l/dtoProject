package dev.dto.dtoApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.dto.dtoApp.repository.CourseRepository;
import dev.dto.dtoApp.model.Course;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
