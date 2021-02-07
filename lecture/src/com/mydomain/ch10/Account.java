package com.mydomain.ch10;

class BalanceInsufficientException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BalanceInsufficientException() {
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
}

public class Account {

	private long balance;

	public Account() {
	}

	public long getBalanced() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
		}
		balance -= money;
	}

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalanced());

		// 출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}
