package com.example4;

import java.util.Scanner;

public class ThrowExceptions {

	public static void main(String[] args) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your age to check for exam eligibility");
		
		Scanner inputAge = new Scanner(System.in);
		
		int age = inputAge.nextInt();
		
		inputAge.close();
		
		if (age < 21 || age > 35) {
			
			//System.out.println("Sorry you are not eligible for this exam");
			throw new IllegalArgumentException("Sorry you are not eligible for this exam");
		} else {
			System.out.println("You are in the right age range to give this exam");
		}

	}

}
