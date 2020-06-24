package com.test.array;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// a1= {2,4,5} a2 = {1,3}  result = {1,2,3,4,5}
		int a1[] = {2,4,5}; int a2[] = {1,3};
		int a3[] = mergeTwoTwoArrays(a1,a2);
		for(int i=0;i<a3.length;i++) {
			System.out.println(a3[i]);
		}
	}
	
	/**
	 * This method merge the two sorted arrays.
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static int [] mergeTwoTwoArrays(int a1[],int a2[]) {
		int n= a1.length; // 3
		int m = a2.length; // 2
		
		int a3[] = new int[m+n] ; // 5
		int i =0,j=0,k=0;
		while(i<n && j<m) {     // i = 0 n =3 j=0 m =2
			if(a1[i] < a2[j]) {
				a3[k++] = a1[i++];  // k=2 i=1
			} else {
				a3[k++] = a2[j++];  // k=1 j=1   // a3 = {1,2,3}
			}
		}
		
		while(i<n) {
			a3[k++] = a1[i++];
		}
		
		while(j<m) {
			a3[k++]=a2[j++];
		}
		
		return a3;  // space: o(n+m) time : o(n+m)
	}
	
	
}
