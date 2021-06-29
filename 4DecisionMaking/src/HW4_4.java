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
		String sciLetter = "";
		int numOfClasses = 4;
		
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
		} else if (lat > 90) {
			latLetter = "A+";
		} else if (lat > 80){
			latLetter = "A";
		} else if (lat > 70) {
			latLetter = "B+";
		} else if (lat > 60) {
			latLetter = "B";
		} else if (lat > 50){
			latLetter = "C";
		} else if (lat >= 1) {
			latLetter = "F";
		} else if (lat < 1) {
			System.out.println("Restart and Enter a Valid Grade For Latin");
			lat = 0;
		}
		if (sci > 100) {
			System.out.println("Restart and Enter a Valid Grade For Science");
			sci = 0;
		} else if (sci > 90) {
			sciLetter = "A+";
		} else if (sci > 80){
			sciLetter = "A";
		} else if (sci > 70) {
			sciLetter = "B+";
		} else if (sci > 60) {
			sciLetter = "B";
		} else if (sci > 50){
			sciLetter = "C";
		} else if (sci >= 1) {
			sciLetter = "F";
		} else if (sci < 1) {
			System.out.println("Restart and Enter a Valid Grade For Science");
			sci = 0;
		}
		
		
		String formatTitle = String.format("%-15s | %-7s | %-7s |", "Subject", "Marks", "Grade");
		String formatMath = String.format("%-15s | %-7s | %-7s |", "Math", math, mathLetter);
		String formatEng = String.format("%-15s | %-7s | %-7s |", "English", eng, engLetter);
		String formatLat = String.format("%-15s | %-7s | %-7s |", "Latin", lat, latLetter);
		String formatSci = String.format("%-15s | %-7s | %-7s |", "Science", sci, sciLetter);
		float points = math + eng + lat + sci;
		float percentage = points/numOfClasses;
		String percentageLetter = "";
		if (percentage > 90) {
			percentageLetter = "A+";
		} else if (percentage > 80){
			percentageLetter = "A";
		} else if (percentage > 70) {
			percentageLetter = "B+";
		} else if (percentage > 60) {
			percentageLetter = "B";
		} else if (percentage > 50){
			percentageLetter = "C";
		} else if (percentage >= 1) {
			percentageLetter = "F";
		} else {
			System.out.println("Error");
		}
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
