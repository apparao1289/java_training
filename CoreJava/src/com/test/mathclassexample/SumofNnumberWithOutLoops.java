package com.test.mathclassexample;

public class SumofNnumberWithOutLoops {

	public static void main(String[] args) {

		System.out.println("sum of natural numbers::" + sumOfNaturalNumbers(5));
	}

	public static int sumOfNaturalNumbers(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n + sumOfNaturalNumbers(n - 1); // 5+4+3+2+1
		}
	}

}
