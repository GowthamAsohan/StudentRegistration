package com.gowtham.student.service;

import java.util.List;

import com.gowtham.student.model.Student;

public interface IStudent {
	
	public Integer saveStudent(Student p);
	public List<Student> getAllStudents();
	public void deleteStudent(Integer id);
	
	public Student getOneStudent(Integer id);
	public String updateStudent(Student p);
	

}
