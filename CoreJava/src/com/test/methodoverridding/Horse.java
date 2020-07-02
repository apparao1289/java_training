package com.test.methodoverridding;

public class Horse extends Animal {

	/**
	 * super class access specifier            child class overridden method possible access specifier
	 * =============================================================================
	 * public                                 public
	 * protected                              protected,public 
	 * default                                default,protected,public
	 * private                                 ---
	 */

	public void eat() {
		System.out.println("Horse eat");
	}

	public void eat(String message) {
		System.out.println("message::" + message);
	}

	public void printYourself() {
		super.printYourself(); // Invoke the superclass (Animal) code
		// Then do Horse-specific print work here
		System.out.println("Horse information printing");
	}

	public static void testClassMethod() {
		System.out.println("Horse class test method");
	}

	public static void main(String[] args) {
		// Creating sub class object
		Horse h = new Horse();
		h.eat(); // overridden method of eat()
		h.eat("Eat fast"); // sub class eat(String message);
		h.printYourself();
		h.testClassMethod();

		// creating super class object.
		Animal a = new Animal();
		a.eat();
		// a.eat("Eat fast"); compilation error

		// creating sub class object and assigning to super class reference variable.
		Animal ah = new Horse();
		ah.eat(); // overridden method of sub class
		// ah.eat("Eat slowly"); // compilation error
		ah.testClassMethod(); // super class method.

	}

}
