package com.tnsif.bankingtransactionproject;

public class Transaction {
	 private final int TRANSACTION_FEE = 10;
	 private int amount;
	 private String type;
	 
	 
	 
	public final void performTransaction(int amount, String type) {
		this.amount = amount;
        this.type = type;
		System.out.println("transaction fee:"+ TRANSACTION_FEE);
		System.out.println("account type:"+type);
		System.out.println("Amount:"+amount);
		
		
	}

}
