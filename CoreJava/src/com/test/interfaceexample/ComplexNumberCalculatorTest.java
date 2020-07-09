package com.test.interfaceexample;

public class ComplexNumberCalculatorTest {

	public static void main(String[] args) {
		ComplexNumberCalculationImpl cc = new ComplexNumberCalculationImpl();
		System.out.println("Addition of two numbres:"+cc.add(10, 20));
		System.out.println("Multiplication of two numbres:"+cc.multiplication(5, 6));
		cc.complexNumberAddition(2, 4, 5, 1);
		System.out.println("Square of a number::"+cc.squareOfNumber(6));
		
		ComplexNumberCalculator cnc = new ComplexNumberCalculationImpl();
		System.out.println("Addition of two numbres:"+cnc.add(10, 20));
		System.out.println("Multiplication of two numbres:"+cnc.multiplication(5, 6));
		cnc.complexNumberAddition(2, 4, 5, 1);
		//cnc.squareOfNumber(6);
	}

}
