package com.test.collections;

import java.util.HashMap;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 2, 5, 6, 3, 5 };
		printFrequencyOfElements(a);
	}

	private static void printFrequencyOfElements(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
		if (null != a && a.length > 0) {
			for (Integer num : a) {
				if (map.containsKey(num)) {
					Integer count = map.get(num);
					map.put(num, ++count);
				} else {
					map.put(num, 1);
				}
			}
		}
		System.out.println("map::"+map);
	}

}
