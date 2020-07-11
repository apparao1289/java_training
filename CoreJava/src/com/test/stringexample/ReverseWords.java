package com.test.stringexample;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "I am reading a book";
		ReverseWords rw = new ReverseWords();
		rw.reverseWords(s);
		rw.reverseWordsUsingStringBuilder(s);
	}

	public void reverseWords(String s) {
		System.out.println("original string ::" + s);
		String result = "";
		if (s.isEmpty()) {
			System.out.println("String is empty");
		}

		String words[] = s.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			result = result + words[i] + " ";
		}

		System.out.println("Revere words in string::" + result);
	}

	public void reverseWordsUsingStringBuilder(String s) {
		System.out.println("original string ::" + s);
		StringBuilder sb = new StringBuilder();
		if (s.isEmpty()) {
			System.out.println("String is empty");
		}

		String words[] = s.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		}

		System.out.println("Revere words in string::" + sb.toString());
	}

}
