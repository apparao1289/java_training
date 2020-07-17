package com.test.exception;

public class DivisionOfTwoNumbers {

	public static void main(String[] args) {
		int result = 0;
		try {
			result = division(20, 0);
		} catch (ArithmeticException e) {
			System.err.println(e);
		}
		System.out.println("\n");
		System.out.println("result ::" + result);

		int value = 0;
		int[] x = { 2, 3, 4 };
		try {
			value = x[4];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Access the elements beyond the rand:" + value);

	}

	private static int division(int a, int b) {
		return a / b;
	}

}
