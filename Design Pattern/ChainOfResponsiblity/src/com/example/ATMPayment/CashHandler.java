package com.example.ATMPayment;

public abstract class CashHandler {

	public static int TWO_THOUSAND_NOTE = 2000;
	public static int FIVE_HUNDRED_NOTE = 500;
	public static int TWO_HUNDRED_NOTE = 200;
	public static int ONE_HUNDRED_NOTE = 100;
	
	CashHandler nextCashHandler;
	
	public CashHandler(CashHandler cashHandler) {
		this.nextCashHandler = cashHandler;
	}
	
	public void cash(int amount) {
		if(nextCashHandler != null) {
			nextCashHandler.cash(amount);
		}
	}
}
