package com.easylearnjava.beanwiring;

public class Student {

	private Book javaBook;
	private String studentName;

	public Book getJavaBook() {
		return javaBook;
	}

	public void setJavaBook(Book javaBook) {
		this.javaBook = javaBook;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
