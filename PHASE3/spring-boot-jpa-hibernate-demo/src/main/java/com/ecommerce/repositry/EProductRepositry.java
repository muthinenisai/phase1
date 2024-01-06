package com.ecommerce.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long>{
	
	// Spring only wants to mention those CRUD methods
	// that are not based on ID
	
	List<EProduct> findAllByName(String name);	
	
	List<EProduct> findAllByPrice(float price);
	
	//search by name like
	List<EProduct> findAllByNameContaining(String name);
	
	//
	List<EProduct> findAllByPriceGreaterThan(float price);
	
	List<EProduct> findAllByPriceGreaterThanAndPriceLessThan(float price1, float price2);
	
	//Ordering
	List<EProduct> findAllByPriceGreaterThanOrderByPrice(float price);
	
	//Our own JPQL queries
	@Query("SELECT p FROM EProduct p WHERE p.price < :minPrice and p.price > :maxPrice")
	List<EProduct> findAllWherePriceIsNotInBetween(float minPrice,float maxPrice);
	
	@Query("SELECT p FROM EProduct p WHERE p.name LIKE :name%")
	List<EProduct> findAllWhereNameStartsWith(String name);
	
	// SQL queries (Native Queries)
	@Query(value="SELECT * FROM eproduct WHERE name LIKE %:name%", nativeQuery=true)
	List<EProduct> findAllByHavingNameAnywhereUsingSQL(String name);

}
