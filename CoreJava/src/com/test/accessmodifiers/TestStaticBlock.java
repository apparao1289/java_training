package com.test.accessmodifiers;

public class TestStaticBlock {

	static {
		// we will write configuration logic
		System.out.println("Static block 1");
	}

	{
		// if you want to share common logic to between all constructors
		System.out.println("init block");
	}

	public TestStaticBlock() {
		System.out.println("default constructor..");
	}

	public static void main(String[] args) {

		TestStaticBlock t = new TestStaticBlock();
	}

}
