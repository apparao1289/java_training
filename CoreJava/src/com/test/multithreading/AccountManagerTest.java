package com.test.multithreading;

public class AccountManagerTest {

	public static void main(String[] args) {
		Runnable am = new AccountManager();
		Thread one = new Thread(am);
		one.setName("Bob");
		
		Thread two = new Thread(am);
		two.setName("Tom");
		
		one.start();
		two.start();
	}

}
