package com.test.interfaceexample;

public class ComplexNumberCalculationImpl implements ComplexNumberCalculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public void complexNumberAddition(int r1, int i1, int r2, int i2) {
		System.out.println("Complex number addition:"+(r1+r2)+" +i"+(i1+i2));
	}
	
	public int squareOfNumber(int n) {
		return n*n;
	}
}
