
public class StudentApp {
	public static void main(String[] args) {
		// Declare and initialize the class
		Student Oreo = new Student();
		// Set Value for Fields
		Oreo.firstName = "Oreo";
		Oreo.lastName = "Garothaya";
		Oreo.rollNumber = 2;
		Oreo.emailAddress = "oreo.garry@gmail.com";
		
		Student Avy = new Student();
		// Set Value for Fields
		Avy.firstName = "Avy";
		Avy.lastName = "Garothaya";
		Avy.rollNumber = 3;
		Avy.emailAddress = "avy.garry@gmail.com";
		
		// Access the Field
		System.out.println(Oreo.emailAddress);
		System.out.println(Avy.emailAddress);
		
		
		
	}
}
