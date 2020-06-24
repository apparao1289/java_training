package com.test.array;

import java.util.Arrays;

public class SumOfTwoElementsEqualToGivenSum {

	public static void main(String[] args) {
		// sum of two elements equals to given sum in a array.
		int a[] = { 1, 3, 4, 6, 7, 8 }; // sum =10 possible pairs: (3,7)(4,6)
		sumOfTwoNumber(a, 10);
	}

	public static void sumOfTwoNumber(int a[], int sum) {
		int low = 0;
		int high = a.length - 1;
		Arrays.sort(a);
		while (low < high) {
			if (a[low] + a[high] == sum) {
				System.out.println("(" + a[low] + "," + a[high] + ")");
				low++;
				high--;
			}else if (a[low] + a[high] > sum) {
				high--;
			} else {
				low++;
			}

		}
	}

}
