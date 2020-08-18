package model;

public class PiggyBank {

	private int balance;

	public PiggyBank() {
		balance = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void insert(Coin c) {
		balance += c.getValue();
	}
	
}