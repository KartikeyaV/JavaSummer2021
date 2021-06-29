/**
 * HW4_3
 * @author karti
 *
 */
public class HW4_3 {

	public static void main(String[] args) {
		float grade = RUI.readUserIntInput("Enter Your Grade:");
		if (grade > 100) {
			System.out.println("Stop Cheating Beta");
		} else if (grade > 90) {
			System.out.println("You have an A+!");
		} else if (grade > 80){
			System.out.println("You have an A!");
		} else if (grade > 70) {
			System.out.println("You have an B+!");
		} else if (grade > 60) {
			System.out.println("You have an B!");
		} else if (grade > 50){
			System.out.println("You have an C!");
		} else if (grade >= 0){
			System.out.println("You Failed");
		} else {
			System.out.println("Your Grade Can't Be That Low Beta");
		}

	}

}
