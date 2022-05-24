package com.example8;

import java.util.Scanner;

public class BalanceCheck3 {

	private static int accountBalance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the amount to withdraw");
		
		Scanner withdrawInput = new Scanner(System.in);
		
		int withdrawAmt = withdrawInput.nextInt();
		
		withdrawInput.close();
		
		if (withdrawAmt > accountBalance) {
			
			
			throw new InSufficientBalanceException1("Insufficient balance");
		} else {
			System.out.println("Withdrawl successful");
			
			
		}
		

}
}
