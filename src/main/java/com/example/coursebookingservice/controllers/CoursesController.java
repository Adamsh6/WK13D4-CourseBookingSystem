package com.example.coursebookingservice.controllers;

import com.example.coursebookingservice.models.Course;
import com.example.coursebookingservice.models.Enums.StarRating;
import com.example.coursebookingservice.repositories.courseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")

public class CoursesController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/starRating/{starRating}")
    public List<Course> getAllCoursesByRating(@PathVariable StarRating starRating){
        return courseRepository.findByStarRating(starRating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getAllCoursesByCustomer(@PathVariable Long id){
        return courseRepository.findByBookingsCustomerId(id);
    }
}
