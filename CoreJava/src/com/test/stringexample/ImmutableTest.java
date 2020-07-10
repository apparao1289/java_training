package com.test.stringexample;

public class ImmutableTest {

	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println("s:"+s);
		s.concat("to US");
		System.out.println("After concat:"+s);
		
	}

}
