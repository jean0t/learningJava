package Application;

import java.util.Scanner;
import java.util.Locale;

import Util.CurrencyConverter;

public class Exercise4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.printf("%nHow many dollars will be bought? ");
		CurrencyConverter.dollarsBought = sc.nextDouble();
		System.out.printf("%nAmount to be paid in BRL = %.2f%n", CurrencyConverter.amountToBePaid());
		
		sc.close();
	}
}
