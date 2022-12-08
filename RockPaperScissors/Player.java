package RockPaperScissors;

import java.util.Scanner;

public class Player {

    public sign playersTurn() {
        sign pSign;
        Scanner sc = new Scanner(System.in);
        String a;

        do {
            System.out.println("Sira sende, secimini yap [r/p/s]: ");
            a = sc.nextLine();
        } while (!a.equals("r") && !a.equals("p") && !a.equals("s"));

        switch (a) {
            case "r":
                pSign = sign.ROCK;
                break;

            case "p":
                pSign = sign.PAPER;
                break;

            case "s":
                pSign = sign.SCISSORS;
                break;

            default:
                pSign = sign.ROCK;
                break;
        }

        System.out.println("Senin secimin: " + pSign);
        sc.close();
        return pSign;
    }
}