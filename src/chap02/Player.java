package chap02;

/**
 * Класс игрока. Содержит метод <code>guess</code> (угадать).
 */
public class Player {
    public int guess() {
         return ((int)(Math.random() * 10));
    }
}
