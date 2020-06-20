package com.test.flowcontrol;

public class SwithStatementTest {

	public static void main(String[] args) {
		findEvenAndOddNumber(8);
		findEvenAndOddNumber(5);
	}

	private static void findEvenAndOddNumber(int n) {

		switch (n % 2) {

		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("Odd number");
			break;
		}
	}

}
