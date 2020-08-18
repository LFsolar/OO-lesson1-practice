package model;

public class Coin {

	public static final String NICKEL = "Nickel";
	public static final String DIME = "Dime";
	public static final String QUARTER = "Quarter";
	
	private int value;

	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}