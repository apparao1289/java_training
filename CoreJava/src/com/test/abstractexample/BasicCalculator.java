package com.test.abstractexample;

public abstract class BasicCalculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sun(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		if (b != 0) {
			return a / b;
		}
		return 0;
	}
	
	public abstract void complexNumberAddition(int realPart1, int imaginaryPart1,int realPart2,int imaginaryPart2);
}
