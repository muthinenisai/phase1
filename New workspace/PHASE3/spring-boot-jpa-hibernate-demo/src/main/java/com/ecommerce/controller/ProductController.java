package com.ecommerce.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.EProduct;
import com.ecommerce.exception.NoProductsWithSuchNameException;
import com.ecommerce.exception.ProductSearchException;
import com.ecommerce.repositry.EProductRepositry;

@Controller
public class ProductController {

	@Autowired
	EProductRepositry eProductRepositry;
   
	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {
		System.err.println("Hi 1");
		EProduct new_product = new EProduct();
		model.addAttribute("product", new_product);

		return "new-product"; // go to new-product.jsp
	}

	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute("product") EProduct product) {
		System.err.println("Hi 2");
		product.setDateAddedConverted(product.getDateAdded());

		eProductRepositry.save(product);

		return "new-product-added-success"; // go to new-product-added-success.jsp
	}

	// LIST ALL PRODUCTS
	@GetMapping("/list-products")
	public String listProduct(Model model) {
		List<EProduct> products = eProductRepositry.findAll();

		model.addAttribute("prodlist", products);

		return "list-of-products"; // go to product-list.jsp
	}

	// DELETE A PRODUCT
	@GetMapping("/delete-product")
	public String deleteProduct(@RequestParam long id, Model model) {
		Optional<EProduct> prodFromRepo = eProductRepositry.findById(id);
		model.addAttribute("id", id);

		if (prodFromRepo.isPresent()) {
			eProductRepositry.deleteById(id);
		} else {
			return "delete-product-failed"; // go to delete-product-failed.jsp
		}
		;

		return "delete-product-success"; // go to delete-product-success.jsp
	}

	// DISPLAY A SINGLE PRODUCT
	@GetMapping("/product-details")
	public String showProductDetails(@RequestParam long id, Model model) {
		Optional<EProduct> prodFromRepo = eProductRepositry.findById(id);
		model.addAttribute("id", id);

		if (prodFromRepo.isPresent()) {
			EProduct product = prodFromRepo.get();
			model.addAttribute("prod", product);
		} else {
			return "product-not-found"; // go to product-not-found.jsp
		}
		

		return "product-details"; // go to product-details.jsp
	}

	// EDIT A PRODUCT: SHOW THE FORM
	@GetMapping("/edit-product")
	public String showEditProductForm(@RequestParam long id, Model model) {
		Optional<EProduct> prodFromRepo = eProductRepositry.findById(id);
		model.addAttribute("id", id);

		if (prodFromRepo.isPresent()) {
			EProduct product = prodFromRepo.get();
			model.addAttribute("prod", product);
			// Show the Edit Form
			return "edit-product-form";
		} else {
			return "product-not-found";// product-not-found.jsp
		}

	}

	// EDIT A PRODUCT: SAVE THE EDITED PRODUCT
	@PostMapping("/edit-product")
	public String saveEditedProduct(@ModelAttribute("prod") EProduct product) {
		product.setDateAdded(new Date());
		eProductRepositry.save(product);

		return "edit-product-success"; // go to edit-product-success.jsp
	}

	// Advanced CRUD operations
	// 5a. LIST ALL PRODUCTS that has a particular name
	@GetMapping("/list-products-by-name")
	public String listProductByName(@RequestParam String name, Model model) {
		List<EProduct> products = eProductRepositry.findAllByName(name);

		model.addAttribute("prodlist", products);

		return "list-of-products"; // go to list-of-products.jsp
	}

	// 5b. LIST ALL PRODUCTS that has a particular price
	@GetMapping("/list-products-by-price")
	public String listProductByPrice(@RequestParam float price, Model model) {
		List<EProduct> products = eProductRepositry.findAllByPrice(price);

		model.addAttribute("prodlist", products);

		return "list-of-products"; // go to list-of-products.jsp
	}

	// 6.
	@GetMapping("/list-products-by-name-like")
	public String listProductByNameLike(@RequestParam String name, Model model) throws ProductSearchException {
		if (name.length() <= 1)
			throw new ProductSearchException("Type atleast 3 chars to search");

		List<EProduct> products = eProductRepositry.findAllByNameContaining(name);

//		if(products.size()==0)
//			throw new ProductSearchException("List is empty");

		model.addAttribute("prodlist", products);

		return "list-of-products"; // go to list-of-products.jsp
	}

	// Exception Handling
	@ExceptionHandler
	public ResponseEntity<Object> abc(Exception ex) {
		return new ResponseEntity<>("Sorry, something went wrong. Contact CC.", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<Object> abc1(ProductSearchException ex) {
		return new ResponseEntity<>("Sorry," + ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
