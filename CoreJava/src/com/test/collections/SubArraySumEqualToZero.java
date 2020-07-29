package com.test.collections;

import java.util.HashSet;

public class SubArraySumEqualToZero {

	public static void main(String[] args) {
		int a[] = { 1, 4, 13, -3, -10, 5 };

		boolean result = subArraySumEqualToZero(a);
		System.out.println("result::" + result);
	}

	private static boolean subArraySumEqualToZero(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		int preSum = 0;
		for (Integer num : a) {
			preSum = preSum + num;
			if (set.contains(preSum)) {
				return true;
			}
			if (preSum == 0) {
				return true;
			}
			set.add(preSum);
			System.out.println("set::"+set);
		}
		
		return false;
	}

}
