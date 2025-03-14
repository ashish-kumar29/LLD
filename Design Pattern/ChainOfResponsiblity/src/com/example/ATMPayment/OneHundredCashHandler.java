package com.example.ATMPayment;

public class OneHundredCashHandler extends CashHandler {

	public OneHundredCashHandler(CashHandler cashHandler) {
		super(cashHandler);
	}

	public void cash(int amount) {
		if(amount>=ONE_HUNDRED_NOTE) {
			int cash_count = amount/ONE_HUNDRED_NOTE;
			System.out.println("100's note: "+cash_count);
			amount%=ONE_HUNDRED_NOTE;
		}
		if(amount > 0) {
			super.cash(amount);
		}
	}
}
