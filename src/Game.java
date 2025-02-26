import java.util.Random;

public class Game {

    private GameBoard gameBoard;
    private Screen screen;
    private int counter;

    public Game() {
        this.gameBoard = new GameBoard();
        this.screen = new Screen();
        this.counter = new Random().nextInt(2) + 1;
    }


    public void startGame() {
        boolean gameContinues = true;

        while (gameContinues) {
            int[][] board = gameBoard.getGameBoard();
            int move = Screen.getMove(counter) - 1;
            if (move == -1 || move == -2){
                Screen.errorMng(move);
            }
             else {
                int row = gameBoard.getRow(move, board);
                if (row == 10) {
                    Screen.columnIsFull(counter);
                } else {
                    gameBoard.updateBoard(move, row, counter);
                    Screen.printBoard(gameBoard.getGameBoard());
                    gameContinues = GameBoard.checkWinConditions(move, row, counter);
                    counter = (counter == 1) ? 2 : 1;
                }
            }
        }
    }
}
