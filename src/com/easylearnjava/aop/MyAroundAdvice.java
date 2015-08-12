package com.easylearnjava.aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyAroundAdvice implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {

		System.out.println("Method name : "	+ arg1.getName());
		
		return null;
	}
	
	

}
