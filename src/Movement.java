import java.util.Scanner;

public class Movement {

    public static int getMove(int counter){
        int move;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Torn del jugador " + counter + ". Introduir la columna on introduir la fitxa:");
        try{
            move = Integer.parseInt(scanner.next());
            if (move > 6 || move < 0) {
                return 10;
            } else {
                return move;
            }
        } catch (Exception e){
            return 10;
        }
    }

}
