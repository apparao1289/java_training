package com.test.flowcontrol;

public class EBillCalculation {

	public static void main(String[] args) {
		/*
		 * Calculate the power bill/electricity bill for given slabs. 
		 * 1 - 50 slab rate :$2 
		 * 50 - 100 slab rate :$4
		 * 100 above slab rate: $ 6 
		 * And add sur charge of 2 % of total bill amount.
		 * 
		 * Example: consumed units are : 120
		 */
		double totalAmount = calcuateEbill(120, 2);
		System.out.println("Bill Amount:" + totalAmount);
	}

	/**
	 * This method calculate electricity bill based on number of units.
	 * 
	 * @param numberOfUnits
	 * @param surCharge
	 * @return
	 */
	private static double calcuateEbill(int numberOfUnits, int surCharge) {
		double amount = 0;
		if (numberOfUnits <= 50) {
			amount = numberOfUnits * 2;
		} else if (numberOfUnits > 50 && numberOfUnits <= 100) {
			amount = 50 * 2 + (numberOfUnits - 50) * 4;
		} else {
			amount = 50 * 2 + 50 * 4 + (numberOfUnits - 100) * 6;
		}

		double totalAmount = amount + ((amount) * surCharge) / 100;
		return totalAmount;
	}

}
