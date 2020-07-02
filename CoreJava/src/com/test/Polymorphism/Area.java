package com.test.Polymorphism;

public class Area {

	/**
	 * This method calculate area of circle for given radius.
	 * 
	 * @return
	 */
	public float area(float radius) {
		System.out.println("Calculating area of circle..");
		return (22 / 7 * radius * radius);
	}

	/**
	 * This method calculate area of square for given side.
	 * 
	 * @return
	 */
	public int area(int side) {
		System.out.println("Calculating area of square..");
		return (side * side);
	}

	/**
	 * This method calculate area of rectangle for given length and width.
	 * 
	 * @return
	 */
	public float area(int l, int b) {
		System.out.println("Calculating area of rectangle..");
		return (l * b);
	}
}
