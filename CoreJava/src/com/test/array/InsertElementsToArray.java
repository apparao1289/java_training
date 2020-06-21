package com.test.array;

public class InsertElementsToArray {

	public static void main(String[] args) {
		int a[]; // declaration
		a = new int[5]; // definition
		
		// insert elements to array.
		int k = 5;
		for (int i = 0; i < 5; i++) {
			a[i] = k++;  // a[0] = 0 a[1] = 1 a[2]=2 a[3] = 3 a[4] = 4
		}
		System.out.println(a);
		
		// retrive elements from array
		int length =  a.length;
		System.out.println("Array length::"+length);
		for(int index =0 ; index < length ; index++) {
			System.out.println("index ::"+index+ "::value = "+a[index]);
		}
		
		// other way of initilizing the array
		int b[] = {2,4,6,8,10};
		        // 0 1 2 3 4
		for(int j =0;j<b.length;j++) {
			System.out.println(b[j]);
			
		}
	}

}
