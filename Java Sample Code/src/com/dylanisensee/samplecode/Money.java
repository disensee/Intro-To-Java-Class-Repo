package com.dylanisensee.samplecode;
/*
Class representing nonnegative amounts of money,
such as $100, $41.99, $0.05.
*/
public class Money {
	
	private long dollars;
	private long cents;
	
	public void set(long newDollars) {
		if(newDollars < 0) {
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}else {
			dollars = newDollars;
			cents = 0;
		}
	}
	public void set(double newAmount) {
		if(newAmount < 0) {
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}else {
			long allCents = Math.round(newAmount * 100);
			dollars = allCents / 100;
			cents = allCents % 100;
		}
	}
	public void set(Money moneyObject) {
		this.dollars = moneyObject.dollars;
		this.cents = moneyObject.cents;
	}

	/*
	 Precondition: The argument is an ordinary representation
	 of an amount of money, with or without a dollar sign.
	 Fractions of a cent are not allowed. 
	*/
	
}