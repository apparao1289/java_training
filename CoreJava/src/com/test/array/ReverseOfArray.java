package com.test.array;

public class ReverseOfArray {

	public static void main(String[] args) {
		// Reverse of a array
		int a[] = { 3, 4, 5, 1, 7, 8 };
		//int b[] = reverseArray(a);
		int b[] = reverseArrayUsingTwoPointer(a);
		System.out.println("Reverse Array::");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static int[] reverseArray(int a[]) {
		int b[] = new int[a.length];   //o(1)
		int j = 0;                     // o(1) 
		for (int i = a.length - 1; i >= 0; i--) { // length = 6
			b[j++] = a[i];             // o(n)
		}

		return b;  // space complexity : o(n)  time complexity: o(n)
	}
	
	private static int[] reverseArrayUsingTwoPointer(int a[]) {
		int low = 0;    
		int high = a.length -1;  
		while(low<high) {
			int temp = a[low];   
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		
		return a;  // space complexity : o(1)   time complexity : less than o(n)
	}
}
