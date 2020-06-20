package com.test.loops;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// print first N natural numbers sum.
		// n = 5 sum= 1+2+3+4+5 = 15 sum = n*(n+1)/2
		System.out.println("Sum of numbers::" + sumOfNumbers(100));
	}

	/**
	 * This method calculate the sum of first N natural numbers.
	 * 
	 * @param n
	 * @return
	 */
	private static int sumOfNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
