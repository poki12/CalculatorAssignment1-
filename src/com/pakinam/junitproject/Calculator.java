package com.pakinam.junitproject;

public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
		
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
		
	}
	
	public static int div(int num1, int num2) {
		if(num2 ==0 ) {
			throw new IllegalArgumentException("Number can not be devided by zero");
		}
		
		return num1 / num2;
		
	}
}
