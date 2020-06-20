package com.test.operators;

public class CircleArea {

	public static void main(String[] args) {
		float area = area(10);
		System.out.println("area:" + area);

	}

	/**
	 * This method calculates area of the circle for given radius.
	 * 
	 * @param radius
	 * @return
	 */
	private static float area(int radius) {

		float area = (22 / 7) * radius * radius;

		return area;
	}

}
