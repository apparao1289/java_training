package com.test.mathclassexample;

public class FactOfNumber {

	public static void main(String[] args) {
		FactOfNumber fn = new FactOfNumber();
		System.out.println("factorial of number::"+fn.fact(6));
	}

	public int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}
