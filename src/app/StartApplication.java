package app;

import decision.Decision;
import stat.Messages;

public class StartApplication {
    public static void main(String[] args) {
        System.out.println(Messages.GAME_START);
        Decision.decision();
        System.out.println(Messages.GAME_END);
    }
}
