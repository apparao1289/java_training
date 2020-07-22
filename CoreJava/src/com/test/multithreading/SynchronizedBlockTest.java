package com.test.multithreading;

public class SynchronizedBlockTest extends Thread {
	private Object obj = new Object();
	
	public void run() {
		System.out.println("Executing run method..");
		display();
	}

	private void display() {
		System.out.println("display method start..");
		synchronized (obj) {
			System.out.println("Executing critical section code.");
		}
		System.out.println("display method end.");
	}

	public static void main(String[] args) {
		SynchronizedBlockTest t1 = new SynchronizedBlockTest();
		t1.start();
		SynchronizedBlockTest t2 = new SynchronizedBlockTest();
		t2.start();
	}

}
