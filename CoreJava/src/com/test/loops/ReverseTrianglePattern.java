package com.test.loops;

public class ReverseTrianglePattern {

	public static void main(String[] args) {
		/** n = 5        i j
		     * * * * *  (1,5)
		     * * * *    (2,4)
		     * * *      (3,3)
		     * *        (4,2)
		     *          (5,1)
		 */
		printPattern(5);
	}

	private static void printPattern(int n) {
		for(int i=1;i<=n;i++) {  // rows 
			for(int j=n ;j>=i ;j--) {   // columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
