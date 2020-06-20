package com.test.loops;

public class FactNumber {

	public static void main(String[] args) {
		System.out.println("fact::" + fact(5)); // 1*2*3*4*5 = 120
	}
	
	/**
	 * This method calculates the factorial of a number.
	 * 
	 * @param n
	 * @return
	 */
	private static int fact(int n) {
		int fact = 1;
		/*for (int i = 1; i <= 5; i++) {
			fact = fact * i;   // fact = 1*1  1*2 1*2*3 1*2*3*4 1*2*3*4*5 
		}*/
		int i = 1;
		while(i<=n) {
			fact = fact*i;
			i++;
		}
		return fact;
	}

}
