package com.test.abstractexample;

public abstract class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}

	public void eat() {
		System.out.println("Animal eat");
	}

	public abstract void walk();

}
