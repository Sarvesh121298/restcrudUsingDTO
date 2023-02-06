package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Product;
import com.axis.service.ProductService;


@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/product")
	ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	@GetMapping("/product/{id}")
	ResponseEntity<Product> getProductById(@PathVariable int id ){
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}
	
	@GetMapping("/productbyname/{name}")
	ResponseEntity<Product>cgetProductByName(@PathVariable String name){
		return new ResponseEntity<Product>(productService.getProductByName(name), HttpStatus.OK);
	}
	
	@GetMapping("/productbycategory/{category}")
	ResponseEntity<List<Product>> getProductByCategory(@PathVariable String name){
		return new ResponseEntity<List<Product>>(productService.getProductByCategory(name), HttpStatus.OK);
	}
	
	@GetMapping("/product/bypricegreater/{price}")
	ResponseEntity<List<Product>> getProductByPriceGreaterThan(@PathVariable int price){
		return new ResponseEntity<List<Product>>(productService.getProductByPriceGreaterThan(price), HttpStatus.OK);
	}
	
	
	@GetMapping("/product/bypricelesser/{price}")
	ResponseEntity<List<Product>> getProductByPriceLesserThan(@PathVariable int price){
		return new ResponseEntity<List<Product>>(productService.getProductByPriceLesserThan(price), HttpStatus.OK);
	}
}
