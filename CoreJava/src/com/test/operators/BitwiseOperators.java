package com.test.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		// Bit wise AND
		/**
		 * bit one  bit two   bitwise and (&)
		    0 		0 			0
		    1       0			0
		    0       1           0
		    1		1			1
		 */
		
		int a = 4 & 5;
		// 4 2 1  ( value representation in the form of power of 2.
		// 1 0 0 
		// 1 0 1
		//------
		// 1 0 0 = 4
		System.out.println("a:"+a);
		//8 4 2 1
		//0 1 1 0  = 6
		//1 0 0 0  = 8
		//--------
		//0  0  0  0 = 0
		int b = 6 & 8;
		System.out.println("b:"+b);
		
		// Bitwise OR (|)
		/**
		 * 
		    bit one  bit two   bitwise or (|)
		    0		0			0
		    0		1			1
		    1		0			1
		    1		1			1
		 */
		int c = 3 | 5;
		// 8 4 2 1
		// 0 0 1 1   = 3
		// 0 1 0 1   = 5
		//--------
		// 0  1  1  1 = 7
		System.out.println("c:"+c);
		
		// Bitwise exclusive or (xor) (^)
		/**
		 *  bit one    bit two     xor (^)
		 
		   0			0			0
		   0			1			1
		   1			0			1
		   1			1			0
		   
		*/
		
		int d = 4 ^ 6;
		// 8 4 2 1
		// 0 1 0 0  = 4
		// 0 1 1 0  = 6
		//------------
		// 0  0  1  0 = 2
		System.out.println("d:"+d);
		
		System.out.println("5 ^ 7 :"+ (5^7));
		// 0101
		// 0111
		//-------
		// 0 0 1  0 = 2 
		
		// Bitwise not (~) :  1's complement of the number. i.e 1's replace to 0's and 0's replace to 1's.
		int e = ~5;
		// 8 4 2 1
		// 0 1 0 1  = 5
		// ~(0 1 0 1) = (1 0 1 0) = 10
		// 2's complement of binary number : 1. 1' complement of number and add 1 to it.
		//   0 1 0 1 = 5
		//   1 0 1 0 = i's complements of number 5
		//         1   ( add 1 to 1's complement number)
		//-----------
		//   1  1  1  0 = -6
		System.out.println("e:"+e);
		
		System.out.println("~8:"+~8); // -9        -9 -8 -7 -6 -5 -4 -3 -2 - 1 0 1 2 3 4 5 6 7 8 9 
		System.out.println("~-7:"+(~-7));
	}

}
