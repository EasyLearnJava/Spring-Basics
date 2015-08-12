package com.easylearnjava.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/easylearnjava/hibernate/beanlocations.xml");
		
		MachineDaoImpl macDaoObj = (MachineDaoImpl)appContext.getBean("machineDaoObj");
		
		Machine macObj = (Machine)appContext.getBean("machineObj");
		macObj.setMachineCode("ROC");
		macObj.setMachineName("Rocket");
		macDaoObj.save(macObj);
		System.out.println("1st object saved...");
		
		Machine macObj1 = (Machine)appContext.getBean("machineObj");
		macObj1.setMachineCode("TRA");
		macObj1.setMachineName("Bullet Train");
		macDaoObj.save(macObj1);
		System.out.println("2nd object saved...");
		
		System.out.println();
		Machine machine = macDaoObj.findByMachineCode("TRA");
		System.out.println(machine);
		
		System.out.println();
		macDaoObj.delete(macObj);
		macDaoObj.delete(macObj1);
		
	}
	
}
