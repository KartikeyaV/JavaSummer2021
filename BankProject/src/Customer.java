/**
 * Customer Class
 * @author karti
 *
 */
public class Customer {
	private String name;
	private String birthDate;
	private String ssn;
	private int customerID;
	Account[] accounts = new Account[25];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	private int counter = 0;
	public void addAccount (String accountName, int aAccountNumber, char accountType, float balance) {
		Account addAccount = new Account();
		addAccount.setAccountType(accountType);
		addAccount.setAccountNumber(aAccountNumber);
		addAccount.setName(accountName);
		addAccount.deposit(balance);
		accounts[counter] = addAccount;
		counter++;
		
		
	}
	public void printCustomerInfo() {
		  System.out.println("Name: " + name);
		  System.out.println("Customer ID: " + customerID);
		  System.out.println("Date of Birth: " + birthDate);
		  System.out.println("SSN: " + ssn);
		  System.out.println("------------------------------------------------------------");
		  System.out.println("Account Number  | Account Name              | Balance      |");
		  System.out.println("------------------------------------------------------------");
		  for (int i = 0; i < counter; i++) {
			  String formatdata = String.format("%-15s | %-25s | %-12s | ", accounts[i].getAccountNumber(), accounts[i].getName(), accounts[i].getBalance() );
			  System.out.println(formatdata);
			  
		  }
		  System.out.println("-------------------------------------------------------------");
		  }
}
