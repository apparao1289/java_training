package com.test.stringexample;

public class StringBUfferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" ");sb.append("how").append(" ");
		sb.append("are").append(" ");
		sb.append("you").append(" ");
		
		System.out.println("final string::"+sb.toString());
		
		// reverse
		//System.out.println("reverse:"+sb.reverse());
		
		// insert charactes
		sb.insert(7, 'w');
		System.out.println(sb.toString());
		
		sb.deleteCharAt(7);
		System.out.println(sb.toString());
	
		
	}

}
