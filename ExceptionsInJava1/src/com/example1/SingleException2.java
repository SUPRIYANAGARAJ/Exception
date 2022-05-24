package com.example1;

public class SingleException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 1;
			
			try {
			
			System.out.println("num1/0 :" + (num1 / 0));
			
			
			} catch (ArithmeticException ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
			
			System.out.println("End of the program");

		}

	}


