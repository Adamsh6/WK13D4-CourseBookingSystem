package com.example.coursebookingservice.repositories.courseRepositories;

import com.example.coursebookingservice.models.Course;
import com.example.coursebookingservice.models.Enums.StarRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByStarRating(StarRating starRating);
    List<Course> findByBookingsCustomerId(Long id);
}
