public class GameBoard {

    public static final int columns = 7;
    public static final int rows = 6;
    int[][] board = GameBoard.getGameBoard();

    protected static int[][] gameBoard = new int[columns][rows];

    public static int[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(int[][] gameBoard) {
        GameBoard.gameBoard = gameBoard;
    }

}
// win conditions
// check column full