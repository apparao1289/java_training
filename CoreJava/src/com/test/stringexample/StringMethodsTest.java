package com.test.stringexample;

public class StringMethodsTest {

	public static void main(String[] args) {
		String s = "welcome";
		String s1 = new String("Welcome");
		
		System.out.println("length::"+s.length());
		
		System.out.println("upper case::"+s.toUpperCase());
		System.out.println("upper case of s1:"+s1.toUpperCase());
		System.out.println("lower case of s1:"+s1.toLowerCase());
		
	   // indexOf	
	   int index = s.indexOf('o');
	   System.out.println("o index:"+index);
	   
	   // charAt
	   System.out.println(s.charAt(index));
	   
	   // substring
	   String s2 = "Welcome to US";
	   String s3 = s2.substring(4);
	   System.out.println("substring with begin index is 4::"+s3);
	   
	   String s4 = s2.substring(8,10);
	   System.out.println("substring with begin index 8 and end index 9:"+s4);
	   
	   // replace
	   String s5 = s2.replace('W', 'D');
	   System.out.println("replace  with characters:"+s5);
	   
	   String s6 = s2.replace("Welcome", "Bye");
	   System.out.println("replace with strings:"+s6);
	   
	   
	}

}
