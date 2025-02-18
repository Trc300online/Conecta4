import java.util.Scanner;

public class Movement {

    public static int getMove(int counter){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Torn del jugador " + counter + ". Introduir la columna on introduir la fitxa:");
        try{
            int move = Integer.parseInt(scanner.next());
            if (move > GameBoard.columns || move < 1) {
                return 0;
            } else {
                return move;
            }
        } catch (NumberFormatException nfe){
            return -1;
        }
    }

    public static int getRow(int column, int[][] board){
        for (int y = 0; y < GameBoard.rows; y++){
            if (board[column][y] == 0){
                return y;
            }
        }
        return 10;
    }

}
