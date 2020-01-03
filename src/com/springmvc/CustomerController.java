package com.springmvc;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@InitBinder
	public void binder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimm= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimm);
	}
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Customer customer= new Customer();
		model.addAttribute("customer",customer);
		return "customer_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return "customer_form";
		else 
		return "customer_confirmation";
		
		
	}

}
