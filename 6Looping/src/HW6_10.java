/**
 * HW6_10
 * @author karti
 *
 */
public class HW6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = RUI.readUserIntInput("Enter A Number:");
		System.out.print("The Factors of " + num + " are: ");
		returnFactor(num);
		
	}
	public static void returnFactor(int number) {
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.print("and " + number);
	}

}
