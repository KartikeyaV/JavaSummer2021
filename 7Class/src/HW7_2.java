/**
 * HW7_2
 * @author karti
 *
 */
public class HW7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = RUI.readUserIntInput("Enter A Year:");
		boolean print = isLeapYear(year);
		System.out.println(print);
		

	}
	
	public static boolean isLeapYear (int aYear) {
		if ((aYear % 400 == 0) || ((aYear % 4 ==0) && (aYear % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}

}
