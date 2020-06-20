package com.test.operators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		/** post increment :  
		    1. Assign the value first 
		    2. increment value by one.
		*/
		
		int i = 10;
		int k = i++;  
		// k = i   ; i = i+1
		System.out.println("k :"+k +" i:"+i);  //k= 10 i=11
		
		/** pre increment : 
		    1. Increment value by 1  
		    2. And assign the value 
		*/
		
		int j = ++i;  
		// i = i+1 ; j = i   i= 11+1 = 12, j=12
		System.out.println("j:"+j+"  i:"+i);
		
		int a= 3;
		int b = a++ + ++a;  // 3 + 5   
		System.out.println("a:"+a+" b:"+b); // a =5 b = 8
		
		int x = 2;
		int y = ++x + x++ + ++x;  // 3 + 3 + 5        x=5
		System.out.println("x:"+x +" y:"+y);  // y =11 x =5
		
		/** post decrement : 
		    1. assign the value 
		    2. and decrement value by 1 
		*/
		
		int c = 5;
		int d = c--; // d = 5 , c = c -1 = 4
		System.out.println("c:"+c +" d:"+d);
		
		int e =6;
		int f = e++ + e--;  // 6 + 7    e =7-1 = 6
		System.out.println("e:"+e +" f:"+f);  // f= 13 e= 6
		
		/** pre decrement : 
		   1. decrement value by 1 
		   2. and assign the value. 
		*/
		
		int m = 8;
		int n = --m;  // n=7  m = 7
		System.out.println("m:"+m+" n:"+n);
		
		int s = 4;
		int t = s++ + --s + s++ + s--; // 4 + 4 + 4 + 5    s =4 
		System.out.println("s:"+s +" t:"+t);
	}

}
