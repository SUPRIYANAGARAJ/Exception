package com.example8;

public class InSufficientBalanceException extends Exception {

	private String message;
	
	public InSufficientBalanceException(String message) {
		
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
