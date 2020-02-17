package Account9_7;

public class AccountTest {
	public static void main(String[] args) {
		Account A = new Account(1122, 20000, 4.5);
		A.withDraw(2500);
		A.deposit(3000);
		System.out.println("balance is : " + A.getBalance() + "\nmonthlyRate is: " + A.getMonthlyInterestRate() + "\nthe data is:" + A.getDateCreated());
	}
}
