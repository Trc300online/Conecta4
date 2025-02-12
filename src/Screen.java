public class Screen {

    public static void printBoard(int[][] board){
        for (int y = GameBoard.gameBoard[0].length -1; y >= 0; y--){
            System.out.println();
            for (int x = 0; x < GameBoard.gameBoard.length; x++){
                System.out.print(board[x][y] + " ");
            }
        }
        System.out.println();
    }

}
