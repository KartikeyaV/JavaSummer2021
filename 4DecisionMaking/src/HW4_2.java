/**
 * HW4_2
 * @author karti
 *
 */
public class HW4_2 {

	public static void main(String[] args) {
		double loan = RUI.readUserIntInput("Enter Your Loan Amount:");
		double interestRate = RUI.readUserIntInput("Enter Your Interest Rate:");
		double rate = interestRate / (12*100);
		double period = RUI.readUserIntInput("Enter the Loan Period in Months: ");
		double EMI = (loan*rate*Math.pow(1+rate,period))/(Math.pow(1+rate,period)-1);
		System.out.println(EMI);
	}

}
