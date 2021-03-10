package com.app.model;

import java.util.List;

public class Address {

	private List city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(List city) {
		this.city=city;
	}

	

	public List getCity() {
		return city;
	}

	public void setCity(List city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
	
}
