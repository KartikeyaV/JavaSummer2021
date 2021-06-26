/**
 * HW3_7 about swapping variables
 * @author karti
 *
 */
public class HW3_7 {

	public static void main(String[] args) {
		// Problem 1
		int num1 = 5;
		int num2 = 10;
		System.out.println("Number 1 is " + num1 + " and " + "Number 2 is " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After the swap, Number 1 is " + num1 + " and " + "Number 2 is " + num2);
		// Problem 2
		System.out.println("Number 1 is " + num1 + " and " + "Number 2 is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After the swap, Number 1 is " + num1 + " and " + "Number 2 is " + num2);
		

	}

}
