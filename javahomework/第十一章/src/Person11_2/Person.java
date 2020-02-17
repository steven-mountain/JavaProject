package Person11_2;

public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddr;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String address, String phoneNumber,String emailAddr) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddr = emailAddr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", emailAddr=" + emailAddr
				+ "]";
	}

	
	
}
