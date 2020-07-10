package com.test.stringexample;

public class DoubleEqualsOperatorTest {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = new String("welcome");
		String s3 = "welcome";
		String s4 = new String("welcome");
		String s5 = "bye";
		
		if(s1 == s2) {
			System.out.println("both s1 and s2 are equal");
		}else {
			System.out.println("s1 and s2 are not equal");  // s1 and s2 are not equal
		}
		
		if(s1 == s3) {
			System.out.println("s1 and s3 are equal");   // s1 and s3 are equal
		} else {
			System.out.println("s1 and s3 are not equal");
		}
		
		if(s2.equals(s4)) {
			System.out.println("s2 and s4 are equal");  // s2 and s4 are equal
		}else {
			System.out.println("s2 and s4 are not equal"); 
		}
		
		System.out.println(s1 == s5 ? "s1 and s5 are equal" : "s1 and s5 are not equal"); // s1 and s5 are not equal
		
		System.out.println(s4.equals(s5) ? "s4 and s5 are equal" : "s4 and s5 are not equal"); // s4 and s5 are not equal
	}

}
