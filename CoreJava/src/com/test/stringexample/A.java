package com.test.stringexample;

public final class A {
	
	final int a = 10;

	public static void main(String[] args) {
		final A oa = new A();
		// oa = new A();
		System.out.println("a::"+oa.a);
	//	oa.a = 20;
		System.out.println("new value of a:"+oa.a);
	}
	
	

}
