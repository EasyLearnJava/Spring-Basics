package com.easylearnjava.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/beanwiring/spring-beans.xml");		
		Student std = (Student)appContext.getBean("stdObject");
		System.out.println("student name : " + std.getStudentName());
		System.out.println("Stydent has take a book with the title : " + std.getJavaBook().getTitle());
		
		Car c = (Car)appContext.getBean("carObject");
		System.out.println("wheel name is  : " + c.getWheel().getName());
		
		College clg = (College)appContext.getBean("collegeObject");
		System.out.println("college name : " + clg.getName());
		System.out.println("student name : " + clg.getStudent().getStudentName());
		
	}

}
