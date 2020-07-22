package com.test.multithreading;

public class DeadLockTest {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	private static class PrinterOne extends Thread {
		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class PrinterTwo extends Thread {
		public void run() {
			synchronized (lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

	public static void main(String args[]) {
		PrinterOne t1 = new PrinterOne();
		PrinterTwo t2 = new PrinterTwo();
		t1.start();
		t2.start();
	}

}
