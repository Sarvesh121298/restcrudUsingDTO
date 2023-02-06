package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Product;
import com.axis.repository.ProductRepository;



@Service
public class ProductServiceIMPL implements ProductService {
	
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public Product getProductByName(String name) {
		
		return productRepository.findByname(name).get();
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return productRepository.findBycategory(category);
	}

	@Override
	public List<Product> getProductByPriceGreaterThan(int price) {
		
		return productRepository.findByPriceGreaterThan(price);
	}

	@Override
	public List<Product> getProductByPriceLesserThan(int price) {
		
		return productRepository.findByPriceLessThan(price);
	}

}
