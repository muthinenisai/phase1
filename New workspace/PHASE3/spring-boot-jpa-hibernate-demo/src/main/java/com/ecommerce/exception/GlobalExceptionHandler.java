package com.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {	
	
	@ExceptionHandler(value=NoProductsWithSuchNameException.class)
	public ResponseEntity<Object> abc1(NoProductsWithSuchNameException ex){
		return new ResponseEntity<>("Sorry,"+ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(value=NewProductsCreateException.class)
//	public ResponseEntity<Object> abc1(NewProductsCreateException ex){
//		return new ResponseEntity<>("Sorry ,  "+ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
//	}

}
