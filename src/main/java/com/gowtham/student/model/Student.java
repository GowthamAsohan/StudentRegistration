package com.gowtham.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	private String courseName;
	private Integer duration;
	private Boolean isNewSudent;
	private Double courseFee;
	private Double discount;
	

}
