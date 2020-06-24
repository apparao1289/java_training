package com.test.array;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int x[] = {2,4,5}; int y[] = {1,2,4};
		interSectionTwoTwoArrays(x,y);
	}

	/**
	 * This method prints the intersection of two sorted arrays.
	 * 
	 * @param a1
	 * @param a2
	 */
	public static void interSectionTwoTwoArrays(int a1[],int a2[]) {  // int a1[] = {2,4,5}; int a2[] = {1,2};   o/p: 2   
		int n= a1.length; 
		int m = a2.length; 
		
		int i =0,j=0;
		while(i<n && j<m) {  
			
			if(a1[i] > a2[j]) {
				j++;
			} else if (a2[j] > a1[i]) {
				i++;
			} else {
				// equal
				System.out.println(a1[i] +" ");
				i++;
				j++;
			}
		}
		
		// space : o(1)
	}
}
