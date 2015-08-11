package com.easylearnjava.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTestUsingSpring {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/beanscopes/spring-beans.xml");
		Student std = null;
		for (int i = 0; i < 10; i++) {
			std = (Student) appContext.getBean("stdObject");
		}
		System.out.println("With spring student in prototype scope, conter : " + std.getCounterValue());

		System.out.println();
		Machine mac = null;
		for (int i = 0; i < 10; i++) {
			mac = (Machine) appContext.getBean("machineObject");;
		}
		System.out.println("With spring machine in singleton scope, counter : " + mac.getCounterValue());

	}

}
