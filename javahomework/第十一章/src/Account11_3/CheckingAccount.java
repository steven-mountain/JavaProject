package Account11_3;

public class CheckingAccount extends Account{
	//设定透支额度为1000
	private double overDraft = 1000;

	@Override
	public String toString() {
		return  super.toString() + "CheckingAccount [overDraft=" + overDraft + "]";
	}
	
}
