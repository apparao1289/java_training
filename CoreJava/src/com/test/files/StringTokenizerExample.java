package com.test.files;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "Java is Object Oriented Language";
		StringTokenizer stn = new StringTokenizer(str, " ");
		String token = null;
		System.out.println("Token are : ");
		while (stn.hasMoreElements()) {
			token = stn.nextToken();
			System.out.println(token);
		}
	}
}
