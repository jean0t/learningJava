package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bank;

public class Exercise5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String userName = sc.nextLine();
		
		Bank account = new Bank(accountNumber, userName);
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value:  ");
			double depositValue = sc.nextDouble();
			account.deposit(depositValue);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		sc.close();
	}
}
