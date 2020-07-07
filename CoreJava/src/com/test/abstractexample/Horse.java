package com.test.abstractexample;

public class Horse extends Animal {
	
	public Horse() {
		System.out.println("Horse constructor");
	}
	
	public void walk() {
		System.out.println("Horse walk..");
	}

	public void eat() {
		System.out.println("Horse eat");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Horse();
		a.walk();
		a.eat();
	}

}
