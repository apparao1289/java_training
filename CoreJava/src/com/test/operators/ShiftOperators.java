package com.test.operators;

public class ShiftOperators {

	public static void main(String[] args) {
		// Signed Left shift operator (<<)
		// x << 1 : left shift with 1 bit
		int a = 4 << 1;
		// 8 4 2 1
		// 0 1 0 0  = 4
		// 1 0 0 0 = ( 4 << 1)      
		System.out.println("a:"+a);
		a = 4;
		System.out.println("a <<2 :"+ (a<<2));
		// if number left shift with n bits then result value multiply with 2 power of n.
		
		System.out.println("5 << 1 :"+ (5 << 3)); // 5 * (2 power 3) = 5 * 8 = 40
		
		// Signed Right shift operator ( >>)
		// x >> n : right shift with n bits ( result number divided by 2 power of n)
		int b = 4 >> 1;
		System.out.println("b:"+ b);
		System.out.println("7 >> 1 :"+(7>>1));  // 7/2 = 3
		System.out.println("7 >> 1 :"+(7>>2));  // 7/4 = 1
		
		// unsigned right shift operator (>>>): 
		int c = 10>>>1;
		System.out.println("c:"+c); // 10/2 = 5
		
		// unsigned left shift operator (<<<): 
	}

	
}
