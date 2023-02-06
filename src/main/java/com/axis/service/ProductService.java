package com.axis.service;

import java.util.List;

import com.axis.entity.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(int id);
	Product getProductByName(String name);
	List<Product> getProductByCategory(String category);
	List<Product> getProductByPriceGreaterThan(int price);
	List<Product> getProductByPriceLesserThan(int price);
	
	
}
