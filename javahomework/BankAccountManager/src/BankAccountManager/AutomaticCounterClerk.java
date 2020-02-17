package BankAccountManager;

public class AutomaticCounterClerk {
	public static void main(String[] args) {
		
	}
	public boolean isMatch(String s, Account a){
		return s.equals(a.getPIN());
	}
}
