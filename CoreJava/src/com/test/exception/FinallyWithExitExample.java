package com.test.exception;

public class FinallyWithExitExample {

	public static void main(String[] args) {
		System.out.println("result::"+add(10,25));
	}

	public static int add(int a, int b) {
		System.out.println("a::"+a +"  b::"+b);
		int result = 0;
		try {
			result = a + b;
			System.out.println("Inside add ::"+result);
			System.exit(0);
		} catch (Exception e) {
			result = 20;
		} finally {
			result = 30;
		}

		return result;
	}

}
