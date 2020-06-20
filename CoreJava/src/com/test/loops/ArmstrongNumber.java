package com.test.loops;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Armstrong number: sum of the cubes of digits equal to number.
		// n= 153 (3*3*3 + 5*5*5 + 1*1*1 = 27+125+1 = 153)

		printArmstrongNumbers(2,2000);

	}

	/**
	 * This method prints the armstrong numbers between given intervals.
	 * 
	 * @param lowerBound
	 * @param upperBound
	 */
	private static void printArmstrongNumbers(int lowerBound, int upperBound) { // 2 200
		for (int i = lowerBound; i <= upperBound; i++) {
			boolean result = armstrongNumber(i);
			if (result) {
				System.out.println(i);
			}
		}
	}

	/**
	 * This method checks given number is armstrong number or not.
	 * 
	 * @param n
	 * @return
	 */
	private static boolean armstrongNumber(int n) { // 153
		int originalNumber = n; // 153
		int armNumber = 0; // 0
		while (n != 0) {
			int digit = n % 10; // 3 5 1
			armNumber = armNumber + (digit * digit * digit); // 0+27 27+125 152+1=153
			n = n / 10; // 15 1
		}

		if (originalNumber == armNumber) {
			return true;
		}
		return false;
	}
}
