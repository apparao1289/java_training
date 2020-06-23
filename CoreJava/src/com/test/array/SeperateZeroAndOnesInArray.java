package com.test.array;

public class SeperateZeroAndOnesInArray {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 0, 1, 1 };
		//int result[] = seperateEvenAndOddNumbers(a);
		int result[] = seperateZeosAndOnesUsingTwoPOinters(a);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] seperateZeosAndOnesUsingTwoPOinters(int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low < high) {
			while (low < high && a[low]  == 0) {
				low++;
			}
			while (low < high && a[high] == 1) {
				high--;
			}
			if (low < high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
			}
		}
		
		return a;  // space complexity: o(1)  time complexity : less than the o(n)
	}

	public static int[] seperateEvenAndOddNumbers(int a[]) {

		int sum = 0;    
		for (int i = 0; i < a.length - 1; i++) {   
			sum = sum + a[i];
		}

		int b[] = new int[a.length];  
		for (int j = 0; j < a.length - sum; j++) {   
			b[j] = 0;
		}

		for (int k = 3; k < a.length; k++) {  
			b[k] = 1;
		}
		return b;  // space complexity = o(n)   time complexity: o(n)
	}
}
