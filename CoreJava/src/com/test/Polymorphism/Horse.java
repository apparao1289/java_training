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

}
