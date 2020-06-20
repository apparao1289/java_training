package com.test.loops;

public class PrintLowerTranglePattern {

	public static void main(String[] args) {
		/** i/p n = 5 , o/p:
		     *
		     * *
		     * * *
		     * * * *
		     * * * * *
		 */
		printPattern(5);
	}
	
	/**
	 * This method prints the pattern based on number of rows and pattern given.
	 * 
	 * @param n
	 */
	private static void printPattern(int n) {
		for(int i=1;i<=n;i++) {  
			for(int j=1 ;j<=i ;j++) {   
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
