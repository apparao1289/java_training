package com.test.inheritance;

public class Horse extends Animal{
	
	public void run() {
		System.out.println("Horse run");
	}
	
	public static void main(String[] args) {
		System.out.println("Invoking sub class members..");
		Horse h = new Horse();  // Using sub class object, we can invoke inherited members of super class as well as child class members. 
		h.eat();  // Animal eat
		System.out.println(h.name); // Animal name
		h.run();  // Horse run
		
		// Invoke super class members using super class object.
		System.out.println("Invoking super class members..");
		Animal a = new Animal();  // we can invoke only super class members. we can't invoke child class members
		a.eat();  // Animal eat
		System.out.println(a.name); // Animal name
	}

}
