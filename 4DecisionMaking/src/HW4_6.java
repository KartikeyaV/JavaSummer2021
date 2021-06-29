/**
 * HW4_6
 * @author karti
 *
 */
public class HW4_6 {
	
	
	
	public static void main(String[] args) {
		String month = RUI.readUserStringInput("Enter the Month Name:");
		String standard = month.toLowerCase();
		
		if (standard.equals("jan") || standard.equals("january")) {
			System.out.println("Month 1");
		} else if (standard.equals("feb") || standard.equals("february")) {
			System.out.println("Month 2");
		} else if (standard.equals("mar")|| standard.equals("march")) {
			System.out.println("Month 3");
		} else if (standard.equals("apr") || standard.equals("april")) {
			System.out.println("Month 4");
		} else if (standard.equals("may")) {
			System.out.println("Month 5");
		} else if (standard.equals("jun")|| standard.equals("june")) {
			System.out.println("Month 6");
		} else if (standard.equals("jul") || standard.equals("july")) {
			System.out.println("Month 7");
		} else if (standard.equals("aug")|| standard.equals("august")) {
			System.out.println("Month 8");
		} else if (standard.equals("sep")|| standard.equals("sept")|| standard.equals("september")) {
			System.out.println("Month 9");
		} else if (standard.equals("oct")|| standard.equals("october")) {
			System.out.println("Month 10");
		} else if (standard.equals("nov") || standard.equals("november")) {
			System.out.println("Month 11");
		} else if (standard.equals("dec")|| standard.equals("december")) {
			System.out.println("Month 12");
		} else {
			System.out.println("Not A Valid Month");
		}
		
		
	}
	

}
