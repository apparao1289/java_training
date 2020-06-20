package com.test.loops;

public class PowerOfNumer {

	public static void main(String[] args) {
		// 2 power 3 = 2*2*2
		System.out.println("power::"+powerOfNumber(2,3));
	}
	
	/**
	 * This method calculate the power of a number.
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	private static long powerOfNumber(int base, int exponent) {  // 2 3
		long powerValue = 1;
		for (int i = exponent; i > 0; i--) {   //i = 3 
			powerValue = powerValue * base;  // powerValue = 2*2
		}
		return powerValue;
	}

}
