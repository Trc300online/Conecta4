public class Screen {

    public static void printBoard(int[][] board){
        for (int y = 5; y >= 0; y--){
            System.out.println();
            for (int x = 0; x < 7; x++){
                System.out.print(board[x][y] + " ");
            }
        }
        System.out.println();
    }

}
