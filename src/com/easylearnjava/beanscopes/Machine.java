package com.easylearnjava.beanscopes;

public class Machine {

	private static int counter;

	public Machine() {
		counter++;
	}

	public int getCounterValue() {
		return counter;
	}
}
