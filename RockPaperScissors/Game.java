package RockPaperScissors;

import java.util.Random;

enum sign {
    ROCK, PAPER, SCISSORS;
}

public class Game {

    public sign AiMakesMove() {
        Random rand = new Random();
        int randomSign = rand.nextInt(3);

        sign s;

        switch (randomSign) {
            case 0:
                s = sign.ROCK;
                break;

            case 1:
                s = sign.PAPER;
                break;

            case 2:
                s = sign.SCISSORS;
                break;

            default:
                s = sign.ROCK;
                break;
        }

        System.out.println("pc nin secimi: " + s);
        return s;
    }

}