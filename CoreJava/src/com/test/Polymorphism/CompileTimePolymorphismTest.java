package com.test.Polymorphism;

/**
 * Compile time Polymorphism example
 * 
 * @author apparao
 *
 */
public class CompileTimePolymorphismTest {

	public static void main(String[] args) {
		// we can achieve compile time Polymorphism  using method overloading.
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
