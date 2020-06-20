package com.test.loops;

public class PattenWithGivenNumber {

	public static void main(String[] args) {
		/**
				* * * * * 
				* * * * 
				* * * 
				* * 
				*
				*
		 */
		printPattern(5,"*");
	}
	
	/**
	 * This method prints the pattern based on number of rows and pattern given.
	 * 
	 * @param n
	 * @param pattern
	 */
	private static void printPattern(int n,String pattern) {
		for(int i=1;i<=n;i++) {  // rows 
			for(int j=n ;j>=i ;j--) {   // columns
				System.out.print(pattern+" ");
			}
			System.out.println();
		}
	}

}
