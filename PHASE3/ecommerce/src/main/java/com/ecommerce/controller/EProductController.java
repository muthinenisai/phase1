package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eProductDAO;
	
	// Example http://localhost:8080/ecommerce/listProducts
		
	@RequestMapping(value ="/listProducts", method= RequestMethod.GET)
	public String listProducts(ModelMap model) {
		
		List<EProduct>  listOfProducts = eProductDAO.getProducts();
		
		model.addAttribute("prodlist" , listOfProducts);
		
		return "list-of-products"; // go to list-of-products.jsp
		
	}
	
	
	@RequestMapping(value ="/addProduct", method= RequestMethod.POST)
	public String addProduct(@RequestParam String name, @RequestParam float price) {
		
		eProductDAO.addProduct(name, price);
		
		return "add-product-success"; // go to add-product-success.jsp
		
	}
	
	@RequestMapping(value ="/deleteProduct", method= RequestMethod.POST)
	public String deleteProduct(@RequestParam long id) {
		
		eProductDAO.deleteProduct(id);
		
		return "delete-product-success"; // go to delete-product-success.jsp
		
	}
	
	
	

}
