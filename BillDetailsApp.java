package com.demo.onlineapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BillDetailsApp {

	Random theRandom = new Random();
	
	public static void main(String[] args) {
		
		HashMap<Integer, ProductDetails> productMap = new HashMap<Integer, ProductDetails>();
		
		productMap.put(1, new ProductDetails(101,"Toothpaste","A",2,85));
		productMap.put(2, new ProductDetails(102,"Body Wash","A",4,122));
		productMap.put(3, new ProductDetails(103,"Table","C",1,349.50));
		productMap.put(4, new ProductDetails(104,"Pulses","B",5,92.56));
		productMap.put(5, new ProductDetails(105,"Butter","B",1,140));
		productMap.put(6, new ProductDetails(106,"Gas stove","C",1,1057));
		productMap.put(7, new ProductDetails(107,"Detergent","A",1,277.70));
		double totalAmt =0.0,totalTax=0.0,taxAmt,chgAmt = 0.0;
		String TaxPercentage= null;
		
		TaxCalculator t1 = new TaxCalculator();
		
		System.out.println("========== Product Details ========= ");
		
			for(Map.Entry m:productMap.entrySet()){    
			    
				System.out.println("==========================");
				ProductDetails p = (ProductDetails) m.getValue();
				
				 System.out.println("Category       : " + p.category );
				 System.out.println("Product Id     : " + p.id );
			     System.out.println("Product Name   : " + p.name );
			     System.out.println("Quantity       : " + p.quantity );
			     System.out.println("Per Unit Price : " + p.price );
			     chgAmt=p.quantity*p.price;
			     taxAmt = t1.calculateTax(p.category,chgAmt);
			     TaxPercentage = p.category=="A"?"10%":(p.category=="B"?"20%":"Nil");
			     System.out.println("Sales Tax("+TaxPercentage +  ") : " + taxAmt);
			     chgAmt = Math.round((chgAmt+taxAmt)*100.0)/100.0;
			     System.out.println("Amount Charged : " + chgAmt );
			     totalAmt = totalAmt + chgAmt;
			     totalTax = totalTax + taxAmt;
			     
			}  

			System.out.println("=========================================================="+"\n");
			System.out.println("Sales Tax Computed   : " + Math.round(totalTax*100.0)/100.0);
			System.out.println("Total Amount Payable : " + totalAmt);
	}
	
}
