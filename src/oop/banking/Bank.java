package oop.banking;

public class Bank {
	private String name;
	private int size;
	private static Account[] accounts;
	private int nextAvailIndex;


	Bank(String name, int size) {
		this.name = name;
		accounts = new Account[size];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Account[] getAccounts() {
		return accounts;
	}

	public Account createAccount(long accNo, int initialBalance) {
		if (initialBalance < 100) {
			System.out.println("Can't create account with an initial amount less than 100");
			return null;
		}
		;

		Account newAccount = new Account(accNo, initialBalance);
		accounts[nextAvailIndex] = newAccount; // We add the new account into the accounts array
		nextAvailIndex++; // We increment the index to point to the next available spot
		return newAccount;
	}

	public boolean notAnAccount(long accountNumber) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accountNumber) return false;
		}
		return true;
	}

	public boolean transfer(int from, int to, int amount) {
		if (notAnAccount(from) || notAnAccount(to)) {
			System.out.println("Account number or amount not valid!");
			return false;
		}

		getAccountByNumber(from).withdraw(amount);
		getAccountByNumber(to).deposit(amount);
		System.out.printf("Transfer from Acc_no: %d to Acc_no: %d is successfully done! \n", getAccountByNumber(from).getAccountNumber(), getAccountByNumber(to).getAccountNumber());
		return true;
	}

	public boolean deposit(int to, int amount) {
		if (notAnAccount(to)) {
			System.out.println("Account is invalid");
			return false;
		}

		return getAccountByNumber(to).deposit(amount);
	}

	private Account getAccountByNumber(int accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		System.out.println("Account not found");
		return null;
	}

	public boolean withdraw(int from, int amount) {
		if (notAnAccount(from)) {
			System.out.println("Account is invalid");
			return false;
		}

		return getAccountByNumber(from).withdraw(amount);
	}

	public boolean checkBalance(int accountNo) {
		if (notAnAccount(accountNo)) {
			System.out.println("Account doesn't exist");
			return false;
		}
		Account account = getAccountByNumber(accountNo);
		System.out.println("The current balance of Account: " + account.getAccountNumber() +
				" is: " + account.getBalance() );
		return true;

	}

	public void displayAllAccounts() {
		for (Account account : accounts) {
			System.out.println(
					"Account: " + account.getAccountNumber() + "\n" +
							"Balance " + account.getBalance() + "\n"
			);
		}
	}
}
