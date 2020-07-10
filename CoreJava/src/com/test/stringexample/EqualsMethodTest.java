package com.test.stringexample;

public class EqualsMethodTest {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		
		if(s1.equals(s2)) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}
	
		
		String s3 = "bye";
		String s4 = "Bye";
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("Both s3 and s4 are equal");
		}else {
			System.out.println("Both s3 and s4 not equal");
		}
	}

}
