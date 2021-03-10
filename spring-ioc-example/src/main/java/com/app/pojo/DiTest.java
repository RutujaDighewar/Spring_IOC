package com.app.pojo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

	public static void main(String[] args) {
		
		/*ApplicationContext ac= new ClassPathXmlApplicationContext("di.xml");
		
		Student student=(Student) ac.getBean("stud");
		Address address=(Address) ac.getBean("add");
		
		System.out.println(student);*/
		
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("di.xml");
		
		Student student=(Student) ac.getBean("stud");
		student.setId(102);
		student.setName("Ishani");
		
	    Address address=(Address) ac.getBean("add");
	    address.setCity("Solapur");
	    
	    student.setAddress(address);
	    
	    System.out.println(student);
	    
	}
}
