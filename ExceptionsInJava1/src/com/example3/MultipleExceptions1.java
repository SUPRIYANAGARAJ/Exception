package com.example3;

public class MultipleExceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Start of the program");
			
			int numArray[] = { 10, 20, 30, 40, 50 };
			
			for (int i = 0; i <= numArray.length; i++) {
			try {
			     
				System.out.println("i = " + i);
				System.out.println("numArray[i] / i");
				System.out.println(numArray[i] / i);
			
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught some exception, which one is is?" + e.getClass());
			}
			 
			
			System.out.println("End of the program");

		}
	}

	}


