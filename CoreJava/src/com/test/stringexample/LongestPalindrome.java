package com.test.stringexample;

public class LongestPalindrome {

	public static void main(String[] args) {
		int maxLength = 0;
		String longestPalandrome = null;
		String s = "Hello mdadm my mom is working as teacher";
		String[] words = s.split(" ");
		for (String word : words) {
			if (isPalandrome(word)) {
				if (maxLength < word.length()) {
					maxLength = word.length();
					longestPalandrome = word;
				}
			}
		}

		System.out.println(longestPalandrome);
	}

	public static boolean isPalandrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		if (word.equals(sb.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}
}
