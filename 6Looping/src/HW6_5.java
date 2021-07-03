/**
 * HW6_5
 * @author karti
 *
 */
public class HW6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[4];
		nums[0] = RUI.readUserIntInput("Enter 1st Integer: ");
		nums[1] = RUI.readUserIntInput("Enter 2nd Integer: ");
		nums[2] = RUI.readUserIntInput("Enter 3rd Integer: ");
		nums[3] = RUI.readUserIntInput("Enter 4th Integer: ");
		int min = minNum(nums);
		System.out.println("The smallest number is " + min);
	}
	public static int minNum (int [] a) {
		int min = a[0];
		for ( int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

}
