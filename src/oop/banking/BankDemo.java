package oop.banking;

public class BankDemo {
	public static void main(String... args) {
		// Objects interact with each other in the main function
		Bank bank = new Bank("Bits Bank", 3);
		for (int i = 0; i < 3; i++) {
			bank.createAccount(i + 1, (i + 1) * 100);
		}

		bank.transfer(3, 1, 100);
		bank.checkBalance(1);
		bank.deposit(2, 599);
		bank.displayAllAccounts();



	}
}
