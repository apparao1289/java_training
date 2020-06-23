package com.test.array;

public class EvenAndOddNumbersSeperately {

	public static void main(String[] args) {
		// Given array consists of even and odd numbers . write a program to seperate even and odd numbers seperately.
		int a[] = {2,3,5,7,4,11};
		int result[] = seperateEvenAndOdd(a);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	
	private static int[] seperateEvenAndOdd(int a[]) {

		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			while (low < high && a[low] % 2 == 0) {
				low++;
			}
			while (low < high && a[high] % 2 == 1) {
				high--;
			}
			if (low < high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
			}
		}
		return a;
	}

}
