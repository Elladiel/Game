package chap02;

/**
 * Класс Referee объявляет ответы игроков и результаты игры.
 */
public class Referee {

    /**
     * Отвечает за игровой процесс. Определяет, закончилась игра или продолжается: если хотя бы один игрок угадал число, игра окончена, иначе игра продолжается.
     *
     * @param answerOfFirstPlayer  ответ первого игрока
     * @param answerOfSecondPlayer ответ второго игрока
     * @param answerOfThirdPlayer  ответ третьего игрока
     * @param secretNumber         загаданное число
     * @return TRUE, если игра закончена, и FALSE, если игра продолжается.
     */
    public boolean match(
            int answerOfFirstPlayer,
            int answerOfSecondPlayer,
            int answerOfThirdPlayer,
            int secretNumber
    ) {
        printAnswers(answerOfFirstPlayer, answerOfSecondPlayer, answerOfThirdPlayer);

        return (
                isGuessed("№1", answerOfFirstPlayer, secretNumber) |
                        isGuessed("№2", answerOfSecondPlayer, secretNumber) |
                        isGuessed("№3", answerOfThirdPlayer, secretNumber)
        );
    }

    /**
     * Выводит на экран ответы всех игроков.
     *
     * @param answerOfFirstPlayer
     * @param answerOfSecondPlayer
     * @param answerOfThirdPlayer
     */
    private void printAnswers(
            int answerOfFirstPlayer,
            int answerOfSecondPlayer,
            int answerOfThirdPlayer
    ) {
        System.out.println("Игрок №1 предлагает число " + answerOfFirstPlayer);
        System.out.println("Игрок №2 предлагает число " + answerOfSecondPlayer);
        System.out.println("Игрок №3 предлагает число " + answerOfThirdPlayer);
    }

    /**
     * @param playerName
     * @param answer
     * @param secretNumber
     * @return TRUE, если число угадано, иначе FALSE.
     */
    private boolean isGuessed(String playerName, int answer, int secretNumber) {
        boolean isGuessed = answer == secretNumber;
        System.out.println("Игрок " + playerName + " угадал? " + (isGuessed ? "Да!" : "Нет :("));

        return isGuessed;
    }
}
