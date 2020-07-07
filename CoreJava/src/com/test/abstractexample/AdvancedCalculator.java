package com.test.abstractexample;

public class AdvancedCalculator extends BasicCalculator {

	@Override
	public void complexNumberAddition(int realPart1, int imaginaryPart1, int realPart2, int imaginaryPart2) {
		System.out.println("Addition of complex numbers:"+(realPart1+realPart2)+"+i"+(imaginaryPart1+imaginaryPart2));
	}

	public static void main(String[] args) {
		BasicCalculator bc = new AdvancedCalculator();
		System.out.println("add :"+bc.add(2, 3));
		System.out.println("sub :"+bc.sun(10, 20));
		System.out.println("mul :"+bc.mul(2, 4));
		bc.complexNumberAddition(2, 3, 4, 5);
	}

}
