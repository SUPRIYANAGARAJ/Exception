package com.example2;

public class MultipleExceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.out.println("Start of the program");
		
		int numArray[] = { 10, 20, 30, 40, 50 };
		try {
		
		//numArray[5] = 70/0;
		numArray[5] = 70/1;
		
		System.out.println(numArray[5]);
		
		} catch (ArithmeticException ex) {
			System.out.println("Caught ArithmeticException");
		
		System.out.println("End of the program");

	}


	}

}
