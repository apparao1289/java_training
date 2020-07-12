package com.test.stringexample;

public class StringReverse {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}

	private static char[] reverseString(String s) {
		char[] charArray = s.toCharArray();
		int low = 0;
		int high = charArray.length - 1;
		while (low < high) {
			char temp = charArray[low];
			charArray[low] = charArray[high];
			charArray[high] = temp;
			low++;
			high--;
		}

		return charArray; // time complexity : less than o(n)
	}
}
