package com.example1;

public class SingleException5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num1 = 1;
		
		try {
			
			System.out.println("Start of the program");
		
		System.out.println("num1/1 :" + (num1 / 1));
		
		} catch (ArithmeticException ex) {
			System.out.println("The code will not execute so no exception");
			System.out.println("num1/0 :" + (num1 / 0));
		}
		
		System.out.println("End of the program ");
			
		

	}

}
