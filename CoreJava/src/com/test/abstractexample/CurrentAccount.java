package com.test.abstractexample;

public class CurrentAccount extends Account {

	@Override
	public void registration() {
		System.out.println("Current account registration");
	}
	
	public void fixedDeposit(int amount, int interestRate) {
		System.out.println("Fixed deposit amount:"+amount +" and  interest rate::"+interestRate);
	}

}
