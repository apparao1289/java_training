package com.test.interfaceexample;

public class Printer implements Display, Print {

	@Override
	public void print() {
		System.out.println("Print...");
	}

	@Override
	public void display() {
		System.out.println("Display");
	}
	
	public void message() {
		System.out.println("message..");
	}

}
