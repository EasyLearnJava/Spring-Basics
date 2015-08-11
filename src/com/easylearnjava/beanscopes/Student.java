package com.easylearnjava.beanscopes;

public class Student {
	
	private static int counter;
	
	public Student(){
		counter++;
	}
	
	public int getCounterValue(){
		return counter;
	}

}
