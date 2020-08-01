package com.test.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class used for calculating the frequency of words in a file.
 * 
 * @author apparao
 *
 */
public class FrequencyOfWords {

	public static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		readFileContent("C:\\Apparao\\test\\input.txt");
		System.out.println("map::" + map);
	}

	/**
	 * This method reads data from given file.
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public static void readFileContent(String filePath) throws IOException {
		// step 1: Read the the file content line by line.
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				calculateFrequencyOfWords(line);
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
	 * This method calculate frequency of words.
	 * 
	 * @param line
	 */
	public static void calculateFrequencyOfWords(String line) {

		// step2: split line into words
		String words[] = line.split(" ");

		// step3: count the frequency of words.
		for (String word : words) {
			if (map.containsKey(word.trim())) {
				Integer count = map.get(word);
				map.put(word, ++count);
			} else {
				map.put(word, 1);
			}
		}

	}
}
