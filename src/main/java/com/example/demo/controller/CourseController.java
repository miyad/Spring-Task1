package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class CourseController {
    @Autowired
    public CourseService courseService;



    @GetMapping("/course/all")
    public Iterable<Course>  getMappingAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping("/newCourse")
    public void postMappingNewCourse(@RequestBody Course course){
        courseService.saveNewCourse(course);
    }

}
