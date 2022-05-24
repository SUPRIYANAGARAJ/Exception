package com.example;

public class SingleExceptions2 {
	
	public static void main(String[] args) {

	int num1 = 1;
	
	try {

	System.out.println("Start of the program");
	
	
	System.out.println("num1/1 :" + (num1 / 1));
	
	} catch (Exception ex) {
		System.out.println("We'll never get here if there is no exception");
	}
	
	System.out.println("End of the program");

}

}
