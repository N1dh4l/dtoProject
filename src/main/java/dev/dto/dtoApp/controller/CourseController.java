package dev.dto.dtoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dto.dtoApp.model.Course;
import dev.dto.dtoApp.service.CourseService;

@RestController("/course")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }
}
