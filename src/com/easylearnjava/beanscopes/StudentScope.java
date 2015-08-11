package com.easylearnjava.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentScope {
	
	public static void main(String[] args) {
		
		/*Student s1 = null;
		for(int i=0; i<10; i++){
			s1 = new Student();
		}
		
		System.out.println("With out spring : " + s1.getCounterValue());*/
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/beanscopes/spring-beans.xml");
		Student std = null;
		for(int i=0;i<10;i++){
			std = (Student)appContext.getBean("stdObject");
		}
		
		System.out.println("With spring : " + std.getCounterValue());
		
		
		
	}

}
