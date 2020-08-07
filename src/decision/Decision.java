package decision;

import stat.Messages;

import java.util.Scanner;

public class Decision {
    private static int numberOfMatches = 20;
    private static int computerMove = 3;
    private static int enemyMove;
    private static Scanner scanner = new Scanner(System.in);

    public static void decision() {
        System.out.println(Messages.MATCHES_LEFT + numberOfMatches + Messages.HOW_MUCH_DID_THE_COMPUTER_TAKE + computerMove);
        numberOfMatches -= computerMove;
        System.out.println(Messages.MATCHES_LEFT + numberOfMatches + Messages.MATCHES);
        if(numberOfMatches == 1)
            return;
        inputEnemyMove();
    }

    private static void inputEnemyMove() {
        System.out.print(Messages.PLAYER_TURN);
        enemyMove = scanner.nextInt();
        if(enemyMove < 1 || enemyMove > 3)
            wrongInputEnemyMove();
        numberOfMatches -= enemyMove;
        computerStroke();
        decision();
    }

    private static void wrongInputEnemyMove() {
        System.out.println(Messages.INPUT_ERROR);
        enemyMove = scanner.nextInt();
        if(enemyMove < 1 || enemyMove > 3)
            wrongInputEnemyMove();
    }

    private static void computerStroke() {
        computerMove = 4 - enemyMove;
    }
}
