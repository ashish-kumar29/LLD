package com.example.ATMPayment;

public class TwoThousandCashHandler extends CashHandler {

	public TwoThousandCashHandler(CashHandler cashHandler) {
		super(cashHandler);
	}
	
	public void cash(int amount) {
		if(amount%100 != 0) {
			System.out.println("Please enter an amount that can be dispensed using available denominations (100, 200, 500, 2000)");
			return;
		}
		int note_count=0;
		if(amount >= 2000) {
			note_count = amount/TWO_THOUSAND_NOTE;
			System.out.println("2000's note: "+note_count);
			amount %= TWO_THOUSAND_NOTE;
		}
		if(amount>0) {
			super.cash(amount);
		}
		
	}

}
