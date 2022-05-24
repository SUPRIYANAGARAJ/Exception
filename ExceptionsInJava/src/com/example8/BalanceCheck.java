package com.example8;

import java.util.Scanner;

public class BalanceCheck {
	
	private static int accountBalance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the amount to withdraw");
		
		Scanner withdrawInput = new Scanner(System.in);
		
		int withdrawAmt = withdrawInput.nextInt();
		
		withdrawInput.close();
		
		if (withdrawAmt > accountBalance) {
			
			//System.out.println("Insufficient balance");
			throw new IllegalStateException("Insufficient balance");
		} else {
			System.out.println("Withdrawl successful");
			
			
		}
		

}
}


