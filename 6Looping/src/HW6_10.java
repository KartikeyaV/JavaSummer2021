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
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.print("and " + num);
	}

}
