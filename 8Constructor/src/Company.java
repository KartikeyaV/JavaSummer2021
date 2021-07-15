/**
 * HW8_7
 * @author karti
 *
 */
public class Company {
	static int counter = 0;
	static Employee[] employees = new Employee[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee karthik = new Employee();
		karthik.setName("Karthik Vinaykumar");
		karthik.setAge(14);
		karthik.setDesignation("CEO");
		karthik.setSalary(1500000);
		employees[counter] = karthik;
		counter++;
		
		Employee bob = new Employee();
		bob.setName("Bob Bobbity");
		bob.setAge(45);
		bob.setDesignation("Manager");
		bob.setSalary(100000);
		employees[counter] = bob;
		counter++;
		
		Employee rob = new Employee();
		rob.setName("Robert Robbity");
		rob.setAge(56);
		rob.setDesignation("Janitor");
		rob.setSalary(40000);
		employees[counter] = rob;
		counter++;
		
		String formattitle = String.format("%-18s | %-4s | %-10s | %-12s |", "Name", "Age", "Position", "Salary");
		System.out.println(formattitle);
		System.out.println("-------------------------------------------------------");
		for ( int i = 0; i < counter; i++ ) {
			String formatdata = String.format("%-18s | %-4s | %-10s | %-12s |", employees[i].getName(), employees[i].getAge(), employees[i].getDesignation(), employees[i].getSalary());
			System.out.println(formatdata);
		}
		System.out.println("--------------------------------------------------------");
		double max = 0;
		for ( int i =0; i < counter; i++) {
		
		if (employees[i].getSalary() > max) {
			max = employees[i].getSalary();
			
		} 
		}
		System.out.println("The Employee With the Max Salary is:");
		System.out.println("");
		
		for ( int i = 0; i < counter; i++) {
			
			if (max == employees[i].getSalary()) {
				String formatdata = String.format("%-18s | %-4s | %-10s | %-12s |", employees[i].getName(), employees[i].getAge(), employees[i].getDesignation(), employees[i].getSalary());
				System.out.println(formatdata);
				
			} 
			}
		
	}

}
