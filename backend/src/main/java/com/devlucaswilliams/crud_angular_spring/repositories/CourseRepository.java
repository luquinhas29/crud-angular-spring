package com.devlucaswilliams.crud_angular_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlucaswilliams.crud_angular_spring.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
