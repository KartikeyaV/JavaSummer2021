/**
 * HW4_4
 * @author karti
 *
 */
public class HW4_4 {
	
	static String returnGrade(float grade, String letter) {
		if (grade > 100) {
			System.out.println("Restart and Enter a Valid Grade");
			grade = 0;
		} else if (grade > 90) {
			letter = "A+";
			return letter;
		} else if (grade > 80){
			letter = "A";
			return letter;
		} else if (grade > 70) {
			letter = "B+";
			return letter;
		} else if (grade > 60) {
			letter = "B";
			return letter;
		} else if (grade > 50){
			letter = "C";
			return letter;
		} else if (grade >= 1) {
			letter = "F";
			return letter;
		} else if (grade < 1) {
			System.out.println("Restart and Enter a Valid Grade");
			grade = 0;
		} else {
			System.out.println("Invalid Input");
		}
		return letter;
	    
	  }
	public static void main(String[] args) {
		String name = RUI.readUserStringInput("Enter your name:");
		float math = RUI.readUserIntInput("Enter Your Grade In Math:");
		float eng = RUI.readUserIntInput("Enter Your Grade In English:");
		float lat = RUI.readUserIntInput("Enter Your Grade In Latin:");
		float sci = RUI.readUserIntInput("Enter Your Grade In Science:");
		String mathLetter = "sdf";
		String engLetter = "";
		String latLetter = "";
		String sciLetter = "";
		int numOfClasses = 4;		
		mathLetter = returnGrade(math, mathLetter);
		engLetter = returnGrade(eng, engLetter);
		latLetter = returnGrade(lat, latLetter);
		sciLetter = returnGrade(sci, sciLetter);		
		String formatTitle = String.format("%-15s | %-7s | %-7s |", "Subject", "Marks", "Grade");
		String formatMath = String.format("%-15s | %-7s | %-7s |", "Math", math, mathLetter);
		String formatEng = String.format("%-15s | %-7s | %-7s |", "English", eng, engLetter);
		String formatLat = String.format("%-15s | %-7s | %-7s |", "Latin", lat, latLetter);
		String formatSci = String.format("%-15s | %-7s | %-7s |", "Science", sci, sciLetter);
		float points = math + eng + lat + sci;
		float percentage = points/numOfClasses;
		String percentageLetter = "";
		percentageLetter = returnGrade(percentage, percentageLetter);
		String formatOverallPoints = String.format("%-15s | %-17s |", "Overall", points + "/" + (numOfClasses*100));
		String formatOverallPercentage = String.format("%-15s | %-7s | %-7s |", "Overall %", percentage + "%", percentageLetter);
		String statement = "";
		if (percentageLetter == "A+") {
			statement = "Your Overall Grade was an A+! Great Work!";
		} else if (percentageLetter == "A") {
			statement = "Your Overall Grade was an A! Good Work!";
		} else if (percentageLetter == "B+") {
			statement = "Your Overall Grade was an B+! Try a little better next time!";
		} else if (percentageLetter == "B") {
			statement = "Your Overall Grade was an B! Try better next time!";
		} else if (percentageLetter == "C") {
			statement = "Your Overall Grade was an C! Try studying next time!";
		} else if (percentageLetter == "F" ) {
			statement = "Your Overall Grade was an F! You really do need to study!";
		}		
		System.out.println("");
		System.out.println("Student Name: " + name);
		System.out.println("-------------------------------------");
		System.out.println(formatTitle);
		System.out.println("-------------------------------------");
		System.out.println(formatMath);
		System.out.println(formatEng);
		System.out.println(formatLat);
		System.out.println(formatSci);
		System.out.println("-------------------------------------");
		System.out.println(formatOverallPoints);
		System.out.println(formatOverallPercentage);
		System.out.println("-------------------------------------");
		System.out.println(statement);	

	}

}
