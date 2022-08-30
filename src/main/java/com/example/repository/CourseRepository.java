package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.Electronics;

public interface CourseRepository extends JpaRepository<Electronics, Integer> {

}
