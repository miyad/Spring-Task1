package com.example.demo.service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    public CourseRepository courseRepository;

    public Iterable<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public void saveNewCourse(Course course){
        courseRepository.save(course);
    }



}
