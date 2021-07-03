/**
 * Break Statement Demo
 * @author karti
 *
 */
public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Random Message");
			String getInput = RUI.readUserStringInput("Do you want to stop receiving messages (Y or N):");
			if (getInput.equalsIgnoreCase("Y")) {
				break;
			}
		}
		System.out.println("Exited the Loop");

	}

}
