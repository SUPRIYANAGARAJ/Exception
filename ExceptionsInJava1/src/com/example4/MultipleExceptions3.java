package com.example4;

public class MultipleExceptions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Start of the program");
		
		int numArray[] = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i <= numArray.length; i++) {
		try {
		     
			System.out.println("i = " + i);
			System.out.println("numArray[i] / i");
			System.out.println(numArray[i] / i);
			
			if (i == 3) {
				Integer.parseInt("someString");
			}
			
			if (i ==4) {
				String someStr = null;
				System.out.println(someStr.toUpperCase());
			}
		
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Caught some specific exception, which one is is?" +ex.getClass());
		} catch (Exception e) {
				 System.out.println("Caught Exception" + e.getClass());
			}
		System.out.println("End of the program");

	}


	}

}
