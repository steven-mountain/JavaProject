package BankAccountManager;

public class Saving extends Account{
	private double account = 0;
	String PIN = "";
	
	public Saving() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saving(String PIN, double account) {
		super();
		this.PIN = PIN;
		this.account = account;
	}

	@Override
	public void showMenu() {
		System.out.println("the type of your account is Saving");
		// TODO Auto-generated method stub
	}

	@Override
	public void deposit(double money) {
		// TODO Auto-generated method stub
		if(money > 100000)
			System.out.println("Sorry, you can't deposit so much money by this ATM, if you want to deposit it you must ask the manager for help");
		else
			account += money;
	}

	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		if(money > 10000)
			System.out.println("You can't withdraw over 10000 dollar from this ATM, ask the manager for help");
		else if(money > account)
			System.out.println("Sorry your account is not enough");
		else
			account -= money;
	}
	
	public void applyInterest(double rate){
		this.balance = rate;
	}
}
