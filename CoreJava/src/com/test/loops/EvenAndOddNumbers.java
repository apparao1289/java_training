package com.test.loops;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// print sum of the even and odd numbers between given intervals.
		// [2,8] = even number = 2,4,6,8 oddnumbers = 3,5,7
		evenAndOddNumber(2,8);
	}

	/**
	 * This method calculate sum of even and odd numbers between given intervals.
	 * 
	 * @param lowerBound
	 * @param upperBound
	 */
	private static void evenAndOddNumber(int lowerBound, int upperBound) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = lowerBound; i <= upperBound; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum+i;
			} else {
				oddSum = oddSum+i;
			}
		}
		System.out.println("Even sum:"+evenSum);
		System.out.println("Odd sum::"+oddSum);
	}
}
