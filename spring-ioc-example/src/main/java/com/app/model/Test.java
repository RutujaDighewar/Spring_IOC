package com.app.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	
	public static void main(String[] args) {
		
		// to parse the applicationcontext.xml for configuration purpose
		/*Resource resource= new ClassPathResource("applicationContext.xml");
		
		       BeanFactory beanFactory= new XmlBeanFactory(resource);
		       
		    Employee emp= (Employee)   beanFactory.getBean("empl");
		    
		    emp.setId(101);
		    emp.setName("Rutuja");
		    
		    System.out.println(emp);*/
		
		
  ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp=(Employee) ac.getBean("emply");
		emp.setId(101);
		emp.setName("Rutuja");
		System.out.println(emp.hashCode());
		
		Employee emp2=(Employee) ac.getBean("emply");
		emp2.setId(102);
		emp2.setName("Vrushali");
		System.out.println(emp2.hashCode());
		
	/*	Employee emp2=(Employee) ac.getBean("emply2");
		emp2.setId(102);
		emp2.setName("Vrushali");
		System.out.println(emp2.hashCode());*/
		
		Employee emp3=(Employee) ac.getBean("emply");
		emp2.setId(103);
		emp2.setName("Rohan");
		System.out.println(emp3.hashCode());
	}
}
