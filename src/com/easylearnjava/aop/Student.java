package com.easylearnjava.aop;

public class Student {
	
	public void getGrades(){
		System.out.println("Calculating the grades for a student...");
	}
	
	public void getAttendance(){
		System.out.println("Retrieving students attendance records...");
	}
	
	public void getAddressDetails() throws Exception {
		throw new Exception("This exception is from Address details method...");
	}

}
