package com.easylearnjava.usingspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Travel {
	
	public static void main(String[] args) {
		
		//Vehicle vehicle = new Car();
		//Vehicle vehicle = new Bike();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/usingspring/spring-beans.xml");

		//A bean object with the id carObj will be returned by the spring container 
		Vehicle vehicle = (Vehicle) appContext.getBean("carObj");		
		vehicle.rent();
		vehicle.move();
		
		System.out.println();
		//A bean object with the id bikeObj will be returned by the spring container
		vehicle = (Vehicle) appContext.getBean("bikeObj");		
		vehicle.rent();
		vehicle.move();
	}

}
