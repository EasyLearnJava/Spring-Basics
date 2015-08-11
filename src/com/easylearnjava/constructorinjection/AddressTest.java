package com.easylearnjava.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressTest {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/constructorinjection/spring-beans.xml");
		Address address = (Address)appContext.getBean("smalladdressObject");
		
		System.out.println("line1 : " + address.getLine1());
		System.out.println("state : " + address.getState());
		
		//com.easylearnjava.constructioninjection
	}

}
