package com.dylanisensee.samplecode;
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		float amount, stateTax, countyTax, totalTax, totalCost;
		System.out.println("Enter the dollar amount of your purchase:");
		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextFloat();
		
		stateTax = amount * 0.055F;
		countyTax = amount * 0.02F;
		totalTax = stateTax + countyTax;
		totalCost = amount + stateTax + countyTax;
		
		System.out.println("The original amount of your purchase is $" + amount);
		System.out.println("The state sales tax on your purchase is $" + stateTax);
		System.out.println("The county sales tax on your purchase is $" + countyTax);
		System.out.println("The total amount of sales tax on your purchase is $" + totalTax);
		System.out.println("The total cost of your purhase with tax is $" + totalCost);
	}

}
