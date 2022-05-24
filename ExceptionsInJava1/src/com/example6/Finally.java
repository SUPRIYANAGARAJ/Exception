package com.example6;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"Gavin", "Kristen", "Rebecca" };
		
		try {
			 for (int i = 0; i <= 3; i++) {
				 System.out.println(s[i] + ": " + s[i].length());
			 }
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Caught ArrayIndexOutOfBoundsException ");
		
		
	} finally {
		
		System.out.println("In the finally block");
		
		System.out.println("This code will always be executed");
	}
	
	System.out.println("End of program");

}
}
