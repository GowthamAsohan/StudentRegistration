package com.gowtham.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	private Integer studentId;
	private String studentName;
	private String departmetName;
	private String courseFee;
	private String toalCourse;
	

}
