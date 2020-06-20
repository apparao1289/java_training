package com.test.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		swap(10, 20);
	}

	/**
	 * Swapping of two numbers with temporary variable.
	 * 
	 * @param a
	 * @param b
	 */
	public static void swap(int a, int b) {
		System.out.println("before swap a:" + a + "b:" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a:" + a + "b:" + b);
	}

}
