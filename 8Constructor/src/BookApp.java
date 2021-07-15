/**
 * HW8_4
 * @author karti
 *
 */
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book harryPotter = new Book();
		harryPotter.setTitle("Harry Potter");
		harryPotter.setNumOfPages(223);
		harryPotter.setAuthor("J.K. Rowling");
		harryPotter.setYear(2001);
		harryPotter.setCost(8.24);
		
		Book percyJackson = new Book();
		percyJackson.setTitle("Percy Jackson");
		percyJackson.setNumOfPages(147);
		percyJackson.setAuthor("Rick Riordan");
		percyJackson.setYear(2006);
		percyJackson.setCost(12.99);
		
		Book hungerGames = new Book();
		hungerGames.setTitle("Hunger Games");
		hungerGames.setNumOfPages(187);
		hungerGames.setAuthor("Suzanne Collins");
		hungerGames.setYear(2008);
		hungerGames.setCost(9.99);
		
		Book inheritanceCycle = new Book();
		inheritanceCycle.setTitle("The Inheritance Cycle");
		inheritanceCycle.setNumOfPages(345);
		inheritanceCycle.setAuthor("Christopher Paolini");
		inheritanceCycle.setYear(2009);
		inheritanceCycle.setCost(15.99);
		
		Book diaryOfAWimpyKid = new Book();
		diaryOfAWimpyKid.setTitle("Diary Of A Wimpy Kid");
		diaryOfAWimpyKid.setNumOfPages(217);
		diaryOfAWimpyKid.setAuthor("Jeff Kinney");
		diaryOfAWimpyKid.setYear(2006);
		diaryOfAWimpyKid.setCost(10.99);
		System.out.println("Author                 | Pages | Author              | Year  | Cost  |");
		System.out.println("----------------------------------------------------------------------");
		printDetails(harryPotter);
		printDetails(percyJackson);
		printDetails(hungerGames);
		printDetails(inheritanceCycle);
		printDetails(diaryOfAWimpyKid);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public static void printDetails(Book aBook) {
		String formatdata = String.format("%-22s | %-5s | %-19s | %-5s | %-5s |", aBook.getTitle(), aBook.getNumOfPages(), aBook.getAuthor(), aBook.getYear(), aBook.getCost());
		System.out.println(formatdata);
	}

}
