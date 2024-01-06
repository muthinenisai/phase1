package com.ecommerce.exception;

public class NoProductsWithSuchNameException extends Exception {
	String message;
	
	public NoProductsWithSuchNameException(String message) {
		super(message);
	}
	

}
