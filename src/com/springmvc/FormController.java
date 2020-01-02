package com.springmvc;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm() {

		return "ShowForm";
	}
	@RequestMapping("/processForm")
	public String processForm() {	
		return "processForm";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name").toString().toUpperCase();
		model.addAttribute("result", "Yo "+name);
		
		return "processForm";
	}
	

}
