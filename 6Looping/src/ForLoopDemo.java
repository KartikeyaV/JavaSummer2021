/**
 * For Loop Demo
 * @author karti
 *
 */
public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}*/
		String names[] = new String[5];
		names[0] = "Oreo-0";
		names[1] = "Oreo-1";
		names[2] = "Oreo-2";
		names[3] = "Oreo-3";
		names[4] = "Oreo-4";
		System.out.println("Array Length is: " + names.length);
		for( int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}
		// For Each Loop
		for (String name : names) {
			System.out.println(name);
		}
		int nums[] = new int[4];
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 3;
		int add = 0;
		for (int num : nums) {
		System.out.println(num);
		add = add + num;
		}
		System.out.println("The sum is: " + add);
	}
}
