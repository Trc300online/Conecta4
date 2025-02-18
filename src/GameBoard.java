public class GameBoard {

    public static final int columns = 7;
    public static final int rows = 6;
    protected static int[][] gameBoard = new int[columns][rows];

    public static int[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(int[][] gameBoard) {
        GameBoard.gameBoard = gameBoard;
    }

    public static boolean checkWinCondHV(int moveX, int moveY, int counter, int[][] board){
        int fichasInLine = 0;
        for (int y = 0; y < rows; y++){
            if (board[moveX][y] == counter){
                fichasInLine++;
                if (fichasInLine == 4){
                    System.out.println("Jugador " + counter + " ha guanyat!");
                    return false;
                }
            } else {
                fichasInLine = 0;
            }
        }
        fichasInLine = 0;
        for (int x = 0; x < columns; x++){
            if (board[x][moveY] == counter){
                fichasInLine++;
                if (fichasInLine == 4){
                    System.out.println("Jugador " + counter + " ha guanyat!");
                    return false;
                }
            } else {
                fichasInLine = 0;
            }
        }
        return true;
    }

    public static boolean checkWinCondD(int moveX, int moveY, int counter, int[][] board){
        int fichasInLine = 0;
        int x = moveX;
        int y = moveY;
        while (y > 0 && x > 0){
                x--;
                y--;
        }
        while (x < columns && y < rows){
            if (board[x][y] == counter){
                fichasInLine++;
                if (fichasInLine == 4){
                    System.out.println("Jugador " + counter + " ha guanyat!");
                    return false;
                }
            } else {
                fichasInLine = 0;
            }
            x++;
            y++;
        }
        fichasInLine = 0;
        x = moveX;
        y = moveY;
        while (x > 0 && y < rows - 1) {
            x--;
            y++;
        }
        while (x < columns && y >= 0) {
            if (board[x][y] == counter) {
                fichasInLine++;
                if (fichasInLine == 4) {
                    System.out.println("Jugador " + counter + " ha guanyat!");
                    return false;
                }
            } else {
                fichasInLine = 0;
            }
            x++;
            y--;
        }
        return true;
    }
}
// win conditions
// check column full