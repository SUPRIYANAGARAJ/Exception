package com.example6;

public class Finally3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s[] = {"Gavin", "Kristen",null, "Rebecca" };
			
			try {
				for (int i = 0; i <= 3; i++) {
					 System.out.println(s[i] + ": " + s[i].length());
				}
				
			//} catch (ArithmeticException ex) {
				
			} catch (NullPointerException ex) {
					System.out.println("We're catching the wrong exception ");
				 
		} finally {
			
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("End of program");



	}

}
