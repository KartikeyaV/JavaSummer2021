/**
 * HW8_5
 * @author karti
 *
 */
public class AddressBook {
	static int counter = 0;
	static Contact[] contacts = new Contact[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact karthik = new Contact();
		karthik.setFirstName("Karthik");
		karthik.setLastName("Vinaykumar");
		karthik.setEmailID("kartikeya.vinaykumar@gmail.com");
		karthik.setCellPhone("222-333-4444");
		karthik.setWorkPhone("333-444-5555");
		karthik.setHomePhone("111-222-3333");
		karthik.setAddress("1234 Crossing Drive");
		karthik.setNotes("GMU");
		contacts[counter] = karthik;
		counter++;
		
		
		Contact karen = new Contact();
		karen.setFirstName("Karen");
		karen.setLastName("Davis");
		karen.setEmailID("karen.davis@gmail.com");
		karen.setCellPhone("555-666-7777");
		karen.setWorkPhone("666-777-8888");
		karen.setHomePhone("444-555-6666");
		karen.setAddress("5678 Karen Drive");
		karen.setNotes("Drop Out");
		contacts[counter] = karen;
		counter++;
		
		String formattitle = String.format("%-10s | %-12s | %-30s | %-12s | %-12s | %-12s | %-20s | %-10s |", "First Name", "Last Name", "Email ID", "Home Phone", "Cell Phone", "Work Phone", "Address", "Notes");
		System.out.println(formattitle);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		for ( int i = 0; i < counter; i++ ) {
			String formatdata = String.format("%-10s | %-12s | %-30s | %-12s | %-12s | %-12s | %-20s | %-10s |", contacts[i].getFirstName(), contacts[i].getLastName(), contacts[i].getEmailID(), contacts[i].getHomePhone(), contacts[i].getCellPhone(), contacts[i].getWorkPhone(), contacts[i].getAddress(), contacts[i].getNotes());
			System.out.println(formatdata);
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		String getName = RUI.readUserStringInput("Enter A Name to Search: ");
		for ( int i =0; i < counter; i++) {
		if (getName.equalsIgnoreCase(contacts[i].getFirstName())) {
			String formatdata = String.format("%-4s | %-15s | %-6s | %-12s | %-12s | %-12s | %-10s | %-10s |", contacts[i].getFirstName(), contacts[i].getLastName(), contacts[i].getEmailID(), contacts[i].getHomePhone(), contacts[i].getCellPhone(), contacts[i].getWorkPhone(), contacts[i].getAddress(), contacts[i].getNotes());
			System.out.println(formatdata);
			
		} 
		}
		

	}

}
