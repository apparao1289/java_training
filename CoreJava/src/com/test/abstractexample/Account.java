package com.test.abstractexample;

public abstract class Account {

	public void deposit(int amount) {
		System.out.println("Deposit amount:" + amount);
	}

	public void withdraw(int amount) {
		System.out.println("withdraw amount ::" + amount);
	}
	 
	public abstract void registration();

}
