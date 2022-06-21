package assignment5.copy;

public class Account {
	private int accountNumber;
	private double balance;
	

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void credit(double amount) {
		System.out.println("Credited "+amount+" successfully");
		balance=balance+amount;
	}
	public void debit(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Debited "+amount+" successfully");
			balance=balance-amount;
		}
	}
	public String toString() {
		return "A/C no : "+accountNumber+" Balance Rs."+balance;
	}

}
