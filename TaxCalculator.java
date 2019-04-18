package com.demo.onlineapp;

public class TaxCalculator {

	
	public double calculateTax(String category, double amount) {
		
		//String category = prodDetails.toString();
		double taxAmt=0.0;
		
		if(category.equals("A"))
			taxAmt= 0.1 * amount;
		else if(category.equals("B"))
			taxAmt= 0.2*amount;
		
		return Math.round(taxAmt*100.0)/100.0;
	}
}
