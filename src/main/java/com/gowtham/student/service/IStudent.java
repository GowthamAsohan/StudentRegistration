package com.gowtham.student.service;

import java.util.List;

import com.gowtham.student.model.Student;

public interface IStudent {
	
	public Integer saveProduct(Student p);
	public List<Student> getAllStudents();
	public void deleteProduct(Integer id);
	
	public Student getOneStudent(Integer id);
	public void updateProduct(Student p);

}
