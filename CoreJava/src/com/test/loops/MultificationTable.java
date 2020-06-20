package com.test.loops;

public class MultificationTable {

	public static void main(String[] args) {
		/**
		 * 2*1=2 
		 * 2*2=4 
		 * 2*3=6
		 */
		multiTable(2, 20);
	}

	/**
	 * This method prints the multiplication table for given number.
	 * 
	 * @param n
	 * @param limit
	 */
	private static void multiTable(int n, int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));

		}
	}
}
