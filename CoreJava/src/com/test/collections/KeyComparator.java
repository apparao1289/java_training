package com.test.collections;

import java.util.Comparator;

public class KeyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}

}
