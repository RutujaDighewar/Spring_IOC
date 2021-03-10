package com.app.model;

import java.util.List;

public class Student {
	
	private int id;
	
	private String name;
	
	private List<Certificate> certificates;
	
	/*public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, List certificates) {
		super();
		this.id=id;
		this.name=name;
		this.certificates=certificates;
	}*/

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", certificates=" + certificates + "]";
	}

	public int getId() {
		return id;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
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

	
	
	

}
