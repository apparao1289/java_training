package com.test.interfaceexample;

public interface Bank {

	public static final int rateofInterest = 6;
	
	public abstract void registration(String name, String address, String ssn);

	public void deposit(int amount);

	abstract void withdraw(int amount);

	void fixedDeposit(String name, int amount, int rateofInteresr);

}
