package NewAccount11_8;

import java.util.Date;

public class Transaction {
	java.util.Date date;
	char type;
	double amount;
	double balance;
	String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		super();
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	/**
	 * @return the date
	 */
	public java.util.Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
