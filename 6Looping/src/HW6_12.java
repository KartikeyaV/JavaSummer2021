/**
 * HW6_12
 * @author karti
 *
 */
public class HW6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibonacci[] = new int[20];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		fibonacci[2] = fibonacci[0] + fibonacci[1];
		fibonacci[3] = fibonacci[1] + fibonacci[2];
		fibonacci[4] = fibonacci[2] + fibonacci[3];
		fibonacci[5] = fibonacci[3] + fibonacci[4];
		fibonacci[6] = fibonacci[4] + fibonacci[5];
		fibonacci[7] = fibonacci[5] + fibonacci[6];
		fibonacci[8] = fibonacci[6] + fibonacci[7];
		fibonacci[9] = fibonacci[7] + fibonacci[8];
		fibonacci[10] = fibonacci[8] + fibonacci[9];
		fibonacci[11] = fibonacci[9] + fibonacci[10];
		fibonacci[12] = fibonacci[10] + fibonacci[11];
		fibonacci[13] = fibonacci[11] + fibonacci[12];
		fibonacci[14] = fibonacci[12] + fibonacci[13];
		fibonacci[15] = fibonacci[13] + fibonacci[14];
		fibonacci[16] = fibonacci[14] + fibonacci[15];
		fibonacci[17] = fibonacci[15] + fibonacci[16];
		fibonacci[18] = fibonacci[16] + fibonacci[17];
		fibonacci[19] = fibonacci[17] + fibonacci[18];
		int ask = RUI.readUserIntInput("Enter A Number <= 20 To Display Until: ");
		if (ask <= 20) {
		for (int i = 0; i < ask; i++) {
			System.out.println((i+1) + ". " + fibonacci[i]);
			
		}
		} else {
			System.out.println("Number is not Under 20");
		}
		
	
	}

}
