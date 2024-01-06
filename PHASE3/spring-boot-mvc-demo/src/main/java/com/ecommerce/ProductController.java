package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {

		EProduct new_product = new EProduct();
		model.addAttribute("product", new_product);

		return "new-product"; // go to new-product.jsp
	}
	
	

	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute("product") EProduct product) {

		return "new-product-added-success"; // go to new-product-added-success.jsp		
	}

}
