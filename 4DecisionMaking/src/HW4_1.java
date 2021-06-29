import java.util.Scanner;

/**
 * HW4_1
 * @author karti
 *
 */
public class HW4_1 {

	public static void main(String[] args) {
		// Problem 1
		int number = RUI.readUserIntInput("Enter a number:");
		if (number > 100) {
			System.out.println( number + " is greater than 100");
		} else {
			System.out.println(number + " is not greater than 100");
		}
		// Problem 2
		int num1 = RUI.readUserIntInput("Enter a number:");
		if ((num1 % 2)== 0) {
			System.out.println(num1 + " is even");
		} else {
			System.out.println(num1 + " is odd");
		}
		// Problem 3
		int number1 = RUI.readUserIntInput("Enter 1st Number:");
		int number2 = RUI.readUserIntInput("Enter 2nd number:");
		int number3 = RUI.readUserIntInput("Enter 3rd number:");
		int number4 = RUI.readUserIntInput("Enter 4th number:");
		if (number1 > number2 && number1 > number3 && number1 > number4) {
			System.out.println(number1 + " is the greatest");
		} else if (number2 > number1 && number2 > number3 && number2 > number4) {
			System.out.println(number2 + " is the greatest");
		} else if (number3 > number1 && number3 > number2 && number3 > number4) {
			System.out.println(number3 + " is the greatest");
		} else if (number4 > number1 && number4 > number2 && number4 > number1) {
			System.out.println(number4 + " is the greatest");
		} else {
			System.out.println("There is no greatest number");
		}
		// Problem 4
		if (number1 < number2 && number1 < number3 && number1 < number4) {
			System.out.println(number1 + " is the smallest");
		} else if (number2 < number1 && number2 < number3 && number2 < number4) {
			System.out.println(number2 + " is the smallest");
		} else if (number3 < number1 && number3 < number2 && number3 < number4) {
			System.out.println(number3 + " is the smallest");
		} else if (number4 < number1 && number4 < number2 && number4 < number1) {
			System.out.println(number4 + " is the smallest");
		} else {
			System.out.println("There is no smallest number");
		}
		
		System.out.println("asdasd");
		
		
	}	
		
		
	

}
