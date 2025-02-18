public class Game {

    public void startGame(){
    int counter = SetPlayers.decidePlayer();
    boolean gameContinues = true;
       while (gameContinues) {
        int[][] board = GameBoard.getGameBoard();
        int move = Movement.getMove(counter) -1;
        if (move == -1) {
            System.out.println("nombre de columna invalid, intentau-ho un altra vegada");
        } else if (move == -2){
            System.out.println("lineas de text no acceptades, perfavor introduir un valor numeric");
        } else {
            /*       Board Class mthd isColmFull boolean */
            int row = Movement.getRow(move, board);
            if (row == 10) {
                System.out.println("La columna es plena.");
            } else {
                board[move][row] = counter;
                GameBoard.setGameBoard(board);
                Screen.printBoard(GameBoard.getGameBoard());
                gameContinues = GameBoard.checkWinCondHV(move, row, counter, board);
                if (gameContinues) {
                    gameContinues = GameBoard.checkWinCondD(move, row, counter, board);
                }
                if (counter == 1){
                    counter = 2;
                } else {
                    counter = 1;
                }
            }
            /**/

        }
    }

    }
}
