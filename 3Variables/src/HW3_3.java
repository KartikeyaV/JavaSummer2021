/**
 * This is HW3_3
 * @author karti
 *
 */
public class HW3_3 {
	public static void main(String[] args) {
		// Byte Min = -128 Max = 127
		byte fanMode = 5;
		//Short Min = -32768 Max 32767
		short numOfPeopleInStadium = 18795;
		// Int Min = -2,147,483,648 Max = 2,147,483,647 
		int valueOfResult = 1000000;
		// Long Min = -9,223,372,036,854,775,808 -9,223,372,036,854,775,808 Max = 9,223,372,036,854,775,807
		long distanceToPluto = 3105000000l;
		// Float 32 Bit Max
		float VALUE_OF_PI = 3.14f;
		// Double 64 Bit Max
		double valueOfAnswer = 24.333333333334;
		// Boolean True/False Only
		boolean isStatementTrue = true;
		// Char Min = \u0000 Max = \uffff
		char firstChar = 'a';
		
		System.out.println("The Fan Speed Level is: " + fanMode);
		System.out.println("The Number of People in This Stadium is: " + numOfPeopleInStadium);
		System.out.println("The Answer to Your Math Problem is: " + valueOfResult);
		System.out.println("The Distance from Earth to Pluto is: " + distanceToPluto);
		System.out.println("The Value of Pi is: " + VALUE_OF_PI);
		System.out.println("The Answer to the Division Problem is: " + valueOfAnswer);
		System.out.println("The statement is: " + isStatementTrue);
		System.out.println("The First Character is: " + firstChar);
		
	}

}
