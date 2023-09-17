package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServletController 
{
	@Autowired
	private Services service;
	
	@GetMapping("/")
	public String page1()
	{
		return "page1.jsp";
	}
	
	@RequestMapping("/process")
	public ModelAndView process(Model model,User user)
	{
		User validUser = service.addUserDetails(user); 
		Double bmi = service.calculateBMI(validUser); // Calculating BMI
		String BMIstatus = service.getBMIStatus(bmi); 
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("validUser", validUser);
		mav.addObject("bmi", bmi);
		mav.addObject("BMIstatus", BMIstatus);
	
		mav.setViewName("page2.jsp");
		
		return mav;
	}

}
