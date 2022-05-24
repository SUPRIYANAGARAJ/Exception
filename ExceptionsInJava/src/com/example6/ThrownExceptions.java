package com.example6;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ThrownExceptions {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		methodWhichThrowsMultipleExceptions();

	}
	
	private static void methodWhichThrowsMultipleExceptions() throws IOException, URISyntaxException {
		
		System.out.println("Enter random number: ");
		
		Scanner inputNum = new Scanner(System.in);
		
		int num = inputNum.nextInt();
		
		inputNum.close();
		
		System.out.println("You input the number: " +num);
		
	}

}
