package com.test.array;

public class FindNonRepeatingElement {

	public static void main(String[] args) {
		// Find the non repeating number in a given array
		int a[] = {2,3,4,3,2};  // xor operator  
		int result = a[0];
		for(int i=1;i<a.length;i++) {
			result = result ^ a[i];
		}
		System.out.println(result);
	}

	
}
