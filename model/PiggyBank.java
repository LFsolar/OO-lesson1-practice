package model;

import java.util.ArrayList;

public class PiggyBank {

	private int balance;
	private ArrayList<Coin> coinHistory = new ArrayList<>();

	public PiggyBank() {
		balance = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void insert(Coin c) {
		balance += c.getValue();
		coinHistory.add(c);
	}

	@Override
	public String toString() {
		return "Balance = " + balance + ", Coin count = " 
			+ coinHistory.size();
	}
	
}