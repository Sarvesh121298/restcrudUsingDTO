package com.axis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	@Column(name = "product_name")
	private String name;
	@Column(name = "product_category")
	private String category;
	@Column(name = "product_availability")
	private int availability;
	@Column(name = "product_price")
	private int price;
	
	
	public Product() {
		super();
	}


	public Product(int id, String name, String category, int availability, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.availability = availability;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getAvailability() {
		return availability;
	}


	public void setAvailability(int availability) {
		this.availability = availability;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
