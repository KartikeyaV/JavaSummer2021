/**
 * HW6_6
 * @author karti
 *
 */
public class HW6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = RUI.readUserIntInput("Enter a Number to Print Multiplication Table: ");
		for (int i = 1; i <=10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}

}
