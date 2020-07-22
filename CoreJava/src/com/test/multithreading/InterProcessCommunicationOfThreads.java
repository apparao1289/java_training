package com.test.multithreading;

public class InterProcessCommunicationOfThreads {

	public static void main(String args[]) {
		final CustomerAccount c = new CustomerAccount();
		new Thread() {
			public void run() {
				c.withdraw(20000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();
	}

}
