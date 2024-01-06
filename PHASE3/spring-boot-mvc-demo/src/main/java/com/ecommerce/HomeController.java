package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@GetMapping("/home")	
	@ResponseBody
	public String home() {	
		
		return "Hello, welcome to Home.";
		
		 //return "home"; // go to home.jsp
	}
	
	@GetMapping("/home1")
	public String home1() {			
		
		 return "home"; // go to home.jsp
	}

}
