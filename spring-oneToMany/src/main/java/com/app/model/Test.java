package com.app.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
   ApplicationContext ac= new ClassPathXmlApplicationContext("studadd.xml");
		
		Student student=(Student) ac.getBean("stud");
		
		Address address=(Address) ac.getBean("add");
		
		/*student.setId(101);
		student.setName("Rutuja");
		
		Address address=(Address) ac.getBean("add");
		address.setCity("Pune");
		
		Address address1=(Address) ac.getBean("add");
		address1.setCity("Mumbai");
		
		List<Address> list=new ArrayList<>();
		list.add(address);
		list.add(address1);
		
		student.setAddress(list);
		*/
		
		System.out.println(student);
	}

}
