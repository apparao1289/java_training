package com.test.flowcontrol;

public class SwitchTestTwo {

	public static void main(String[] args) {
		display(300);
	}
	
	private static void display(int n) {
		switch(n) {
		
		case 1 : System.out.println("one");
		         break;
		
		case 2 : System.out.println("two");
        		  break;
        
		case 100 : System.out.println("100");
        
		case 200 : System.out.println("200");
                   
		default : System.out.println("default case");
        
		}
	}

}
