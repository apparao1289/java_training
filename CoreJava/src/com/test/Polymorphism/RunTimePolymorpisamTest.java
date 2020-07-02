package com.test.Polymorphism;

/**
 * Run time polymorpism example.
 * 
 * @author apparao
 *
 */
public class RunTimePolymorpisamTest {

	public static void main(String[] args) {
		// Creating sub class object. with this object we can invoke all members of sub class and inherited members of super class
		Horse h = new Horse();
		h.eat(); // overridden method of eat()
		h.eat("Eat fast"); // sub class eat(String message);
		h.printYourself(); // sub class  printYourself() 

		// creating super class object. Using this object we can invoke only super class members
		Animal a = new Animal();
		a.eat();

		// creating sub class object and assigning to super class reference variable. (Dynamic Polymorphism)
		Animal ah = new Horse();  // Using this object we can invoke all inherited or override methods of super class method available in sub class.
		ah.eat(); // overridden method of sub class

	}

}
