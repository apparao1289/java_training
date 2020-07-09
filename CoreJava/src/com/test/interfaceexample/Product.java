package com.test.interfaceexample;

@FunctionalInterface
public interface Product {

	void getProductDetails(String id);
	
	default void display() {
		System.out.println("Display method..");
	}

	default void print() {
		System.out.println("Display method..");
	}
	
	static void message() {
		System.out.println("Message method..");
	}
	
	static void show() {
		System.out.println("show method..");
	}
}
