package BankAccountManager;

public abstract class Account {
	protected String PIN = "";
	protected double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String pIN, double balance) {
		super();
		PIN = pIN;
		this.balance = balance;
	}
	/**
	 * @return the pIN
	 */
	public String getPIN() {
		return PIN;
	}
	/**
	 * @param pIN the pIN to set
	 */
	public void setPIN(String pIN) {
		PIN = pIN;
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
	public abstract void showMenu();
	public abstract void deposit(double money);
	public abstract void withdraw(double money);
}
