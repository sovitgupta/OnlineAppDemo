package com.demo.onlineapp;

import java.util.HashMap;
import java.util.List;

public class TaxCalculator {

	
	public double calculateTax(String category, double amount) {
		
		//String category = prodDetails.toString();
		double taxAmt=0.0;
		
		if(category == "A")
			taxAmt= 0.1 * amount;
		else if(category =="B")
			taxAmt= 0.2*amount;
		
		return Math.round(taxAmt*100.0)/100.0;
	}
}
