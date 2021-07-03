/**
 * Do While Loop Demo
 * @author karti
 *
 */
public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continueAgain = false;
	do {
		String userInput = RUI.readUserStringInput("Enter Option: ");
		continueAgain = false;
		if (userInput.equalsIgnoreCase("FC")) {
			System.out.println("F to C");
			String doContinue = RUI.readUserStringInput(" Do you want to Continue (Y or N): ");
			if (doContinue.equalsIgnoreCase("Y")) {
				continueAgain = true;
			}
		} else if (userInput.equalsIgnoreCase("Cf")) {
			System.out.println("C tp F");
			String doContinue = RUI.readUserStringInput(" Do you want to Continue (Y or N): ");
			if (doContinue.equalsIgnoreCase("Y")) {
				continueAgain = true;
			}
		} else {
			System.out.println("Invalid Input, try again");
			continueAgain = true;
		}
	} while (continueAgain);
	
	}

}
