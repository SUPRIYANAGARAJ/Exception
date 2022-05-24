package com.example4;

import java.util.Scanner;

public class ThrowExceptions1 {

	public static void main(String[] args) {
		
		checkAgeForExameligibility();
	}
		
	public static void checkAgeForExameligibility() throws IllegalArgumentException {
		
     System.out.println("Enter your age to check for exam eligibility");
		
		Scanner inputAge = new Scanner(System.in);
		
		int age = inputAge.nextInt();
		
		inputAge.close();
		
		if (age < 21 || age > 35) {
			//throw new IllegalArgumentException("Sorry you are not eligible for this exam");
			//throw new NullPointerException("Sorry you are not eligible for this exam");
			throw new RuntimeException("Sorry you are not eligible for this exam");
		} else {
			System.out.println("You are in the right age range to give this exam");
		}

	}


	}


