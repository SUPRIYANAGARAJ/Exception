package com.example5;

import java.util.Scanner;

public class ThrownExceptions {

public static void main(String[] args) {
		
		checkAgeForExamEligibility();
	}
		
	public static void checkAgeForExamEligibility()  {
		
		try {
        System.out.println("Enter your age to check for exam eligibility");
		
		Scanner inputAge = new Scanner(System.in);
		
		int age = inputAge.nextInt();
		
		inputAge.close();
		
		if (age < 21 || age > 35) {
			
			throw new Exception("Sorry you are not eligible for this exam");
		}
		 System.out.println("You are in the right age range to give this exam");
		 
		} catch (Exception ex) {
			System.out.println("Catch and handle exception: " + ex);
		}

	}
}



