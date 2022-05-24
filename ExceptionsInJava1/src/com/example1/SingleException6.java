package com.example1;

public class SingleException6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
       int limit = 10;
       int num = 10;
		
		try {
			
			while (limit >= 0) {
				int result = num / limit;
				System.out.println(num + "/" + limit + ": " + result);
				limit -= 1;
			}
		
		} catch (ArithmeticException ex) {
			
		
		System.out.println("Exception occured");
		}
			
		

	}

}
