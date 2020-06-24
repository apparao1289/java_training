package com.test.array;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		// a = {1,2,3,5,6,7,8,9,10}  n = 10  o/p : 4   total = n*(n+1)/2 = 10*11/2=55   sum =sum of all elements in array
		// result = total -sum  = 55 - 51 = 4
		int  a[] = {1,2,3,4,5,6,8,9,10};
		//System.out.println("Missing number::"+missingNumber(a));
		System.out.println("MIssing NUmber::"+missingNUmberUsingXor(a));
	}

	/**
	 * This method finds the missing number in given array.
	 * 
	 * @param a
	 * @return
	 */
	public static int missingNumber(int a[]) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		int n = a.length + 1;
		int totalSum = n*(n+1)/2;
		int missingNumber = totalSum - sum;
		return  missingNumber;
	}
	
	public static int missingNUmberUsingXor(int a[]) {  // a = {1,2,3,5}
		// x = xor of all elements in array   1^2^3^5
		// y = xor of all elements form 1 to n  1^2^3^4^5
		// missingNumber = x^y;      
		                            
		int x = a[0];
		for(int i=1;i<a.length;i++) {
			x = x ^ a[i];
		}
		
		int y = 1;
		for(int j=2;j<=a.length+1;j++) {
			y = y^j;
		}
		int missingNumber = x^y;
		return missingNumber;
	}
}
