package com.example8;

import java.util.Scanner;

public class BalanceCheck2 {
	
	private static int accountBalance = 1000;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		System.out.println("Enter the amount to withdraw");
		
		Scanner withdrawInput = new Scanner(System.in);
		
		int withdrawAmt = withdrawInput.nextInt();
		
		withdrawInput.close();
		
		if (withdrawAmt > accountBalance) {
			
			
			throw new InSufficientBalanceException("Insufficient balance");
		} 
		     System.out.println("Withdrawl Successful");
		} catch (InSufficientBalanceException e) {
			System.out.println("Catch and handle exception: " + e);
			
			
		}
		

}

}
