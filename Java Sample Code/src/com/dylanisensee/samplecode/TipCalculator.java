package com.dylanisensee.samplecode;
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the price of the meal?");
		float price = scanner.nextFloat();
		
		final float STATE_TAX = 0.055F;
		final float COUNTY_TAX = 0.02F;
		final float TIP_PERCENT = 0.15F;
		
		float totalStateTax = price * STATE_TAX;
		float totalCountyTax = price * COUNTY_TAX;
		float totalTax = totalStateTax + totalCountyTax;
		float tip = (price + totalTax) * TIP_PERCENT;
		float grandTotal = price + totalTax + tip;
		
		System.out.println("Price:" + price);
		System.out.println("Tax: " + totalTax);
		System.out.println("Tip:" + tip);
		System.out.println("Total:" + grandTotal);
	}

}
