/**
 * HW6_9
 * @author karti
 *
 */
public class HW6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	do {
		int age = RUI.readUserIntInput("Enter Your Age: ");
		String license = RUI.readUserStringInput("Do You Have a Valid Driver's License (Y/N): ");
		if (age >= 18 && license.equalsIgnoreCase("Y")) {
			System.out.println("You are Allowed To Drive a Car!");
			String repeat = RUI.readUserStringInput("Do You Want to Retry(Y/N): ");
			if (repeat.equalsIgnoreCase("N")) {
				break;
			}
		} else {
			System.out.println("Sorry, You are Not Allowed To Drive Yet.");
			String repeat = RUI.readUserStringInput("Do You Want to Retry(Y/N): ");
			if (repeat.equalsIgnoreCase("N")) {
				break;
			}
		}
	} while (true);
	System.out.println("Have A Great Day!");
	}

}
