package com.test.collections;

import java.util.HashMap;

public class OccurenceOfWords {

	public static void main(String[] args) {
        String sentance = "I am reading I am eating";
		findWordOccurences(sentance);
	}

	public static void findWordOccurences(String sentance) {

		HashMap<String, Integer> map = new HashMap<>();

		String[] words = sentance.split(" ");

		for (String word : words) {

			if (map.containsKey(word)) {
				
				Integer count = map.get(word);
				
				map.put(word, ++count);
				
			} else {
				
				map.put(word, 1);
			}
		}
		
		System.out.println("map::"+map);
	}
}
