package com.easylearnjava.settermethodinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressTest {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/settermethodinjection/spring-beans.xml");
		Address address = (Address)appContext.getBean("addressObject");
		
		System.out.println("line1 : " + address.getLine1());
		System.out.println("state : " + address.getState());
		
		//com.easylearnjava.constructioninjection
	}

}
