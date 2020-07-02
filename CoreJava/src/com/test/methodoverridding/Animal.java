package com.test.methodoverridding;

public class Animal {

	public String name = "Animal name";

	public void eat() {
		System.out.println("Animal eat");
	}

	public void printYourself() {
		System.out.println("Printing Animal information..");
	}

	public static void testClassMethod() {
		System.out.println("The class method in Animal.");
	}

}
