package com.dylanisensee.samplecode;

import java.util.Scanner;

/*
Class representing nonnegative amounts of money,
such as $100, $41.99, $0.05.
*/
public class Money {
	
	public static void main(String[] args) {
		Money m1 = new Money();
		m1.set(2L);
		
		Money m2 = new Money();
		m2.set(2.5);
		
		Money m3 = new Money();
		m3.set("3.10");
		
		Money m4 = new Money();
		m4.set(m3);
		
		Money m5 = m1.add(m2);
		m5.writeOutput();
		
		Money m6 = m3.times(2);
		m6.writeOutput();
	}
	
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
	
	public void set(String amountString) {
		String dollarsString;
		String centsString;
		
		//Delete '$' if any:
		if(amountString.charAt(0) == '$') {
			amountString = amountString.substring(1);
		}
		amountString = amountString.trim();
		
		//Locate decimal point
		int pointLocation = amountString.indexOf(".");
		if(pointLocation < 0) {  //If no decimal point
			cents = 0;
			dollars = Long.parseLong(amountString);
		}else {  //String has a decimal point
			dollarsString = amountString.substring(0, pointLocation);
			centsString = amountString.substring(pointLocation + 1);
		
		
			//one digit in cents means one tenth of a dollar
			if(centsString.length() <= 1) {
				centsString = centsString + "0";
			}
			
			//convert to numeric
			dollars = Long.parseLong(dollarsString);
			cents = Long.parseLong(centsString);
			
			if((dollars < 0) || (cents < 0) || (cents > 99)){
				System.out.println("Error: Illegal representation of money.");
				System.exit(0);
			}
		}
	}
	
	public void readInput() {
		System.out.println("Enter amount a line by itself:");
		Scanner keyboard = new Scanner(System.in);
		String amount = keyboard.nextLine();
		set(amount.trim());
	}
	
	/*
	 Does not go to the next line after displaying money
	 */
	
	public void writeOutput() {
		System.out.print("$" + dollars);
		if(cents < 10) {
			System.out.print(".0" + cents);
		}else {
			System.out.print("." + cents);
		}
		System.out.println("\n");
	}
	
	
	/*
	 Returns n times the calling object
	*/	
	
	public Money times(int n) {
		Money product = new Money();
		product.cents = n *cents;
		long carryDollars = product.cents / 100;
		product.cents = product.cents % 100;
		product.dollars = n * dollars + carryDollars;
		return product;
	}
	
	/*
	 Returns the sum of the calling object and the argument
	 */
	public Money add(Money otherAmount) {
		Money sum = new Money();
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents / 100;
		sum.cents = sum.cents % 100;
		sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
		return sum;
	}
}