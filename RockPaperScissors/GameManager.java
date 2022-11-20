package RockPaperScissors;

public class GameManager {

    static boolean isGameOver;

    private int playerWin = 0;
    private int AiWin = 0;
    private int winCondition = 3;

    public static void main(String[] args) {
        Player player = new Player();
        Game ai = new Game();
        GameManager Instance = new GameManager();

        while (!isGameOver) {
            Instance.Turn(player, ai, Instance);

            if (Instance.playerWin == Instance.winCondition) {

                isGameOver = true;
                System.out.println("tebriks");
            } else if (Instance.AiWin == Instance.winCondition) {
                isGameOver = true;
                System.out.println("kaybettin");
            }
        }
    }

    public void Turn(Player player, Game ai, GameManager Instance) {
        sign P = player.playersTurn();
        sign A = ai.AiMakesMove();

        if (P.equals(sign.ROCK) && A.equals(sign.SCISSORS)) {
            System.out.println("turu kazandin!");
            Instance.playerWin++;
        }

        else if (P.equals(sign.SCISSORS) && A.equals(sign.PAPER)) {
            System.out.println("turu kazandin!");
            Instance.playerWin++;
        }

        else if (P.equals(sign.PAPER) && A.equals(sign.ROCK)) {
            System.out.println("turu kazandin!");
            Instance.playerWin++;
        }

        else if (P.equals(A)) {
            System.out.println("Berabere!");
        }

        else {
            System.out.println("turu kaybettin!");
            Instance.AiWin++;
        }

        System.out.println("sen=" + Instance.playerWin + "\npc= " + Instance.AiWin);
    }
}