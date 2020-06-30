package com.test.methodoverloading;

public class Addition {

	public void add(int a, int b) {
		System.out.println("Addition of 2 int numbers:"+(a+b));
	}

	protected int add(int a, int b, int c) {

		return a + b + c;
	}

	private int add(int a, int b, float c) {

		return a + b + (int) c;
	}

	float add(float x, float y) {
		return (x + y);
	}
	
	public static void main(String args[]) {
		Addition addition = new Addition();
		
		System.out.println("Addition 3 int number::"+addition.add(2, 4, 6));
		
		addition.add(2, 4);
		
		System.out.println("Addition of 2 float numbers::"+addition.add(3.4f, 10.6f));
	}

}
