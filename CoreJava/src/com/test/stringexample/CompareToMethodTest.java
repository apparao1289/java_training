package com.test.stringexample;

public class CompareToMethodTest {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		
		int result = s1.compareTo(s2);
		System.out.println(result == 0 ? "s1 and s2 are equal" : "s1 and s2 are not equal");
		
		int result1 = s2.compareTo(s3);
		System.out.println(result1 == 0 ? "s2 and s3 are equal" : "s2 and s3 are not equal");
		
		int result2 = s1.compareTo(s3);
		System.out.println(result2 == 0 ? "s1 and s3 are equal" : "s1 and s3 are not equal");
	}

}
