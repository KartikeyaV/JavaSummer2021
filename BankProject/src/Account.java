/**
 * Account Class
 * @author karti
 *
 */
import java.util.Date;
public class Account {
	private long accountNumber;
	private String name;
	private float balance;
	private char accountType;
	private AccountActivity[] activities = new AccountActivity[100];
	  	 
	  public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getAccountType() {
		return accountType;
	}
	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}
	int counter = 0;
	public void deposit(float aAmount) {
	  AccountActivity activity = new AccountActivity();
	  activity.setTxnDate(new Date());
	  activity.setDescription("Cash Deposit");
	  activity.setAmount(aAmount);
	  balance = balance + aAmount;
	  activity.setRunningBalance(balance);
	  activity.setAction("Credit");
	  activities[counter] = activity;
	  counter++;
	  
	  //Add activity to activities array
	  }

	   public float getBalance(){
		   return balance;
	  }

	  public void withdraw(float aAmount) {
		  AccountActivity activity = new AccountActivity();
		  activity.setTxnDate(new Date());
		  activity.setDescription("Cash Withdrawal");
		  activity.setAmount(aAmount);
		  balance = balance - aAmount;
		  activity.setRunningBalance(balance);
		  activity.setAction("Debit");
		  activities[counter] = (activity);
		  counter++;
	  }
	  
	  public void printActivities() {
	  System.out.println("Name: " + name);
	  System.out.println("Account Number: " + accountNumber);
	  System.out.println("------------------------------------------------------------------------------------");
	  System.out.println("Date                         | Description     | Action | Amount   | Running Balance |");
	  System.out.println("------------------------------------------------------------------------------------");
	  for (int i = 0; i < counter; i++) {
		  String formatdata = String.format("%-4s | %-15s | %-6s | %-8s | %-15s | ", activities[i].getTxnDate(), activities[i].getDescription(), activities[i].getAction(), activities[i].getAmount(), activities[i].getRunningBalance() );
		  System.out.println(formatdata);
		  
	  }
	  System.out.println("------------------------------------------------------------------------------------");
	  }

}
