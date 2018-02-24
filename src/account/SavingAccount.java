package account;

public class SavingAccount implements Account {
	/*
	 * Account Number, long Full Name String Phone Number String Current Address
	 * String Permanent Address String Email Id String
	 * 
	 */
	private long accountNumber;
	private String fullName;
	private String phoneNumber;
	private String currentAddress;
	private String permanentAddress;
	private String emailId;
	private float balance;

	/* Getter and Setter Methods start from here */
	public long getAccountNumber() {
		return accountNumber;

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	/* Getter and Setter Methods ends from here */

}
