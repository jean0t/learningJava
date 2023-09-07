package Entities;

public class Bank {
	private int accountNumber;
	private double balance;
	private String userName;
	
	public Bank(int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.balance = 0.00;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double balanceToWithdraw) {
		this.balance -= balanceToWithdraw + 5;
	}
	
	public void deposit(double balanceToWithdraw) {
		this.balance += balanceToWithdraw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAccountNumber (int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String toString() {
		String text = "Account %d, Holder: %s, Balance: $ %.2f".formatted(this.accountNumber, this.getUserName(), this.balance);
		return text;
	}
	
}
