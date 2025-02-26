public class GameBoard {
    public static final int columns = 7;
    public static final int rows = 6;
    private static int[][] board;

    public GameBoard() {
        this.board = new int[columns][rows];
    }

    public int[][] getGameBoard() {
        return board;
    }

    public void updateBoard(int move, int row, int counter) {
        board[move][row] = counter;
    }

    public static boolean isColumnFull(int counter){
        boolean isFull = false;
        if (board[counter -1][rows -1] != 0){
            isFull = true;
        }
        return isFull;
    }

    public int getRow(int column, int[][] board) {
        for (int y = 0; y < GameBoard.rows; y++) {
            if (board[column][y] == 0) return y;
        }
        return 10;
    }

    public static boolean checkWinConditions(int moveX, int moveY, int counter) {
        boolean result = checkWinCondHV(moveX, moveY, counter) && checkWinCondD(moveX, moveY, counter);
        if (!result) {
            Screen.winner(counter);
        }
        return result;
    }

    private static boolean checkWinCondHV(int moveX, int moveY, int counter) {
        int fichasInLine = 0;
        for (int y = 0; y < rows; y++) {
            fichasInLine = (board[moveX][y] == counter) ? fichasInLine + 1 : 0;
            if (fichasInLine == 4) return false;
        }
        fichasInLine = 0;
        for (int x = 0; x < columns; x++) {
            fichasInLine = (board[x][moveY] == counter) ? fichasInLine + 1 : 0;
            if (fichasInLine == 4) return false;
        }
        return true;
    }

    private static boolean checkWinCondD(int moveX, int moveY, int counter) {
        int total1 = checkDiagonalDirection(moveX, moveY, counter, 1, 1) + checkDiagonalDirection(moveX, moveY, counter, -1, -1) + 1;
        int total2 = checkDiagonalDirection(moveX, moveY, counter, 1, -1) + checkDiagonalDirection(moveX, moveY, counter, -1, 1) + 1;
        return total1 < 4 && total2 < 4;
    }

    private static int checkDiagonalDirection(int startX, int startY, int counter, int dx, int dy) {
        int fichasInLine = 0;
        int x = startX + dx;
        int y = startY + dy;
        while (x >= 0 && y >= 0 && x < columns && y < rows) {
            if (board[x][y] == counter) {
                fichasInLine++;
                x += dx;
                y += dy;
            } else {
                break;
            }

        }
        return fichasInLine;
    }

}
