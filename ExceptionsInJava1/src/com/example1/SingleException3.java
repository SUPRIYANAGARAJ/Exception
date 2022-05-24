package com.example1;

public class SingleException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1;
		
		try {
			
			System.out.println("Start of the program");
		
		System.out.println("num1/0 :" + (num1 / 0));
		
		System.out.println("Unexecuted code just after the exception");
		
		
		} catch (NullPointerException ex) {
			System.out.println(ex);
			System.out.println("We never get here, wrong exception type caught!");
		}
		
		System.out.println("End of the program - we never get here as well");

	}
	

}
