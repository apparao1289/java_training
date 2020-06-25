package com.test.array;

public class MatrixMultilipcation {
	
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
		
		matrixMultiplication(a,b,3,3);  // 1*1+2*2+3*3=1+4+9 =14
	
	}
	
	/**
	 * This method doing matrix multipication of given two matrix.
	 * @param a
	 * @param b
	 * @param rows
	 * @param colums
	 */
	public static void matrixMultiplication(int a[][], int b[][],int rows,int colums) {
		int c[][] = new int[rows][colums];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colums;j++) {
				c[i][j] = 0;
				for(int k=0;k<rows;k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}
