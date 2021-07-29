/**
 * TicTacToe Custom Class
 * @author karti
 *
 */
public class TTTgame {
	public static char[] cellValue = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	
	
	
	
	public boolean playTurn (int aCellNumber, char aSymbol) {
		if (cellValue[aCellNumber - 1] == ' ') {
			cellValue[aCellNumber - 1] = aSymbol;
			return true;
		} else {
			System.out.println("Invalid Input, try again!");
			return false;
		}	
	}
	
	//This should return game status:
	// W - Won
	// D - Draw
	// I - Incomplete
	  
	public String isGameOver() {
		if ((cellValue[0] == 'O' && cellValue[3] == 'O' && cellValue[6] == 'O') || (cellValue[1] == 'O' && cellValue[4] == 'O' && cellValue[7] == 'O') || (cellValue[2] == 'O' && cellValue[5] == 'O' && cellValue[8] == 'O')) {
			return "Player 2 Has Won the Game!";
		} else if ((cellValue[0] == 'O' && cellValue[1] == 'O' && cellValue[2] == 'O') || (cellValue[3] == 'O' && cellValue[4] == 'O' && cellValue[5] == 'O') || (cellValue[6] == 'O' && cellValue[7] == 'O' && cellValue[8] == 'O')) {
			return "Player 2 Has Won the Game!";
		} else if ((cellValue[0] == 'O' && cellValue[4] == 'O' && cellValue[8] == 'O') || (cellValue[2] == 'O' && cellValue[4] == 'O' && cellValue[6] == 'O')){
			return "Player 2 Has Won the Game!";
		} else if ((cellValue[0] == 'X' && cellValue[3] == 'X' && cellValue[6] == 'X') || (cellValue[1] == 'X' && cellValue[4] == 'X' && cellValue[7] == 'X') || (cellValue[2] == 'X' && cellValue[5] == 'X' && cellValue[8] == 'X')) {
			return "Player 1 Has Won the Game!";
		} else if ((cellValue[0] == 'X' && cellValue[1] == 'X' && cellValue[2] == 'X') || (cellValue[3] == 'X' && cellValue[4] == 'X' && cellValue[5] == 'X') || (cellValue[6] == 'X' && cellValue[7] == 'X' && cellValue[8] == 'X')) {
			return "Player 1 Has Won the Game!";
		} else if ((cellValue[0] == 'X' && cellValue[4] == 'X' && cellValue[8] == 'X') || (cellValue[2] == 'X' && cellValue[4] == 'X' && cellValue[6] == 'X')) {
			return "Player 1 Has Won the Game!";
		} 
		
		if (cellValue[0] != ' ' && cellValue[1] != ' ' && cellValue[2] != ' ' && cellValue[3] != ' ' && cellValue[4] != ' ' && cellValue[5] != ' ' && cellValue[6] != ' ' && cellValue[7] != ' ' && cellValue[8] != ' ') {
			return "Draw";
		}
		return "Incomplete";
		
	}
	
	
	public void printGame() {
		printRow(1);
		System.out.println("------------------------------------------------");		
		printRow(2);
		System.out.println("------------------------------------------------");
		printRow(3);
		System.out.println();
	}
	
	private void printRow (int aRowNum) {
		if (aRowNum == 1) {
			System.out.println("\t1\t|\t2\t|\t3\t");
			System.out.println("\t\t|\t\t|\t\t");
			System.out.println("\t" + cellValue[0] +  "\t|\t" + cellValue[1] +  "\t|\t" + cellValue[2] + "\t");
		} else if (aRowNum == 2) {
			System.out.println("\t4\t|\t5\t|\t6\t");
			System.out.println("\t\t|\t\t|\t\t");
			System.out.println("\t" + cellValue[3] +  "\t|\t" + cellValue[4] +  "\t|\t" + cellValue[5] + "\t");
		} else if (aRowNum == 3) {
			System.out.println("\t7\t|\t8\t|\t9\t");
			System.out.println("\t\t|\t\t|\t\t");
			System.out.println("\t" + cellValue[6] +  "\t|\t" + cellValue[7] +  "\t|\t" + cellValue[8] + "\t");
		}
	}
	

}
