package com.example8;

public class InSufficientBalanceException1 extends RuntimeException{
	
	private static final long serialVersionUID =1L;
	
private String message;
	
	public InSufficientBalanceException1(String message) {
		
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}


}
