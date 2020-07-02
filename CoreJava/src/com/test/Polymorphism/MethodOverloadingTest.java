package com.test.Polymorphism;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// compile time Polymorphism example
		Area a = new Area();
		
		// Area of circle
		float circleArea = a.area(3.5f);
		System.out.println("Area of circle:"+circleArea);
		
		// Area of square
		System.out.println("Area of square::"+a.area(4));
		
		// Area of rectangle
		System.out.println("Area of rectangle::"+a.area(2, 6));
		
	}

}
