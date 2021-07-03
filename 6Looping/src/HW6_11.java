/**
 * HW6_11
 * @author karti
 *
 */
public class HW6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = RUI.readUserIntInput("Enter A Number:");
		int factors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				factors++;
			}
		}
		if (factors <= 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
