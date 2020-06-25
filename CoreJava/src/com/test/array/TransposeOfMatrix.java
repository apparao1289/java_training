package com.test.array;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int a[][] = {
				{1,2,3},
				{2,1,4},
				{3,3,2}
			};
		int rows = 3;
		int col = 3;
		int [][] c = transposeMatrix(a,rows,col);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}
	
	public static int [][] transposeMatrix(int a[][], int rows,int colums) {
		int c[][] = new int[rows][colums];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colums;j++) {
				c[i][j]= a[j][i];
			}
		}
		return c;
	}  

}
