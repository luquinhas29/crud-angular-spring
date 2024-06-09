package com.devlucaswilliams.crud_angular_spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucaswilliams.crud_angular_spring.entities.Course;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
	
	@GetMapping
	public ResponseEntity<List<Course>> findAll(){
		List<Course> list = new ArrayList<>();
		list.add(new Course(1L, "curso de frontend", "frontend"));
		return ResponseEntity.ok().body(list);
	}

}
