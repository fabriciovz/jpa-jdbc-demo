package com.fabribraguev.springboot.jpa_jdbc_demo.course;

import com.fabribraguev.springboot.jpa_jdbc_demo.course.Course;
import com.fabribraguev.springboot.jpa_jdbc_demo.course.jdbc.CourseJdbcRepository;
import com.fabribraguev.springboot.jpa_jdbc_demo.course.jpa.CourseJpaRepository;
import com.fabribraguev.springboot.jpa_jdbc_demo.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJdbcRepository courseJdbcRepository;

    //@Autowired
    //private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1L,"Onboarding Spring JPA 3","Luis"));
        courseSpringDataJpaRepository.save(new Course(2L,"Onboarding Spring JPA 1","Fabricio"));
        courseSpringDataJpaRepository.save(new Course(3L,"Onboarding Spring JPA 2","Rodrigo"));
        courseSpringDataJpaRepository.save(new Course(4L,"Onboarding Spring JPA 3","Fabian"));
        courseSpringDataJpaRepository.save(new Course(5L,"Onboarding Spring JPA 3","Kaituko"));


        courseSpringDataJpaRepository.deleteById(5L);

        System.out.println(courseSpringDataJpaRepository.findById(2L));
        System.out.println(courseSpringDataJpaRepository.findById(3L));

        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.count());

        System.out.println(courseSpringDataJpaRepository.findByAuthor("Fabricio"));
    }
    /*public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1L,"Onboarding JPA 1","Fabricio"));
        courseJpaRepository.insert(new Course(2L,"Onboarding JPA 2","Fabricio"));
        courseJpaRepository.insert(new Course(3L,"Onboarding JPA 3","Fabricio"));

        courseJpaRepository.deleteById(1L);

        System.out.println(courseJpaRepository.findById(2L));
        System.out.println(courseJpaRepository.findById(3L));
    }
    /*public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1L,"Onboarding Spring JDBC 1","Fabricio"));
        courseJdbcRepository.insert(new Course(2L,"Onboarding Spring JDBC 2","Fabricio"));
        courseJdbcRepository.insert(new Course(3L,"Onboarding Spring JDBC 3","Fabricio"));

        courseJdbcRepository.deleteById(1L);

        System.out.println(courseJdbcRepository.findById(2L));
        System.out.println(courseJdbcRepository.findById(3L));
    }*/
}
