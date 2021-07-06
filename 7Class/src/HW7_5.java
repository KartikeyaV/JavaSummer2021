/**
 * HW7_5
 * @author karti
 *
 */
public class HW7_5 {
	public static void numOfWords(String aSentence) {
		int numOfWords = 0;
		char[] list = aSentence.toCharArray();
		for (int i = 0; i < list.length; i++) {
			if (Character.isWhitespace(list[i])) {
				numOfWords++;
			}
		}
		if (list[list.length -1] != ' ') {
			numOfWords++;
		}
		System.out.println("There are " + numOfWords + " words in this sentence");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "The quick brown fox jumps over the lazy dog";
		numOfWords(sentence);
		
	}

}
