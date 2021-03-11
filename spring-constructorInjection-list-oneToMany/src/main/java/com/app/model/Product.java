package com.app.model;

import java.util.List;

public class Product {
	
	private int id;
	
	private String product;
	
	private List<Color> colors;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String product , List colors) {
		this.id=id;
		this.product=product;
		this.colors=colors;
	}

	
	public String toString() {
		return "Product [id=" + id + ", product="+ product + " , colors=" + colors  + "]";
	}
	

}
