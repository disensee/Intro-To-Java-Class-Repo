package com.dylanisensee.samplecode;
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		float amount, totalTax, totalCost, tip;
		final float STATE_TAX;
		final float COUNTY_TAX;
		final float TIP_PERCENT;
		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextFloat();
		
		STATE_TAX = amount * 0.055F;
		COUNTY_TAX = amount * 0.02F;
		TIP_PERCENT = 0.15F;
		totalTax = STATE_TAX + COUNTY_TAX;
		tip = (amount + totalTax) * TIP_PERCENT;
		totalCost = amount + totalTax + tip;
		
		
		System.out.println("Enter the dollar amount of your purchase:");
		System.out.println("The original amount of your purchase is $" + amount);
		System.out.println("The state sales tax on your purchase is $" + STATE_TAX);
		System.out.println("The county sales tax on your purchase is $" + COUNTY_TAX);
		System.out.println("The total amount of sales tax on your purchase is $" + totalTax);
		System.out.println("The total tip for your purchase is " + tip);
		System.out.println("The total cost of your purhase with tax and tip is $" + totalCost);
	}

}
