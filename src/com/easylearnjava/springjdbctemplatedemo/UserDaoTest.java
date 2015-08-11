package com.easylearnjava.springjdbctemplatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/springjdbctemplatedemo/spring-beans.xml");
		
		UserDao ud = (UserDao)appContext.getBean("userdaoobject");
		//ud.updateUser(3, "newSecret");
		ud.findByUserId(3);
		
	}

}
