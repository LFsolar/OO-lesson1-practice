package test;

import model.Coin;
import model.PiggyBank;

public class PiggyBankTest {
	public static void main(String[] args) {
		// test coin constructor
		Coin c1 = new Coin(5);
		assert c1.getValue() == 5;
		Coin c2 = new Coin(10);
		assert c2.getValue() == 10;

		// test PiggyBank object
		PiggyBank piggy = new PiggyBank();
		assert piggy.getBalance() == 0;

		// test PiggyBank.insert()
		piggy.insert(c1);
		assert piggy.getBalance() == 5;
		piggy.insert(c2);
		assert piggy.getBalance() == 15;
		piggy.insert(new Coin(25));
		assert piggy.getBalance() == 40;
	}
}