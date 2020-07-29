package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int a[] = { 15, 20, 5, 25 };
		int b[] = { 15, 20, 5, 10 };

		intersectionOfTwoArrays(a, b);

	}

	private static void intersectionOfTwoArrays(int[] a, int[] b) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (Integer num : a) {
			set.add(num);
		}

		for (Integer num : b) {
			if (set.contains(num)) {
				list.add(num);
			}
		}

		System.out.println("Intersection of two arrays:" + list);
	}

}
