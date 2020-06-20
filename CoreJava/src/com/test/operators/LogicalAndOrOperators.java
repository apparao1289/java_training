package com.test.operators;

public class LogicalAndOrOperators {

	public static void main(String[] args) {
		
		/**  logical and (&&) truth table:

	       con1   cond2   logical and(&&)
		   true   true    true
		   false  true    false
		   true   false   false
		   false  false   false
		   
		note: if first condition is false then compiler not evaluate the second condition. */
		int a =10;
		boolean b = (a<20) && (a++ > 10);  // true && false a = 11
		System.out.println("a:"+a +" b:"+b); // a= 10 b= false
		
		int i =5;
		boolean j = (i++ < 6) && (++i < 5);
		System.out.println("i:"+i+" j:"+j);
		
		int x = 4;
		boolean y = (--x > 10) && (x++ < 4); // (3 >10) && ( 3 < 4 )  x = 3
		System.out.println("x:"+x+" y:"+y);  // y= false
		
	   /** 
		  logical or (||) truth table:
		 
		condition 1  condition 2  logical or (||)
	      false 		false 		false
		  true			false       true
		  false         true        true
		  true          true        true
		  
		  note: if first condition is true then compiler not evaluate the second condition. 
		 */
		
		int m = 10;
		boolean n = (m++ == 10) || (++m > 20); // (10 == 10) || (12 >20)   m =11
		System.out.println("m:"+m+" n:"+n); // n = true 
	
	}
	

}
