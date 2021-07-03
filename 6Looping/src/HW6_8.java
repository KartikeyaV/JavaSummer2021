/**
 * HW6_8
 * @author karti
 *
 */
public class HW6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int index = 0;
		for (i =0; i < 5; i++) {
			for (index=5-i; index >1; index--) {
				System.out.print(" ");
			}
			
			for (index = 0; index <= i; index++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
