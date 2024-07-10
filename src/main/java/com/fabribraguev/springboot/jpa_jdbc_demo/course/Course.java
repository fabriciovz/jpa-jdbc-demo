package com.fabribraguev.springboot.jpa_jdbc_demo.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "course") //Entity is adding to implement JPA/Hibernate. /it is not add name param since the class and column name match
public class Course {
    @Id //adding to implement JPA/Hibernate
    private Long id;

    @Column(name = "name") //it is not necessary since the attribute and column name match
    private String name;

    @Column(name = "author") //it is not necessary since the attribute and column name match
    private String author;

    public Course() {
    }
    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
