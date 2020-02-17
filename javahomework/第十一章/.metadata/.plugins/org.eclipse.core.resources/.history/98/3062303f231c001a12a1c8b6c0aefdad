package NewAccount11_8;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
	
	private String name;
	private int id = 0;
	private double balance = 0;
	private  double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	
	
	public NewAccount(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	NewAccount(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	NewAccount(int id, int balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	void setId(int id) {
		this.id = id;
	}
	int getId() {
		return id;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	double getBalance() {
		return balance;
	}
	
	void setAnnualInterestRate(int annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	String getDateCreated() {
		return dateCreated.toString();
	}

	double getMonthlyInterestRate(){
		return balance * (annualInterestRate / 1200 );
	}
	
	void withDraw(char type, double amount, double balance, String description) {
		if(amount < balance) {
			balance -= amount;	
		}
		
		transactions.add(new Transaction(type, amount, balance, description));
	}

	void deposit(char type, double amount, double balance, String description) {
		balance += amount;
		transactions.add(new Transaction(type, amount, balance, description));
	}
	
}

