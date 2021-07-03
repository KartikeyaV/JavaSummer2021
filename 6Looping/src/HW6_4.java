/**
 * HW6_4
 * @author karti
 *
 */
public class HW6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[10];
		nums[0] = 0;
		nums[1] = 11;
		nums[2] = 2;
		nums[3] = 3;
		nums[4] = 44;
		nums[5] = 5;
		nums[6] = 6;
		nums[7] = 7;
		nums[8] = 8;
		nums[9] = 9;
		int max = maxNum(nums);
		System.out.println("The biggest number is " + max);
	}
	public static int maxNum (int [] a) {
		int max = a[0];
		for ( int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
