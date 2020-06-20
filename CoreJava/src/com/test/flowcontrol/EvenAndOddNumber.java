package com.test.flowcontrol;

public class EvenAndOddNumber {

	public static void main(String[] args) {

		findEvenAndOddNumber(13);
	}

	/**
	 * This method checks given number is even or odd number.
	 * 
	 * @param n
	 */
	private static void findEvenAndOddNumber(int n) {

		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

	}

}
