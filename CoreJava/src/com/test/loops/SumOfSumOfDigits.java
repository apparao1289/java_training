package com.test.loops;

public class SumOfSumOfDigits {

	public static void main(String[] args) {
		// i/p: 342 o/p : 3+4+2 = 9
		System.out.println("sum of digits in a given number:" + sumOfDigits(342));
	}

	/**
	 * This method calculates the sum of digits in a given number.
	 * 
	 * @param n
	 * @return
	 */
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {         // 
			int digit = n % 10;  // digit = 342%10 = 2  34%10 = 4  3%10 = 3
			sum = sum + digit;   // sum = 0+2=2  2+4 = 6   6+3 =9
			n = n/10;           // n =34  34/10 = 3  3/10 =0
		}

		return sum;
	}

}
