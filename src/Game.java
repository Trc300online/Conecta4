import java.util.Random;

public class Game {

    private GameBoard gameBoard;
    private Movement movement;
    private Screen screen;
    private int counter;
    private boolean gameContinues;

    public Game() {
        this.gameBoard = new GameBoard();
        this.movement = new Movement();
        this.screen = new Screen();
        this.counter = new Random().nextInt(2) + 1;
        this.gameContinues = true;
    }


    public void startGame() {
        while (gameContinues) {
            int[][] board = gameBoard.getGameBoard();
            int move = movement.getMove(counter) - 1;
            if (move == -1) {
                System.out.println("Nombre de columna invàlid, intenteu-ho una altra vegada");
            } else if (move == -2) {
                System.out.println("Línies de text no acceptades, si us plau introduïu un valor numèric");
            } else {
                int row = movement.getRow(move, board);
                if (row == 10) {
                    System.out.println("La columna és plena.");
                } else {
                    gameBoard.updateBoard(move, row, counter);
                    screen.printBoard(gameBoard.getGameBoard());
                    gameContinues = gameBoard.checkWinConditions(move, row, counter);
                    counter = (counter == 1) ? 2 : 1;
                }
            }
        }
    }
}
