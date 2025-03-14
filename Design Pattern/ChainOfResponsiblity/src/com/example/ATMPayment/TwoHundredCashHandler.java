package com.example.ATMPayment;

public class TwoHundredCashHandler extends CashHandler {

	public TwoHundredCashHandler(CashHandler cashHandler) {
		super(cashHandler);
	}

	public void cash(int amount) {
		if(amount>=TWO_HUNDRED_NOTE) {
			int cash_count = amount/TWO_HUNDRED_NOTE;
			System.out.println("200's note: "+cash_count);
			amount%=TWO_HUNDRED_NOTE;
		}
		if(amount > 0) {
			super.cash(amount);
		}
	}
}
