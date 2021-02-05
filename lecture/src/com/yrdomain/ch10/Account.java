package com.yrdomain.ch10;

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
			throw new BalanceInsufficientException("�ܰ����:" + (money - balance) + " ���ڶ�");
		}
		balance -= money;
	}

	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalanced());

		// ����ϱ�
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
