package com.devlucaswilliams.crud_angular_spring.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
public class Course implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("_id")
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String name;
	
	@Column(length = 10, nullable = false)
	private String category;
	
		
	}
