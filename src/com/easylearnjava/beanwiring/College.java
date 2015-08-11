package com.easylearnjava.beanwiring;

public class College {

	private String name;
	private Student student;
	
	public College(){
		
	}
	
	public College(Student student){
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
