package com.test.loops;

public class PalandromeNumber {

	public static void main(String[] args) {
		// Palandrome : If original number and reverse of the number both are same, then given number is palandrome number.
		int n = 545;
		int reverseNumber = reverseNumber(n);
		if(n == reverseNumber) {
			System.out.println("Palandrome");
		} else {
			System.out.println("Not Palandrome");
		}
	}

	/**
	 * This method reverse the given number.
	 * 
	 * @param n
	 * @return
	 */
	public static int reverseNumber(int n) {
		int reverseNumber = 0;
		while (n != 0) {   
			int digit = n % 10; 
			reverseNumber = reverseNumber * 10 + digit; 
			n = n / 10;
		}

		return reverseNumber;
	}
}
