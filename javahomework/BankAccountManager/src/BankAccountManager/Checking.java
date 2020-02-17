package BankAccountManager;

public class Checking extends Account{
	String PIN = "";
	private double account;
	
	public Checking(double account, String PIN) {
		super();
		this.PIN = PIN;
		this.account = account;
	}
	

	public String getPIN() {
		return PIN;
	}


	public void setPIN(String pIN) {
		PIN = pIN;
	}


	public double getAccount() {
		return account;
	}


	public void setAccount(double account) {
		this.account = account;
	}


	public Checking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Checking(String pIN, double balance) {
		super(pIN, balance);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("The type of your account is Checking");
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
		else if(money > account){
			System.out.println("Sorry your account is not enough, you cant overdraft you account, but the fare of overdraft is $10");
			System.out.println("overdraft? yes or no");
			if(new java.util.Scanner(System.in).next().equals("yes"))
				overDraft(money);
		}
		else
			account -= money;
	}
	
	public void overDraft(double money){
		if((account - money - 10) >= -100)
			account -= (money + 10);
		else
			System.out.println("your overdraft is more than the limit");
	}
	
}
