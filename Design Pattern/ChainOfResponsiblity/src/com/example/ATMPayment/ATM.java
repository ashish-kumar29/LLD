package com.example.ATMPayment;

public class ATM {

	public static void main(String[] args) {
		
		CashHandler cashHandler = new TwoThousandCashHandler(new FiveHundredCashHandler(new TwoHundredCashHandler(new OneHundredCashHandler(null))));
		
		cashHandler.cash(5300);

	}

}
