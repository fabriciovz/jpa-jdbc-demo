package com.fabribraguev.springboot.jpa_jdbc_demo.course.springdatajpa;

import com.fabribraguev.springboot.jpa_jdbc_demo.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author); //This is a custom method
}
