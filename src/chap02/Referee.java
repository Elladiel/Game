package chap02;

/**
 * Created by Анастасия on 01.10.2017.
 */
public class Referee {
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

    private void printAnswers(
            int answerOfFirstPlayer,
            int answerOfSecondPlayer,
            int answerOfThirdPlayer
    ) {
        System.out.println("Игрок №1 предлагает число " + answerOfFirstPlayer);
        System.out.println("Игрок №2 предлагает число " + answerOfSecondPlayer);
        System.out.println("Игрок №3 предлагает число " + answerOfThirdPlayer);
    }

    private boolean isGuessed(String playerName, int answer, int secretNumber) {
        boolean isGuessed = answer == secretNumber;
        System.out.println("Игрок " + playerName + " угадал? " + (isGuessed ? "Да!" : "Нет :("));

        return isGuessed;
    }
}
