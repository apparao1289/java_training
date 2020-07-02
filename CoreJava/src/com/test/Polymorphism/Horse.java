package com.test.Polymorphism;

public class Horse extends Animal {

	public void eat() {
		System.out.println("Horse eat");
	}

	public void eat(String message) {
		System.out.println("message::" + message);
	}

	public void printYourself() {

		System.out.println("Horse information printing");
	}

	public static void testClassMethod() {
		System.out.println("Horse class test method");
	}

	public static void main(String[] args) {
		// Creating sub class object. with this object we can invoke all members of sub class and inherited members of super class
		Horse h = new Horse();
		h.eat(); // overridden method of eat()
		h.eat("Eat fast"); // sub class eat(String message);
		h.printYourself(); // sub class  printYourself() 
		h.testClassMethod();  // static methods can not be overridden

		// creating super class object. Using this object we can invoke only super class members
		Animal a = new Animal();
		a.eat();

		// creating sub class object and assigning to super class reference variable. (Dynamic Polymorphism)
		Animal ah = new Horse();  // Using this object we can invoke all inherited or override methods of super class method available in sub class.
		ah.eat(); // overridden method of sub class
		

	}

}
