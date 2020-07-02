package com.test.inheritance;

public class B extends A {
	
	int a= 30;
	
	int c =100;
	
	public void display() {
		System.out.println("B display");
	}
	
	public void print() {
		System.out.println("B print");
	}
	
	public void display(String message) {
		System.out.println("B display:"+message);
	}
	
	public static void main(String[] args) {
		B ob = new B();
		ob.display();  // overridden method is invoked
		ob.print();
		ob.display("Hello");
		System.out.println("b="+ob.b);  // 20
		System.out.println("a="+ob.a);  //30
		
		
		A oa = new A();
		oa.display();
		System.out.println("a="+oa.a);
		System.out.println("b="+oa.b);
	}

}
