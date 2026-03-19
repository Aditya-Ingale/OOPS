package Oops;

public class BankAccount {
	private int accno;
	private String accType;
	private double bal;
	static double interestRate;
	
	static {
		interestRate = 4.5;
		System.out.println("Static Block: interestRate initialised to " + interestRate + "%");
	}
	
	public BankAccount(int accno, String accType, double bal) {
		this.accno = accno;
		this.accType = accType;
		this.bal = bal;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			bal += amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= bal) {
			bal -= amount;
			System.out.println("Withdrawn: " + amount);
		}else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}
	
	public void displayDetails() {
		System.out.println("Account no.    : " + accno);
		System.out.println("Account Type   : " + accType);
		System.out.println("Balance        : " + bal);
		System.out.println("Interest Rate  : " + interestRate + "%");
	}
}
