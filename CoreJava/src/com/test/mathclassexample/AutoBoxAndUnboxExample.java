package com.test.mathclassexample;

public class AutoBoxAndUnboxExample {

	boolean flag;
	Boolean flag1;

	public static void main(String[] args) {
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(2);
		Integer e = a; // autoboxing
		int d = a + b + c; // unboxing
		System.out.println("d::" + d);

		int x = 4;
		Integer y = 5;
		int z = ++x + y++; // 5 + 5=10 x =5, y= 6
		System.out.println("x:" + x + " y:" + y + " z:" + z);

		AutoBoxAndUnboxExample ae = new AutoBoxAndUnboxExample();
		System.out.println("flag::" + ae.flag);
		System.out.println("flag::" + ae.flag1);

	}

}
