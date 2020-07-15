package com.test.mathclassexample;

public class AdiitionOfTwoNumbersUsingCommandLine {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("Adition of two numbers::" + add(a, b));
	}

	public static int add(int a, int b) {
		return (a + b);
	}

}
