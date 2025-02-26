import java.util.Scanner;

public class Screen {

    public static void printBoard(int[][] board) {
        for (int y = GameBoard.rows - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < GameBoard.columns; x++) {
                System.out.print(board[x][y] + " ");
            }
        }
        System.out.println();
    }

    public static int getMove(int counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Torn del jugador " + counter + ". Introduir la columna:");
        try {
            int move = Integer.parseInt(scanner.next());
            return (move > GameBoard.columns || move < 1) ? 0 : move;
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public static void columnIsFull(int move){
        if (GameBoard.isColumnFull(move)){
            System.out.println("La columna es plena.");
        }
    }

    public static void errorMng(int move){
        if (move == -1) {
            System.out.println("Nombre de columna invàlid, intenteu-ho una altra vegada");
        } else if (move == -2) {
            System.out.println("Línies de text no acceptades, si us plau introduïu un valor numèric");
        }
    }
    
    public static void winner(int counter){
            System.out.println("Jugador " + counter + " ha guanyat!");
    }
}