package question4;

public class BankAccount {

	private String name;
	private double balance;

	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public BankAccount(String name) {
		this(name, 0);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public String toString() {
		return name + ", " + balance;
	}
}
