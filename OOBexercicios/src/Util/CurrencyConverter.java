package Util;

public class CurrencyConverter {
	public static double dollarPrice, dollarsBought;
	
	public static double amountToBePaid() {
		return dollarPrice * dollarsBought * 1.06;
	}
	
}
