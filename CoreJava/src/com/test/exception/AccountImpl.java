package com.test.exception;

public class AccountImpl implements Account {

	static int amount = 500;

	@Override
	public boolean deposit(String accountId, int depositAmount) throws AccountException {

		if (null == accountId || "".equalsIgnoreCase(accountId)) {
			throw new AccountException("Account Id is null or empty");
		}

		if (depositAmount <= 0) {
			throw new AccountException("Deposit Amount should be greater than zero");
		}

		amount = amount + depositAmount;

		return true;
	}

	@Override
	public int withdraw(String accountId, int withdrawAmount) throws AccountException {

		if (null == accountId || "".equalsIgnoreCase(accountId)) {
			throw new AccountException("Account Id is null or empty");
		}

		if (withdrawAmount <= 0) {
			throw new AccountException("Withdraw Amount should be greater than zero");
		}

		amount = amount - withdrawAmount;

		return amount;
	}

}
