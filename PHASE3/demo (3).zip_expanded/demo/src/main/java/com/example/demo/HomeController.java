package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)	
	@ResponseBody
	public String home() {	
		
		return "Hello, welcome to Home.";
		
		 //return "home"; // go to home.jsp
	}
	
	

}
