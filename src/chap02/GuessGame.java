package chap02;

/**
 * Класс описывает игровой процесс.
 */
public class GuessGame {
    private Player firstPlayer = new Player();
    private Player secondPlayer = new Player();
    private Player thirdPlayer = new Player();

    private Referee referee = new Referee();
    private boolean isGameOver = false;

    public void startGame() {
        int secretNumber = (int) (Math.random() * 10);
        System.out.println("Думаю, это число от 0 до 9...");
        System.out.println("Загаданное число - " + secretNumber);

        while(!isGameOver) {
            isGameOver = referee.match(
                    firstPlayer.guess(),
                    secondPlayer.guess(),
                    thirdPlayer.guess(),
                    secretNumber
            );

            if (!isGameOver)
                System.out.println("Играем дальше ...");
            System.out.println("");
        }

        System.out.println("Игра окончена");
    }
}
