package com.test.operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		swap(30,40);
		swapArithmeticOperators(10, 20);
	}

	/**
	 * This method swaps two numbers using arithmetic operators.
	 * 
	 * @param a
	 * @param b
	 */
	private static void swap(int a, int b) {
		System.out.println("Before swap a:" + a + " b:" + b);
		a = a + b; // 10+20 = 30
		b = a - b; // 30-20 = 10
		a = a - b; // 30-10 = 20
		System.out.println("After swap a:" + a + " b:" + b);
	}

	/**
	 * This method swaps two numbers using arithmetic operators with out temporary
	 * variable.
	 * 
	 * @param a
	 * @param b
	 */
	private static void swapArithmeticOperators(int a, int b) {

		System.out.println("Before swap a:" + a + " b:" + b);

		a = (a * b) / (b = a);

		System.out.println("After swap a:" + a + " b:" + b);
	}

}
