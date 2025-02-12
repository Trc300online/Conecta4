public class Main {

    public static void main(String[] args) {

       int counter = SetPlayers.decidePlayer();
       boolean gameContinues = true;

       while (gameContinues) {
           int[][] board = GameBoard.getGameBoard();
           int move = Movement.getMove(counter);
           if (move == 10) {
               System.out.println("nombre de columna invalid, intentau-ho un altra vegada");
           } else if (move == 11){
               System.out.println("lineas de text no acceptades, perfavor introduir un valor numeric");
           } else {
               int row = Movement.getRow(move, board);
               if (row == 10) {
                   System.out.println("La columna es plena.");
               } else {
                   board[move][row] = counter;
                   GameBoard.setGameBoard(board);
                   Screen.printBoard(GameBoard.getGameBoard());
               }
               
           }
       }

    }
}