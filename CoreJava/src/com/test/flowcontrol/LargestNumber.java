package com.test.flowcontrol;

public class LargestNumber {

	public static void main(String[] args) {
		findLargestNumber(10, 20);
	}

	/**
	 * This method checks largest number among given two numbers.
	 * 
	 * @param a
	 * @param b
	 */
	private static void findLargestNumber(int a, int b) {
		if (a > b) {
			System.out.println("a is large number compare to b");
		} else {
			System.out.println("b is large number compare to a");
		}

	}

}
