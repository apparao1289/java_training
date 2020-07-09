package com.test.interfaceexample;

public class PrinterTest {

	public static void main(String[] args) {
		System.out.println("Using class reference variable..");
		Printer printer = new Printer();
		printer.display();
		printer.print();
		printer.message();
		
		System.out.println("Using display reference variable..");
		Display display = new Printer();
		display.display();
		//display.print();
		
		System.out.println("Using print reference variable..");
		Print print =  new Printer();
		print.print();
		//print.dispay();
		
	}

}
