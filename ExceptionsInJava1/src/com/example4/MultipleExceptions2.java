package com.example4;

public class MultipleExceptions2 {

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
		
		} catch (ArithmeticException ex) {
			System.out.println("Caught ArithmeticException");
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Caught ArrayIndexOutOfBoundsException");
		 }
			catch (Exception e) {
				 System.out.println("Caught Exception" + e.getClass());
			}
		System.out.println("End of the program");

	}



	}

}
