/**
 * HW7_6
 * @author karti
 *
 */
public class HW7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "The quick brown fox jumps over the lazy dog";
		int numOfLetters = 0;
		char[] list = sentence.toCharArray();
		for (int i = 0; i < list.length; i++) {
			if (Character.isWhitespace(list[i])) {
				continue;
			}
			numOfLetters++;
		}
		System.out.println(numOfLetters);
		
	}

}
