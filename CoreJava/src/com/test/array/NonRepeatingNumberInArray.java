package com.test.array;

public class NonRepeatingNumberInArray {
	
	public static void main(String args[]) {
		// a = {2,3,4,4,3,4,2}  o/p : 2    2^3^4^4^3 = 2^(3^3)^(4^4)      X^X = 0 
		int a[] = {2,3,4,4,3,2,4};
		nonRepeatingNumber(a);
	}

	/**
	 * This method find the non repeating number in given array.
	 * 
	 * @param a
	 */
	public static void nonRepeatingNumber(int a[]) {

		int result = a[0];
		for (int i = 1; i < a.length; i++) {
			result = result ^ a[i];
		}
		System.out.println(result);
	}
}
