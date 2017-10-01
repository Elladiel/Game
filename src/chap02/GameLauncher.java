package chap02;

/**
 * Класс запускает игру.
 */
public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
