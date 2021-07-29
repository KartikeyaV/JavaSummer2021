/**
 * TicTacToe App
 * @author karti
 *
 */
public class TTTapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TTTgame game = new TTTgame();
		char playerSign = 'X';
		while (game.isGameOver().equals("Incomplete")) {
		game.printGame();
		System.out.println("Player Symbol: " + playerSign);
		int askCellNum = RUI.readUserIntInput("Enter Cell Number for Next Turn: ");
		game.playTurn(askCellNum, playerSign);
		if (game.isGameOver().equals("Draw") || game.isGameOver().equals("Player 1 Has Won the Game!") || game.isGameOver().equals("Player 2 Has Won the Game!")) {
			System.out.println(game.isGameOver());
			System.out.println();
			System.out.println("Final Game Details: ");
			System.out.println();
			
			game.printGame();
		}
		if (playerSign == 'X') {
			playerSign = 'O';
		} else {
			playerSign = 'X';
		}
		}
		

	}

}
