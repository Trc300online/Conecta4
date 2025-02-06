import java.util.Random;

public class SetPlayers {

    public static int decidePlayer(){
        int counter;
        Random rand = new Random();

        if (rand.nextInt(2) == 0) {
            counter = 1;
        } else {
            counter = 2;
        }
        return counter;
    }

}
