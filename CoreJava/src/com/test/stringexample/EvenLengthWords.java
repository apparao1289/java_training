package com.test.stringexample;

public class EvenLengthWords {

	public static void main(String[] args) {
		String s = "hello how are ramu";
		String[] words = s.split(" ");
		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
	}

}
