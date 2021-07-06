/**
 * HW7_7
 * @author karti
 *
 */
public class HW7_7 {
	public static boolean isPalindrome(String aPalindrome) {
		int start = 0;
		int finish = aPalindrome.length() - 1;
		char[] list = aPalindrome.toCharArray();
		while (start < finish) {
			if (list[start] != list[finish]) {
				return false;
			}
			start++;
			finish--;		
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = RUI.readUserStringInput("Enter A Word To Check If It Is a Palindrome: ");
		String palindrome = input.toLowerCase();
		if (isPalindrome(palindrome)) {
			System.out.println(palindrome + " is a palindrome");
		} else {
			System.out.println(palindrome + " is not a palindrome");
		}	
		}
	}


