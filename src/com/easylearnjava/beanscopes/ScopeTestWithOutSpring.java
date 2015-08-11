package com.easylearnjava.beanscopes;

public class ScopeTestWithOutSpring {

	public static void main(String[] args) {

		Student std = null;
		for (int i = 0; i < 10; i++) {
			std = new Student();
		}
		System.out.println("With out spring student counter : " + std.getCounterValue());

		System.out.println();
		Machine mac = null;
		for (int i = 0; i < 10; i++) {
			mac = new Machine();
		}
		System.out.println("With out spring machine counter : " + mac.getCounterValue());

	}
}
