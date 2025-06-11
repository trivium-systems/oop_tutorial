package oop.banking;

public class Account{
	private long accountNumber;
	private double balance;

	Account(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		setBalance(balance += amount);
		System.out.println("Successfully deposited " + amount + " to account: " + accountNumber);
		return true;
	}

	public boolean withdraw(double amount){
	if (balance <= amount) {
		System.out.println("Insufficient balance!");
		return false;
	}
		setBalance(balance -= amount);
		System.out.println("Successfully withdrawn " + amount + " from account: " + accountNumber);
		return true;
	}
};


