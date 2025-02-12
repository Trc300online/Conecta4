import java.util.Scanner;

public class Movement {

    public static int getMove(int counter){
        int move;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Torn del jugador " + counter + ". Introduir la columna on introduir la fitxa:");
        try{
            move = Integer.parseInt(scanner.next());
            if (move > GameBoard.gameBoard.length || move < 1) {
                return 0;
            } else {
                return move;
            }
        } catch (NumberFormatException nfe){
            return -1;
        }
    }

    public static int getRow(int column, int[][] board){
        int row;
        for (int y = 0; y < 6; y++){
            if (board[column][y] == 0){
                row = y;
                return row;
            }
        }
        row = 10;
        return row;
    }

}
