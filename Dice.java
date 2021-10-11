package Week2;

import java.util.Random;

public class Dice {
    public int rollTheDice() {
        Random random = new Random();
        return random.nextInt(6) + 1 ;

    }
}