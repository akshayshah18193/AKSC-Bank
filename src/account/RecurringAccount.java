package account;

import java.util.Date;

public class RecurringAccount implements Account {
/*Data members declartion starts from here 

	 * Account Number    long 
	 * Full Name         String 
	 * Phone Number      String 
	 * Current Address   String
	 * Permanent Address String 
	 * Email Id          String
	 * balance			 float
	 * rateOfIntrest	 float
	 * depositAmount	 float
	 * startDate	     Date
	 * endDate			 Date
	 * maturityPeriod	 int (number of months ) 
	 * 
	 */
	private long   accountNumber;
	private String fullName;
	private String phoneNumber;
	private String currentAddress;
	private String permanentAddress;
	private String emailId;
	private float  balance;
	private float  rateOfIntrest;
	private float  depositAmount;
	private Date   startDate;
	private Date   endDate;
	private int    maturityPeriod;
/*Data member declartion ends here
 * 
 * 
 * Getter and Setters method begin here
 * */
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
	public float getRateOfIntrest() {
		return rateOfIntrest;
	}
	public void setRateOfIntrest(float rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	public float getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getMaturityPeriod() {
		return maturityPeriod;
	}
	public void setMaturityPeriod(int maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}
  
	/*Getter and Setter method ends here*/
	
	/*Account Operation Methods begins from here
	 * Reccuring Account Operations 
	 * 1.Update Recurring Amount  SavingsAccount ie debit Saving account with amount x and credit reccuring account with amount x
	 * 2.Calculate Rate of Inerest
	 * 
	 * */
	public void updateReccuringAccount() {
		
	}
	public void calculateInterest() {
	
	}
}
