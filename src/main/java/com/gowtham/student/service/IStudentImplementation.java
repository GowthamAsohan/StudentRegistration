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
	public Integer saveStudent(Student p) {
		
		Double newStuDiscount = 0.10 ;
		Double oldStuDiscount = 0.20;
		Double discountFee = 0.0;
		Double newFee= 0.0;
		
		if(p.getIsNewSudent()) {
			
			if (p.getDuration() == 2) {
				
				discountFee = p.getCourseFee() * newStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 3000;
				
			}else {
				
				discountFee = p.getCourseFee() * newStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 2000;
				
			}
			
			p.setCourseFee(newFee);
			
		}else {
			
          if (p.getDuration() == 2) {
				
				discountFee = p.getCourseFee() * oldStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 2000;
				
			}else {
				
				discountFee = p.getCourseFee() * oldStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 1000;
				
			}
			
			p.setCourseFee(newFee);
			
			
		}
		
		return irepo.save(p).getStudentId();
	}

	@Override
	public List<Student> getAllStudents() {
		
		return irepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		
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
	public String updateStudent(Student p) {
		
		Double newStuDiscount = 0.10 ;
		Double oldStuDiscount = 0.20;
		Double discountFee = 0.0;
		Double newFee= 0.0;
		
		if(p.getIsNewSudent()) {
			
			if (p.getDuration() == 2) {
				
				discountFee = p.getCourseFee() * newStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 3000;
				
			}else {
				
				discountFee = p.getCourseFee() * newStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 2000;
				
			}
			
			p.setCourseFee(newFee);
			
		}else {
			
          if (p.getDuration() == 2) {
				
				discountFee = p.getCourseFee() * oldStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 2000;
				
			}else {
				
				discountFee = p.getCourseFee() * oldStuDiscount ;
				p.setDiscount(discountFee);
				newFee = discountFee + 1000;
				
			}
			
			p.setCourseFee(newFee);
			
			
		}

		return irepo.save(p).getStudentName();
		
	}

	
}
