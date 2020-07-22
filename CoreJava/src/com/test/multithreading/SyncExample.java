package com.test.multithreading;

public class SyncExample extends Thread {
	int a = 10;
	
	@Override
	public void run() {
		this.a = a++ + ++a;   // 10 + 12= 22       // a =11 +1 = 12
		System.out.println("a:" + a + " Executing thread name::" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		SyncExample se1 = new SyncExample();
		se1.start();

		SyncExample se2 = new SyncExample();
		se2.start();

		SyncExample se3 = new SyncExample();
		se3.start();

	}

}
