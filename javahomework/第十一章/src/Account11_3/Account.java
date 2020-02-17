package Account11_3;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private  double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account(int id, int balance, double annualInterestRate){
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
	
	void withDraw(double num) {
		if(num < balance) {
			balance -= num;	
		}

	}

	void deposit(double num) {
		balance += num;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}
}

