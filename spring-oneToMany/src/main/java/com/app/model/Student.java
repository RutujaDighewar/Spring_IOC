package com.app.model;

import java.util.List;

public class Student {

	
	private int id;
	
	private String name;
	
	private List<Address> address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String name, List<Address> address) {
		  super();
	      this.id=id;
	      this.name=name;
	      this.address=address;
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


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
