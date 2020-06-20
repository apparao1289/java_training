package com.test.flowcontrol;

public class FindNumberSign {

	public static void main(String[] args) {
		findNumberSign(5);
		findNumberSign(-8);
		findNumberSign(0);
	}

	/**
	 * This method checks given number is positive or negative or zero.
	 * 
	 * @param n
	 */
	private static void findNumberSign(int n) {
		if (n > 0) {
			System.out.println("positive number");
		} else if (n < 0) {
			System.out.println("Negative number");
		} else {
			System.out.println("zero");
		}
	}

}
