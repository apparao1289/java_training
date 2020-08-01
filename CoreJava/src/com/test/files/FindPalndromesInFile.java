package com.test.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for checking the palindrome string.
 * 
 * @author apparao
 *
 */
public class FindPalndromesInFile {

	public static Set<String> list = new HashSet<>();

	public static void main(String[] args) {
		FindPalndromesInFile fpf = new FindPalndromesInFile();
		try {
			fpf.readContentFromFile("C:\\Apparao\\test\\input.txt");
			System.out.println("Palandrome count::" + list.size());
			System.out.println("Palandrome string::" + list);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method reading content from file.(line by line)
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public void readContentFromFile(String filePath) throws IOException {
		// step1: Read the content from file (line by line)
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				processLines(line);
			}
		} finally {
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();
			}
		}

	}

	/**
	 * This method splitting the given string into multiple words.
	 * 
	 * @param line
	 */
	public void processLines(String line) {
		// step2: Split the line into words
		if (null != line) {
			String[] words = line.split(" ");
			for (String word : words) {
				if (chechPalandrome(word)) {
					list.add(word);
				}
			}
		}
	}

	/**
	 * This method checks given string is palindrome or not.
	 * 
	 * @param word
	 * @return
	 */
	public boolean chechPalandrome(String word) {
		// step3: check given word is palandrome or not.
		StringBuilder sb = new StringBuilder(word);
		String reverseWord = sb.reverse().toString();
		if (word.equals(reverseWord)) {
			return true;
		} else {
			return false;
		}
	}

}
