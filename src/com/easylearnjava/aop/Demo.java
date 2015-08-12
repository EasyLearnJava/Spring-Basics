package com.easylearnjava.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/aop/spring-beans.xml");
		Student std = (Student)appContext.getBean("stdObject");
		
		std.getGrades();
		
	}
	
}
