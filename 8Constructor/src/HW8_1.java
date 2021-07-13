/**
 * HW8_1
 * @author karti
 *
 */
public class HW8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 25; i <=2000 ; i++) {
			isPrime(i);
		}

	}
	public static void isPrime (int aNumber) {
		int factors = 0;
		for (int i = 1; i <= aNumber; i++) {
			if (aNumber % i == 0) {
				factors++;
			}
		}
		if (factors <= 2) {
			System.out.println(aNumber);
		}
	}

}
