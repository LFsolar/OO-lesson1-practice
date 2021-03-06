package test;

import model.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.enter(1);
		c1.enter(2);

		c1.add();
		double n = c1.getResult();
		assert c1.getResult() == 3;

		c1.multiply();
		assert c1.getResult() == 2;

		c1.enter(2);
		c1.enter(3);
		c1.multiply();
		assert c1.getResult() == 6;

		c1.divide();
		assert c1.getResult() == 3.0/2;
	}
}