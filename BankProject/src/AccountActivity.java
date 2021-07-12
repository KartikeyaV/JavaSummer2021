import java.util.Date;
public class AccountActivity {
	
		  private Date txnDate;
		  private float amount;
		  private String action; //Credit/Debit
		  private String description;
		  private float runningBalance;
		public Date getTxnDate() {
			return txnDate;
		}
		public void setTxnDate(Date txnDate) {
			this.txnDate = txnDate;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public float getRunningBalance() {
			return runningBalance;
		}
		public void setRunningBalance(float runningBalance) {
			this.runningBalance = runningBalance;
		}

		  
		 }

