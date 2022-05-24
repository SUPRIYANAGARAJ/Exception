package com.example3;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     System.out.println("Start of the program");
		
		int numArray[] = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i <= numArray.length; i++) {
		try {
		     
			System.out.println("i = " + i);
			System.out.println("numArray[i] / i");
			System.out.println(numArray[i] / i);
		
		} catch (ArithmeticException ex) {
			System.out.println("Caught ArithmeticException");
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		
		System.out.println("End of the program");

	}
}
	}
}


