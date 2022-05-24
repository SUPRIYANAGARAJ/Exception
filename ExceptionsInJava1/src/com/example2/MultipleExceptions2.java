package com.example2;

public class MultipleExceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.out.println("Start of the program");
		
		int numArray[] = { 10, 20, 30, 40, 50 };
		try {
		
		numArray[4] = 70/0;
		
		} catch (ArithmeticException ex) {
			System.out.println("Caught ArithmeticException");
		}
		try {
			System.out.println(numArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		
		System.out.println("End of the program");

	}


	}

	

}
