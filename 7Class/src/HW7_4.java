
public class HW7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String character = RUI.readUserStringInput("Enter A Character: ");
		printPattern(character);
		
	}
	
	public static void printPattern(String aChar) {
		for (int i = 0; i<6; i++) {
			for (int index = 0; index < i; index++) {
				System.out.print(aChar + " ");
			}
			System.out.println();
		}
	}

}
