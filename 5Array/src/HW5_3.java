/**
 * HW5_3
 * @author karti
 *
 */
public class HW5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Key 	          Description");
		System.out.println("-----------------------------");
		System.out.println("FC 		Fahrenheit -> Celsius");
		System.out.println("CF		Celsius -> Fahrenheit");
		String key = RUI.readUserStringInput("Enter Key:");
		String input = key.toUpperCase();
		if (input.equals("FC")) {
			float far = RUI.readUserIntInput("Enter Fahrenheit Measurement: ");
			float toCel = (far - 32) * 5/9;
			System.out.println(far + " degrees Fahrenheit is " + toCel + " degrees Celsius");
			
		} else if (input.equals("CF")) {
			float cel = RUI.readUserIntInput("Enter Celsius Measurement: ");
			float toFar = (cel * 9/5) + 32;
			System.out.println(cel + " degrees Celsius is " + toFar + " degrees Fahrenheit");
		} else {
			System.out.println("Invalid Input, Please Try Again");
		} 
		
		
		
	}

}
