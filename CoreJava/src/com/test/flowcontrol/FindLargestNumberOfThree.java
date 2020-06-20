package com.test.flowcontrol;

public class FindLargestNumberOfThree {

	public static void main(String[] args) {
		findLargestNumber(5, 8, 10);
	}

	/**
	 * This method checks largest number among three numbers.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	private static void findLargestNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(" a is large number");
		} else if (b > c) {
			System.out.println("b is large number");
		} else {
			System.out.println("c is large number");
		}

	}

}
