package com.fabribraguev.springboot.jpa_jdbc_demo.course.jdbc;

import com.fabribraguev.springboot.jpa_jdbc_demo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String INSERT_QUERY= "insert into COURSE values (?,?,?);";

    private final String DELETE_QUERY= "delete from COURSE where id=?;";

    private final String SELECT_QUERY= "select * from COURSE where id=?;";



    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(Long id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course findById(Long id){
        //Result set -> Bean => Row mapper =>
        return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
    }
}
