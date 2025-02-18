import java.util.Scanner;

public class Movement {

    public int getMove(int counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Torn del jugador " + counter + ". Introduir la columna:");
        try {
            int move = Integer.parseInt(scanner.next());
            return (move > GameBoard.columns || move < 1) ? 0 : move;
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public int getRow(int column, int[][] board) {
        for (int y = 0; y < GameBoard.rows; y++) {
            if (board[column][y] == 0) return y;
        }
        return 10;
    }
}
