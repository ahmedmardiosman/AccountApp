package cin.qa.app;

public class Accounts {

	private int id;
	private String firstName;
	private String lastName;
	private String accountNumber;

	public Accounts(int id, String firstName, String lastName, String accountNumber) {

		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAccountNumber(accountNumber);

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Accounts [id : " + id + ", firstName : " + firstName + ", lastName : " + lastName + ", accountNumber : "
				+ accountNumber + "]";
	}

}
