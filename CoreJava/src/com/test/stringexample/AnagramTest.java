package com.test.stringexample;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {

	public static void main(String[] args) {
		System.out.println(checkBothStringsAreAnagram("god", "dog"));
		System.out.println("Using hashmap::"+checkAnagram("god","dog"));
		System.out.println("Using hashmap::"+checkAnagram("listen","silent"));
	}

	public static boolean checkBothStringsAreAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] charArray = s1.toCharArray();

		for (char c : charArray) { // g, o ,d
			int index = s2.indexOf(c); // g = 0
			if (index != -1) {
				s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
			} else {
				return false;
			}

		}

		return s2.isEmpty();
	}

	public static boolean checkAnagram(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Character> map = new HashMap<>();
		char[] charArray2 = s2.toCharArray();
		for (char c : charArray2) {
			map.put(c, c);
		}

		char[] charArray = s1.toCharArray();

		for (char c : charArray) {
			if (!map.containsKey(c)) {
				return false;
			}
		}

		return true;
	}

}
