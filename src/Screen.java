public class Screen {

    public void printBoard(int[][] board) {
        for (int y = GameBoard.rows - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < GameBoard.columns; x++) {
                System.out.print(board[x][y] + " ");
            }
        }
        System.out.println();
    }
}