package com.test.loops;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// i/p: 543 o/p: 345
		System.out.println("Reverse of Number:" + reverseNumber(543));
	}
	
	/**
	 * This method reverse the given number.
	 * 
	 * @param n
	 * @return
	 */
	public static int reverseNumber(int n) {
		int reverseNumber = 0;
		while (n != 0) {   // n=543
			int digit = n % 10; // digit = 3 54%10 = 5 5%10 = 5
			reverseNumber = reverseNumber * 10 + digit; // 3 3*10+4 = 34 34*10+5 = 340+5= 345
			n = n / 10; // n= 54 5
		}

		return reverseNumber;
	}

}
