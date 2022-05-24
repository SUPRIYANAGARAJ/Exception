package com.example1;

public class SingleException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int num1 = 1;
		
		try {

		System.out.println("Start of the program");
		
		
		System.out.println("num1/0 :" + (num1 / 0));
		
		
		} catch (Exception ex) {
			System.out.println("Exception class: " + ex.getClass());
			System.out.println("ArithmeticException is type of Exception: " +
			    (ex instanceof Exception));
			ex.printStackTrace();
		}
		
		System.out.println("End of the program");

	}
	}


