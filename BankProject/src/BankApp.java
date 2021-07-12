
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account karthik = new Account();
		karthik.setAccountNumber(1);
		karthik.setName("Karthik's Savings 101");
		karthik.setAccountType('S');
		karthik.deposit(1);
		karthik.deposit(500);
		karthik.withdraw(50);
		karthik.deposit(100);
		karthik.printActivities();
		Account avy = new Account();
		avy.setAccountNumber(2);
		avy.setName("Avy's College Funds");
		avy.setAccountType('F');
		avy.deposit(500);
		avy.deposit(1000);
		avy.withdraw(1600);
		avy.deposit(500);
		avy.printActivities();
		Account dhruv = new Account();
		dhruv.setAccountNumber(3);
		dhruv.setName("Dhruv's Investment Portfolio");
		dhruv.setAccountType('I');
		dhruv.deposit(10000);
		dhruv.deposit(5000);
		dhruv.withdraw(20000);
		dhruv.deposit(500000);
		dhruv.printActivities();
		Account dhyeya = new Account();
		dhyeya.setAccountNumber(4);
		dhyeya.setName("Dhyeya's House Savings");
		dhyeya.setAccountType('S');
		dhyeya.deposit(600000);
		dhyeya.deposit(1000);
		dhyeya.withdraw(200000);
		dhyeya.deposit(600000);
		dhyeya.printActivities();
		Account oreo = new Account();
		oreo.setAccountNumber(5);
		oreo.setName("Oreo's Investments");
		oreo.setAccountType('I');
		oreo.deposit(5000);
		oreo.deposit(5000);
		oreo.withdraw(50);
		oreo.deposit(100);
		oreo.printActivities();
		
		
		
		
		
		
		
		
		
		

	}

}
