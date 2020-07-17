package com.test.exception;

public class ReturnInFinallyBlockExample {

	public static void main(String[] args) {
		System.out.println("result::" + division(20, 0));
	}

	public static int division(int a, int b) {
		int result = 0;
		try {
			result = a / b;
			return result;

		} catch (Exception e) {
			return 3;
		} finally {
			return 5;
		}

	}

}
