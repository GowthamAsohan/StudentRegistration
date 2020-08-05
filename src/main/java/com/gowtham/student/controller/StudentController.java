package com.gowtham.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("")
	public String getHomepage()
	{
		return "Home";
	}	
	

}
