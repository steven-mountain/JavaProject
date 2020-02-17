package Person11_2;

public class Employee extends Person{
	protected String office;
	protected String wage;
	protected java.util.Date Date;
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage = wage;
	}
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(java.util.Date date) {
		Date = date;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [office=" + office + ", wage=" + wage + ", Date="
				+ Date + "]";
	}
	
	
}
