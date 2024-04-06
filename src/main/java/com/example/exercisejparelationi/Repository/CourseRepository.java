package com.example.exercisejparelationi.Repository;

import com.example.exercisejparelationi.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    Course findCourseById(Integer id);
}
