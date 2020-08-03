package com.gowtham.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowtham.student.model.Student;
import com.gowtham.student.repository.StudentRepository;

@Service
public class IStudentImplementation implements IStudent {
	
	@Autowired
	private StudentRepository irepo;

	@Override
	public Integer saveProduct(Student p) {
		return irepo.save(p).getStudentId();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return irepo.findAll();
	}

	@Override
	public void deleteProduct(Integer id) {
		
		irepo.deleteById(id);
	}

	@Override
	public Student getOneStudent(Integer id) {
		Optional<Student> opt = irepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		return null;

	}

	@Override
	public void updateProduct(Student p) {
		
		irepo.save(p);
		
	}

	
}
