package com.axis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.axis.entity.Product;



public interface ProductRepository extends JpaRepository<Product ,Integer>{

	
	Optional<Product> findByname(String name);
	List<Product> findBycategory(String category);
	List<Product> findByPriceLessThan(int price);
	List<Product> findByPriceGreaterThan(int price);
	
	
}
