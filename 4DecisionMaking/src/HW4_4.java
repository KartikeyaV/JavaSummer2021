/**
 * HW4_4
 * @author karti
 *
 */
public class HW4_4 {

	public static void main(String[] args) {
		String name = RUI.readUserStringInput("Enter your name:");
		float math = RUI.readUserIntInput("Enter Your Grade In Math:");
		float eng = RUI.readUserIntInput("Enter Your Grade In English:");
		float lat = RUI.readUserIntInput("Enter Your Grade In Latin:");
		float sci = RUI.readUserIntInput("Enter Your Grade In Science:");
		String mathLetter = "";
		String engLetter = "";
		String latLetter = "";
		String scoLetter = "";
		
		if (math > 100) {
			System.out.println("Restart and Enter a Valid Grade For Math");
			math = 0;
		} else if (math > 90) {
			mathLetter = "A+";
		} else if (math > 80){
			mathLetter = "A";
		} else if (math > 70) {
			mathLetter = "B+";
		} else if (math > 60) {
			mathLetter = "B";
		} else if (math > 50){
			mathLetter = "C";
		} else if (math >= 1) {
			mathLetter = "F";
		} else if (math < 1) {
			System.out.println("Restart and Enter a Valid Grade For Math");
			math = 0;
		}
		if (eng > 100) {
			System.out.println("Restart and Enter a Valid Grade For English");
			eng = 0;
		} else if (eng > 90) {
			engLetter = "A+";
		} else if (eng > 80){
			engLetter = "A";
		} else if (eng > 70) {
			engLetter = "B+";
		} else if (eng > 60) {
			engLetter = "B";
		} else if (eng > 50){
			engLetter = "C";
		} else if (eng >= 1) {
			engLetter = "F";
		} else if (eng < 1) {
			System.out.println("Restart and Enter a Valid Grade For English");
			eng = 0;
		}
		if (lat > 100) {
			System.out.println("Restart and Enter a Valid Grade For Latin");
			lat = 0;
		} else if (lat < 1) {
			System.out.println("Restart and Enter a Valid Grade For Latin");
			lat = 0;
		}
		if (sci > 100) {
			System.out.println("Restart and Enter a Valid Grade For Science");
			lat = 0;
		} else if (sci < 1) {
			System.out.println("Restart and Enter a Valid Grade For Science");
			lat = 0;
		}
		
		
		
		//String format = String.format("%-20")
		
		System.out.println("Student Name: " + name);
		System.out.println("-------------------------------------");
		System.out.println("Subject         | Marks   | Grade   |");
		System.out.println("-------------------------------------");
		System.out.println(mathLetter);
		System.out.println(engLetter);
		
		
		

	}

}
