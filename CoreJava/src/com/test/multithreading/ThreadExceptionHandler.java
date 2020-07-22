package com.test.multithreading;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Thread Id::"+Thread.currentThread().getId());
		System.out.println("Thread name::"+Thread.currentThread().getName());
		System.out.println("Exception message::"+e.getMessage());
		e.printStackTrace();
		//new ThreadException().start();
	}

}
