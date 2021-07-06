/**
 * Continue Statement Demo
 * @author karti
 *
 */
public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] names =  new String [4];
		names[0] = "Avy";
		names[1] = "Dhruv";
		names[2] = "Dhyeya";
		names[3] = "Karthik";
		boolean exist = false;
	for (int i = 0; i <= (names.length - 1); i++) {
		if (names[i] == "Karthik") {
			exist = true;
		} else {
			
		}
	}
		System.out.println(exist);*/
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				continue;
			}
			sum = sum + nums[i];
		}

		System.out.println("The sum of all even numbers is " + sum);
	}

}
