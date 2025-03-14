package com.example.ATMPayment;

public class FiveHundredCashHandler extends CashHandler {

	public FiveHundredCashHandler(CashHandler cashHandler) {
		super(cashHandler);
	}

	public void cash(int amount) {
		if(amount>=FIVE_HUNDRED_NOTE) {
			int cash_count = amount/FIVE_HUNDRED_NOTE;
			System.out.println("500's note: "+cash_count);
			amount%=FIVE_HUNDRED_NOTE;
		}
		if(amount > 0) {
			super.cash(amount);
		}
	}
}
