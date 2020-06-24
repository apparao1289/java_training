package com.test.array;

public class EquilibriumPositionInArray {

	public static void main(String[] args) {
		int a[] = {1,3,3,4,7};
		findEqualibriumPosition(a);
	}
	
	/**
	 * This method find the equilibrium position in given array.
	 * 
	 * @param a
	 */
	public static void findEqualibriumPosition(int a[]) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {   // o(n)
			sum = sum+a[i];
		}
		int leftSum = 0;
		for(int i =0 ;i<a.length;i++) {   // o(n)
			sum = sum-a[i];
			if(leftSum == sum) {
				System.out.println("Equalibrium postion:"+a[i]);
			}
			
			leftSum = leftSum +a[i];
		}
	}  // space: o(1) time: o(n) + o(n) = 2o(n) = o(n)
	
}
