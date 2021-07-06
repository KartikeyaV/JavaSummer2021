/**
 * HW7_3
 * @author karti
 *
 */
public class HW7_3 {
	public static void convert(int aNumber) {
		String[] toNineteen = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
				"Eighteen", "Nineteen"};
		String[] multipleTens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
		if (aNumber == 100) {
			System.out.println(multipleTens[10]);
		} else if (aNumber >= 0 && aNumber < 20) {
			System.out.println(toNineteen[aNumber]);
		} else if (aNumber > 19 && aNumber < 100){
			System.out.println(multipleTens[aNumber/10] + " " + toNineteen[aNumber % 10].toLowerCase());
		} else {
			System.out.println("Not Supported");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = RUI.readUserIntInput("Enter a Number From 0-100:");
		convert(num);
		
		
	}

}
