package com.test.exception;

public class ExaceptionMethodsTest {

	public static void main(String[] args) {
		try {
			int resutlt = ExaceptionMethodsTest.division(30, 0);
			System.out.println("result ::" + resutlt);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println(e.getMessage());
			System.out.println(e.getStackTrace());

		}
	}

	private static int division(int a, int b) {
		return a / b;
	}

}
