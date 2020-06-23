package com.test.array;

public class SeperatePositiveAndNegativeNumberInArray {

	public static void main(String[] args) {
		// seperate positive and negative numbers in array.
		int a[] = {2,-4,6,-3,-11,9,10};
		int result[] = seperatePositiveAndNegativeNumbers(a);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] seperatePositiveAndNegativeNumbers(int a[]) {

		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			while (low < high && a[low] > 0) {
				low++;
			}
			while (low < high && a[high] < 0) {
				high--;
			}
			if (low < high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
			}
		}

		return a;  // space : o(1)  time: less than o(n)
	}
}
