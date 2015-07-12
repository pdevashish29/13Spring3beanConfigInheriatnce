package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/test/beans.xml");
		Customer cus =(Customer)context.getBean("parentclassID");
		System.out.println(cus.toString());
		
		
		
	}
}
