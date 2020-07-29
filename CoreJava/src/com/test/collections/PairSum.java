package com.test.collections;

import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {
		int a[] = { 3, 2, 8, 15, 19, 20 };
		int sum = 17;
		pairSum(a, sum);
	}

	private static void pairSum(int[] a, int sum) {
		HashSet<Integer> set = new HashSet<>(); // sum = a+b => sum-a = b
		for (Integer num : a) {
			if (set.contains(sum - num)) {
				System.out.println("pair::" + num + "," + (sum - num));
			} else {
				set.add(num);
			}
		}
	}

}
