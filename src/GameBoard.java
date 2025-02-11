public class GameBoard {

    private static int[][] gameBoard = new int[7][6];

    public static int[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(int[][] gameBoard) {
        GameBoard.gameBoard = gameBoard;
    }
}
