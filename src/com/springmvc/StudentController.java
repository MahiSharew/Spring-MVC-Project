package com.springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class StudentController {
	
	@RequestMapping("/student/showForm")
	public String showForm(Model model) {
		// create the object 
		Student student= new Student();
		
		// add the object into the model 
		model.addAttribute("student",student);
		
		//return the form 
		return "student_form";
	}

	@RequestMapping("/student/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
			return "student_form";
		else 
		return "student-confirmation";
		
		
	}
}
