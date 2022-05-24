package com.example1;

public class SingleException4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1 = 1;
		
		try {
			
			System.out.println("Start of the program");
		
		System.out.println("num1/0 :" + (num1 / 0));
		
		} catch (ArithmeticException ex) {
			System.out.println("First exception caught here - what about the second?");
			System.out.println("num1/0 :" + (num1 / 0));
		}
		
		System.out.println("End of the program - second exception not caught");
			
		

	}
	
}
