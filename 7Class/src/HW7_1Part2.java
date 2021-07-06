/**
 * HW7_1Part2
 * @author karti
 *
 */
public class HW7_1Part2 {
	public static void main(String[] args) {
		Cars toyota = new Cars();
		toyota.make = "Toyota";
		toyota.model = "Corolla";
		toyota.year = 2021;
		toyota.newOld = "New";
		toyota.price = 27000;
		toyota.mileage = 5;
		toyota.mpg = 35;
		toyota.printDetails();
		
		Cars honda = new Cars();
		honda.make = "Honda";
		honda.model = "Civic";
		honda.year = 1998;
		honda.newOld = "Used";
		honda.price = 5000;
		honda.mileage = 140000;
		honda.mpg = 25;
		honda.printDetails();
		
		Cars nissan = new Cars();
		nissan.make = "Nissan";
		nissan.model = "Altima";
		nissan.year = 2018;
		nissan.newOld = "Used";
		nissan.price = 19000;
		nissan.mileage = 30000;
		nissan.mpg = 31;
		nissan.printDetails();
		
		
		
		
	}
	
	
	
}
