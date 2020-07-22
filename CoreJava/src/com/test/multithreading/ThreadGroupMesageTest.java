package com.test.multithreading;

public class ThreadGroupMesageTest {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
		Runnable runnable = new ThreadGroupMesage();

		Thread t1 = new Thread(tg, runnable, "account");
		t1.start();

		Thread t2 = new Thread(tg, runnable, "order");
		t2.start();

		Thread t3 = new Thread(tg, runnable, "inventory");
		t3.start();

		showThreadGrouDetails(tg);

	}

	private static void showThreadGrouDetails(ThreadGroup tg) {

		System.out.println("Thread Group Name:" + tg.getName());
		tg.list();
		System.out.println("Active count :" + tg.activeCount());
		System.out.println("Active thread group count :" + tg.activeGroupCount());
	}

}
