package com.test.loops;

public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println("Number of digits:" + numberOfDigits(4546));
	}

	/**
	 * This method calculates the number of digits in a given number.
	 * 
	 * @param n
	 * @return
	 */
	public static int numberOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			count = count + 1;
			n = n / 10;
		}

		return count;
	}

}
