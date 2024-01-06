package com.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositry.EProductRepositry;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	EProductRepositry eProductRepositry;

	// Supply a Single Product Details from the DB
	@GetMapping(value="/details/{id}", produces = "application/json")
	public EProduct showProduct(@PathVariable("id") long id) {

		Optional<EProduct> productFromRepo = eProductRepositry.findById(id);

		if (productFromRepo.isPresent()) {
			EProduct product = productFromRepo.get();
			return product;
		} else {
			return new EProduct();
			// return "Product with id = "+ id + " not found";
		}

	}

	// Supply the full list of products from the DB
	@GetMapping("/list")
	public List<EProduct> showAllProducts() {

		List<EProduct> products = eProductRepositry.findAll();
		return products;
	}

	@PostMapping(value="/add-product", consumes = "application/json", produces = "application/json")
	public EProduct addProduct(@RequestBody EProduct eProduct) {
		eProduct.setDateAddedConverted(eProduct.getDateAdded());

		EProduct savedProduct = eProductRepositry.save(eProduct);
		return savedProduct;
	}

	@PostMapping("/edit-product/{id}")
	public EProduct editProduct(@PathVariable("id") long id, @RequestBody EProduct eProduct) {

		Optional<EProduct> productFromRepo = eProductRepositry.findById(id);

		if (productFromRepo.isPresent()) {

			EProduct product = productFromRepo.get();

			if (eProduct.getName() != null && !eProduct.getName().equals(""))
				product.setName(eProduct.getName());

			if (eProduct.getPrice() != null)
				product.setPrice(eProduct.getPrice());

			EProduct savedProduct = eProductRepositry.save(product);

			return savedProduct;
		} else {
			return new EProduct();
			// return "Product with id = "+ id + " not found";
		}
	}
	
	//CHALLENGE : Add the delete-product mapping
	//@DeleteMapping("/delete-product/{id}")

}
