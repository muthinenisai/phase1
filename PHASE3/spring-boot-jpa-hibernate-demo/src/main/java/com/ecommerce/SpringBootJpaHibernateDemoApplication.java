package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@ComponentScan({"com.ecommerce.controller", "com.ecommerce.entity","com.ecommerce.repositry", "com.ecommerce.exception"})
@SpringBootApplication
public class SpringBootJpaHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHibernateDemoApplication.class, args);
	}

}
