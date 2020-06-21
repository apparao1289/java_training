package com.test.array;

public class FindElementInGivenArray {
	
	public static void main(String [] arg) {
		// Find the element in a given array.
		// a[] = {3,4,5,6,7,8,9,1}    given element = 5 
		int a[] = {3,4,5,6,7,8,9,1};
		int element = 9;
		boolean result = findElement(a,element);
		System.out.println("Element Fount::"+result);
		
		System.out.println("Element Fount at index::"+searchElement(a,element));
	}
	
	/**
	 * This method search the given element available in array or not.
	 * 
	 * @param a
	 * @param elementValue
	 * @return
	 */
	private static  boolean findElement(int a[],int elementValue) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == elementValue) {
				return true;
			}
		}
		return false;   // space complexity : o(1)  time complexity : o(n)
	}
	
	private static int searchElement(int a[],int elementValue) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == elementValue) {
				return i;
			}
		}
		return -1;
	}
}
