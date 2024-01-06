package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.exception.NoProductsWithSuchNameException;

@Controller
public class Controller1 {

	@GetMapping("/hello")
	@ResponseBody
	public String hello(@RequestParam int number) throws NoProductsWithSuchNameException {
		if (number == 5)
			throw new NoProductsWithSuchNameException(
					"Hello, with thanks. This is an exception message from Global Hand;er");
		return "Hello";
	}
	
	@GetMapping("/hello-2")
	@ResponseBody
	public String hello2(@RequestParam int number) throws NoProductsWithSuchNameException {
		if (number == 5)
			throw new NoProductsWithSuchNameException(
					"Hello, with thanks. This is an exception message from Global Hand;er");
		return "Hello";
	}

}
