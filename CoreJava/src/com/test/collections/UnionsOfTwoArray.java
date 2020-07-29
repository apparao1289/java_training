package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionsOfTwoArray {

	public static void main(String[] args) {
		int a[] = { 15, 20, 5, 15 };
		int b[] = { 15, 20, 15, 10 };

		int c[] = unionOfTwoArrays(a, b);
		for(Integer num : c) {
			System.out.println(num);
		}
	}

	private static int[] unionOfTwoArrays(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<>();
		for (Integer num : a) {
			set.add(num);
		}

		for (Integer num : b) {
			set.add(num);
		}
		List<Integer> list = new ArrayList<>(set);
		int c[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			c[i] = list.get(i);
		}

		return c;
	}

}
