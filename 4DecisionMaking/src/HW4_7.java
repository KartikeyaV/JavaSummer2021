/**
 * HW4_7
 * @author karti
 *
 */
public class HW4_7 {

	public static void main(String[] args) {
		int month = RUI.readUserIntInput("Enter the Month Number:");
		int year = RUI.readUserIntInput("Enter a Year:");
		int numOfDays = 0;
		
		switch (month) {
		case 1:
			numOfDays = 31;
		case 3:
			numOfDays = 31;
		case 5:
			numOfDays = 31;
		case 7:
			numOfDays = 31;
		case 8:
			numOfDays = 31;
		case 10:
			numOfDays = 31;
		case 12:
			numOfDays = 31;
			break;
		case 4:
			numOfDays = 30;
		case 6:
			numOfDays = 30;
		case 9:
			numOfDays = 30;
		case 11:
			numOfDays = 30;
			break;
		case 2:
			if ((year % 400 == 0) || ((year % 4 ==0) && (year % 100 != 0))) {
				numOfDays = 29;
			} else {
				numOfDays = 28;
			}
		}
		System.out.println("There are " + numOfDays + " days in month " + month);
		
	}

}
