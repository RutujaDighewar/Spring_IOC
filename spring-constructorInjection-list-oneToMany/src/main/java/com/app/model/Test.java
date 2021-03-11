package com.app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("di.xml");
		
	   Product product=(Product) ac.getBean("pro");
	   
	   System.out.println(product);

	}

}
