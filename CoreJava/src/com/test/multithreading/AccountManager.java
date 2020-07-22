package com.test.multithreading;

public class AccountManager implements Runnable {
	private Account acct = new Account();

	public void run() {
		//verifyTransactionDetails("account");
		for (int x = 0; x < 5; x++) {
			this.makeWithdrawal(10,x);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	/*private void verifyTransactionDetails(String accountId) {
		// check account id is valid or not.
	}*/

	private synchronized void makeWithdrawal(int amt, int iterationValue) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw ::for "+iterationValue );
			try {
				Thread.sleep(500);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal for amount:"+amt + "  for iteration :"+iterationValue);
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}

}
