package com.example8;

import java.util.Scanner;

public class BalanceCheck1 {
	
	private static int accountBalance = 1000;

	public static void main(String[] args) throws InSufficientBalanceException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the amount to withdraw");
		
		Scanner withdrawInput = new Scanner(System.in);
		
		int withdrawAmt = withdrawInput.nextInt();
		
		withdrawInput.close();
		
		if (withdrawAmt > accountBalance) {
			
			
			throw new InSufficientBalanceException("Insufficient balance");
		} else {
			System.out.println("Withdrawl successful");
			
			
		}
		

}
}
		


