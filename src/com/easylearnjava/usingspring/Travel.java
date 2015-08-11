package com.easylearnjava.usingspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Travel {
	
	public static void main(String[] args) {
		
		//Vehicle vehicle = new Car();
		//Vehicle vehicle = new Bike();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/usingspring/spring-beans.xml");
		Vehicle vehicle = (Vehicle) appContext.getBean("vehicle");
		
		vehicle.rent();
		vehicle.move();
		
		//Traveller t = new Traveller();
		Traveller t = (Traveller) appContext.getBean("customer");
	}

}
