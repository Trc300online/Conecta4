import java.util.Random;

public class SetPlayers {

    public static int decidePlayer(){
        return new Random().nextInt(2) + 1;
    }

}
