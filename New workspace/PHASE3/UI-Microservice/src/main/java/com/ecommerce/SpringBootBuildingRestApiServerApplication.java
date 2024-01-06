package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ecommerce.config","com.ecommerce.controller", "com.ecommerce.entity"})
@SpringBootApplication
public class SpringBootBuildingRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBuildingRestApiServerApplication.class, args);
	}

}
