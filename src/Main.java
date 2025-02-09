public class Main {

    public static void main(String[] args) {

       int counter = SetPlayers.decidePlayer();
       boolean gameContinues = true;

       while (gameContinues) {
           int[][] board = GameBoard.getGameBoard();
           int move = Movement.getMove(counter);
           if (move == 10) {
               System.out.println("nombre de columna invalid, intentau-ho un altra vegada");
           } else {
               
           }
       }

    }
}