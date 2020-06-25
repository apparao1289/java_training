package com.test.array;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		int a[][] = {
						{1,2,3},
						{2,1,4},
						{3,3,2}
					};
		
		int b[][] = {
				       {1,1,1},
				       {2,1,1},
				       {3,1,1}
					};
		
		matrixAddition(a,b,3,3);
	
	}
	
	public static void matrixAddition(int a[][], int b[][],int rows,int colums) {
		int c[][] = new int[rows][colums];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colums;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
	}  // space: o(m*n)  time : o(m*n) 

}
